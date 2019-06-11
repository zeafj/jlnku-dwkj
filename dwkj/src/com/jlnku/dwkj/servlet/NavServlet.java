package com.jlnku.dwkj.servlet;

import com.jlnku.dwkj.entity.User;
import com.jlnku.dwkj.service.UserService;
import com.jlnku.dwkj.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/NavServlet/*")
//@WebServlet(urlPatterns = {"/htgl/UserServlet/*",""})
public class NavServlet extends BaseServlet {


    /**
     * 登录验证
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void login(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{




    }

    public  void demoUser(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        System.out.println("------UserServlet in demoUser method-----");
    }
}
