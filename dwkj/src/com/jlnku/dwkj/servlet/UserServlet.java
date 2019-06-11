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
import java.util.ArrayList;

@WebServlet("/UserServlet/*")
//@WebServlet(urlPatterns = {"/htgl/UserServlet/*",""})
public class UserServlet extends BaseServlet {


    /**
     * 登录验证
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public  String login(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{

        String user = request.getParameter("user");
        String password = request.getParameter("password");

        UserService userService = new UserServiceImpl();

       // ArrayList<User> listUser = userService.listUser(user,password);

        User u = userService.getPower(user,password);

        int power = u.getPower();

        System.out.println("------UserServlet in Login method-----");
        System.out.println("power is =========="+power);


        if(power==-1){
            //无法登录  数据库中无该用户
            return null;
        }else if(power==0){
            //超级管理员
            return null;
        }else if(power==1){
            //普通管理员
            HttpSession session = request.getSession();
            session.setAttribute("user",u);
            return "redirect:/htgl/index";
//            response.sendRedirect("index.jsp");

        }
        return null;
    }

    public  void demoUser(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        System.out.println("------UserServlet in demoUser method-----");
    }
}
