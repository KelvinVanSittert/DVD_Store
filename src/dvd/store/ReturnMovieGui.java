/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd.store;

import static dvd.store.DVDStore.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelvin
 */
public class ReturnMovieGui extends javax.swing.JFrame {

    /**
     * Creates new form ReturnMovieGui
     */
    public ReturnMovieGui() {
        
        initComponents();
        
        movieComboBox.removeAllItems();
        movieComboBox.addItem("Select movie to return");
        
        ArrayList<DVD> dvdCopy = new ArrayList();
            for (int i = 0; i < getDvdArrayList().size(); i++) {
                dvdCopy.add(getDvdArrayList().get(i));
            }
           
        ArrayList<DVD> rentedDvd = new ArrayList();
                
                for (int j = 0; j < getDvdArrayList().size(); j++) {
                    for (int k = 0; k < getRentalArrayList().size(); k++) {
                        if (getDvdArrayList().get(j).getDvdNumber() == getRentalArrayList().get(k).getDvdNumber()) {
                            rentedDvd.add(getDvdArrayList().get(j));
                        }
                    
                    }
                
                }
                
                for (int i = 0; i < rentedDvd.size(); i++) {
                    movieComboBox.addItem(rentedDvd.get(i).getTitle());
        }
            

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        returnMovieBtn = new javax.swing.JButton();
        movieComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox<>();
        monthComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        returnMovieBtn.setText("Return Movie");
        returnMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMovieBtnActionPerformed(evt);
            }
        });

        movieComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Date Returned");

        jLabel2.setText("Day");

        jLabel3.setText("Month");

        jLabel4.setText("Year");

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));

        jLabel5.setText("20");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnMovieBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(movieComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(81, 81, 81)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(returnMovieBtn)
                .addGap(29, 29, 29)
                .addComponent(backBtn)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMovieBtnActionPerformed

        String dateReturned = (Integer.toString(yearComboBox.getSelectedIndex()+1)) + "/" + (Integer.toString(monthComboBox.getSelectedIndex()+1)) + "/" + (Integer.toString(dayComboBox.getSelectedIndex()+1));
        
       // calculate penalties if any
       //                 calculate payment
       
        if (movieComboBox.getSelectedItem().equals("Select movie to return")) {
            
            JOptionPane.showMessageDialog(null, "Please select a movie to return");
            
        }else{
            for (int i = 0; i < getDvdArrayList().size(); i++) {
                
                if (getDvdArrayList().get(i).getTitle().equals(movieComboBox.getSelectedItem())) {
                    for (int j = 0; j < getRentalArrayList().size(); j++) {
                        if (getDvdArrayList().get(i).getDvdNumber() == getRentalArrayList().get(j).getDvdNumber()) {
                            getRentalArrayList().get(j).setDateReturned(dateReturned);
                            System.out.println(getRentalArrayList().get(j).getTotalPenaltyCost());
                            getRentalArrayList().remove(j);
                            JOptionPane.showMessageDialog(null, "Success!");
                        }
                    }
                    
                    
                }
            }
        
        /*
        if (movieComboBox.getSelectedItem().equals("Select movie to return")) {
            
            JOptionPane.showMessageDialog(null, "Please select a movie to return");
            
        }else{
            for (int i = 0; i < getDvdArrayList().size(); i++) {
                
                if (getDvdArrayList().get(i).getTitle().equals(movieComboBox.getSelectedItem())) {
                    
                    getDvdArrayList().get(i).setAvailableForRent(true);
                    
                    for (int j = 0; j < getCustomerArrayList().size(); j++) {
                        
                        if (getCustomerArrayList().get(j).getMovieRented().equals(movieComboBox.getSelectedItem())) {
                            
                            getCustomerArrayList().get(j).setCanRent(true);
                            getCustomerArrayList().get(j).setMovieRented("");
                            
                        }
                        
                    }
                    
                }
            }
        }
        */
        }
    }//GEN-LAST:event_returnMovieBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        hide();
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JComboBox<String> movieComboBox;
    private javax.swing.JButton returnMovieBtn;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
