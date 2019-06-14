package com.jlnku.dwkj.servlet;

import com.jlnku.dwkj.entity.Category;
import com.jlnku.dwkj.service.NavService;
import com.jlnku.dwkj.service.impl.NavServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/htgl/*")
public class JumpServlet extends BaseServlet {
    //定向登入
    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/htgl/login.jsp").forward(request,response);

    }

    protected void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/htgl/index.jsp").forward(request,response);

    }
    protected void nav_index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/htgl/nav_index.jsp").forward(request,response);

    }
    //登出
    protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //   request.getSession().invalidate();
//        response.sendRedirect(request.getContextPath() + "/htgl/login");
        request.getSession().invalidate();
        request.getRequestDispatcher("/WEB-INF/htgl/login.jsp").forward(request,response);
    }


    public void jumpadd(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{

        NavService navService = new NavServiceImpl();

        ArrayList<Category> nav_list_lead = navService.listCategoryLead();
        request.setAttribute("nav_list_lead",nav_list_lead);

        request.getRequestDispatcher("/WEB-INF/htgl/nav_add.jsp").forward(request,response);
    }
}
