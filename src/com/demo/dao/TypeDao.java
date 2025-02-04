package com.demo.dao;

import com.demo.db.DBConnection;
import com.demo.entity.Type;

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
 */
public class TypeDao {

    /**
     * 查询种类
     */
    public List<Type> getTypelist(){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="select t_id,t_name from type order by t_id";
        PreparedStatement pst=null;
        ResultSet rs=null;
        List<Type> typeList=new ArrayList<>();
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                Type type=new Type();
                type.setT_id(rs.getInt("t_id"));
                type.setT_name(rs.getString("t_name"));
                typeList.add(type);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(con,pst,rs);
        }
        return typeList;
    }

    /**
     * 删除种类
     */
    public int delType(int id){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="delete from type where t_id=?";
        PreparedStatement pst=null;
        int i=0;
        try{
            pst=con.prepareStatement(sql);
            pst.setInt(1,id);
            i=pst.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.dbClose(con,pst,null);
        }
        return i;
    }

    /**
     * 修改种类
     */
    public int updateType(Type type){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="update type set t_name=? where t_id=?";
        PreparedStatement pst=null;
        int i=0;
        try {
            pst=con.prepareStatement(sql);
            pst.setString(1,type.getT_name());
            pst.setInt(2,type.getT_id());
            i=pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(con,pst,null);
        }
        return i;
    }

    /**
     * 增加种类
     */
    public int addType(Type type){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="insert into type(t_id,t_name) values(?,?)";
        PreparedStatement pst=null;
        int i=0;
        try {
            pst=con.prepareStatement(sql);
            pst.setInt(1,type.getT_id());
            pst.setString(2,type.getT_name());
            i=pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(con,pst,null);
        }
        return i;
    }
    public boolean getType(String str){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="select t_id,t_name from type where t_name=?";
        PreparedStatement pst=null;
        ResultSet rs=null;
        boolean flag=false;
        try {
            pst=con.prepareStatement(sql);
            pst.setString(1,str);
            rs=pst.executeQuery();
            if(rs.next()){
                flag=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(con,pst,rs);
        }
        return flag;
    }
}
