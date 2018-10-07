/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd.store;

import static dvd.store.DVDStore.getCustomerArrayList;
import static dvd.store.DVDStore.getDvdArrayList;
import static dvd.store.DVDStore.getRentalArrayList;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelvin
 */
public class MainMenu extends javax.swing.JFrame {
    
    
    
    
    ServerProxy proxy;
    /**
     * Creates new form Gui
     */
    public MainMenu() {
        
        initComponents();
        proxy = new ServerProxy();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        rentMovieBtn = new javax.swing.JButton();
        sortedComboBox = new javax.swing.JComboBox<>();
        listMovieBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sortBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        returnMovieBtn = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        rentMovieBtn.setText("Rent Movie");
        rentMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentMovieBtnActionPerformed(evt);
            }
        });

        sortedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Movies", "Available Movies", "Customers" }));

        listMovieBtn.setText("List movies that starts with...");
        listMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMovieBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Sorted list of : ");

        sortBtn.setText("Sort");
        sortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBtnActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        returnMovieBtn.setText("Return Movie");
        returnMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMovieBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listMovieBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(sortedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(sortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rentMovieBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnMovieBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(addBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rentMovieBtn)
                .addGap(8, 8, 8)
                .addComponent(returnMovieBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listMovieBtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sortedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sortBtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGui().setVisible(true);
            }
        });
    }//GEN-LAST:event_addBtnActionPerformed

    private void listMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMovieBtnActionPerformed
        
        textArea.setText(null);
        
        char startingMovieLetter = JOptionPane.showInputDialog("Enter what letter the movie starts with").charAt(0);
        System.out.println(startingMovieLetter);
        
        for (int i = 0; i < getDvdArrayList().size(); i++) {
            if (startingMovieLetter == getDvdArrayList().get(i).getTitle().charAt(0)) {
                
                textArea.setText(textArea.getText() + getDvdArrayList().get(i).getTitle() + "\n \n");
                
            }
        }
        
    }//GEN-LAST:event_listMovieBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteGui().setVisible(true);
            }
        });
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void rentMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentMovieBtnActionPerformed
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentMovie().setVisible(true);
            }
        });
    }//GEN-LAST:event_rentMovieBtnActionPerformed

    private void returnMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMovieBtnActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnMovieGui().setVisible(true);
            }
        });
    }//GEN-LAST:event_returnMovieBtnActionPerformed

    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBtnActionPerformed
       
        String textPlaceholder = "";
        
        
        
        if (sortedComboBox.getSelectedItem().equals("All Movies")) {
            
            textPlaceholder = "";
            textArea.setText(null);
            
            for (int i = 0; i < getDvdArrayList().size(); i++) {
                
                textPlaceholder = textPlaceholder + getDvdArrayList().get(i).toString() + "\n \n";
                
            }
            
            textArea.setText(textPlaceholder);
            
        }
        
        if (sortedComboBox.getSelectedItem().equals("Available Movies")) {
            
                    textPlaceholder = "";
                    textArea.setText(null);
            
            ArrayList<DVD> dvdCopy = new ArrayList();
        
            for (int i = 0; i < getDvdArrayList().size(); i++) {
                dvdCopy.add(getDvdArrayList().get(i));
            }
            
                for (int i = 0; i < getDvdArrayList().size(); i++) {
                    for (int j = 0; j < getRentalArrayList().size(); j++) {
                        if (getDvdArrayList().get(i).getDvdNumber() == getRentalArrayList().get(j).getDvdNumber()) {
                        dvdCopy.remove(i);
                        }
                    
                    }
                    
                
                }
                
        for (int i = 0; i < dvdCopy.size(); i++) {
            
            textPlaceholder = textPlaceholder + dvdCopy.get(i).toString() + "\n \n";
            
        }

            textArea.setText(textPlaceholder);
        }
        
        if (sortedComboBox.getSelectedItem().equals("Customers")) {
            
            textPlaceholder = "";
            textArea.setText(null);
            
            for (int i = 0; i < getCustomerArrayList().size(); i++) {    
                    
                    textPlaceholder = textPlaceholder + getCustomerArrayList().get(i).toString() + "\n \n";
        }
            textArea.setText(textPlaceholder);
            
        }
        
        
    }//GEN-LAST:event_sortBtnActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listMovieBtn;
    private javax.swing.JButton rentMovieBtn;
    private javax.swing.JButton returnMovieBtn;
    private javax.swing.JButton sortBtn;
    private javax.swing.JComboBox<String> sortedComboBox;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
