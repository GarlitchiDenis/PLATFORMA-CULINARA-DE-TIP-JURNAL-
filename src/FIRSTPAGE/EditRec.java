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
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author garli
 */
public class EditRec  extends javax.swing.JFrame {

    private int count=0;
    static Connection connection = null;
    PreparedStatement pst = null;
    PreparedStatement ps = null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    ResultSet res = null;
    static String ImagePath=null;
    static String adddid=null;
 
  
    
   
    /**
     * Creates new form Page1
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     */
    public EditRec() throws SQLException, IOException {
        initComponents();
        flname.setText(nmm);
        nre.setText(nm_rec);
        DisplayData();
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
               adddid=rs.getString("id_rec");
            String ing = rs.getString("ingredients");
            inre.setText(ing);
            String  modp = rs.getString("preparation_mode");
            mpre.setText(modp);
            String t = rs.getString("type");
            if("PRIVAT".equals(t)){
                tip.setSelectedIndex(0);}
            else{
                tip.setSelectedIndex(1);
             }
            
            int l = rs.getInt("dairy_products");
            if(l==1){
               lac.setSelected(true);
            }else{
                lac.setSelected(false);}
            
            int cr = rs.getInt("meat");
            if(cr==1){
               car.setSelected(true);
            }else{
                car.setSelected(false);}
            
            int eg = rs.getInt("egg");
            if(eg==1){
               ou.setSelected(true);
            }else{
                ou.setSelected(false);}
            
            int fr = rs.getInt("fruit");
            if(fr==1){
               fruc.setSelected(true);
            }else{
                fruc.setSelected(false);}
            
            int vg = rs.getInt("vegetables");
            if(vg==1){
               leg.setSelected(true);
            }else{
                leg.setSelected(false);}
            
            int ce = rs.getInt("cereals");
            if(ce==1){
               cer.setSelected(true);
            }else{
                cer.setSelected(false);}  
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
        jLabel6 = new javax.swing.JLabel();
        cer = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        tip = new javax.swing.JComboBox<>();
        bsv = new javax.swing.JButton();
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
        bup = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TastyDiary");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 236, 193));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(opmen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jLabel4.setText("INGREDIENTS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel5.setText("PREPARATION MODE");
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

        jLabel7.setText("TYPE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        tip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRIVAT", "PUBLIC" }));
        jPanel1.add(tip, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        bsv.setBackground(new java.awt.Color(255, 230, 208));
        bsv.setText("EDITARE REȚETĂ");
        bsv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bsvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bsvMouseExited(evt);
            }
        });
        bsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsvActionPerformed(evt);
            }
        });
        jPanel1.add(bsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

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

        bup.setBackground(new java.awt.Color(255, 230, 208));
        bup.setText("ÎNCARCARE IMAGINE");
        bup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bupMouseExited(evt);
            }
        });
        bup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupActionPerformed(evt);
            }
        });
        jPanel1.add(bup, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, -1));

        jLabel8.setText("TYPE OF FOOD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

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

    private void bfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfActionPerformed
        try {
            dispose();
            DisplayFriends p=new DisplayFriends();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(EditRec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bfActionPerformed

    private void bmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmrActionPerformed
        try {
            dispose();
            MyRecipes p=new MyRecipes();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(EditRec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bmrActionPerformed

    private void bsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsvActionPerformed
   int opt=JOptionPane.showConfirmDialog(null, "Sigur dorești să modifici rețeta?", "MODIFICARE", JOptionPane.YES_NO_OPTION);
     if(opt==0){  
                    try {
                                         int l;
                                         int cr;
                                         int o;
                                         int fr;
                                         int le;
                                         int ce;
                                         if(ImagePath !=null){
                                         String sqlt="UPDATE `licenta`.`recipes` SET `name`=?,`ingredients`=?,`preparation_mode`=?,`type`=?,`dairy_products`=?,`meat`=?,`egg`=?,`fruit`=?,`vegetables`=?,`cereals`=?,`images`=? WHERE `id_rec`='"+adddid+"';";
                                        connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/licenta", "root","000000");
                                        pst =connection.prepareStatement(sqlt);
					pst.setString(1,nre.getText());
					pst.setString(2,inre.getText());
					pst.setString(3,mpre.getText());
					pst.setString(4,tip.getSelectedItem().toString());                                                                            
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
                                       try {
                                           File image= new File(ImagePath);
                                            FileInputStream fis=new FileInputStream(image);
                                            ByteArrayOutputStream bos=new ByteArrayOutputStream();
                                       byte[] buf=new byte[1024];
                                       for(int redNum;(redNum=fis.read(buf))!=-1;){
                                       bos.write(buf,0,redNum);
                                       }
                                        byte[] person_image = bos.toByteArray();
                                       pst.setBytes(11, person_image);
                                            pst.executeUpdate();
                                        
                                         
                                    } catch (FileNotFoundException ex) {
                                        Logger.getLogger(CreateRec.class.getName()).log(Level.SEVERE, null, ex);
                                    }        catch (IOException ex) {
                                                 Logger.getLogger(EditRec.class.getName()).log(Level.SEVERE, null, ex);
                                             }}else{
                                      String sqlt="UPDATE `licenta`.`recipes` SET `name`=?,`ingredients`=?,`preparation_mode`=?,`type`=?,`dairy_products`=?,`meat`=?,`egg`=?,`fruit`=?,`vegetables`=?,`cereals`=?WHERE `id_rec`='"+adddid+"';";
                                        connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/licenta", "root","000000");
                                        pst =connection.prepareStatement(sqlt);
					pst.setString(1,nre.getText());
					pst.setString(2,inre.getText());
					pst.setString(3,mpre.getText());
					pst.setString(4,tip.getSelectedItem().toString());                                                                            
                                        
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
                                           
                                         }
                                       
                                       pst.executeUpdate();
                                       if(pst.executeUpdate()==1){
                                       JOptionPane.showMessageDialog(null,"Actualizat cu succes");
                                       dispose();
                                       MyRecipes mrs=new MyRecipes();
                                       mrs.setVisible(true);}
    }catch(HeadlessException | SQLException ex) {
	JOptionPane.showMessageDialog(null,"Error");} 
     }                                  
    }//GEN-LAST:event_bsvActionPerformed

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

    private void bupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupActionPerformed
         JFileChooser ch=new  JFileChooser();
        FileNameExtensionFilter filter= new FileNameExtensionFilter("*.IMAGE","jpg","png","gif");
        ch.addChoosableFileFilter(filter);
        int result=ch.showSaveDialog(this);
        if(result==JFileChooser.APPROVE_OPTION){
            File f=ch.getSelectedFile(); 
            ImagePath=f.getAbsolutePath();
            try{
            lbi.setIcon(ResizeImage(ImagePath));  
            }catch (Exception exception){
            JOptionPane.showMessageDialog(this, "eroare imagine: " + exception.getMessage());}
        }
    }//GEN-LAST:event_bupActionPerformed

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

    private void bsvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsvMouseEntered
        bsv.setBackground(Color.GRAY);
    }//GEN-LAST:event_bsvMouseEntered

    private void bsvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsvMouseExited
       bsv.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bsvMouseExited

    private void bupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bupMouseEntered
         bup.setBackground(Color.GRAY);
    }//GEN-LAST:event_bupMouseEntered

    private void bupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bupMouseExited
        bup.setBackground( new Color(255,230,208));
    }//GEN-LAST:event_bupMouseExited

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
    private javax.swing.JButton bf;
    private javax.swing.JButton blo;
    private javax.swing.JButton bmr;
    private javax.swing.JButton bsv;
    private javax.swing.JButton bup;
    private javax.swing.JCheckBox car;
    private javax.swing.JCheckBox cer;
    private javax.swing.JLabel flname;
    private javax.swing.JCheckBox fruc;
    private java.awt.TextArea inre;
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
    private javax.swing.JLabel jLabel8;
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

    private ImageIcon ResizeImage(String imgPath){
        int imageX = 240;
        int imageY = 310;
        lbi.setSize(imageX, imageY);
        ImageIcon myImage = new ImageIcon(imgPath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(lbi.getWidth(), lbi.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    
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
