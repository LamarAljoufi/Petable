package petable;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GiveUp extends javax.swing.JFrame {

    private String petname;
    private int petage;
    private String gender;
    private boolean health;
    private String species;

    public GiveUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        PetName = new javax.swing.JTextField();
        PetAge = new javax.swing.JTextField();
        GenderF = new javax.swing.JRadioButton();
        GenderM = new javax.swing.JRadioButton();
        UnHealthy = new javax.swing.JRadioButton();
        Healthy = new javax.swing.JRadioButton();
        Cat = new javax.swing.JRadioButton();
        Dog = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        giveUP = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(390, 844));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PetName.setBackground(new java.awt.Color(255, 255, 255));
        PetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetNameActionPerformed(evt);
            }
        });
        jPanel1.add(PetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 81, -1));

        PetAge.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(PetAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 81, -1));

        GenderF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GenderF.setForeground(new java.awt.Color(255, 255, 255));
        GenderF.setText("Female");
        GenderF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderFActionPerformed(evt);
            }
        });
        jPanel1.add(GenderF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        GenderM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GenderM.setForeground(new java.awt.Color(255, 255, 255));
        GenderM.setText("male");
        jPanel1.add(GenderM, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        UnHealthy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UnHealthy.setForeground(new java.awt.Color(255, 255, 255));
        UnHealthy.setText("UnHealthy");
        UnHealthy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnHealthyActionPerformed(evt);
            }
        });
        jPanel1.add(UnHealthy, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        Healthy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Healthy.setForeground(new java.awt.Color(255, 255, 255));
        Healthy.setText("Healthy");
        Healthy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthyActionPerformed(evt);
            }
        });
        jPanel1.add(Healthy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        Cat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cat.setForeground(new java.awt.Color(255, 255, 255));
        Cat.setText("Cat");
        Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatActionPerformed(evt);
            }
        });
        jPanel1.add(Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, -1, -1));

        Dog.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Dog.setForeground(new java.awt.Color(255, 255, 255));
        Dog.setText("Dog");
        Dog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogActionPerformed(evt);
            }
        });
        jPanel1.add(Dog, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/photos/Next.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, 90, 40));

        profile.setBackground(new java.awt.Color(255, 255, 255));
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/photos/Profile2.png"))); // NOI18N
        profile.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 780, 60, 50));

        giveUP.setBackground(new java.awt.Color(255, 255, 255));
        giveUP.setForeground(new java.awt.Color(255, 255, 255));
        giveUP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/photos/Give up2.png"))); // NOI18N
        giveUP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(giveUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 780, 60, 50));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/photos/Home2.png"))); // NOI18N
        home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 780, 60, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Choose pet's species");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pet's name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pet's Age");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose Pet's Gender :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Choose helth status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/photos/GiveUp.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 844));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PetNameActionPerformed

    private void GenderFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderFActionPerformed

    private void UnHealthyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnHealthyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnHealthyActionPerformed

    private void HealthyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HealthyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String errorMessage = "";
        petname = PetName.getText();
        if (petname == null || petname.isEmpty()) {
            errorMessage += "Please enter the pet's name.";
        }
        String ageString = PetAge.getText();
        if (ageString.isEmpty()) {

            errorMessage += "\nPlease enter the pet's age.";
        }
        try {
            petage = Integer.parseInt(ageString);
        } catch (NumberFormatException e) {
            errorMessage += "\nPlease enter a valid age (an integer).";
        }
        if (!GenderF.isSelected() && !GenderM.isSelected()) {
            errorMessage += "\nPlease select the pet's gender.";
        }
        gender = GenderF.isSelected() ? "F" : "M";
        if (!Healthy.isSelected() && !UnHealthy.isSelected()) {
            errorMessage += "\nPlease select the pet's health condition.";
            JOptionPane.showMessageDialog(this, errorMessage, "Invalid input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        health = Healthy.isSelected() ? true : false;

        if (!Cat.isSelected() && !Dog.isSelected()) {
            errorMessage += "\nPlease select the pet's species";
            JOptionPane.showMessageDialog(this, errorMessage, "Invalid input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        species = Cat.isSelected() ? "Cat" : "Dog";
        if (species.equalsIgnoreCase("Cat")) {
            try {
                Cat Cat = new Cat(petname, petage, gender, health, false, species);
            } catch (Exception ex) {
                Logger.getLogger(GiveUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                Dog Dog = new Dog(petname, petage, gender, health, false, species);
            } catch (Exception ex) {
                Logger.getLogger(GiveUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            new Invoice().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(GiveUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DogActionPerformed

    private void CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
         new Main().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
         new Profile().setVisible(true);
    }//GEN-LAST:event_profileActionPerformed

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
            java.util.logging.Logger.getLogger(GiveUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiveUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiveUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiveUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiveUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Cat;
    private javax.swing.JRadioButton Dog;
    private javax.swing.JRadioButton GenderF;
    private javax.swing.JRadioButton GenderM;
    private javax.swing.JRadioButton Healthy;
    private javax.swing.JTextField PetAge;
    private javax.swing.JTextField PetName;
    private javax.swing.JRadioButton UnHealthy;
    private javax.swing.JButton giveUP;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton profile;
    // End of variables declaration//GEN-END:variables
}
