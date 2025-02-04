package com.demo.servlet;

import com.demo.dao.TypeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 汪飞洋
 * @project: PetManager
 * @Date: 2023/8/25
 */
@WebServlet("/deleteType")
public class DeleteTypeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStr=req.getParameter("id");
        int id=Integer.parseInt(idStr);
        TypeDao typeDao=new TypeDao();
        int i=typeDao.delType(id);
        resp.sendRedirect("/typeList");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
