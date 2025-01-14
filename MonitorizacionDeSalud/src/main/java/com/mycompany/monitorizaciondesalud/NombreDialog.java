
package com.mycompany.monitorizaciondesalud;

import javax.swing.*;

public class NombreDialog extends JDialog {
    private JTextField txtNombre;
    private JButton btnAceptar;
    private String nombre; // Variable para almacenar el nombre

    public NombreDialog(JFrame parent) {
        super(parent, "Ingreso de Nombre", true); // Modal
        initComponents();
    }

    private void initComponents() {
        JLabel lblNombre = new JLabel("Ingrese su nombre:");
        txtNombre = new JTextField(20);
        btnAceptar = new JButton("Aceptar");

        btnAceptar.addActionListener(evt -> btnAceptarActionPerformed());

        // Configuración del layout
        setLayout(new java.awt.FlowLayout());
        add(lblNombre);
        add(txtNombre);
        add(btnAceptar);

        // Configuración del diálogo
        setSize(300, 150);
        setLocationRelativeTo(null); // Centra el diálogo
    }

    private void btnAceptarActionPerformed() {
        nombre = txtNombre.getText(); // Guarda el nombre ingresado
        if (!nombre.isEmpty()) {
            dispose(); // Cierra el diálogo
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese su nombre.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getNombre() {
        return nombre; // Método para obtener el nombre
    }
}
