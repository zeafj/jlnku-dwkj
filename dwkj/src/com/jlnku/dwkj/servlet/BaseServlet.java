package com.jlnku.dwkj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

@WebServlet("/BaseServlet")
public class BaseServlet extends HttpServlet {

    public void service(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{

        String uri = request.getRequestURI();
        System.out.println("uri---------"+uri);
        String methodName = uri.substring(uri.lastIndexOf('/')+1);
        System.out.println("method==============="+methodName);
        try {
            Method method = this.getClass().getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
            method.invoke(this,request,response);
        }catch (Exception e){
            throw new RuntimeException(e);
        }


    }

}
