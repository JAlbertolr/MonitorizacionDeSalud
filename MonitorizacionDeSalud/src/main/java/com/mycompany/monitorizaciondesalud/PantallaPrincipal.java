
package com.mycompany.monitorizaciondesalud;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JDialog;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PantallaPrincipal extends javax.swing.JFrame {

  
    public PantallaPrincipal() {
        initComponents();
        JDialog dia=new JDialog();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        nombreAPP = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        nombreUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labelKM = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labelPulso = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        labelPasos = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        labelCalorias = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        labelDescanso = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 800));
        setMinimumSize(new java.awt.Dimension(600, 800));
        getContentPane().setLayout(new java.awt.GridLayout(9, 1, 5, 5));

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new java.awt.GridLayout());

        nombreAPP.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        nombreAPP.setForeground(new java.awt.Color(204, 204, 204));
        nombreAPP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreAPP.setText("Monitoreo");
        jPanel1.add(nombreAPP);

        getContentPane().add(jPanel1);

        jPanel8.setLayout(new java.awt.GridLayout(1, 3));

        jPanel10.setLayout(new java.awt.GridLayout(1, 0, 10, 10));

        nombreUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreUsuario.setText("Usuario: ");
        nombreUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel10.add(nombreUsuario);

        jPanel8.add(jPanel10);

        getContentPane().add(jPanel8);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setMaximumSize(new java.awt.Dimension(55, 52));
        jLabel1.setMinimumSize(new java.awt.Dimension(55, 52));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel1, gridBagConstraints);

        labelPeso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelPeso.setForeground(new java.awt.Color(102, 102, 102));
        labelPeso.setText("Peso: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(labelPeso, gridBagConstraints);

        getContentPane().add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));
        jPanel3.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel3, gridBagConstraints);

        labelKM.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelKM.setForeground(new java.awt.Color(102, 102, 102));
        labelKM.setText("KM: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(labelKM, gridBagConstraints);

        getContentPane().add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jLabel5, gridBagConstraints);

        labelPulso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelPulso.setForeground(new java.awt.Color(102, 102, 102));
        labelPulso.setText("Pulso cardíaco: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(labelPulso, gridBagConstraints);

        getContentPane().add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jLabel7, gridBagConstraints);

        labelPasos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelPasos.setForeground(new java.awt.Color(102, 102, 102));
        labelPasos.setText("Pasos: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(labelPasos, gridBagConstraints);

        getContentPane().add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel6.add(jLabel9, gridBagConstraints);

        labelCalorias.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelCalorias.setForeground(new java.awt.Color(102, 102, 102));
        labelCalorias.setText("Calorias: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 1.0;
        jPanel6.add(labelCalorias, gridBagConstraints);

        getContentPane().add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(jLabel11, gridBagConstraints);

        labelDescanso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelDescanso.setForeground(new java.awt.Color(102, 102, 102));
        labelDescanso.setText("Descanso: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(labelDescanso, gridBagConstraints);

        getContentPane().add(jPanel7);

        jPanel9.setLayout(new java.awt.GridLayout(3, 3));
        jPanel9.add(jLabel15);
        jPanel9.add(jLabel18);
        jPanel9.add(jLabel13);
        jPanel9.add(jLabel17);

        btnActualizar.setBackground(new java.awt.Color(102, 102, 255));
        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel9.add(btnActualizar);
        jPanel9.add(jLabel14);
        jPanel9.add(jLabel16);

        getContentPane().add(jPanel9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       //Calorias
        int calorias=(int)(Math.random()*3000)+1;
        labelCalorias.setText("Calorias: "+calorias);
        //Kilometros
        int kilometros=(int)(Math.random()*50)+1;
        labelKM.setText("KM: "+kilometros);
        //Descanso
         int horas=(int)(Math.random()*7)+1;
         int minutos=(int)(Math.random()*59)+1;
        labelDescanso.setText("Descanso: "+horas+":"+minutos);
        //Pulso
         int pulso=(int)(Math.random()*140)+40;
        labelPulso.setText("Pulso: "+pulso);
        //Distancia (metros)
         int pasos=(int)(Math.random()*100000)+1;
        labelPasos.setText("Pasos: "+pasos);
        //Peso
        int peso=(int)(Math.random()*70)+40;
        labelPeso.setText("Peso: "+peso);
        
        
        
        
        
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelCalorias;
    private javax.swing.JLabel labelDescanso;
    private javax.swing.JLabel labelKM;
    private javax.swing.JLabel labelPasos;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelPulso;
    private javax.swing.JLabel nombreAPP;
    private javax.swing.JLabel nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
