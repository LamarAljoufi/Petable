package petable;

public class Main extends javax.swing.JFrame {

    private static DatabaseConnection DB;

    public Main(DatabaseConnection DB) {

        this.DB = DB;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Adopt = new javax.swing.JButton();
        give_up = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(390, 844));
        jPanel1.setMinimumSize(new java.awt.Dimension(390, 844));
        jPanel1.setPreferredSize(new java.awt.Dimension(390, 844));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Adopt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/Adopte button.png"))); // NOI18N
        Adopt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdoptActionPerformed(evt);
            }
        });
        jPanel1.add(Adopt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 120, 50));

        give_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/Give up button.png"))); // NOI18N
        give_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                give_upActionPerformed(evt);
            }
        });
        jPanel1.add(give_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 120, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petable/Main.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 844));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void give_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_give_upActionPerformed
        // TODO add your handling code here:
        new GiveUp(DB).setVisible(true);
    }//GEN-LAST:event_give_upActionPerformed

    private void AdoptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdoptActionPerformed
        // TODO add your handling code here:

        Adopt adopt = new Adopt(DB);
        adopt.setVisible(true);
    }//GEN-LAST:event_AdoptActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(DB).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adopt;
    private javax.swing.JButton give_up;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
