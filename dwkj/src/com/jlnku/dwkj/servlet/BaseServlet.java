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

        //1 获取访问地址的URL
        String uri = request.getRequestURI();
        System.out.println("uri---------"+uri);
        //2 获取uri最后一个斜线的位置，
        int currentPosition = uri.lastIndexOf('/');
        //3 获取方法名称 截取uri中最后一个斜线的单词
        String methodName = uri.substring(currentPosition+1);
        System.out.println("method==============="+methodName);
        //4 谁继承Base Servlet，并且调用Base Servlet，就是this
        Class<? extends BaseServlet> clazz = this.getClass();

        try {
            //5 通过反射机制拿到（调用对象）进行忽略访问权限进而获取clazz中的方法，参数为方法名，请求队形，响应队形
            Method method = clazz.getDeclaredMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);

            //6 获取调用的返回值，并通过invoke方法执行调用业务方法
            String  dispatcherPage = (String) method.invoke(this,request,response);

            //7 接受到的转发页面
//            System.out.println("接受到的页面字符串:"+dispatcherPage);
            String page;
            // 判断 转发页面中是否包含 冒号 用于判断继承类中是否写入了 forward后者是redirect，有冒号，则表示写入了

            if (dispatcherPage.contains(":")) {

                String [] datas = dispatcherPage.split(":");
                System.out.println("datas 1"+datas[0]+"            datas 2"+datas[1]);

                page =datas[1];
                if("forward".equals(datas[0])){
                    request.getRequestDispatcher(page).forward(request,response);
                }else if("redirect".equals(datas[0])){
                    response.sendRedirect(request.getContextPath()+page);
                }
            }else{
                page = dispatcherPage;
                System.out.println("page"+page);
                if(page == null || page == ""){
                    response.sendRedirect(request.getContextPath()+"/500.jsp");
                }else {
                    request.getRequestDispatcher(page).forward(request,response);
                }

            }

        }catch (Exception e){
            throw new RuntimeException(e);
        }


    }

}
