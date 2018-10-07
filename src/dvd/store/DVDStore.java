/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd.store;

import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public class DVDStore {
    
    private static ArrayList<DVD> dvdArrayList = new ArrayList();
    private static ArrayList<Customer> customerArrayList = new ArrayList();
    private static ArrayList<Rental> rentalArrayList = new ArrayList();

        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
        
    }
        
public static void newCustomer(Customer newCustomer){
    customerArrayList.add(newCustomer);
           
}
public static void newDvd(DVD newDvd){
    dvdArrayList.add(newDvd);
           
}

public static void deleteDvd(int deletedDvd){
    dvdArrayList.remove(deletedDvd);
}

public static void deleteCustomer(int deletedCustomer){
    customerArrayList.remove(deletedCustomer);
}
        
public static ArrayList<DVD> getDvdArrayList(){
    return ServerProxy.GetDvds();
}
public static ArrayList<Customer> getCustomerArrayList(){
    return customerArrayList;
}

public static void setDvdArrayList(ArrayList<DVD> newDvdArrayList){
    
    dvdArrayList = newDvdArrayList;
}

public static void setCustomerArrayList(ArrayList<Customer> newCustomerArrayList){
    
    customerArrayList = newCustomerArrayList;
}

public static void setRentalArrayList(ArrayList<Rental> newRentalArrayList){
    rentalArrayList = newRentalArrayList;
}

public static ArrayList<Rental> getRentalArrayList(){
    return rentalArrayList;
}
    
}
