package proyecto1_201602491;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Carlos Luna
 */
public class MenuP extends javax.swing.JFrame {
    public Bibliografia bibliografia;
    Usuario usuario;
    /**
     * Creates new form MenuP
     */
    public MenuP() {
        initComponents();
        this.setVisible(true);
        usuario = new Usuario();
        bibliografia = new Bibliografia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenup1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAbout = new javax.swing.JButton();
        panelMenup2 = new javax.swing.JPanel();
        labelImagen1 = new javax.swing.JLabel();
        labelmenup1 = new javax.swing.JLabel();
        labelmenup2 = new javax.swing.JLabel();
        labelmenup3 = new javax.swing.JLabel();
        labelmenup4 = new javax.swing.JLabel();
        labelmenup5 = new javax.swing.JLabel();
        labelmenup6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IPC1_Proyecto1");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(50, 50));
        setName("MenuP"); // NOI18N
        setResizable(false);

        panelMenup1.setBackground(new java.awt.Color(0, 0, 0));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnLogout.setText("LOGOUT");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("UNIVERSIDAD SAN CARLOS DE GUATEMALA");

        javax.swing.GroupLayout panelMenup1Layout = new javax.swing.GroupLayout(panelMenup1);
        panelMenup1.setLayout(panelMenup1Layout);
        panelMenup1Layout.setHorizontalGroup(
            panelMenup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenup1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelMenup1Layout.setVerticalGroup(
            panelMenup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenup1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelMenup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMenup1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnAbout.setBackground(new java.awt.Color(255, 255, 255));
        btnAbout.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnAbout.setText("ABOUT");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        panelMenup2.setBackground(new java.awt.Color(255, 153, 0));

        labelImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMenuP.png"))); // NOI18N

        labelmenup1.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        labelmenup1.setText("BIBLIOTECA VIRTUAL USAC");
        labelmenup1.setToolTipText("");

        labelmenup2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        labelmenup2.setText("Horarios de atención:");

        labelmenup3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelmenup3.setText("Lunes a Viernes");

        labelmenup4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelmenup4.setText("8:00 am - 5:00 pm");

        labelmenup5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelmenup5.setText("Sábado");

        labelmenup6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelmenup6.setText("8:00 am - 12:00 pm");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("adminbiblioteca@correo100%real.com");

        javax.swing.GroupLayout panelMenup2Layout = new javax.swing.GroupLayout(panelMenup2);
        panelMenup2.setLayout(panelMenup2Layout);
        panelMenup2Layout.setHorizontalGroup(
            panelMenup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenup2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panelMenup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenup2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelmenup1))
                    .addGroup(panelMenup2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(labelmenup3))
                    .addGroup(panelMenup2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(labelmenup5))
                    .addGroup(panelMenup2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(panelMenup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelmenup6)
                            .addComponent(labelmenup4)))
                    .addGroup(panelMenup2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(labelmenup2))
                    .addGroup(panelMenup2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)))
                .addGap(28, 28, 28))
        );
        panelMenup2Layout.setVerticalGroup(
            panelMenup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenup2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenup2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(labelmenup1)
                        .addGap(18, 18, 18)
                        .addComponent(labelmenup2)
                        .addGap(18, 18, 18)
                        .addComponent(labelmenup3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelmenup4)
                        .addGap(13, 13, 13)
                        .addComponent(labelmenup5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelmenup6)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(489, 489, 489))
            .addComponent(panelMenup1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMenup2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMenup2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
       About about = new About();
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       Login login = new Login();
       login.usuario=usuario;
       login.bibliografia=bibliografia;
       
      // login.usuarios = usuarios;
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelImagen1;
    private javax.swing.JLabel labelmenup1;
    private javax.swing.JLabel labelmenup2;
    private javax.swing.JLabel labelmenup3;
    private javax.swing.JLabel labelmenup4;
    private javax.swing.JLabel labelmenup5;
    private javax.swing.JLabel labelmenup6;
    private javax.swing.JPanel panelMenup1;
    private javax.swing.JPanel panelMenup2;
    // End of variables declaration//GEN-END:variables
}
