/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import logica.CantanteFamoso;
import static logica.ListaCantantesFamosos.cantantes;
import static ui.EditarCantante.txtfIndiceEditarCantante;

/**
 *
 * @author Nicolas
 */
public class EditarDatosCantante extends javax.swing.JFrame {

    /**
     * Creates new form AgregarCantante
     */
    public EditarDatosCantante() {
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
        lbNuevoNumeroVisitas = new javax.swing.JLabel();
        txtfIngresarNombreNuevo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfDiscoConMasVentasNuevo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfNuevoNumeroTotalVentas = new javax.swing.JTextField();
        btnEnviarEdicionCantante = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbNuevoNombreCantante = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbNuevoDiscoVentasEditar = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Editar Cantante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        lbNuevoNumeroVisitas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNuevoNumeroVisitas.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbNuevoNumeroVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 140, 20));

        txtfIngresarNombreNuevo.setBackground(new java.awt.Color(153, 153, 153));
        txtfIngresarNombreNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfIngresarNombreNuevo.setForeground(new java.awt.Color(0, 0, 0));
        txtfIngresarNombreNuevo.setBorder(null);
        txtfIngresarNombreNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIngresarNombreNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(txtfIngresarNombreNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 210, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nuevo disco con mas ventas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        txtfDiscoConMasVentasNuevo.setBackground(new java.awt.Color(153, 153, 153));
        txtfDiscoConMasVentasNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfDiscoConMasVentasNuevo.setForeground(new java.awt.Color(0, 0, 0));
        txtfDiscoConMasVentasNuevo.setBorder(null);
        jPanel1.add(txtfDiscoConMasVentasNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 210, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nuevo numero total de ventas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        txtfNuevoNumeroTotalVentas.setBackground(new java.awt.Color(153, 153, 153));
        txtfNuevoNumeroTotalVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfNuevoNumeroTotalVentas.setForeground(new java.awt.Color(0, 0, 0));
        txtfNuevoNumeroTotalVentas.setBorder(null);
        jPanel1.add(txtfNuevoNumeroTotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 210, 30));

        btnEnviarEdicionCantante.setBackground(new java.awt.Color(153, 153, 153));
        btnEnviarEdicionCantante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnviarEdicionCantante.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviarEdicionCantante.setText("Editar");
        btnEnviarEdicionCantante.setBorder(null);
        btnEnviarEdicionCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarEdicionCantanteActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviarEdicionCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nuevo nombre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Numero de ventas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        lbNuevoNombreCantante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNuevoNombreCantante.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbNuevoNombreCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 140, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Seleccionado");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Disco");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        lbNuevoDiscoVentasEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNuevoDiscoVentasEditar.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbNuevoDiscoVentasEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 140, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarEdicionCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarEdicionCantanteActionPerformed

        try {

            int ind = Integer.parseInt(txtfIndiceEditarCantante.getText());
            CantanteFamoso cantanteSeleccionado = cantantes.get(ind - 1);

            cantanteSeleccionado.setNombre(txtfIngresarNombreNuevo.getText());
            cantanteSeleccionado.setDiscoConMasVentas(txtfDiscoConMasVentasNuevo.getText());
            cantanteSeleccionado.setTotalVentas(Integer.parseInt(txtfNuevoNumeroTotalVentas.getText())); // esta linea esta jodida

            JOptionPane.showMessageDialog(null, "Editado Exitosamente!");

            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese bien los datos.");
            this.dispose();

        }

    }//GEN-LAST:event_btnEnviarEdicionCantanteActionPerformed

    public JLabel getLbNuevoNombreCantante() {
        return lbNuevoNombreCantante;
    }

    public void setLbNuevoNombreCantante(JLabel lbNuevoNombreCantante) {
        this.lbNuevoNombreCantante = lbNuevoNombreCantante;
    }

    public JLabel getLbNuevoDiscoVentasEditar() {
        return lbNuevoDiscoVentasEditar;
    }

    public void setLbNuevoDiscoVentasEditar(JLabel lbNuevoDiscoVentasEditar) {
        this.lbNuevoDiscoVentasEditar = lbNuevoDiscoVentasEditar;
    }

    public JLabel getLbNuevoNumeroVisitas() {
        return lbNuevoNumeroVisitas;
    }

    public void setLbNuevoNumeroVisitas(JLabel lbNuevoNumeroVisitas) {
        this.lbNuevoNumeroVisitas = lbNuevoNumeroVisitas;
    }

    public JTextField getTxtfDiscoConMasVentasNuevo() {
        return txtfDiscoConMasVentasNuevo;
    }

    public void setTxtfDiscoConMasVentasNuevo(JTextField txtfDiscoConMasVentasNuevo) {
        this.txtfDiscoConMasVentasNuevo = txtfDiscoConMasVentasNuevo;
    }

    public JTextField getTxtfIngresarNombre1() {
        return txtfIngresarNombre1;
    }

    public void setTxtfIngresarNombre1(JTextField txtfIngresarNombre1) {
        this.txtfIngresarNombre1 = txtfIngresarNombre1;
    }

    public JTextField getTxtfIngresarNombreNuevo() {
        return txtfIngresarNombreNuevo;
    }

    public JTextField getTxtfNuevoNumeroTotalVentas() {
        return txtfNuevoNumeroTotalVentas;
    }

    public void setTxtfNuevoNumeroTotalVentas(JTextField txtfNuevoNumeroTotalVentas) {
        this.txtfNuevoNumeroTotalVentas = txtfNuevoNumeroTotalVentas;
    }

    public void setTxtfTotalVentasNuevo(JTextField txtfTotalVentasNuevo) {
        this.txtfNuevoNumeroTotalVentas = txtfTotalVentasNuevo;
    }


    private void txtfIngresarNombreNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIngresarNombreNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIngresarNombreNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarDatosCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarDatosCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarDatosCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarDatosCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarDatosCantante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarEdicionCantante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbNuevoDiscoVentasEditar;
    private javax.swing.JLabel lbNuevoNombreCantante;
    private javax.swing.JLabel lbNuevoNumeroVisitas;
    private javax.swing.JTextField txtfDiscoConMasVentasNuevo;
    private javax.swing.JTextField txtfIngresarNombre1;
    private javax.swing.JTextField txtfIngresarNombreNuevo;
    private javax.swing.JTextField txtfNuevoNumeroTotalVentas;
    // End of variables declaration//GEN-END:variables
}
