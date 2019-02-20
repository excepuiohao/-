package oa.servlet;

import oa.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet",urlPatterns = {"/UserLogin","/UserRegister"})
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String code = req.getServletPath();
        boolean flag = false;
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        switch (code){
            case "/UserLogin":{
                flag = ServiceFactory.getUserService().check(username,password);
                if(flag){
                    //登录成功
                    req.getSession().setAttribute("user",ServiceFactory.getUserService().getUser());
                    req.getRequestDispatcher("main.jsp").forward(req,resp);
                }else {
                    //登录失败
                    req.getRequestDispatcher("index.jsp").forward(req,resp);
                }
                break;
            }
            case "/UserRegister":{

                break;
            }
        }
    }
}
