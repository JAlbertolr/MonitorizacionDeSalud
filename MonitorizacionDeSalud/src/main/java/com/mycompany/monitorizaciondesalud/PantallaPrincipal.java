package com.mycompany.monitorizaciondesalud;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;

public class PantallaPrincipal extends javax.swing.JFrame {

    public PantallaPrincipal() {
        initComponents();
        configurarInteracciones();
        // Crear el JFrame principal para pedir el nombre
        JFrame frame = new JFrame("Monitorización de Salud");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null); // Centra la ventana

        // Mostrar el JDialog al inicio
        NombreDialog dialog = new NombreDialog(frame);
        dialog.setVisible(true); // Muestra el diálogo

        // Obtener el nombre ingresado
        String nombreUsu = dialog.getNombre(); // Variable para almacenar el nombre del usuario
        nombreUsuario.setText("Usuario: " + nombreUsu);
        //Centrar aplicación
        this.setLocationRelativeTo(null);

        //Insertar imágenes en los Jlabel
        ImageIcon iconPasos = new ImageIcon(getClass().getResource("/images/pasosFail.png"));
        iPasos.setIcon(iconPasos);
        ImageIcon iconKM = new ImageIcon(getClass().getResource("/images/km.png"));
        iKM.setIcon(iconKM);
        ImageIcon iconCalorias = new ImageIcon(getClass().getResource("/images/calorias.png"));
        iCalorias.setIcon(iconCalorias);
        ImageIcon iconPulso = new ImageIcon(getClass().getResource("/images/monitor-de-pulso-cardiaco.png"));
        iPulso.setIcon(iconPulso);
        ImageIcon iconPeso = new ImageIcon(getClass().getResource("/images/peso.png"));
        iPeso.setIcon(iconPeso);
        ImageIcon iconDescanso = new ImageIcon(getClass().getResource("/images/calidad-de-sueno.png"));
        iDescanso.setIcon(iconDescanso);

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
        iPeso = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        iKM = new javax.swing.JLabel();
        labelKM = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        iPulso = new javax.swing.JLabel();
        labelPulso = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        iPasos = new javax.swing.JLabel();
        labelPasos = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        iCalorias = new javax.swing.JLabel();
        labelCalorias = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        iDescanso = new javax.swing.JLabel();
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
        setLocation(new java.awt.Point(100, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 400, 600));
        setMaximumSize(new java.awt.Dimension(400, 600));
        setMinimumSize(new java.awt.Dimension(400, 600));
        setSize(new java.awt.Dimension(400, 600));
        getContentPane().setLayout(new java.awt.GridLayout(9, 1, 5, 5));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        nombreAPP.setFont(new java.awt.Font("Dialog", 3, 26)); // NOI18N
        nombreAPP.setForeground(new java.awt.Color(102, 102, 255));
        nombreAPP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreAPP.setText("MONITORIZACIÓN DE SALUD");
        jPanel1.add(nombreAPP);

        getContentPane().add(jPanel1);

        jPanel8.setPreferredSize(new java.awt.Dimension(200, 62));
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
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 62));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        iPeso.setMaximumSize(new java.awt.Dimension(55, 52));
        iPeso.setMinimumSize(new java.awt.Dimension(55, 52));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(iPeso, gridBagConstraints);

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
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 62));
        jPanel3.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(iKM, gridBagConstraints);

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
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 62));
        jPanel4.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(iPulso, gridBagConstraints);

        labelPulso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelPulso.setForeground(new java.awt.Color(102, 102, 102));
        labelPulso.setText("Pulso: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(labelPulso, gridBagConstraints);

        getContentPane().add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 62));
        jPanel5.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(iPasos, gridBagConstraints);

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
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 62));
        jPanel6.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel6.add(iCalorias, gridBagConstraints);

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
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 62));
        jPanel7.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(iDescanso, gridBagConstraints);

        labelDescanso.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelDescanso.setForeground(new java.awt.Color(102, 102, 102));
        labelDescanso.setText("Descanso: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(labelDescanso, gridBagConstraints);

        getContentPane().add(jPanel7);

        jPanel9.setPreferredSize(new java.awt.Dimension(300, 75));
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

        ImageIcon icon;
        // Calorías
        int calorias = generarAleatorio(1, 3000);
        labelCalorias.setText("Calorías: " + calorias);

        // Peso
        int peso = generarAleatorio(40, 70);
        labelPeso.setText("Peso: " + peso);

        // Kilómetros
        int kilometros = generarAleatorio(1, 20);
        labelKM.setText("KM: " + kilometros);

        //Descanso
        int horas = generarAleatorio(0, 10);
        int minutos = generarAleatorio(0, 60);
        labelDescanso.setText("Descanso: " + horas + ":" + minutos);
        if (horas < 3) {
            icon = new ImageIcon(getClass().getResource("/images/expectativa.png"));
            iDescanso.setIcon(icon);
        } else if (horas > 5) {
            icon = new ImageIcon(getClass().getResource("/images/suenos.png"));
            iDescanso.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/images/calidad-de-sueno.png"));
            iDescanso.setIcon(icon);
        }
        //Pulso
        int pulso = generarAleatorio(40, 200);
        labelPulso.setText("Pulso: " + pulso);
        if (pulso > 120) {
            icon = new ImageIcon(getClass().getResource("/images/pulsoAlto.png"));
            iPulso.setIcon(icon);

        } else if (pulso < 80) {
            icon = new ImageIcon(getClass().getResource("/images/pulsoBajo (1).png"));
            iPulso.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/images/pulsoMedio.png"));
            iPulso.setIcon(icon);
        }
        //Distancia (metros)
        int pasos = generarAleatorio(1, 50000);
        labelPasos.setText("Pasos: " + pasos);
        if (pasos > 20000) {
            icon = new ImageIcon(getClass().getResource("/images/pasosPass.png"));
            iPasos.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/images/pasosFail.png"));
            iPasos.setIcon(icon);
        }


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

    //Añadir hover
    private void configurarInteracciones() {
        // Agregar comportamiento a cada JPanel
        configurarPanelHover(jPanel2);
        configurarPanelHover(jPanel3);
        configurarPanelHover(jPanel4);
        configurarPanelHover(jPanel5);
        configurarPanelHover(jPanel6);
        configurarPanelHover(jPanel7);
    }

    private void configurarPanelHover(javax.swing.JPanel panel) {
        panel.addMouseListener(new MouseAdapter() {
            Color colorOriginal = panel.getBackground();

            @Override
            public void mouseEntered(MouseEvent e) {
                // Cambiar color y simular reducción de tamaño
                panel.setBackground(colorOriginal.darker());
                panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Restaurar color y tamaño original
                panel.setBackground(colorOriginal);
                panel.setBorder(BorderFactory.createEmptyBorder());
            }
        });
    }

    //Método que genera un numero entre un rango de valores(min y max incluidos)
    public int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel iCalorias;
    private javax.swing.JLabel iDescanso;
    private javax.swing.JLabel iKM;
    private javax.swing.JLabel iPasos;
    private javax.swing.JLabel iPeso;
    private javax.swing.JLabel iPulso;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
