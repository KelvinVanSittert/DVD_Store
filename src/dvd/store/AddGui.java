/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd.store;

import static dvd.store.DVDStore.getCustomerArrayList;
import static dvd.store.DVDStore.getDVDArrayList;
import static dvd.store.DVDStore.newCustomer;
import static dvd.store.DVDStore.newDVD;
import javax.swing.JOptionPane;



/**
 *
 * @author Kelvin
 */
public class AddGui extends javax.swing.JFrame {
    
    /**
     * Creates new form AddGui
     */
    public AddGui() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitMovieBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addMovieCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        newReleaseCheckBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        firstNameTf = new javax.swing.JTextField();
        surnameTf = new javax.swing.JTextField();
        phoneNumberTf = new javax.swing.JTextField();
        creditTf = new javax.swing.JTextField();
        movieTitleTf = new javax.swing.JTextField();
        submitCustomerBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setTitle("Add");

        submitMovieBtn.setText("Submit Movie");
        submitMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitMovieBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Movie Title: ");

        jLabel2.setText("Movie Category");

        addMovieCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horror", "Sci-fi", "Drama", "Romance", "Comedy", "Action", "Cartoon" }));
        addMovieCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieComboActionPerformed(evt);
            }
        });

        jLabel3.setText("New Release");

        jLabel5.setText("Add Movie");

        jLabel6.setText("Add Customer");

        jLabel7.setText("First Name: ");

        jLabel8.setText("Surname: ");

        jLabel9.setText("Credit:");

        jLabel10.setText("Phone Number: ");

        creditTf.setText("100");
        creditTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditTfActionPerformed(evt);
            }
        });

        submitCustomerBtn.setText("Submit Customer");
        submitCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitCustomerBtnActionPerformed(evt);
            }
        });

        jLabel11.setText("R");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newReleaseCheckBox)
                            .addComponent(addMovieCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movieTitleTf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(submitMovieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(54, 54, 54)
                                .addComponent(surnameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(firstNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneNumberTf)
                                    .addComponent(creditTf, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))))
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submitCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(firstNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movieTitleTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(surnameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(newReleaseCheckBox))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneNumberTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addMovieCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(creditTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitMovieBtn)
                    .addComponent(submitCustomerBtn)
                    .addComponent(backBtn))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creditTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditTfActionPerformed

    private void submitMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitMovieBtnActionPerformed
        
        int primaryKey = Integer.parseInt(JOptionPane.showInputDialog("Please enter primary key"));
        boolean unique = true;
        for (int i = 0; i < getDVDArrayList().size(); i++) {
            if (getDVDArrayList().get(i).getDVDNumber() == primaryKey) {
                unique = false;
                JOptionPane.showMessageDialog(null, "This primary key is in use already");
            }
        }
        
        if(unique){
        if (movieTitleTf.getText().length() < 50) {
            
            //public DVD(int dvdNumber, String title, int category, boolean newRelease, boolean avail)
            DVD dvd = new DVD(primaryKey, movieTitleTf.getText(), addMovieCombo.getSelectedIndex()+1, newReleaseCheckBox.isSelected(), true);
            newDVD(dvd);
           // try {
                    ServerProxy.InstertDvd(dvd);
             //   } catch (Exception e) {
              //  }
            JOptionPane.showMessageDialog(null, "Success!");
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Please enter a valid movie title (Less than 50 characters)");
         
        }
        }
    movieTitleTf.setText(null);
        
    }//GEN-LAST:event_submitMovieBtnActionPerformed

    private void submitCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitCustomerBtnActionPerformed
            
        
        int primaryKey = Integer.parseInt(JOptionPane.showInputDialog("Please enter primary key"));
        boolean unique = true;
        for (int i = 0; i < getCustomerArrayList().size(); i++) {
            if (getCustomerArrayList().get(i).getCustNumber() == primaryKey) {
                unique = false;
                JOptionPane.showMessageDialog(null, "This primary key is in use already");
            }
        }
        
        if(unique){
        if (Double.parseDouble(creditTf.getText()) > 99 && phoneNumberTf.getText().length()== 10) {
            if (surnameTf.getText().length() < 30 && firstNameTf.getText().length() < 30) {
                //int custNumber, String fName, String lName, String phone, double credAmt, boolean can
            Customer customer = new Customer(primaryKey,firstNameTf.getText(), surnameTf.getText(), phoneNumberTf.getText(), Double.parseDouble(creditTf.getText()), true);
            newCustomer(customer);
                System.out.println(customer.toString());
                    ServerProxy.InstertCustomer(customer);
                
            JOptionPane.showMessageDialog(null, "Success!");
            }else{
                JOptionPane.showMessageDialog(null, "Please enter a valid firstname and surname (Less than 30 characters)");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Please enter a valid phone number and more than R100 credit");
        }
        }
    firstNameTf.setText(null);
    surnameTf.setText(null);
    phoneNumberTf.setText(null);
    creditTf.setText("100");
    }//GEN-LAST:event_submitCustomerBtnActionPerformed

    private void addMovieComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMovieComboActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        hide();
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addMovieCombo;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField creditTf;
    private javax.swing.JTextField firstNameTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField movieTitleTf;
    private javax.swing.JCheckBox newReleaseCheckBox;
    private javax.swing.JTextField phoneNumberTf;
    private javax.swing.JButton submitCustomerBtn;
    private javax.swing.JButton submitMovieBtn;
    private javax.swing.JTextField surnameTf;
    // End of variables declaration//GEN-END:variables



}
