package com.demo.servlet;

import com.demo.dao.LoginDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: 汪飞洋
 * @project: PetManager
 * @Date: 2023/8/23
 */
@WebServlet("/regdit")
public class RegditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password= req.getParameter("password");
        LoginDao loginDao=new LoginDao();
        int i=loginDao.addUser(username,password);
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        if(i>0){//注册成功，跳转到登录页面
            out.println("<script>alert('注册成功!');location.href='/index.jsp'</script>");
        }else{
            out.println("<script>alert('注册失败,密码或账号不得为空!');location.href='/register.jsp'</script>");
        }
    }
}
