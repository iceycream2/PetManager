package com.demo.servlet;

import com.demo.dao.LoginDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: 汪飞洋
 * @project: PetManager
 * @Date: 2023/8/23
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //获取客户端请求的账号和密码
        String username= req.getParameter("username");
        String password= req.getParameter("password");
        LoginDao loginDao=new LoginDao();
        boolean flag=loginDao.isUserExist(username,password);
        if(flag){//用户存在，就进入管理界面
            HttpSession session= req.getSession();
            session.setAttribute("username",username);
            resp.sendRedirect("/login.jsp");
        }else{  //用户不存在，返回登录页面
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.println("<script>alert('登录失败!');location.href='/index.jsp'</script>");
            //resp.sendRedirect("/login.jsp");
        }
    }
}
