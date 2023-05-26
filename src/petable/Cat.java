package petable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Cat extends javax.swing.JFrame {

    private static int ID;
    private String name;
    private int age;
    private String gender;
    private boolean healthStatus;
    private boolean isAdopted;
    private DatabaseConnection DB = SharedContext.getDB();
    private static String input1;
    private static String input2;
    private static String input3;

    public Cat() throws Exception {
        species = "Cat";
        initComponents();
        input1 = DB.retPet(species);
        jLabel2.setText(input1);
        input2 = DB.retPet(species);
        jLabel3.setText(input2);
        input3 = DB.retPet(species);
        jLabel4.setText(input3);

    }

    public Cat(String name, int age, String gender, boolean healthStatus, boolean isAdopted, String species) throws Exception {
        if (!species.toLowerCase().equals("cat")) {
            throw new Exception("Invalid pet type for cat");
        }

        this.ID = (int) (Math.random() * 999);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.healthStatus = healthStatus;
        this.isAdopted = false;
        DB.addCat(this);
        initComponents();
        PrintID();

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    private String species;

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        giveUP = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(390, 844));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(60, 63, 65));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/photos/chooseB.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 70, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/photos/chooseB.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 70, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/photos/chooseB.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 70, 30));

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
        giveUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveUPActionPerformed(evt);
            }
        });
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

        jLabel4.setFont(new java.awt.Font("Meiryo", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 34, 92));
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 140, 100));

        jLabel3.setFont(new java.awt.Font("Meiryo", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 34, 92));
        jLabel3.setText("jLabel3");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 140, 100));

        jLabel2.setFont(new java.awt.Font("Meiryo", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 34, 92));
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setFocusCycleRoot(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 140, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/photos/cat1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 840));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setID(input1);
        try {
            this.setIsAdopted(true);
        } catch (SQLException ex) {
            Logger.getLogger(Cat.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintID();
        try {
            new Invoice().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Cat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setID(input2);
        try {
            this.setIsAdopted(true);
        } catch (SQLException ex) {
            Logger.getLogger(Cat.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        PrintID();
        try {
            new Invoice().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Cat.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setID(input3);
        try {
            this.setIsAdopted(true);
        } catch (SQLException ex) {
            Logger.getLogger(Cat.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintID();
        try {
            new Invoice().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Cat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
         new Main().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void giveUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveUPActionPerformed
        new GiveUp().setVisible(true);
    }//GEN-LAST:event_giveUPActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
         new Profile().setVisible(true);
    }//GEN-LAST:event_profileActionPerformed

    public void PrintID() {
        try {
            ObjectOutputStream outputStream = SharedContext.getoutputStream();
            outputStream.writeInt(ID);
            outputStream.flush();
            System.out.println(ID);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setID(String input) {
        String idPrefix = "Pet's ID: ";
        int startIndex = input.indexOf(idPrefix) + idPrefix.length();
        int endIndex = input.indexOf("<br>", startIndex);
        this.ID = Integer.parseInt(input.substring(startIndex, endIndex));
    }

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
            java.util.logging.Logger.getLogger(Cat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Cat().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Cat.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giveUP;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profile;
    // End of variables declaration//GEN-END:variables
}
