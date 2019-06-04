package club.mxz1122.servlet;

import club.mxz1122.entity.User;
import club.mxz1122.service.UserService;
import club.mxz1122.serviceimpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectServlet")
public class SelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");


        UserService userService = new UserServiceImpl();
       List<User> list = userService.select();
        User uuuu = list.get(0);
        request.setAttribute("list",list);
        request.setAttribute("uuuu",uuuu);

        System.out.println(list.get(0).getUserName());
        request.getRequestDispatcher("/show.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

}
