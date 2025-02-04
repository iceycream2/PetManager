package com.demo.servlet;

import com.demo.dao.PetDao;
import com.demo.entity.Pet;

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
 * @Date: 2023/8/24
 */
@WebServlet("/addPet")
public class AddPetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String p_name=req.getParameter("p_name");
        String p_m_name=req.getParameter("p_m_name");
        String p_m_phone=req.getParameter("p_m_phone");
        String p_m_address=req.getParameter("p_m_address");
        String p_type=req.getParameter("p_type");
        Pet pet=new Pet();
        pet.setP_name(p_name);
        pet.setP_m_name(p_m_name);
        pet.setP_m_phone(p_m_phone);
        pet.setP_m_address(p_m_address);
        pet.setP_type(p_type);
        PetDao petDao=new PetDao();
        int i=petDao.addPet(pet);
        if(i>0){
            resp.sendRedirect("/petList");
        }else{
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.println("<script>alert('添加失败!');location.href='/addPet.jsp'</script>");
        }
    }
}
