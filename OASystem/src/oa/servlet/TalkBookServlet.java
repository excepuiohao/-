package oa.servlet;

import oa.bean.User;
import oa.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by St01 on 2017-10-11.
 */
@WebServlet(name = "TalkBookServlet",urlPatterns = "/TalkBookListInfo")
public class TalkBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> list = ServiceFactory.getUserService().query(new User());
        request.getSession().setAttribute("userList", list);
        response.sendRedirect("TalkBook.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
