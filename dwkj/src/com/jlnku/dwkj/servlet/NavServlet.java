package com.jlnku.dwkj.servlet;

import com.jlnku.dwkj.entity.Category;
import com.jlnku.dwkj.service.NavService;
import com.jlnku.dwkj.service.impl.NavServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/NavServlet/*")
//@WebServlet(urlPatterns = {"/htgl/UserServlet/*",""})
public class NavServlet extends BaseServlet {

    NavService navService = new NavServiceImpl();


    /**
     * 查询所有导航
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @return
     */
    public void query(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{

        ArrayList<Category> nav_list = navService.listCategory();
        request.setAttribute("nav_list",nav_list);
        System.out.println("nav_list is _______" +
                nav_list);
        System.out.println(nav_list);
        request.getRequestDispatcher("/WEB-INF/htgl/nav_index.jsp").forward(request,response);
    }

    /**
     * 数据回写
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void editBack(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String lead = request.getParameter("lead");
        String servlet = request.getParameter("servlet");

        ArrayList<Category> nav_list_lead = navService.listCategoryLead();
        request.setAttribute("nav_list_lead",nav_list_lead);


        System.out.println("editBack inner--------------- Category_servlet is "+servlet);

        request.setAttribute("id",id);
        request.setAttribute("name",name);
        request.setAttribute("lead",lead);
        request.setAttribute("servlet",servlet);

        request.getRequestDispatcher("/WEB-INF/htgl/nav_updata.jsp").forward(request,response);
    }


    /**
     * 修改导航项
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void updata(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String lead = request.getParameter("lead");
        String servlet = request.getParameter("servlet");

        int affectLine = navService.updataCategory(id,name,lead,servlet);

        if (affectLine!= 0){
            System.out.println("更新成功");
            request.getRequestDispatcher("/NavServlet/query").forward(request,response);

        }else{
            System.out.println("更新失败");
            request.getRequestDispatcher("/NavServlet/query").forward(request,response);
        }
    }

    /**
     * 添加导航条
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void add(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{

        String name = request.getParameter("name");
        String lead = request.getParameter("lead");
        String servlet = request.getParameter("servlet");

        int affectLine = navService.addCategory(name,lead,servlet);

        if (affectLine!= 0){
            System.out.println("添加成功");
            request.getRequestDispatcher("/NavServlet/query").forward(request,response);

        }else{
            System.out.println("添加失败");
            request.getRequestDispatcher("/NavServlet/query").forward(request,response);
        }
    }

    /**
     * 删除导航项目
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void delete(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{

        String id = request.getParameter("id");

        int affectLine = navService.deleteCategory(id);

        if (affectLine!= 0){
            System.out.println("删除成功");
            request.getRequestDispatcher("/NavServlet/query").forward(request,response);


        }else{
            System.out.println("删除失败");
        }

        //request.getRequestDispatcher("/WEB-INF/htgl/nav_index.jsp").forward(request,response);
    }

    /**
     * 测试Servlet
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public  void demoUser(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        System.out.println("------UserServlet in demoUser method-----");
    }

    /**
     * 获取一级导航
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void mainnav(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{

        ArrayList<Category> nav_list_lead = navService.listCategoryLead();
        request.setAttribute("nav_list_lead",nav_list_lead);

        ArrayList<Category> nav_list = navService.listCategory();
        request.setAttribute("nav_list",nav_list);

        request.getRequestDispatcher("/head.jsp").forward(request,response);
    }


}
