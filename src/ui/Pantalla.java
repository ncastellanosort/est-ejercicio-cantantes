/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import logica.ListaCantantesFamosos;

/**
 *
 * @author Nicolas
 */
public class Pantalla extends javax.swing.JFrame {

    DefaultListModel modeloLista = new DefaultListModel();

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
        frameListaCantantes.setModel(modeloLista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminarCantante = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAgregarCantante1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnEditarCantante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        frameListaCantantes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ejercicio Cantantes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Eliminar cantante");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, -1, -1));

        btnEliminarCantante.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarCantante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminarCantante.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarCantante.setText("Eliminar");
        btnEliminarCantante.setBorder(null);
        btnEliminarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCantanteActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 90, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Agregar cantante");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        btnAgregarCantante1.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarCantante1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarCantante1.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCantante1.setText("Agregar");
        btnAgregarCantante1.setBorder(null);
        btnAgregarCantante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCantante1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCantante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Editar cantante");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        btnEditarCantante.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarCantante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarCantante.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarCantante.setText("Editar");
        btnEditarCantante.setBorder(null);
        btnEditarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCantanteActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 90, 30));

        frameListaCantantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(frameListaCantantes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 440, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCantanteActionPerformed

        EliminarCantante eliminar = new EliminarCantante();

        if (ListaCantantesFamosos.cantantes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cantantes para eliminar.");
        } else {
            eliminar.setLocationRelativeTo(null);
            eliminar.setResizable(false);
            eliminar.setVisible(true);

            eliminar.getLbNombresCantantes().setText(ListaCantantesFamosos.mostrarNombreCantantesJframe());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCantanteActionPerformed

    private void btnAgregarCantante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCantante1ActionPerformed



        AgregarCantante agregarCantante = new AgregarCantante();

        agregarCantante.setLocationRelativeTo(null);
        agregarCantante.setResizable(false);
        agregarCantante.setVisible(true);

        
        for (int i = 0; i < ListaCantantesFamosos.cantantes.size(); i++) {
            modeloLista.addElement(ListaCantantesFamosos.datosTablaFrame(i));
            
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCantante1ActionPerformed

    private void btnEditarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCantanteActionPerformed

        EditarCantante editarCantante = new EditarCantante();

        if (ListaCantantesFamosos.cantantes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cantantes para editar.");
        } else {

            try {
                editarCantante.getLbNombresCantantesEditar().setText(ListaCantantesFamosos.mostrarNombreCantantesJframe());

                editarCantante.setLocationRelativeTo(null);
                editarCantante.setResizable(false);
                editarCantante.setVisible(true);

            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Ingrese bien los datos.");
            }

        }    // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCantanteActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCantante1;
    private javax.swing.JButton btnEditarCantante;
    private javax.swing.JButton btnEliminarCantante;
    private javax.swing.JList<String> frameListaCantantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
