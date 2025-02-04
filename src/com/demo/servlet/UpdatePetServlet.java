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
@WebServlet("/updatePet")
public class UpdatePetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String idStr=req.getParameter("p_id");
        int p_id=Integer.parseInt(idStr);
        String p_name=req.getParameter("p_name");
        String p_m_name=req.getParameter("p_m_name");
        String p_m_phone=req.getParameter("p_m_phone");
        String p_m_address=req.getParameter("p_m_address");
        String p_type=req.getParameter("p_type");
        Pet pet=new Pet(p_id,p_name,p_m_name,p_m_phone,p_m_address,p_type);
        PetDao petDao=new PetDao();
        int i=petDao.updatePet(pet);
        if(i>0){
            resp.sendRedirect("/petList");
        }else{
            resp.sendRedirect("/updatePetPre?id="+pet.getP_id());
        }
    }
}
