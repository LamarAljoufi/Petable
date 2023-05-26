package petable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Adopt extends javax.swing.JFrame {

    public Adopt() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        home = new javax.swing.JButton();
        giveUP = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(390, 844));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/CatsB1.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 96, 57));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/DogsB1.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 96, 57));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Adopt.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 848));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new Cat().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Adopt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            new Dog().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Adopt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
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
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(Adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adopt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giveUP;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profile;
    // End of variables declaration//GEN-END:variables
}
