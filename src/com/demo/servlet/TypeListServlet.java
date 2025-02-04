package com.demo.servlet;

import com.demo.dao.TypeDao;
import com.demo.entity.Type;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: 汪飞洋
 * @project: PetManager
 * @Date: 2023/8/25
 */
@WebServlet("/typeList")
public class TypeListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TypeDao typeDao=new TypeDao();
        List<Type> typeList=typeDao.getTypelist();
        req.setAttribute("typeList",typeList);
        req.getRequestDispatcher("/typeList.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
