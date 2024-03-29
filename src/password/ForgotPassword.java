package password;

import Log.Login;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author garli
 */
public class ForgotPassword extends javax.swing.JFrame {

    private int randomCode;

    public ForgotPassword() {

        initComponents();
        Seticon();
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
        bbsnd = new javax.swing.JButton();
        vemail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        vcode = new javax.swing.JTextField();
        bver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TastyDiary");
        setMinimumSize(new java.awt.Dimension(776, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(776, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(776, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bbsnd.setBackground(new java.awt.Color(255, 230, 208));
        bbsnd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bbsnd.setText("TRIMITE CATRE EMAIL");
        bbsnd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bbsnd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bbsnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bbsndMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bbsndMouseExited(evt);
            }
        });
        bbsnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbsndActionPerformed(evt);
            }
        });
        jPanel1.add(bbsnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 160, 40));

        vemail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        vemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vemailActionPerformed(evt);
            }
        });
        jPanel1.add(vemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 300, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("COD VERIFICARE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 170, 60));

        vcode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(vcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 300, 40));

        bver.setBackground(new java.awt.Color(255, 230, 208));
        bver.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bver.setText("VERIFICARE COD");
        bver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bverMouseExited(evt);
            }
        });
        bver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bverActionPerformed(evt);
            }
        });
        jPanel1.add(bver, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 160, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("EMAIL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 130, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\garli\\OneDrive\\Desktop\\Licenta\\iconite\\backk.png")); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 70, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\garli\\OneDrive\\Desktop\\Licenta\\FPASS.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 810, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, -1, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bbsndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbsndActionPerformed
        Random rand = new Random();
        randomCode = rand.nextInt(999999);
        String HOST = "smtp.gmail.com";
        String USER = "tt942858@gmail.com";
        String PASSWORD = "AbCdEfGh111";
        String PORT = "465";
        String FROM = "put_from_address_here";
        String TO = vemail.getText();
        String STARTTLS = "true";
        String AUTH = "true";
        String DEBUG = "true";
        String SOCKET_FACTORY = "javax.net.ssl.SSLSocketFactory";
        String SUBJECT = "Reseting Code";
        String MESSAGE = "Your code is " + randomCode;
        
        Properties props = new Properties();
 
        props.put("mail.smtp.host", HOST);
        props.put("mail.smtp.port", PORT);
        props.put("mail.smtp.user", USER);
        props.put("mail.smtp.auth", AUTH);
        props.put("mail.smtp.starttls.enable", STARTTLS);
        props.put("mail.smtp.debug", DEBUG);
        props.put("mail.smtp.socketFactory.port", PORT);
        props.put("mail.smtp.socketFactory.class", SOCKET_FACTORY);
        props.put("mail.smtp.socketFactory.fallback", "false");
        
 
        try {
 
            //Obtain the default mail session
            Session session = Session.getDefaultInstance(props, null);
            session.setDebug(true);
 
            //Construct the mail message
            MimeMessage message = new MimeMessage(session);
            message.setText(MESSAGE);
            message.setSubject(SUBJECT);
            message.setFrom(new InternetAddress(FROM));
            message.addRecipient(RecipientType.TO, new InternetAddress(TO));
            message.saveChanges();
 
            //Use Transport to deliver the message
            Transport transport = session.getTransport("smtp");
            transport.connect(HOST, USER, PASSWORD);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            JOptionPane.showMessageDialog(null, "Codul a fost trimis");
 
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Adresa de email invalidă", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bbsndActionPerformed

    private void bverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bverActionPerformed
        if(Integer.valueOf(vcode.getText())==randomCode){
             dispose();
             NewPassword np= new NewPassword(vemail.getText());
            np.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Codul nu se potrivește ");
        }
    

    }//GEN-LAST:event_bverActionPerformed

    private void vemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vemailActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        dispose();
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void bbsndMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbsndMouseEntered
        bbsnd.setBackground(Color.GRAY);
                                   
    }//GEN-LAST:event_bbsndMouseEntered

    private void bbsndMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbsndMouseExited
        bbsnd.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bbsndMouseExited

    private void bverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bverMouseEntered
       bver.setBackground(Color.GRAY);
                                     
    }//GEN-LAST:event_bverMouseEntered

    private void bverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bverMouseExited
        bver.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bverMouseExited

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ForgotPassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbsnd;
    private javax.swing.JButton bver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField vcode;
    private javax.swing.JTextField vemail;
    // End of variables declaration//GEN-END:variables
}
