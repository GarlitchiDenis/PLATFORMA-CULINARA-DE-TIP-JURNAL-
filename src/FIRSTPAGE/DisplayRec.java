/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIRSTPAGE;

import static FIRSTPAGE.HOME.nmm;
import Log.Login;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
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
     */
    public DisplayRec() {
        initComponents();
        flname.setText(nmm);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        flname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        opmen = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cer = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        tip = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lac = new javax.swing.JCheckBox();
        ou = new javax.swing.JCheckBox();
        fruc = new javax.swing.JCheckBox();
        leg = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        car = new javax.swing.JCheckBox();
        inre = new java.awt.TextArea();
        mpre = new java.awt.TextArea();
        lbi = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.hide();
        menu.setBackground(new java.awt.Color(204, 255, 204));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("afisare");
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 50));

        jLabel2.setBackground(new java.awt.Color(255, 230, 208));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\garli\\OneDrive\\Desktop\\Licenta\\iconite\\user (1).png")); // NOI18N
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        flname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        flname.setText("name");
        menu.add(flname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 80, 20));

        jButton1.setBackground(new java.awt.Color(255, 230, 208));
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jButton2.setText("FRIENDS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, -1));

        jButton3.setText("MYRECIPES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        menu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 480));

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
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel5.setText("MOD PREPARARE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));
        jPanel1.add(nre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 290, -1));

        jLabel6.setText("LACTATE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 100, -1));

        cer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerActionPerformed(evt);
            }
        });
        jPanel1.add(cer, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jLabel7.setText("TIP");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        tip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRIVAT", "PUBLIC" }));
        jPanel1.add(tip, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        jButton4.setText("SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        jLabel3.setText("NUME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 20));

        jLabel9.setText("CARNE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jLabel10.setText("FRUCTE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabel11.setText("LEGUME");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        jLabel12.setText("CEREALE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        lac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lacActionPerformed(evt);
            }
        });
        jPanel1.add(lac, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        ou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouActionPerformed(evt);
            }
        });
        jPanel1.add(ou, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        fruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frucActionPerformed(evt);
            }
        });
        jPanel1.add(fruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        leg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legActionPerformed(evt);
            }
        });
        jPanel1.add(leg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        jLabel13.setText("OUA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carActionPerformed(evt);
            }
        });
        jPanel1.add(car, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));
        jPanel1.add(inre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 230, 60));
        jPanel1.add(mpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 230, 70));

        lbi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 240, 310));

        jButton5.setText("UPLOAD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 520));

        pack();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Login lg= new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void opmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opmenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opmenActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        FRIENDS p=new FRIENDS();
        p.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            dispose();
            MyRecipes p=new MyRecipes();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DisplayRec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    
        try {
                
            
                                        String query="SELECT id FROM licenta.login  WHERE fullname ='"+nmm+"'";
					String sqlt="INSERT INTO `licenta`.`recipes` (`name`, `ingredients`, `preparation_mode`, `type`,`dairy_products`,`meat`,`egg`,`fruit`,`vegetables`,`cereals`,`id`,`images`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
                                        connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/licenta", "root","000000"); 
					ps =connection.prepareStatement(query);
                                        rs = ps.executeQuery();
                                        String adid=null;  
                                        if(rs.next()){
                                                 adid=rs.getString("id");}
                                        pst =connection.prepareStatement(sqlt);
					pst.setString(1,nre.getText());
					pst.setString(2,inre.getText());
					pst.setString(3,mpre.getText());
					pst.setString(4,tip.getSelectedItem().toString());                                                                            
                                        int l;
                                        int cr;
                                        int o;
                                        int fr;
                                        int le;
                                        int ce;
                                        if(lac.isSelected()){
                                            l=1;
                                        }else{
                                            l=0;}
                                       pst.setString(5, String.valueOf(l));
                                      
                                       if(car.isSelected()){
                                            cr=1;
                                        }else{
                                            cr=0;}
                                       pst.setString(6, String.valueOf(cr));
                                       
                                       if(ou.isSelected()){
                                            o=1;
                                        }else{
                                            o=0;}
                                       pst.setString(7, String.valueOf(o));
                                       
                                       if(fruc.isSelected()){
                                            fr=1;
                                        }else{
                                            fr=0;}
                                       pst.setString(8, String.valueOf(fr));
                                       
                                        if(leg.isSelected()){
                                            le=1;
                                        }else{
                                            le=0;}
                                       pst.setString(9, String.valueOf(le));
                                       
                                        if(cer.isSelected()){
                                            ce=1;
                                        }else{
                                            ce=0;}
                                       pst.setString(10, String.valueOf(ce));    
                                       pst.setString(11,adid);
                                       
                                         if(ImagePath !=null){  
                                       try {
                                        InputStream inps= new FileInputStream(new File(ImagePath));
                                         pst.setBlob(12,inps);
                                    } catch (FileNotFoundException ex) {
                                        Logger.getLogger(DisplayRec.class.getName()).log(Level.SEVERE, null, ex);
                                    }}
                                    if(pst.executeUpdate()==1){JOptionPane.showMessageDialog(null,"MERGE");}else{JOptionPane.showMessageDialog(null,"nup");}
                                      // pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Register SUCCESSFULY");
				}catch(HeadlessException | SQLException ex) {
					JOptionPane.showMessageDialog(null,"Eror");
				} 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerActionPerformed

    private void lacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lacActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_lacActionPerformed

    private void ouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ouActionPerformed

    private void frucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frucActionPerformed

    private void legActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legActionPerformed

    private void carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser ch=new  JFileChooser();
       ch.showOpenDialog(null);
         File f=ch.getSelectedFile();
        lbi.setIcon(new ImageIcon(f.toString()));         
        ImagePath=f.getAbsolutePath();
    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JCheckBox car;
    private javax.swing.JCheckBox cer;
    private javax.swing.JLabel flname;
    private javax.swing.JCheckBox fruc;
    private java.awt.TextArea inre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox lac;
    private javax.swing.JLabel lbi;
    private javax.swing.JCheckBox leg;
    private javax.swing.JPanel menu;
    private java.awt.TextArea mpre;
    private javax.swing.JTextField nre;
    private javax.swing.JButton opmen;
    private javax.swing.JCheckBox ou;
    private javax.swing.JComboBox<String> tip;
    // End of variables declaration//GEN-END:variables

}
