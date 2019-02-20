package oa.servlet;

import oa.Utils.out;
import oa.bean.Sign;
import oa.bean.User;
import oa.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by St01 on 2017-10-10.
 */
@WebServlet(name="/SignInfoServlet", urlPatterns = {"/SignInfo"})
public class SignServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paths = request.getServletPath();
        User user = ServiceFactory.getUserService().getUser();
        switch (paths){
            case "/SignInfo":{
                String strType = request.getParameter("signType");
                int signType = Integer.parseInt(strType);

                Sign sign = new Sign(user.getU_id(), signType, new Date(System.currentTimeMillis()));
                boolean flag = ServiceFactory.getSignService().insert(sign);
                List<Sign> list = ServiceFactory.getSignService().query(new Sign(user.getU_id()));
                for (Sign s :list) {
                    out.print(s.toString());
                }
                request.getSession().setAttribute("signList", list);
                if(flag){
                    response.getWriter().print("<script>window.location='main.jsp'</script>");
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
