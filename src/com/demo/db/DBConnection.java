package com.demo.db;

import java.sql.*;

/**
 * @Author: 汪飞洋
 * @project: PetManager
 * @Date: 2023/8/21
 */
public class DBConnection {
    private String driverClassName="com.mysql.cj.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/petmanager?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8";
    private String user="root";
    private String pass="153517";
    private Connection con;

    public DBConnection(){
        try {
            Class.forName(driverClassName);
            con= DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     * @return
     */
    public Connection getCon(){
        return con;
    }

    /**
     * 关闭数据库连接
     * @param con
     * @param st
     * @param rs
     */
    public void  dbClose(Connection con, Statement st, ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
