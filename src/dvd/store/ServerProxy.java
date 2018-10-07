/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd.store;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.*;

import java.net.Socket;

/**
 *
 * @author Jarrod
 */
public class ServerProxy {
    private Socket server;
    
    public ServerProxy()
    {
        // Attempt to establish connection to server
        try
        {
            // Create socket
            server = new Socket("127.0.0.1", 12345);
        }
        catch (IOException ioe)
        {
            System.out.println("IOException: " + ioe.getMessage());
        }
    }
    
    /**
     *
     * @param customer
     */
    public void UpdateCustomer(Customer customer)
    {
        try
        {        
            // Step 1: create channels
            ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
            out.flush();
            ObjectInputStream in = new ObjectInputStream(server.getInputStream());
            String updateStmt = "update Customers set credit = " + customer.getCredit() + ", canRent = " + customer.canRent() +
                    " where custNum = " + customer.getCustNumber();
            // Step 2: communicate
            out.writeObject(updateStmt);
            out.flush();
            String response = (String)in.readObject();
            System.out.println("From SERVER>> " + response);
            
            // Step 3: close down
            out.close();
            in.close();
            server.close();        
        }
        catch (IOException ioe)
        {
            System.out.println("IO Exception: " + ioe.getMessage());
        }
        catch (ClassNotFoundException cnfe)
        {
            System.out.println("Class not found: " + cnfe.getMessage());
        }
    }
}
