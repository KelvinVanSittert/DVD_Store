/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd.store;
import static dvd.store.DVDStore.*;
import javax.swing.JOptionPane;
import static dvd.store.ServerProxy.InstertRental;
import java.util.*;
/**
 *
 * @author Kelvin
 */
public class RentMovie extends javax.swing.JFrame {

    /**
     * Creates new form RentMovie
     */
    public RentMovie() {
        initComponents();
        
        selectMovieComboBox.removeAllItems();
        selectMovieComboBox.addItem("Select a movie to rent");
        
        for (int i = 0; i < getDVDArrayList().size(); i++) {
            if (getDVDArrayList().get(i).isAvailable()) {
                selectMovieComboBox.addItem(getDVDArrayList().get(i).getTitle());
            }
        }
        
        /*
        ArrayList<DVD> dvdCopy = new ArrayList();
            for (int i = 0; i < getDVDArrayList().size(); i++) {
                dvdCopy.add(getDVDArrayList().get(i));
            }
           
        ArrayList<DVD> rentedDVD = new ArrayList();
                
                for (int j = 0; j < getDVDArrayList().size(); j++) {
                    for (int k = 0; k < getRentalArrayList().size(); k++) {
                        if (getDVDArrayList().get(j).getDVDNumber() == getRentalArrayList().get(k).getDVDNumber()) {
                            rentedDVD.add(getDVDArrayList().get(j));
                        }
                    
                    }
                
                }
                
                for (int i = 0; i < rentedDVD.size(); i++) {
                    movieComboBox.addItem(rentedDVD.get(i).getTitle());
        }*/
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectMovieComboBox = new javax.swing.JComboBox<>();
        viewAvailableBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        customerPrimaryKeyTf = new javax.swing.JTextField();
        rentBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        addCreditBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox<>();
        monthComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Rent a movie");

        selectMovieComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a movie to rent", "Item 2", "Item 3", "Item 4" }));
        selectMovieComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMovieComboBoxActionPerformed(evt);
            }
        });

        viewAvailableBtn.setText("View Available Movies To rent");
        viewAvailableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAvailableBtnActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jLabel3.setText("Customer Primary Key");

        rentBtn.setText("Rent");
        rentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        addCreditBtn.setText("Add Credit");
        addCreditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCreditBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Date Rented");

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel2.setText("20");

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));

        jLabel4.setText("Day");

        jLabel5.setText("Month");

        jLabel6.setText("Year");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewAvailableBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectMovieComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rentBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(customerPrimaryKeyTf, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(addCreditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(selectMovieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerPrimaryKeyTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCreditBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addComponent(viewAvailableBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentBtn)
                    .addComponent(backBtn))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        
        hide();
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void selectMovieComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMovieComboBoxActionPerformed

    }//GEN-LAST:event_selectMovieComboBoxActionPerformed

    private void rentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentBtnActionPerformed
        
        //int  rentalNumber, String dateRented, int custNumber , int dvdNumber
        boolean validatedDVD = false;
        double custCredit = 0;
        boolean validatedCustomer = false;
        double cost = 0;
        int storedDVDNum = 0;
        int rentalPrimaryKey = Integer.parseInt(JOptionPane.showInputDialog("Please enter primary key for rental"));
        boolean unique = true;
        int storedCustomerNum = 0;
        int dvdPrimaryKey = 0;
        
        for (int i = 0; i < getRentalArrayList().size(); i++) {
            if (rentalPrimaryKey == getRentalArrayList().get(i).getRentalNumber()) {
                unique = false;
            }
        }
        
        if(unique){
        
        ArrayList<Rental> newRentalArrayList = getRentalArrayList();
        String dateRented = (Integer.toString(yearComboBox.getSelectedIndex()+1)) + "/" + (Integer.toString(monthComboBox.getSelectedIndex()+1)) + "/" + (Integer.toString(dayComboBox.getSelectedIndex()+1));
        int customerPrimaryKey = Integer.parseInt(customerPrimaryKeyTf.getText());
        String movieSelected = selectMovieComboBox.getSelectedItem().toString();

        for (int i = 0; i < getCustomerArrayList().size(); i++) {
            if (Integer.toString(getCustomerArrayList().get(i).getCustNumber()).equals(customerPrimaryKeyTf.getText())) {
                if (getCustomerArrayList().get(i).canRent()) {
                    custCredit = getCustomerArrayList().get(i).getCredit();
                    validatedCustomer = true;
                    storedCustomerNum = Integer.parseInt(customerPrimaryKeyTf.getText());
                }else{
                    JOptionPane.showMessageDialog(null, "This customer is already renting a movie and cannot rent another");
                    validatedCustomer = false;
                }
                
            }
        }
        System.out.println(storedCustomerNum);
        
        for (int i = 0; i < getDVDArrayList().size(); i++) {
            
            if (getDVDArrayList().get(i).getTitle().equals(movieSelected)) {
                dvdPrimaryKey = getDVDArrayList().get(i).getDVDNumber();
                cost = getDVDArrayList().get(i).getPrice();
                validatedDVD = true;
                if (validatedCustomer) {
                    getDVDArrayList().get(i).setAvailable(false);
                }
            }
        }
        double custCreditAfter = custCredit - cost;
        if (validatedDVD && validatedCustomer) {
            if (custCreditAfter < 0) {
            
            int rentalKey = rentalPrimaryKey;
            Rental newRental = new Rental(rentalKey, dateRented, customerPrimaryKey, dvdPrimaryKey);
                    
            newRentalArrayList.add(newRental);
            setRentalArrayList(newRentalArrayList);
            for (int i = 0; i < getCustomerArrayList().size(); i++) {
                if (getCustomerArrayList().get(i).getCustNumber() == storedCustomerNum) {
                    getCustomerArrayList().get(i).setCanRent(false);
                }
            }
            JOptionPane.showMessageDialog(null, "Success!");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Needs more funds");
            
        }
        
        selectMovieComboBox.removeAllItems();
        selectMovieComboBox.addItem("Select a movie to rent");
        
        for (int i = 0; i < getDVDArrayList().size(); i++) {
            if (getDVDArrayList().get(i).isAvailable()) {
                selectMovieComboBox.addItem(getDVDArrayList().get(i).getTitle());
            }
        }
        }
        
        
        
        /*boolean movieReady = false;
        boolean customerReady = false;
        int whichCustomer = 0;
        int whichDVD = 0;
        if((customerPhoneNumberTf.getText().length() > 9 && customerPhoneNumberTf.getText().length() < 11) && !(selectMovieComboBox.getSelectedItem().toString().equalsIgnoreCase("Select a movie to rent"))){
            for (int i = 0; i < getDVDArrayList().size(); i++) {
                if (getDVDArrayList().get(i).getTitle().equalsIgnoreCase(selectMovieComboBox.getSelectedItem().toString()) && getDVDArrayList().get(i).isAvailableForRent()) {
                    movieReady = true;
                    whichDVD = i;
                    break;
                }
            }
            for (int i = 0; i < getCustomerArrayList().size(); i++) {
                if (getCustomerArrayList().get(i).getPhoneNumber().equals(customerPhoneNumberTf.getText()) && getCustomerArrayList().get(i).canRent()) {
                    customerReady = true;
                    whichCustomer = i;
                    break;
                }
            }
            
            if (movieReady && customerReady) {
                
                JOptionPane.showMessageDialog(null, "Successful rent!");
                getCustomerArrayList().get(whichCustomer).addCredit(-(getDVDArrayList().get(whichDVD).getPrice()));
                getCustomerArrayList().get(whichCustomer).setCanRent(false);
                getCustomerArrayList().get(whichCustomer).setMovieRented(getDVDArrayList().get(whichDVD).getTitle());
                getDVDArrayList().get(whichDVD).setAvailableForRent(false);
                
            }else if(movieReady == false){
                JOptionPane.showMessageDialog(null, "The movie is currently being rented");
            }else if(customerReady == false){
                JOptionPane.showMessageDialog(null, "The customer is currently renting another movie");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please enter a valid customer number and select a movie");
        }
        */
    }//GEN-LAST:event_rentBtnActionPerformed

    private void addCreditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCreditBtnActionPerformed
        boolean flag = false;
        
        int customerPrimaryKey = Integer.parseInt(customerPrimaryKeyTf.getText());
        
        
        for (int i = 0; i < getCustomerArrayList().size(); i++) {
            if (customerPrimaryKey == getCustomerArrayList().get(i).getCustNumber()) {
                double addAmount = Double.parseDouble(JOptionPane.showInputDialog("How much do you want to add?"));
                getCustomerArrayList().get(i).setCredit(getCustomerArrayList().get(i).getCredit() + addAmount);
                
            }else{
                JOptionPane.showMessageDialog(null,"That customer does not exist");
                customerPrimaryKeyTf.setText("");
            }
        }
        /*
        if(customerPrimaryKeyTf.getText().length() > 9 && customerPrimaryKeyTf.getText().length() < 11){
        
            for (int i = 0; i < getCustomerArrayList().size(); i++) {
                if (getCustomerArrayList().get(i).getPhoneNumber().equals(customerPrimaryKeyTf.getText())) {
                    getCustomerArrayList().get(i).addCredit(Double.parseDouble(JOptionPane.showInputDialog("How much would you like to input?/n" + "Your current credit is R :"+ getCustomerArrayList().get(i).getCredit())));
                    flag = true;
                    
                }
                    
            }
            
            if (flag != true) {
                
                JOptionPane.showMessageDialog(null, "That number does not match any customers");
                    
                }
        
        }else{
        
            JOptionPane.showMessageDialog(null, "Please enter a valid phone number");
            
        }
        
        */
        
        
        
    }//GEN-LAST:event_addCreditBtnActionPerformed

    private void viewAvailableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAvailableBtnActionPerformed
        
        String textPlaceholder = "";
        textArea.setText(null);
        boolean flag;
            
        ArrayList<DVD> dvdCopy = new ArrayList();
        
        for (int i = 0; i < getDVDArrayList().size(); i++) {
            dvdCopy.add(getDVDArrayList().get(i));
        }
        
            for (int i = 0; i < getDVDArrayList().size(); i++) {
                for (int j = 0; j < getRentalArrayList().size(); j++) {
                    if (getDVDArrayList().get(i).getDVDNumber() == getRentalArrayList().get(j).getDVDNumber()) {
                        dvdCopy.remove(i);
                    }
                    
                }
                    
                
            }
        for (int i = 0; i < dvdCopy.size(); i++) {
            
            textPlaceholder = textPlaceholder + dvdCopy.get(i).toString() + "\n \n";
            
        }

            textArea.setText(textPlaceholder);
        
    }//GEN-LAST:event_viewAvailableBtnActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCreditBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField customerPrimaryKeyTf;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JButton rentBtn;
    private javax.swing.JComboBox<String> selectMovieComboBox;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton viewAvailableBtn;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
