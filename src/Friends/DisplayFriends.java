/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Friends;

import FIRSTPAGE.*;
import static FIRSTPAGE.HOME.nmm;
import Log.Login;
import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author garli
 */
public class DisplayFriends  extends javax.swing.JFrame {

    private int count=0;
    static Connection connection = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    ResultSet rs3 = null;
    ResultSet rs4 = null;
    PreparedStatement ps = null;
    PreparedStatement ps2 = null;
    PreparedStatement ps3 = null;
    PreparedStatement ps4 = null;
    PreparedStatement ps5 = null;
    PreparedStatement ps6 = null;
     public static String ff1=null;

    public static String addid=null;
    public static String nm_fr;
   
    /**
     * Creates new form Page1
     * @throws java.sql.SQLException
     */
    public DisplayFriends() throws SQLException {
        initComponents();
        flname.setText(nmm);
        DisplayTable();
        Seticon();

        
    }
    public final void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logoLTD.png")));
    }
    
    private void DisplayTable() throws SQLException{
    try{   
           
           
           
           connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/licenta", "root","000000"); 
           String query="SELECT id FROM licenta.login  WHERE fullname ='"+nmm+"'";
           ps =connection.prepareStatement(query);
           rs = ps.executeQuery();
           if(rs.next()){
           addid=rs.getString("id");    
           String sql="SELECT fullname as Prieteni FROM licenta.friends WHERE id_user ='"+addid+"'";
           ps2 =connection.prepareStatement(sql);
           rs2 = ps2.executeQuery();
           t2.setModel(DbUtils.resultSetToTableModel(rs2));
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
        addframe = new javax.swing.JInternalFrame();
        adfr = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        flname = new javax.swing.JLabel();
        blo = new javax.swing.JButton();
        bf = new javax.swing.JButton();
        bmr = new javax.swing.JButton();
        opmen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        bop = new javax.swing.JButton();
        bad = new javax.swing.JButton();
        bde = new javax.swing.JButton();
        aa = new javax.swing.JLabel();
        bb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TastyDiary");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 236, 193));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addframe.setVisible(false);
        Container pane = ((BasicInternalFrameUI) addframe.getUI()).getNorthPane();
        pane.getComponent(0).setVisible(false);
        addframe.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adfr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adfrActionPerformed(evt);
            }
        });
        addframe.getContentPane().add(adfr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 260, 60));

        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        addframe.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jButton8.setText("Cancel");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        addframe.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jPanel1.add(addframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 410, 270));

        menu.hide();
        menu.setBackground(new java.awt.Color(228, 236, 193));
        menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 230, 208));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\garli\\OneDrive\\Desktop\\Licenta\\iconite\\user (1).png")); // NOI18N
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        flname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        flname.setText("name");
        menu.add(flname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 80, 20));

        blo.setBackground(new java.awt.Color(255, 230, 208));
        blo.setText("LOG OUT");
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
        menu.add(blo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        bf.setBackground(new java.awt.Color(255, 230, 208));
        bf.setText("FRIENDS");
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
        menu.add(bf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, -1));

        bmr.setBackground(new java.awt.Color(255, 230, 208));
        bmr.setText("MYRECIPES");
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
        menu.add(bmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 390));

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

        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        t2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(t2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 470, 210));

        bop.setBackground(new java.awt.Color(255, 230, 208));
        bop.setText("OPEN");
        bop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bopMouseExited(evt);
            }
        });
        bop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bopActionPerformed(evt);
            }
        });
        jPanel1.add(bop, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 80, -1));

        bad.setBackground(new java.awt.Color(255, 230, 208));
        bad.setText("ADD");
        bad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                badMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                badMouseExited(evt);
            }
        });
        bad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badActionPerformed(evt);
            }
        });
        jPanel1.add(bad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 80, -1));

        bde.setBackground(new java.awt.Color(255, 230, 208));
        bde.setText("DELETE");
        bde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bdeMouseExited(evt);
            }
        });
        bde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeActionPerformed(evt);
            }
        });
        jPanel1.add(bde, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 80, -1));

        aa.setText("jLabel1");
        jPanel1.add(aa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 100, 60));

        bb.setText("jLabel1");
        jPanel1.add(bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 430));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_bfActionPerformed

    private void bmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmrActionPerformed
        try {
            dispose();
            MyRecipes p=new MyRecipes();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DisplayFriends.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bmrActionPerformed

    private void bdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeActionPerformed
        int row=t2.getSelectedRow();
        String n_friend=t2.getModel().getValueAt(row,0).toString();
        int opt=JOptionPane.showConfirmDialog(null, "Are you sure to Delete", "Delete", JOptionPane.YES_NO_OPTION);
       if(opt==0){
        try{
            String qur="DELETE FROM `licenta`.`friends` WHERE fullname='"+n_friend+"' AND id_user='"+addid+"'";
            ps3 =connection.prepareStatement(qur);
            ps3.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deleted Successfully");
            DisplayTable();
            

        }catch(SQLException e){}}
    }//GEN-LAST:event_bdeActionPerformed

    private void badActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badActionPerformed
       addframe.setVisible(true);
        
    }//GEN-LAST:event_badActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        addframe.dispose();
        adfr.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            String fl2=adfr.getText();
            
            String sqll="SELECT fullname FROM licenta.login  WHERE id ='"+addid+"'";
            ps5 =connection.prepareStatement(sqll);
            rs3 = ps5.executeQuery();
            String fl=null;  
            if(rs3.next()){
              fl=rs3.getString("fullname");}
            
            String sql2="SELECT fullname FROM licenta.login  ";
            ps6 =connection.prepareStatement(sql2);
            rs4 = ps6.executeQuery();
            if(rs4.next()){
              ff1=rs4.getString("fullname");}
             bb.setText(fl2);
             aa.setText(ff1);
            if( fl2.equals(fl)){
                  JOptionPane.showMessageDialog(null,"Error: You can't add yourself to your friends list"); }
            else if(fl2.equals(ff1)){
                  JOptionPane.showMessageDialog(null,"Error:sss  You cannot add this person");  
              
            }else{
                String sqlt="INSERT INTO `licenta`.`friends` (`fullname`, `id_user`) VALUES (?,'"+addid+"');";
                ps4 =connection.prepareStatement(sqlt);
                ps4.setString(1,adfr.getText());
                ps4.executeUpdate();
                JOptionPane.showMessageDialog(null,"The friend has been added ");
                DisplayTable();
                    
            

            }}catch(SQLException e){JOptionPane.showMessageDialog(null,"Error: You cannot add this person  ");}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void adfrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adfrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adfrActionPerformed

    private void bopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bopActionPerformed
       try{
            int row=t2.getSelectedRow();
            nm_fr=t2.getModel().getValueAt(row,0).toString();
            dispose();
            FriendRecipes friendr=new FriendRecipes();
            friendr.setVisible(true);
       }catch (SQLException ex) {
            Logger.getLogger(DisplayFriends.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bopActionPerformed

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

    private void bopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bopMouseEntered
        bop.setBackground(Color.GRAY);
    }//GEN-LAST:event_bopMouseEntered

    private void bopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bopMouseExited
       bop.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bopMouseExited

    private void badMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_badMouseEntered
        bad.setBackground(Color.GRAY);
    }//GEN-LAST:event_badMouseEntered

    private void badMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_badMouseExited
       bad.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_badMouseExited

    private void bdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdeMouseEntered
        bde.setBackground(Color.GRAY);
    }//GEN-LAST:event_bdeMouseEntered

    private void bdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdeMouseExited
        bde.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bdeMouseExited

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
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
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
    private javax.swing.JLabel aa;
    private javax.swing.JInternalFrame addframe;
    private javax.swing.JTextField adfr;
    private javax.swing.JButton bad;
    private javax.swing.JLabel bb;
    private javax.swing.JButton bde;
    private javax.swing.JButton bf;
    private javax.swing.JButton blo;
    private javax.swing.JButton bmr;
    private javax.swing.JButton bop;
    private javax.swing.JLabel flname;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton opmen;
    private javax.swing.JTable t2;
    // End of variables declaration//GEN-END:variables
}
