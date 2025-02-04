package com.demo.servlet;

import com.demo.dao.TypeDao;
import com.demo.entity.Type;

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
 * @Date: 2023/8/25
 */
@WebServlet("/addType")
public class AddTypeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String t_name=req.getParameter("t_name");
        Type type=new Type();
        type.setT_name(t_name);
        TypeDao typeDao=new TypeDao();
        boolean flag=typeDao.getType(t_name);
        if(flag){
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.println("<script>alert('添加失败,存在重复种类!');location.href='/addType.jsp'</script>");
        }else{
            int i=typeDao.addType(type);
            resp.sendRedirect("/typeList");
        }
    }
}
