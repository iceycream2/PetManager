package com.demo.servlet;

import com.demo.dao.PetDao;
import com.demo.entity.Pet;

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
 * @Date: 2023/8/24
 */
@WebServlet("/petList")
public class PetListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PetDao petDao=new PetDao();
        List<Pet> petList=petDao.getPetList();
        req.setAttribute("petList",petList);
        req.getRequestDispatcher("/petList.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }



}
