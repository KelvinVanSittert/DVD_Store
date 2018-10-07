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
 * @author Jaco
 */
public class ServerProxy {
    private static Socket server;
    
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
    public static void UpdateCustomer(Customer customer)
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
            Message msg = new Message(customer, Message.Action.Update, Message.Target.Customer, updateStmt);
            out.writeObject(msg);
            out.flush();
            String response = (String)in.readObject();
            System.out.println("From SERVER>> " + response);
            
            // Step 3: close down
            out.close();
            in.close();
              
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
    
        public static void InstertCustomer(Customer customer)
    {
        try
        {        
            // Step 1: create channels
            ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
            out.flush();
            ObjectInputStream in = new ObjectInputStream(server.getInputStream());
            String updateStmt = "INSERT INTO Customers(custNumber, firstName, surname, phoneNum ,credit, canRent)" 
                    + " VALUES (1, kelvin, vans, 2121212121, 20, true)";
                   
            // Step 2: communicate
            Message msg = new Message(customer, Message.Action.Insert, Message.Target.Customer, updateStmt);
            out.writeObject(msg);
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
    
    public static ArrayList<DVD> GetDVDs(){
        ArrayList<DVD> dvds = new ArrayList<DVD>();
        try
        {        
            // Step 1: create channels
            ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
            out.flush();
            ObjectInputStream in = new ObjectInputStream(server.getInputStream());
            String statement = "select * from Movies";
            // Step 2: communicate
            Message msg = new Message(new ArrayList<DVD>(), Message.Action.Get, Message.Target.DVD, statement);
            out.writeObject(msg);
            out.flush();
            msg = (Message)in.readObject();
            System.out.println("From SERVER>> Success");
            dvds = msg.getDVDs();
            System.out.println("From SERVER>> Success DVDS:" + dvds.size());
            // Step 3: close down
            out.close();
            in.close();
          
        }
        catch (IOException ioe)
        {
            System.out.println("IO Exception: " + ioe.getMessage());
        }
        catch (ClassNotFoundException cnfe)
        {
            System.out.println("Class not found: " + cnfe.getMessage());
        }
        return dvds;
    }
}
