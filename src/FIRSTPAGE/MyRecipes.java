/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIRSTPAGE;

import static FIRSTPAGE.HOME.nmm;
import Log.Login;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    ResultSet rs = null;
    ResultSet res = null;
    public static String nm_rec;
    public static String addid=null;
    public static int cc1=0;
    public static int cc2=0;
    public static int cc3=0;
    public static int cc4=0;
    public static int cc5=0;
    public static int cc6=0;
    
   
    
   
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
           
           connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/licenta", "root","000000"); 
           String query="SELECT id FROM licenta.login  WHERE fullname ='"+nmm+"'";
           ps =connection.prepareStatement(query);
           rs = ps.executeQuery();
            if(rs.next()){
            addid=rs.getString("id");}
         // lac car ou fruc leg cer
         // 1   2   3   4    5   6
         	
           if(cer.isSelected() && cc1%2==0 && cc2%2==0 && cc3%2==0 && cc4%2==0 && cc5%2==0){
            //2
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(leg.isSelected() && cc1%2==0 && cc2%2==0 && cc3%2==0 && cc4%2==0 && cc6%2==0){
            //3
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(leg.isSelected() && cc1%2==0 && cc2%2==0 && cc3%2==0 && cc4%2==0 && cer.isSelected()){
            //4
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(fruc.isSelected() && cc1%2==0 && cc2%2==0 && cc3%2==0 && cc5%2==0 && cc6%2==0){
            //5
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `fruit`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(fruc.isSelected() && cc1%2==0 && cc2%2==0 && cc3%2==0 && cc5%2==0 && cer.isSelected()){
            //6
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `fruit`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(fruc.isSelected() && cc1%2==0 && cc2%2==0 && cc3%2==0 && cc6%2==0 && leg.isSelected()){
            //7
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `fruit`=1 AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(fruc.isSelected() && cc1%2==0 && cc2%2==0 && cc3%2==0 && cer.isSelected() && leg.isSelected()){
            //8
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `fruit`=1 AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(ou.isSelected() && cc1%2==0 && cc2%2==0 && cc4%2==0 && cc5%2==0 && cc6%2==0){
            //9
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `egg`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(ou.isSelected() && cc1%2==0 && cc2%2==0 && cc4%2==0 && cc5%2==0 && cer.isSelected()){
            //10
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `egg`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(ou.isSelected() && cc1%2==0 && cc2%2==0 && cc4%2==0 && cc6%2==0 && leg.isSelected()){
            //11
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `egg`=1 AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(ou.isSelected() && cc1%2==0 && cc2%2==0 && cc4%2==0 && cer.isSelected() && leg.isSelected()){
            //12
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `egg`=1 AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(ou.isSelected() && cc1%2==0 && cc2%2==0 && fruc.isSelected() && cc5%2==0  && cc6%2==0){
            //13
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `egg`=1 AND `fruit`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(ou.isSelected() && cc1%2==0 && cc2%2==0 && fruc.isSelected() && cc5%2==0  && cer.isSelected()){
            //14
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `egg`=1 AND `fruit`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
            
           else if(ou.isSelected() && cc1%2==0 && cc2%2==0 && fruc.isSelected() && cc6%2==0  && leg.isSelected()){
            //15
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `egg`=1 AND `fruit`=1 AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
            
           else if(ou.isSelected() && cc1%2==0 && cc2%2==0 && fruc.isSelected() && cer.isSelected()  && leg.isSelected()){
            //16
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `egg`=1 AND `fruit`=1 AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && cc3%2==0 && cc4%2==0 && cc5%2==0  && cc6%2==0){
            //17
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && cc3%2==0 && cc4%2==0 && cc5%2==0  && cer.isSelected()){
            //18
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && cc3%2==0 && cc4%2==0 && leg.isSelected()  &&  cc6%2==0){
            //19
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && cc3%2==0 && cc4%2==0 && leg.isSelected()  &&  cer.isSelected()){
            //20
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `vegetables`=1  AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && cc3%2==0 && fruc.isSelected() && cc5%2==0  &&  cc6%2==0){
            //21
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `fruit`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && cc3%2==0 && fruc.isSelected() && cc5%2==0  &&  cer.isSelected()){
            //22
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `fruit`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && cc3%2==0 && fruc.isSelected() && leg.isSelected()  &&  cc6%2==0){
            //23
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `fruit`=1  AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && cc3%2==0 && fruc.isSelected() && leg.isSelected()  &&  cer.isSelected()){
            //24
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `fruit`=1  AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           
           else if(cc1%2==0 && car.isSelected() && ou.isSelected() && cc4%2==0 && cc5%2==0  &&  cc6%2==0){
            //25
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `egg`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && ou.isSelected() && cc4%2==0 && cc5%2==0  && cer.isSelected()){
            //26
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `egg`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && ou.isSelected() && cc4%2==0 && leg.isSelected()  && cc6%2==0){
            //27
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `egg`=1 AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && ou.isSelected() && cc4%2==0 && leg.isSelected()  && cer.isSelected()){
            //28
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `egg`=1 AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && ou.isSelected() && fruc.isSelected() && cc5%2==0  && cc6%2==0){
            //29
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `egg`=1 AND `fruit`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           
           else if(cc1%2==0 && car.isSelected() && ou.isSelected() && fruc.isSelected() && cc5%2==0  && cer.isSelected()){
            //30
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `egg`=1 AND `fruit`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && ou.isSelected() && fruc.isSelected() && leg.isSelected()  &&cc6%2==0){
            //31
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `egg`=1 AND `fruit`=1 AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(cc1%2==0 && car.isSelected() && ou.isSelected() && fruc.isSelected() && leg.isSelected()  && cer.isSelected()){
            //32
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `meat`=1  AND `egg`=1 AND `fruit`=1 AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && cc3%2==0 && cc4%2==0 && cc5%2==0  && cc6%2==0){
            //33
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && cc3%2==0 && cc4%2==0 && cc5%2==0  && cer.isSelected()){
            //34
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && cc3%2==0 && cc4%2==0 && leg.isSelected()  && cc6%2==0){
            //35
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && cc3%2==0 && cc4%2==0 && leg.isSelected() && cer.isSelected()){
            //36
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && cc3%2==0 && fruc.isSelected() && cc5%2==0 && cc6%2==0){
            //37
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `fruit`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && cc3%2==0 && fruc.isSelected() && cc5%2==0 && cer.isSelected()){
            //38
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `fruit`=1  AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && cc3%2==0 && fruc.isSelected() && leg.isSelected() && cc6%2==0){
            //39
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `fruit`=1  AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && cc3%2==0 && fruc.isSelected() && leg.isSelected() && cer.isSelected()){
            //40
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `fruit`=1  AND `vegetables`=1  AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && cc3%2==0 && fruc.isSelected() && leg.isSelected() && cer.isSelected()){
            //40
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `fruit`=1  AND `vegetables`=1  AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && ou.isSelected() && cc4%2==0 && cc5%2==0 && cc6%2==0){
            //41
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `egg`=1 "; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && ou.isSelected() && cc4%2==0 && cc5%2==0 && cer.isSelected()){
            //42
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `egg`=1 AND `cereals`=1 "; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && ou.isSelected() && cc4%2==0 && leg.isSelected() && cc6%2==0){
            //43
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `egg`=1 AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && ou.isSelected() && cc4%2==0 && leg.isSelected() && cer.isSelected()){
            //44
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `egg`=1 AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && ou.isSelected() && fruc.isSelected() && cc5%2==0 && cc6%2==0){
            //45
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `egg`=1 AND `fruit`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && ou.isSelected() && fruc.isSelected() && cc5%2==0 && cer.isSelected()){
            //46
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `egg`=1 AND `fruit`=1  AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && ou.isSelected() && fruc.isSelected() && leg.isSelected() &&cc6%2==0){
            //47
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `egg`=1 AND `fruit`=1 AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && cc2%2==0 && ou.isSelected() && fruc.isSelected() && leg.isSelected() &&cer.isSelected()){
            //48
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `egg`=1 AND `fruit`=1 AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && cc3%2==0 && cc4%2==0 && cc5%2==0 && cc6%2==0){
            //49
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && cc3%2==0 && cc4%2==0 && cc5%2==0 && cer.isSelected()){
            //50
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && cc3%2==0 && cc4%2==0 && leg.isSelected() && cc6%2==0){
            //51
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && cc3%2==0 && cc4%2==0 && leg.isSelected() && cer.isSelected()){
            //52
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && cc3%2==0 && fruc.isSelected() && cc5%2==0 && cc6%2==0){
            //53
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `fruit`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && cc3%2==0 && fruc.isSelected() && cc5%2==0 && cer.isSelected()){
            //54
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `fruit`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && cc3%2==0 && fruc.isSelected() && leg.isSelected() && cc6%2==0){
            //55
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `fruit`=1 AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && cc3%2==0 && fruc.isSelected() && leg.isSelected() && cer.isSelected()){
            //56
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `fruit`=1 AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && ou.isSelected() && cc4%2==0 && cc5%2==0 && cc6%2==0){
            //57
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `egg`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && ou.isSelected() && cc4%2==0 && cc5%2==0 && cer.isSelected()){
            //58
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `egg`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && ou.isSelected() && cc4%2==0 && leg.isSelected() && cc6%2==0){
            //59
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `egg`=1 AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && ou.isSelected() && cc4%2==0 && leg.isSelected() && cer.isSelected()){
            //60
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `egg`=1 AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && ou.isSelected() && fruc.isSelected() && cc5%2==0 && cc6%2==0){
            //61
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `egg`=1 AND `fruit`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && ou.isSelected() && fruc.isSelected() && cc5%2==0 && cer.isSelected()){
            //62
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `egg`=1 AND `fruit`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && ou.isSelected() && fruc.isSelected() && leg.isSelected() && cc6%2==0){
            //63
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `egg`=1 AND `fruit`=1 AND `vegetables`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           else if(lac.isSelected() && car.isSelected() && ou.isSelected() && fruc.isSelected() && leg.isSelected() && cer.isSelected()){
            //63
            String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"' AND `dairy_products`=1 AND `meat`=1  AND `egg`=1 AND `fruit`=1 AND `vegetables`=1 AND `cereals`=1"; 
            pst =connection.prepareStatement(sql);
            res = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null,"checkbox check");}
           
           
           
           
           
           
           else{
             //1
           String sql="SELECT name,ingredients,preparation_mode,images FROM licenta.recipes WHERE id ='"+addid+"'"; 
           pst =connection.prepareStatement(sql);
           res = pst.executeQuery();
           t1.setModel(DbUtils.resultSetToTableModel(res));}
           
           
           
           
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
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cer = new javax.swing.JCheckBox();
        lac = new javax.swing.JCheckBox();
        car = new javax.swing.JCheckBox();
        ou = new javax.swing.JCheckBox();
        fruc = new javax.swing.JCheckBox();
        leg = new javax.swing.JCheckBox();

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
        t1.getAccessibleContext().setAccessibleName("r");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 101, 640, 370));

        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, -1, -1));

        jButton6.setText("OPEN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        jButton7.setText("EDIT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        jLabel3.setText("LAPTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 20));

        jLabel4.setText("CARNE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 20));

        jLabel5.setText("OUA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 20));

        jLabel6.setText("FRUCTE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 20));

        jLabel7.setText("LEGUME");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, 20));

        jLabel8.setText("CEREALE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, 20));

        cer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerActionPerformed(evt);
            }
        });
        jPanel1.add(cer, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        lac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lacActionPerformed(evt);
            }
        });
        jPanel1.add(lac, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carActionPerformed(evt);
            }
        });
        jPanel1.add(car, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        ou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouActionPerformed(evt);
            }
        });
        jPanel1.add(ou, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        fruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frucActionPerformed(evt);
            }
        });
        jPanel1.add(fruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        leg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legActionPerformed(evt);
            }
        });
        jPanel1.add(leg, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

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
        Login log= new Login();
        log.setVisible(true);
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
        String n_rec=t1.getModel().getValueAt(row,0).toString();
        try{
        String qur="DELETE FROM `licenta`.`recipes` WHERE name='"+n_rec+"'";
        prs =connection.prepareStatement(qur);
        prs.executeUpdate();
        JOptionPane.showMessageDialog(null,"Reteta a fost stearsa cu succes");
        DisplayTable();
        
            
        }catch(SQLException e){}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            int row=t1.getSelectedRow();
            nm_rec=t1.getModel().getValueAt(row,0).toString();
            dispose();
            EditRec ed=new EditRec();
            ed.setVisible(true);
        } catch (SQLException | IOException ex) {
            Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            dispose();
            DisplayRec ed=new DisplayRec();
            ed.setVisible(true);
        } catch (SQLException | IOException ex) {
            Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void lacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lacActionPerformed
        
                cc1++;
                if(cc1%2==0){JOptionPane.showMessageDialog(null,"nu ii");
                lac.setSelected(false);
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
                else{JOptionPane.showMessageDialog(null,"ii bifat");
                lac.setSelected(true);
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
    }//GEN-LAST:event_lacActionPerformed

    private void carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carActionPerformed
                cc2++;
                if(cc2%2==0){JOptionPane.showMessageDialog(null,"nu ii");
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
                else{JOptionPane.showMessageDialog(null,"ii bifat");
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
    }//GEN-LAST:event_carActionPerformed

    private void ouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouActionPerformed
                cc3++;
                if(cc3%2==0){JOptionPane.showMessageDialog(null,"nu ii");
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
                else{JOptionPane.showMessageDialog(null,"ii bifat");
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
    }//GEN-LAST:event_ouActionPerformed

    private void frucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frucActionPerformed
                cc4++;
                if(cc4%2==0){JOptionPane.showMessageDialog(null,"nu ii");
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
                else{JOptionPane.showMessageDialog(null,"ii bifat");
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
    }//GEN-LAST:event_frucActionPerformed

    private void legActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legActionPerformed
                cc5++;
                if(cc5%2==0){JOptionPane.showMessageDialog(null,"nu ii");
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
                else{JOptionPane.showMessageDialog(null,"ii bifat");
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
    }//GEN-LAST:event_legActionPerformed

    private void cerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerActionPerformed
                cc6++;
                if(cc6%2==0){JOptionPane.showMessageDialog(null,"nu ii");
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
                else{JOptionPane.showMessageDialog(null,"ii bifat");
                    try {
                        DisplayTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(MyRecipes.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
    }//GEN-LAST:event_cerActionPerformed

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
    private javax.swing.JCheckBox car;
    private javax.swing.JCheckBox cer;
    private javax.swing.JLabel flname;
    private javax.swing.JCheckBox fruc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox lac;
    private javax.swing.JCheckBox leg;
    private javax.swing.JPanel menu;
    private javax.swing.JButton opmen;
    private javax.swing.JCheckBox ou;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables


}
