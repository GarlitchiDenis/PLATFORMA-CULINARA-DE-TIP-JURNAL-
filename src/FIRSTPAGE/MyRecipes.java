/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIRSTPAGE;

import static FIRSTPAGE.HOME.nmm;
import Log.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author garli
 */
public class MyRecipes  extends javax.swing.JFrame {
    
    private int count=0;
    static Connection connection = null;
    PreparedStatement pst = null;
   PreparedStatement ps = null;
   PreparedStatement prs= null;
   PreparedStatement pp= null;
   PreparedStatement ppp= null;
    ResultSet rs = null;
    ResultSet res = null;
    
   
    
   
    /**
     * Creates new form Page1
     * @throws java.sql.SQLException
     */
    public MyRecipes() throws SQLException  {
        initComponents();
        flname.setText(nmm); 
        DisplayTable();
    }
    
    private void DisplayTable() throws SQLException{
       try{
           String addid=null;
           connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/licenta", "root","000000"); 
           String query="SELECT id FROM licenta.login  WHERE fullname ='"+nmm+"'";
           ps =connection.prepareStatement(query);
           rs = ps.executeQuery();
            if(rs.next()){
            addid=rs.getString("id");}
           String sql="SELECT id_rec,name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"'"; 
           pst =connection.prepareStatement(sql);
           res = pst.executeQuery();
           
           t1.setModel(DbUtils.resultSetToTableModel(res));
          // aa.setText(addid);
					
           
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

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        flname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        opmen = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        aa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.hide();
        menu.setBackground(new java.awt.Color(204, 255, 204));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("retete");
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

        jButton4.setText("CREATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, -1, -1));

        t1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(t1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 640, -1));

        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, -1, -1));

        aa.setText("jLabel3");
        jPanel1.add(aa, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, 60, 50));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      dispose();
      CreateRec c= new CreateRec();
      c.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int row=t1.getSelectedRow();
        String id_rec=t1.getModel().getValueAt(row,0).toString();
        try{
        String qur="DELETE FROM `licenta`.`recipes` WHERE id_rec='"+id_rec+"'";
        String reset="ALTER TABLE `licenta`.`recipes` DROP id_rec";
        String consecutinumber="ALTER TABLE `licenta`.`recipes` ADD id_rec INT NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST";
        prs =connection.prepareStatement(qur);
        prs.executeUpdate();
        JOptionPane.showMessageDialog(null,"Reteta a fost stearsa cu succes");
        aa.setText(id_rec);
       pp =connection.prepareStatement(reset);
       ppp =connection.prepareStatement(consecutinumber);
       pp.executeUpdate();
       ppp.executeUpdate();
        DisplayTable();
        
            
        }catch(SQLException e){}
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
    private javax.swing.JLabel flname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton opmen;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables


}
