/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import javax.swing.ImageIcon;
/**
 *
 * @author EWD
 */
public class LoginUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginUI
     */
    public LoginUI() {
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

        IDPetugasTF = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        loginLB = new javax.swing.JLabel();
        TemplateLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        IDPetugasTF.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        IDPetugasTF.setForeground(new java.awt.Color(204, 204, 204));
        IDPetugasTF.setText("ID PETUGAS");
        IDPetugasTF.setBorder(null);
        IDPetugasTF.setOpaque(false);
        IDPetugasTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDPetugasTFActionPerformed(evt);
            }
        });
        getContentPane().add(IDPetugasTF);
        IDPetugasTF.setBounds(390, 270, 280, 50);

        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPasswordField1.setCaretColor(new java.awt.Color(204, 204, 204));
        jPasswordField1.setOpaque(false);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(390, 350, 210, 40);

        loginLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManajemenParkirImage/loginBiasa.png"))); // NOI18N
        loginLB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginLBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginLBMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginLBMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginLBMouseReleased(evt);
            }
        });
        getContentPane().add(loginLB);
        loginLB.setBounds(320, 440, 400, 70);

        TemplateLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManajemenParkirImage/loginUI template.png"))); // NOI18N
        getContentPane().add(TemplateLabel);
        TemplateLabel.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDPetugasTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDPetugasTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDPetugasTFActionPerformed

    private void loginLBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLBMouseEntered
       loginLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManajemenParkirImage/loginPencet.png")));
    }//GEN-LAST:event_loginLBMouseEntered

    private void loginLBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLBMouseExited

               ImageIcon A = new ImageIcon(getClass().getResource("/ManajemenParkirImage/loginBiasa.png"));
               loginLB.setIcon(A);
    }//GEN-LAST:event_loginLBMouseExited

    private void loginLBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLBMousePressed
       ImageIcon A = new ImageIcon(getClass().getResource("/ManajemenParkirImage/loginTahan.png"));
       loginLB.setIcon(A);
    }//GEN-LAST:event_loginLBMousePressed

    private void loginLBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLBMouseReleased
        ImageIcon A = new ImageIcon(getClass().getResource("/ManajemenParkirImage/loginPencet.png"));
               loginLB.setIcon(A);
    }//GEN-LAST:event_loginLBMouseReleased

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDPetugasTF;
    private javax.swing.JLabel TemplateLabel;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel loginLB;
    // End of variables declaration//GEN-END:variables
}