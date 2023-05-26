package petable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class User extends javax.swing.JFrame {

    private String name;
    private int age;
    private String phoneNo;
    private DatabaseConnection DB = SharedContext.getDB();

    public User() {
        initComponents();

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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        home = new javax.swing.JButton();
        giveUP = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(390, 844));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Age");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 87, -1));

        Age.setBackground(new java.awt.Color(255, 255, 255));
        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });
        jPanel1.add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 87, -1));

        Phone.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 87, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/NextB.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 90, 50));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Home1.png"))); // NOI18N
        home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 780, 60, 50));

        giveUP.setBackground(new java.awt.Color(255, 255, 255));
        giveUP.setForeground(new java.awt.Color(255, 255, 255));
        giveUP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/giveup1.png"))); // NOI18N
        giveUP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        giveUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveUPActionPerformed(evt);
            }
        });
        jPanel1.add(giveUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 780, 60, 50));

        profile.setBackground(new java.awt.Color(255, 255, 255));
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/profile1.png"))); // NOI18N
        profile.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 780, 60, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter your information");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 230, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/User.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 844));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String errorMessage = "";
        String nameText = Name.getText().trim();
        String ageText = Age.getText().trim();
        String phoneText = Phone.getText().trim();

        if (nameText.isEmpty()) {
            errorMessage += "Please enter a name.\n";
        }
        try {
            int age = Integer.parseInt(ageText);
            if (age <= 0) {
                errorMessage += "Age must be a positive number.\n";
            }
        } catch (NumberFormatException e) {
            errorMessage += "Age must be a number.\n";
        }
        if (phoneText.isEmpty()) {
            errorMessage += "Please enter a phone number.\n";
        } else if (!phoneText.matches("\\d{10}")) {
            errorMessage += "Phone number must be 10 digits.\n";
        }
        try {
            ObjectOutputStream outputStream = SharedContext.getoutputStream();
            outputStream.writeUTF(phoneText);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!errorMessage.isEmpty()) {
            JOptionPane.showMessageDialog(this, errorMessage, "Invalid input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.setName(nameText);
        this.setAge(Integer.parseInt(ageText));
        this.setPhoneNo(phoneText);
        DB.addUser(this);
        new Main().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
         new Main().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void giveUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveUPActionPerformed
        new GiveUp().setVisible(true);
    }//GEN-LAST:event_giveUPActionPerformed

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
            java.util.logging.Logger.getLogger(User.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton giveUP;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profile;
    // End of variables declaration//GEN-END:variables
}
