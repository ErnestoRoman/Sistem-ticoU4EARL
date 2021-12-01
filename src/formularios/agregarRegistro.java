/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package formularios;

import ernrestoroman.EmpleadoOficina;
import ernrestoroman.EmpleadoProduccion;
import ernrestoroman.IOperaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class agregarRegistro extends javax.swing.JInternalFrame {

    IOperaciones io;
    
    public agregarRegistro(IOperaciones io) {
        initComponents();
        this.io = io;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtSalarioBase = new javax.swing.JTextField();
        jtHorasExtras = new javax.swing.JTextField();
        jlbono = new javax.swing.JLabel();
        jtBono = new javax.swing.JTextField();
        jcEmpleado = new javax.swing.JComboBox<>();
        jbGuardar = new javax.swing.JButton();
        jtId = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Agregar");

        jLabel1.setText("Id: ");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Apellido: ");

        jLabel4.setText("Salario base:");

        jLabel5.setText("Horas extras: ");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });

        jlbono.setText("Bono:");

        jcEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado de oficina", "Empleado de produccion" }));
        jcEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpleadoActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbono)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtHorasExtras)
                    .addComponent(jtApellido)
                    .addComponent(jtSalarioBase, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtNombre)
                    .addComponent(jtBono, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jtId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jcEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtHorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbono)
                    .addComponent(jtBono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int id; String nombre, apellido; double salarioBase; double horasExtras; double bono;
           id = Integer.parseInt(jtId.getText());
           nombre = jtNombre.getText();
           apellido = jtApellido.getText();
           salarioBase = Double.parseDouble(jtSalarioBase.getText());
           horasExtras = Double.parseDouble(jtHorasExtras.getText());
        
        if(jcEmpleado.getSelectedItem() == "Empleado de oficina"){
           EmpleadoOficina emOf = new EmpleadoOficina(apellido,horasExtras,id, nombre,salarioBase);
           io.agregarRegistro(emOf);
           
       }else if(jcEmpleado.getSelectedItem() == "Empleado de produccion"){
           bono = Double.parseDouble(jtBono.getText());
           EmpleadoProduccion emPr = new EmpleadoProduccion(apellido, horasExtras, id, nombre, salarioBase,bono);
           io.agregarRegistro(emPr);
       }
        
        JOptionPane.showMessageDialog(null, "Registro guardado en " + jcEmpleado.getSelectedItem());
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpleadoActionPerformed
        if(jcEmpleado.getSelectedItem() == "Empleado de produccion"){
            jtBono.setEnabled(true);
        }else{
            jtBono.setEnabled(false);
        }
    }//GEN-LAST:event_jcEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<String> jcEmpleado;
    private javax.swing.JLabel jlbono;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtBono;
    private javax.swing.JTextField jtHorasExtras;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtSalarioBase;
    // End of variables declaration//GEN-END:variables
}
