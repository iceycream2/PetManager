package com.demo.dao;

import com.demo.db.DBConnection;
import com.demo.entity.Pet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 汪飞洋
 * @project: PetManager
 * @Date: 2023/8/21
 * D:\idea\apache-tomcat-9.0.78-windows-x64\apache-tomcat-9.0.78\lib\servlet-api.jar
 */
public class PetDao {
    /**
     * 查询所有宠物
     */
    public List<Pet> getPetList(){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="SELECT p_id,p_name,p_m_name,p_m_phone,p_m_address,p_type FROM pet";
        PreparedStatement pst=null;
        ResultSet rs=null;
        List<Pet> petList=new ArrayList<>();
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                Pet pet=new Pet();
                pet.setP_id(rs.getInt("p_id"));
                pet.setP_name(rs.getString("p_name"));
                pet.setP_m_name(rs.getString("p_m_name"));
                pet.setP_m_phone(rs.getString("p_m_phone"));
                pet.setP_m_address(rs.getString("p_m_address"));
                pet.setP_type(rs.getString("p_type"));
                petList.add(pet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            db.dbClose(con,pst,rs);
        }
        return petList;
    }

    /**
     * 增加宠物
     */
    public int addPet(Pet pet){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="insert into pet(p_name,p_m_name,p_m_phone,p_m_address,p_type) values(?,?,?,?,?)";
        PreparedStatement pst=null;
        int i=0;
        try {
            pst=con.prepareStatement(sql);
            pst.setString(1,pet.getP_name());
            pst.setString(2,pet.getP_m_name());
            pst.setString(3,pet.getP_m_phone());
            pst.setString(4,pet.getP_m_address());
            pst.setString(5,pet.getP_type());
            i=pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            db.dbClose(con,pst,null);
        }
        return i;
    }

    /**
     * 删除宠物
     */
    public int delPet(int id){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="delete from pet where p_id=?";
        PreparedStatement pst=null;
        int i=0;
        try {
            pst=con.prepareStatement(sql);
            pst.setInt(1,id);
            i=pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            db.dbClose(con,pst,null);
        }
        return i;
    }

    /**
     * 修改宠物
     */
    public int updatePet(Pet pet){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="update pet set p_name=?,p_m_name=?,p_m_phone=?,p_m_address=?,p_type=? where p_id=?";
        PreparedStatement pst=null;
        int i=0;
        try {
            pst=con.prepareStatement(sql);
            pst.setString(1,pet.getP_name());
            pst.setString(2,pet.getP_m_name());
            pst.setString(3,pet.getP_m_phone());
            pst.setString(4,pet.getP_m_address());
            pst.setString(5,pet.getP_type());
            pst.setInt(6,pet.getP_id());
            i=pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            db.dbClose(con,pst,null);
        }
        return i;
    }
    public Pet getPetByID(int id){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="select p_id,p_name,p_m_name,p_m_phone,p_m_address,p_type from pet where p_id=?";
        PreparedStatement pst=null;
        ResultSet rs=null;
        Pet pet=new Pet();
        try {
            pst=con.prepareStatement(sql);
            pst.setInt(1,id);
            rs=pst.executeQuery();
            if(rs.next()){
                pet.setP_id(rs.getInt("p_id"));
                pet.setP_name(rs.getString("p_name"));
                pet.setP_m_name(rs.getString("p_m_name"));
                pet.setP_m_phone(rs.getString("p_m_phone"));
                pet.setP_m_address(rs.getString("p_m_address"));
                pet.setP_type(rs.getString("p_type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.dbClose(con,pst,rs);
        }
        return pet;
    }
    public List<Pet> groupPetList(String str){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="SELECT p_id,p_name,p_m_name,p_m_phone,p_m_address,p_type FROM pet where p_type=?";
        PreparedStatement pst=null;
        ResultSet rs=null;
        List<Pet> petList=new ArrayList<>();
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            pst.setString(1,str);
            while(rs.next()){
                Pet pet=new Pet();
                pet.setP_id(rs.getInt("p_id"));
                pet.setP_name(rs.getString("p_name"));
                pet.setP_m_name(rs.getString("p_m_name"));
                pet.setP_m_phone(rs.getString("p_m_phone"));
                pet.setP_m_address(rs.getString("p_m_address"));
                pet.setP_type(rs.getString("p_type"));
                petList.add(pet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            db.dbClose(con,pst,rs);
        }
        return petList;
    }
}
