/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petable;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Dog extends javax.swing.JFrame {

    private int ID;
    private String name;
    private int age;
    private String gender;
    private boolean healthStatus;
    private boolean isAdopted;
    private String species;
    private static DatabaseConnection DB;

    public Dog(DatabaseConnection DB) throws Exception {
        this.DB = DB;
        initComponents();
        String input = DB.retDog();
        jLabel2.setText(input);
        String idPrefix = "Pet's ID: ";
        int startIndex = input.indexOf(idPrefix) + idPrefix.length();
        int endIndex = input.indexOf("<br>", startIndex);
        this.ID = Integer.parseInt(input.substring(startIndex, endIndex));

        jLabel3.setText(DB.retDog());
        jLabel4.setText(DB.retDog());
    }

    public Dog(String name, int age, String gender, boolean healthStatus, boolean isAdopted, String petType, DatabaseConnection DB) throws Exception {
        if (!petType.toLowerCase().equals("dog")) {
            throw new Exception("Invalid pet type for dog");
        }
        this.DB = DB;
        this.ID = (int) (Math.random() * 999);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.healthStatus = healthStatus;
        this.isAdopted = false;
        DB.addDog(this);
        initComponents();
        jLabel2.setText(DB.retDog());
        jLabel3.setText(DB.retDog());
        jLabel4.setText(DB.retDog());

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(boolean healthStatus) {
        this.healthStatus = healthStatus;
    }

    public boolean isIsAdopted() {
        return isAdopted;
    }

    public void setIsAdopted(boolean isAdopted) throws SQLException {
        DB.updateIsadopted(this.ID);
        this.isAdopted = isAdopted;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void updatePet(int petId, String name, int age, String gender, boolean healthStatus) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.healthStatus = healthStatus;
    }

    public void adoptPet(int petId) {
        this.isAdopted = true;
    }

    public String displayPetDetails(int petId) {
        return "Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender + ", Health status: " + this.healthStatus + ", Adoption status: " + (this.isAdopted ? "Adopted" : "Not adopted");
    }

    /**
     * Creates new form Dog
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(390, 844));
        jPanel1.setMinimumSize(new java.awt.Dimension(390, 844));
        jPanel1.setPreferredSize(new java.awt.Dimension(390, 844));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/choose botton2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 60, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/choose botton2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 60, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/choose botton2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, 60, 30));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 140, 100));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 140, 100));

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 140, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/Dog.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 844));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            this.setIsAdopted(true);
        } catch (SQLException ex) {
            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            new Invoice().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            this.setIsAdopted(true);
        } catch (SQLException ex) {
            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            new Invoice().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            this.setIsAdopted(true);
        } catch (SQLException ex) {
            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            new Invoice().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Dog(DB).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
