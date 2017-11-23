/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.AdminBD;
import modelo.Asesor;
import modelo.Seminario;


/**
 *
 * @author Jhon Nash
 */
public class JFrameFormAsesor extends javax.swing.JFrame {
    Asesor asesor = new Asesor();
    Seminario seminario = new Seminario();
    AdminBD adminBD = new AdminBD();

    /**
     * Creates new form JFrameFormAsesor
     */
    public JFrameFormAsesor() {
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

        jPanelAsesor = new javax.swing.JPanel();
        jLabNomAsesor = new javax.swing.JLabel();
        jLabCubiculo = new javax.swing.JLabel();
        jblCorrEletrAsesor = new javax.swing.JLabel();
        jLabHrAsesor = new javax.swing.JLabel();
        jtxtNombreAsesor = new javax.swing.JTextField();
        jtxtCubiculo = new javax.swing.JTextField();
        jtxtCorrEleAsesor = new javax.swing.JTextField();
        jtxtHrAsesoria = new javax.swing.JTextField();
        jbtnGuardarA = new javax.swing.JButton();
        jbtnCancelarA = new javax.swing.JButton();
        jlblApellidoPaterno = new javax.swing.JLabel();
        jlblApellicoMaterno = new javax.swing.JLabel();
        jtxtApellidoPaterno = new javax.swing.JTextField();
        jtxtApellidoMaterno = new javax.swing.JTextField();
        jlblTitle = new javax.swing.JLabel();
        jlblTelefono = new javax.swing.JLabel();
        jtxtTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA DE APOYO A LA TITULACION");

        jPanelAsesor.setBackground(new java.awt.Color(0, 204, 102));
        jPanelAsesor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabNomAsesor.setText("Nombre");

        jLabCubiculo.setText("Cubiculo");

        jblCorrEletrAsesor.setText("Correo electronico ");

        jLabHrAsesor.setText("Horario de asesorias");

        jtxtCubiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCubiculoActionPerformed(evt);
            }
        });

        jbtnGuardarA.setText("Guardar");
        jbtnGuardarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarAActionPerformed(evt);
            }
        });

        jbtnCancelarA.setText("Cancelar");
        jbtnCancelarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarAActionPerformed(evt);
            }
        });

        jlblApellidoPaterno.setText("Apellido Paterno");

        jlblApellicoMaterno.setText("Apellido Materno");

        jlblTitle.setText("REGISTRO DE ASESOR");

        jlblTelefono.setText("Telefono");

        javax.swing.GroupLayout jPanelAsesorLayout = new javax.swing.GroupLayout(jPanelAsesor);
        jPanelAsesor.setLayout(jPanelAsesorLayout);
        jPanelAsesorLayout.setHorizontalGroup(
            jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAsesorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblTitle)
                .addGap(139, 139, 139))
            .addGroup(jPanelAsesorLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblCorrEletrAsesor)
                    .addComponent(jLabHrAsesor)
                    .addComponent(jLabNomAsesor)
                    .addComponent(jlblApellidoPaterno)
                    .addComponent(jlblApellicoMaterno)
                    .addComponent(jLabCubiculo)
                    .addComponent(jlblTelefono))
                .addGap(47, 47, 47)
                .addGroup(jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtNombreAsesor)
                    .addComponent(jtxtCubiculo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCorrEleAsesor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtHrAsesoria, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAsesorLayout.createSequentialGroup()
                        .addComponent(jbtnCancelarA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnGuardarA)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtxtApellidoPaterno)
                    .addComponent(jtxtApellidoMaterno)
                    .addComponent(jtxtTelefono))
                .addGap(56, 56, 56))
        );
        jPanelAsesorLayout.setVerticalGroup(
            jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsesorLayout.createSequentialGroup()
                .addComponent(jlblTitle)
                .addGap(52, 52, 52)
                .addGroup(jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombreAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabNomAsesor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblApellidoPaterno)
                    .addComponent(jtxtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblApellicoMaterno)
                    .addComponent(jtxtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabCubiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCorrEletrAsesor)
                    .addComponent(jtxtCorrEleAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTelefono)
                    .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabHrAsesor)
                    .addComponent(jtxtHrAsesoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanelAsesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardarA)
                    .addComponent(jbtnCancelarA))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAsesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCubiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCubiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCubiculoActionPerformed

    private void jbtnCancelarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarAActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtnCancelarAActionPerformed

    private void jbtnGuardarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarAActionPerformed
        // TODO add your handling code here:
        asesor = new Asesor();
        seminario = new Seminario();
        adminBD = new AdminBD();
        
        seminario.agregarAsesor(this.jtxtNumeroTrabajador.getText(),
                this.jtxtNombreAsesor.getText(), this.jtxtApellidoPaterno.getText(),
                this.jtxtApellidoMaterno.getText(), this.jtxtCorrEleAsesor.getText(),
                Integer.parseInt(this.jtxtTelefono.getText()), this.jtxtCubiculo.getText());
        asesor = seminario.getAsesor();
        adminBD.insertarAsesor(asesor); 

        this.dispose();
    }//GEN-LAST:event_jbtnGuardarAActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameFormAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFormAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFormAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFormAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameFormAsesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabCubiculo;
    private javax.swing.JLabel jLabHrAsesor;
    private javax.swing.JLabel jLabNomAsesor;
    private javax.swing.JPanel jPanelAsesor;
    private javax.swing.JLabel jblCorrEletrAsesor;
    private javax.swing.JButton jbtnCancelarA;
    private javax.swing.JButton jbtnGuardarA;
    private javax.swing.JLabel jlblApellicoMaterno;
    private javax.swing.JLabel jlblApellidoPaterno;
    private javax.swing.JLabel jlblTelefono;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JTextField jtxtApellidoMaterno;
    private javax.swing.JTextField jtxtApellidoPaterno;
    private javax.swing.JTextField jtxtCorrEleAsesor;
    private javax.swing.JTextField jtxtCubiculo;
    private javax.swing.JTextField jtxtHrAsesoria;
    private javax.swing.JTextField jtxtNombreAsesor;
    private javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
