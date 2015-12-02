/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.sistematransporte.vistas;

import com.co.sistematransporte.clases.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DESARROLLO
 */
public class Rutas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Rutas
     */
    public Rutas() {
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

        lblNombre = new javax.swing.JLabel();
        txtCantidadParadas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTarifa = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtIDRutas = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Rutas");
        setToolTipText("Rutas");
        setMaximumSize(new java.awt.Dimension(500, 517));
        setMinimumSize(new java.awt.Dimension(500, 517));
        setNormalBounds(new java.awt.Rectangle(0, 0, 500, 517));
        setPreferredSize(new java.awt.Dimension(500, 517));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNombre);
        lblNombre.setBounds(20, 60, 110, 30);

        txtCantidadParadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtCantidadParadas);
        txtCantidadParadas.setBounds(130, 100, 150, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cantidad Paradas");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 100, 110, 30);

        tblTarifa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo Tarifa", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTarifa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 452, 280);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(390, 60, 90, 30);

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo);
        btnNuevo.setBounds(290, 20, 90, 29);

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(390, 20, 90, 30);

        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(290, 60, 90, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 110, 30);

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtNombre);
        txtNombre.setBounds(130, 60, 150, 30);

        txtIDRutas.setEditable(false);
        txtIDRutas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtIDRutas);
        txtIDRutas.setBounds(130, 20, 150, 30);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(290, 100, 90, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int idRuta=0;
    
    public void manejoBotonera(boolean nuevo,boolean guardar,boolean modificar,boolean eliminar,boolean cancelar){
        btnNuevo.setEnabled(nuevo);
        btnGuardar.setEnabled(guardar);
        btnModificar.setEnabled(modificar);
        btnEliminar.setEnabled(eliminar);
        btnCancelar.setEnabled(cancelar);
    }
    
    public void limpiar(){
        txtIDRutas.setText("");
        txtNombre.setText("");
        txtCantidadParadas.setText("");
        txtIDRutas.requestFocus();
    }
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        manejoBotonera(false, true, false, false,true);
        txtIDRutas.setText(Integer.toString(idRuta));
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model= (DefaultTableModel) tblTarifa.getModel();
            if(!txtIDRutas.getText().equals("")){
                if(!txtIDRutas.getText().equals("")){
                    Utilidades ut = new Utilidades();
                    if(ut.isNumeric(txtCantidadParadas.getText())){
                        model.addRow(new Object[]{txtIDRutas.getText(),txtNombre.getText(),txtCantidadParadas.getText()});
                        idRuta++;
                        limpiar();
                        txtIDRutas.setText(Integer.toString(idRuta));
                        manejoBotonera(true, false, true, true,false);
                    }else{
                        JOptionPane.showMessageDialog(this, "Digite el valor de la Tarifa!!");
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Digite el Tipo de la Tarifa!!");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Digite ID de la Tarifa!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: "+e.getMessage());
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int numFilaSeleccionada=tblTarifa.getSelectedRow();
        if(numFilaSeleccionada>=0){

        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una tarifa para modificar!!");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        if(tblTarifa.getRowCount()>0){
            manejoBotonera(true, false, true, true, false);
        }else{
            manejoBotonera(true, false, false, false, false);
        }

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
         int numFilas=tblTarifa.getRowCount();
        if(numFilas>0){
            manejoBotonera(true, false, true, true,false);
        }else{
            idRuta=1;            
        }
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblTarifa;
    private javax.swing.JTextField txtCantidadParadas;
    private javax.swing.JTextField txtIDRutas;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
