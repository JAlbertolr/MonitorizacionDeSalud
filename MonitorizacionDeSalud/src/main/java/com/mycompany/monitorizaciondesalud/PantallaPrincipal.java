
package com.mycompany.monitorizaciondesalud;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PantallaPrincipal extends javax.swing.JFrame {

   
    public PantallaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        nombreAPP = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 800));
        setMinimumSize(new java.awt.Dimension(600, 800));
        getContentPane().setLayout(new java.awt.GridLayout(10, 1, 5, 5));

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        nombreAPP.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        nombreAPP.setText("Monitoreo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(nombreAPP, gridBagConstraints);

        nombreUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreUsuario.setText("Usuario: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(nombreUsuario, gridBagConstraints);

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pulsoBajo (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(55, 52));
        jLabel1.setMinimumSize(new java.awt.Dimension(55, 52));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel2, gridBagConstraints);

        getContentPane().add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3);

        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4);

        getContentPane().add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        jLabel5.setText("jLabel5");
        jPanel4.add(jLabel5);

        jLabel6.setText("jLabel6");
        jPanel4.add(jLabel6);

        getContentPane().add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        jLabel7.setText("jLabel7");
        jPanel5.add(jLabel7);

        jLabel8.setText("jLabel8");
        jPanel5.add(jLabel8);

        getContentPane().add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        jLabel9.setText("jLabel9");
        jPanel6.add(jLabel9);

        jLabel10.setText("jLabel10");
        jPanel6.add(jLabel10);

        getContentPane().add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        jLabel11.setText("jLabel11");
        jPanel7.add(jLabel11);

        jLabel12.setText("jLabel12");
        jPanel7.add(jLabel12);

        getContentPane().add(jPanel7);

        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        jLabel13.setText("jLabel13");
        jPanel8.add(jLabel13);

        jLabel14.setText("jLabel14");
        jPanel8.add(jLabel14);

        getContentPane().add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(1, 3));
        jPanel9.add(jLabel15);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel9.add(btnActualizar);
        jPanel9.add(jLabel16);

        getContentPane().add(jPanel9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         UIManager.setLookAndFeel(new FlatDarkLaf());

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel nombreAPP;
    private javax.swing.JLabel nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
