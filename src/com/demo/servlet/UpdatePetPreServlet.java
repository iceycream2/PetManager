package com.demo.servlet;

import com.demo.dao.PetDao;
import com.demo.entity.Pet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 汪飞洋
 * @project: PetManager
 * @Date: 2023/8/24
 */
@WebServlet("/updatePetPre")
public class UpdatePetPreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str=req.getParameter("id");
        int id=Integer.parseInt(str);
        PetDao petDao=new PetDao();
        Pet pet=petDao.getPetByID(id);
        req.setAttribute("pet",pet);
        req.getRequestDispatcher("/updatePet.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
