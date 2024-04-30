/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import logica.ListaCantantesFamosos;

/**
 *
 * @author Nicolas
 */
public class AgregarCantante extends javax.swing.JFrame {

    /**
     * Creates new form AgregarCantante
     */
    public AgregarCantante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtfIngresarNombre1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtfIngresarNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfDiscoConMasVentas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfTotalVentas = new javax.swing.JTextField();
        btnAgregarCantanteFrame = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agregar Cantante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 91, -1, -1));

        txtfIngresarNombre.setBackground(new java.awt.Color(153, 153, 153));
        txtfIngresarNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfIngresarNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtfIngresarNombre.setBorder(null);
        jPanel1.add(txtfIngresarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 123, 210, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Disco con mas ventas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtfDiscoConMasVentas.setBackground(new java.awt.Color(153, 153, 153));
        txtfDiscoConMasVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfDiscoConMasVentas.setForeground(new java.awt.Color(0, 0, 0));
        txtfDiscoConMasVentas.setBorder(null);
        jPanel1.add(txtfDiscoConMasVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 210, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Total ventas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtfTotalVentas.setBackground(new java.awt.Color(153, 153, 153));
        txtfTotalVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfTotalVentas.setForeground(new java.awt.Color(0, 0, 0));
        txtfTotalVentas.setBorder(null);
        jPanel1.add(txtfTotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 210, 30));

        btnAgregarCantanteFrame.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarCantanteFrame.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarCantanteFrame.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCantanteFrame.setText("Agregar");
        btnAgregarCantanteFrame.setBorder(null);
        btnAgregarCantanteFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCantanteFrameActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCantanteFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCantanteFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCantanteFrameActionPerformed

        try {
            ListaCantantesFamosos.agregarCantante(txtfIngresarNombre.getText(), txtfDiscoConMasVentas.getText(), Integer.parseInt(txtfTotalVentas.getText()));
            JOptionPane.showMessageDialog(null, "Agregado Exitosamente!");
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente.");
            this.dispose();
        }

        

    }//GEN-LAST:event_btnAgregarCantanteFrameActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCantante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCantanteFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtfDiscoConMasVentas;
    private javax.swing.JTextField txtfIngresarNombre;
    private javax.swing.JTextField txtfIngresarNombre1;
    private javax.swing.JTextField txtfTotalVentas;
    // End of variables declaration//GEN-END:variables
}
