/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIRSTPAGE;

import static FIRSTPAGE.HOME.nmm;
import static FIRSTPAGE.MyRecipes.nm_rec;
import Friends.DisplayFriends;
import Log.Login;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author garli
 */
public class DisplayRec  extends javax.swing.JFrame {

    private int count=0;
    static Connection connection = null;
    PreparedStatement pst = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    static String ImagePath=null;
  
    
   
    /**
     * Creates new form Page1
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     */
    public DisplayRec() throws SQLException, IOException {
        initComponents();
        flname.setText(nmm);
        DisplayData();
        nre.setText(nm_rec);
        Seticon();
      
    }
    public final void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logoLTD.png")));
    }
    private void DisplayData() throws SQLException, IOException{
       try{
           
           connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/licenta", "root","000000"); 
           String query="SELECT * FROM licenta.recipes  WHERE name ='"+nm_rec+"'";
           ps =connection.prepareStatement(query);
           rs = ps.executeQuery();
           if(rs.next()){
               
            String ing = rs.getString("ingredients");
            inre.setText(ing);
            String  modp = rs.getString("preparation_mode");
            mpre.setText(modp);
           BufferedImage im = ImageIO.read(rs.getBinaryStream("images"));
           lbi.setIcon(ResizeBuffer(im));
            
}   
       }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Eror");
				}  
        
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
        menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        flname = new javax.swing.JLabel();
        blo = new javax.swing.JButton();
        bf = new javax.swing.JButton();
        bmr = new javax.swing.JButton();
        opmen = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inre = new java.awt.TextArea();
        mpre = new java.awt.TextArea();
        lbi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TastyDiary");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 236, 193));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.hide();
        menu.setBackground(new java.awt.Color(228, 236, 193));
        menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.black, java.awt.Color.black));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 230, 208));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\garli\\OneDrive\\Desktop\\Licenta\\iconite\\user (1).png")); // NOI18N
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        flname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        flname.setText("name");
        menu.add(flname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 80, 20));

        blo.setBackground(new java.awt.Color(255, 230, 208));
        blo.setText("IEȘIRE CONT");
        blo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bloMouseExited(evt);
            }
        });
        blo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloActionPerformed(evt);
            }
        });
        menu.add(blo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        bf.setBackground(new java.awt.Color(255, 230, 208));
        bf.setText("PRIETENI");
        bf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bfMouseExited(evt);
            }
        });
        bf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfActionPerformed(evt);
            }
        });
        menu.add(bf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 130, -1));

        bmr.setBackground(new java.awt.Color(255, 230, 208));
        bmr.setText("REȚETELE MELE");
        bmr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bmrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bmrMouseExited(evt);
            }
        });
        bmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmrActionPerformed(evt);
            }
        });
        menu.add(bmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, -1));

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 480));

        opmen.setBackground(new java.awt.Color(255, 230, 208));
        opmen.setIcon(new javax.swing.ImageIcon("C:\\Users\\garli\\OneDrive\\Desktop\\Licenta\\iconite\\menu (1).png")); // NOI18N
        opmen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opmen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opmenMouseClicked(evt);
            }
        });
        opmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opmenActionPerformed(evt);
            }
        });
        jPanel1.add(opmen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jLabel4.setText("INGREDIENTS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        jLabel5.setText("PREPARATION MODE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        nre.setEditable(false);
        jPanel1.add(nre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 290, -1));

        jLabel3.setText("NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, 20));

        inre.setEditable(false);
        jPanel1.add(inre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 500, 160));

        mpre.setEditable(false);
        jPanel1.add(mpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 510, 160));

        lbi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 240, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opmenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opmenMouseClicked
   
        count++;
        if ( count % 2 == 0 ){  
         menu.hide();
        }
        else{
         menu.show();    
        }       
    
    }//GEN-LAST:event_opmenMouseClicked

    private void bloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloActionPerformed
        dispose();
        Login lg= new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_bloActionPerformed

    private void opmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opmenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opmenActionPerformed

    private void bfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfActionPerformed
        try {
            dispose();
            DisplayFriends p=new DisplayFriends();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DisplayRec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bfActionPerformed

    private void bmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmrActionPerformed
        try {
            dispose();
            MyRecipes p=new MyRecipes();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DisplayRec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bmrActionPerformed

    private void bmrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmrMouseEntered
        bmr.setBackground(Color.GRAY);
    }//GEN-LAST:event_bmrMouseEntered

    private void bmrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmrMouseExited
        bmr.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bmrMouseExited

    private void bfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bfMouseEntered
        bf.setBackground(Color.GRAY);
    }//GEN-LAST:event_bfMouseEntered

    private void bfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bfMouseExited
         bf.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bfMouseExited

    private void bloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloMouseEntered
        blo.setBackground(Color.GRAY);
    }//GEN-LAST:event_bloMouseEntered

    private void bloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloMouseExited
        blo.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bloMouseExited

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
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HOME().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bf;
    private javax.swing.JButton blo;
    private javax.swing.JButton bmr;
    private javax.swing.JLabel flname;
    private java.awt.TextArea inre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbi;
    private javax.swing.JPanel menu;
    private java.awt.TextArea mpre;
    private javax.swing.JTextField nre;
    private javax.swing.JButton opmen;
    // End of variables declaration//GEN-END:variables
 private ImageIcon ResizeBuffer(BufferedImage imgPath){
        int imageX = 240;
        int imageY = 310;
        lbi.setSize(imageX, imageY);
        ImageIcon myImage = new ImageIcon(imgPath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(lbi.getWidth(), lbi.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
}
