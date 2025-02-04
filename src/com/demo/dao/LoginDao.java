package com.demo.dao;

import com.demo.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: 汪飞洋
 * @project: PetManager
 * @Date: 2023/8/23
 */
public class LoginDao {
    /**
     * 登录操作
     * @param useraname
     * @param password
     * @return 用户是否存在
     */
    public boolean isUserExist(String useraname,String password){
        DBConnection db=new DBConnection();
        Connection connection=db.getCon();
        String sql="select id,username from login where username=? and password=?";
        PreparedStatement pst=null;
        ResultSet rs=null;
        boolean flag=false;
        try {
            pst=connection.prepareStatement(sql);
            pst.setString(1,useraname);
            pst.setString(2,password);
            rs=pst.executeQuery();
            if(rs.next()){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(connection,pst,rs);
        }
        return flag;
    }

    /**
     * 用户注册
     * @param username
     * @param password
     * @return
     */
    public int addUser(String username,String password){
        DBConnection db=new DBConnection();
        Connection con=db.getCon();
        String sql="insert into login(username,password) values(?,?)";
        PreparedStatement pst=null;
        int i=0;
        try {
            pst= con.prepareStatement(sql);
            pst.setString(1,username);
            pst.setString(2,password);
            i=pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(con,pst,null);
        }
        return i;
    }
}
