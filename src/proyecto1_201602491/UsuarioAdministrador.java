/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201602491;

/**
 *
 * @author W7-JUEGOS
 */
public class UsuarioAdministrador extends javax.swing.JFrame {
  // public Usuario usuarios[];
    /**
     * Creates new form UsuarioAdministrador
     */
    public Usuario usuario;
    
    public UsuarioAdministrador() {
        initComponents();
        this.setVisible(true);
    }

    public void setUsuario(Usuario usuario){
        this.usuario=usuario;
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
        btnCrearUser = new javax.swing.JButton();
        btnCrearBiblio = new javax.swing.JButton();
        btnModificarUser = new javax.swing.JButton();
        btnModificarBiblio = new javax.swing.JButton();
        btnEliminarUser = new javax.swing.JButton();
        btnEliminarBiblio = new javax.swing.JButton();
        btnVerUser = new javax.swing.JButton();
        btnVerBiblio = new javax.swing.JButton();

        setTitle("Administrador");
        setLocation(new java.awt.Point(250, 150));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Usuarios:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Bibliografías:");

        btnCrearUser.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnCrearUser.setText("Crear");
        btnCrearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUserActionPerformed(evt);
            }
        });

        btnCrearBiblio.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnCrearBiblio.setText("Crear");
        btnCrearBiblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearBiblioActionPerformed(evt);
            }
        });

        btnModificarUser.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnModificarUser.setText("Modificar");
        btnModificarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUserActionPerformed(evt);
            }
        });

        btnModificarBiblio.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnModificarBiblio.setText("Modificar");
        btnModificarBiblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarBiblioActionPerformed(evt);
            }
        });

        btnEliminarUser.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnEliminarUser.setText("Eliminar");
        btnEliminarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUserActionPerformed(evt);
            }
        });

        btnEliminarBiblio.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnEliminarBiblio.setText("Eliminar");

        btnVerUser.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnVerUser.setText("Ver");
        btnVerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerUserActionPerformed(evt);
            }
        });

        btnVerBiblio.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnVerBiblio.setText("Ver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrearBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(btnModificarBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(btnModificarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarBiblio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(btnVerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVerBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCrearBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificarBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminarBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVerBiblio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUserActionPerformed
        CrearUsuario crearuser = new CrearUsuario();
        crearuser.usuario=usuario;
       // crearuser.usuarios = usuarios;
        Login.print();
    }//GEN-LAST:event_btnCrearUserActionPerformed

    private void btnModificarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUserActionPerformed
        ModificarUsuario modificaruser = new ModificarUsuario();
    }//GEN-LAST:event_btnModificarUserActionPerformed

    private void btnEliminarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUserActionPerformed
        EliminarUsuario eliminaruser = new EliminarUsuario();
    }//GEN-LAST:event_btnEliminarUserActionPerformed

    private void btnVerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerUserActionPerformed
        VerUsuario veruser = new VerUsuario();
    }//GEN-LAST:event_btnVerUserActionPerformed

    private void btnCrearBiblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearBiblioActionPerformed
        CrearBibliografia crearbiblio = new CrearBibliografia();
    }//GEN-LAST:event_btnCrearBiblioActionPerformed

    private void btnModificarBiblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarBiblioActionPerformed
        //ModificarBibliografia modificarbiblio = new ModificarBibliografia();
    }//GEN-LAST:event_btnModificarBiblioActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearBiblio;
    private javax.swing.JButton btnCrearUser;
    private javax.swing.JButton btnEliminarBiblio;
    private javax.swing.JButton btnEliminarUser;
    private javax.swing.JButton btnModificarBiblio;
    private javax.swing.JButton btnModificarUser;
    private javax.swing.JButton btnVerBiblio;
    private javax.swing.JButton btnVerUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
