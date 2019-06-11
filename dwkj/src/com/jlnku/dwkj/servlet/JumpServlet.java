package com.jlnku.dwkj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
}
