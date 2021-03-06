/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import ernrestoroman.EmpleadoOficina;
import ernrestoroman.EmpleadoProduccion;
import ernrestoroman.IOperaciones;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class jfPrincipal extends javax.swing.JFrame {



    agregarRegistro ifAgregar;
    mostrarRegistro ifMostrar;
    IOperaciones io = new IOperaciones() {
        
        public ArrayList <EmpleadoOficina> empOf = new ArrayList <>();
        public ArrayList <EmpleadoProduccion> empPr = new ArrayList <>();
        
        @Override
        public void agregarRegistro(EmpleadoOficina emp) {
            empOf.add(emp);            
        }

        @Override
        public void agregarRegistro(EmpleadoProduccion emp) {
            empPr.add(emp);
        }

        @Override
        public void mostrarRegistro(mostrarRegistro reg) {
            reg.setTaRegistro(reg.getTaRegistro() + "Empleados de Oficina\n");
            for (EmpleadoOficina temOf: empOf) {
                reg.setTaRegistro(reg.getTaRegistro() + "\n" + "ID  : " +  temOf.getId() + "\n" + "Nombre : " + temOf.getNombre() + "\n" +
                                  "Apellido: " + temOf.getApellido() + "\n" + 
                                  "Salario final: " + temOf.getSalarioBase() + "\n" + 
                                  "Horas extras: " + temOf.getHorasExtras());
            }
            reg.setTaRegistro(reg.getTaRegistro() + "\nEmpleados de Producción");
            for (EmpleadoProduccion temPr: empPr) {
                reg.setTaRegistro(reg.getTaRegistro() + "\n" + "ID  : " +  temPr.getId() + "\n" + "Nombre : " + temPr.getNombre() + "\n" +
                                  "Apellido: " + temPr.getApellido() + "\n" + 
                                  "Salario final: " + temPr.getSalarioBase() + "\n" + 
                                  "Horas extras: " + temPr.getHorasExtras() + "\n" + 
                                  "Bono: " + temPr.getBono());
            }
            
        }
    };
    
    public jfPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ifAgregar = new agregarRegistro(io);
        this.ifMostrar = new mostrarRegistro(io);
        jdPrincipal.add(ifAgregar);
        jdPrincipal.add(ifMostrar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdPrincipalLayout = new javax.swing.GroupLayout(jdPrincipal);
        jdPrincipal.setLayout(jdPrincipalLayout);
        jdPrincipalLayout.setHorizontalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );
        jdPrincipalLayout.setVerticalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jMenu1.setText("Opciones");

        jMenuItem1.setText("agregar registro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("mostrar registro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ifMostrar.setVisible(true);
        ifMostrar.mostrar();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ifAgregar.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JDesktopPane jdPrincipal;
    // End of variables declaration//GEN-END:variables
}
