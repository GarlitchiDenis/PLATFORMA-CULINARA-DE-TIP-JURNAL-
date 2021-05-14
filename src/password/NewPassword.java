/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;


/**
 *
 * @author garli
 */
public class NewPassword extends javax.swing.JFrame {
       Connection con=null;
       Result rs=null;
       PreparedStatement pst=null;
       public String user;
    
    /**
     * Creates new form NewPassword
     */
    public NewPassword() {
        initComponents();
        Seticon();
    }
public NewPassword(String vemail){
    initComponents();
    this.user=vemail;
   
    
}

    public final void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logoLTD.png")));
    }     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setResizable(false);
        jPanel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        respsw = new javax.swing.JPasswordField();
        crespsw = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TastyDiary");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 230, 208));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("RESET");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 128, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CONFIRM NEW PASSWORD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 230, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NEW PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 140, 50));

        respsw.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        respsw.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        respsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respswActionPerformed(evt);
            }
        });
        jPanel1.add(respsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 380, 40));

        crespsw.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        crespsw.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(crespsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 380, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\garli\\OneDrive\\Desktop\\Licenta\\iconite\\backk.png")); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 70, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\garli\\OneDrive\\Desktop\\Licenta\\newpass.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        if(respsw.getText() == null ? crespsw.getText() == null : respsw.getText().equals(crespsw.getText())){
            try{
                String updateQuery="UPDATE `licenta`.`login` SET `password` = ? WHERE email=?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/licenta", "root","000000");
		pst = con.prepareStatement(updateQuery);
                 pst.setString(1, respsw.getText());
                 pst.setString(2, user);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Reset Successfully");
            }catch(HeadlessException | SQLException e){
                 JOptionPane.showMessageDialog(null,e);
            }
        }else{
                 JOptionPane.showMessageDialog(null,"Password do not match");
             }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void respswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respswActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        dispose();
        ForgotPassword fp= new ForgotPassword();
        fp.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
           //</editor-fold>
           
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewPassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField crespsw;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField respsw;
    // End of variables declaration//GEN-END:variables
}
