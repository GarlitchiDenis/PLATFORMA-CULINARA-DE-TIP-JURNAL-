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
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
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
    static BufferedImage im=null;
  
    
   
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
            im = ImageIO.read(rs.getBinaryStream("images"));
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

        addprint = new javax.swing.JInternalFrame();
        bimp = new javax.swing.JButton();
        bie = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        printlb = new javax.swing.JTextArea();
        lbi1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        bim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TastyDiary");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addprint.setBackground(new java.awt.Color(235, 236, 193));
        addprint.setVisible(false);
        addprint.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bimp.setBackground(new java.awt.Color(255, 230, 208));
        bimp.setText("IMPRIMARE");
        bimp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bimp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bimpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bimpMouseExited(evt);
            }
        });
        bimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bimpActionPerformed(evt);
            }
        });
        addprint.getContentPane().add(bimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 415, 110, 30));

        bie.setBackground(new java.awt.Color(255, 230, 208));
        bie.setText("IEȘIRE");
        bie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bieMouseExited(evt);
            }
        });
        bie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bieActionPerformed(evt);
            }
        });
        addprint.getContentPane().add(bie, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 415, 110, 30));

        printlb.setColumns(20);
        printlb.setRows(5);
        jScrollPane1.setViewportView(printlb);

        addprint.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 350, 390));

        lbi1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addprint.getContentPane().add(lbi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 240, 310));

        jPanel2.setBackground(new java.awt.Color(235, 236, 193));
        addprint.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 560, 500));

        getContentPane().add(addprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 560, 500));

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
        bf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        bmr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel4.setText("INGREDIENTE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        jLabel5.setText("MOD DE PREPARARE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        nre.setEditable(false);
        jPanel1.add(nre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 290, -1));

        jLabel3.setText("NUME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, 20));

        inre.setEditable(false);
        jPanel1.add(inre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 500, 160));

        mpre.setEditable(false);
        jPanel1.add(mpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 510, 160));

        lbi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 240, 310));

        bim.setBackground(new java.awt.Color(255, 230, 208));
        bim.setText("Imprimare");
        bim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bimMouseExited(evt);
            }
        });
        bim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bimActionPerformed(evt);
            }
        });
        jPanel1.add(bim, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

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

    private void bimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bimActionPerformed
        addprint.setVisible(true);
        printlb.setText("**********************\n");
        printlb.setText(printlb.getText()+"\n");
        printlb.setText(printlb.getText()+"NUME RETETA:"+nre.getText()+"\n");
        printlb.setText(printlb.getText()+"\n");
        printlb.setText(printlb.getText()+"INGREDIENTE:"+inre.getText()+"\n");
        printlb.setText(printlb.getText()+"\n");
        printlb.setText(printlb.getText()+"MOD DE PREPARARE:"+mpre.getText()+"\n");
        printlb.setText(printlb.getText()+"\n");
        printlb.setText(printlb.getText()+"**********************\n");
        
        
    }//GEN-LAST:event_bimActionPerformed

    private void bieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bieActionPerformed
       addprint.dispose();
    }//GEN-LAST:event_bieActionPerformed

    private void bimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bimpActionPerformed
   
        try {
            printlb.print();
        } catch (PrinterException ex) {
            Logger.getLogger(DisplayRec.class.getName()).log(Level.SEVERE, null, ex);
        }


     
    }//GEN-LAST:event_bimpActionPerformed

    private void bimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bimMouseEntered
        bim.setBackground(Color.GRAY);
    }//GEN-LAST:event_bimMouseEntered

    private void bimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bimMouseExited
       bim.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bimMouseExited

    private void bieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bieMouseEntered
        bie.setBackground(Color.GRAY);
    }//GEN-LAST:event_bieMouseEntered

    private void bieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bieMouseExited
        bie.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bieMouseExited

    private void bimpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bimpMouseEntered
        bimp.setBackground(Color.GRAY);
    }//GEN-LAST:event_bimpMouseEntered

    private void bimpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bimpMouseExited
        bimp.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bimpMouseExited

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
    private javax.swing.JInternalFrame addprint;
    private javax.swing.JButton bf;
    private javax.swing.JButton bie;
    private javax.swing.JButton bim;
    private javax.swing.JButton bimp;
    private javax.swing.JButton blo;
    private javax.swing.JButton bmr;
    private javax.swing.JLabel flname;
    private java.awt.TextArea inre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbi;
    private javax.swing.JLabel lbi1;
    private javax.swing.JPanel menu;
    private java.awt.TextArea mpre;
    private javax.swing.JTextField nre;
    private javax.swing.JButton opmen;
    private javax.swing.JTextArea printlb;
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
