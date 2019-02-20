package oa.servlet;

import oa.Utils.out;
import oa.bean.Project;
import oa.bean.Rate;
import oa.bean.User;
import oa.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by WangNing on 2017-10-10.
 */
@WebServlet(name = "ProjectServlet",urlPatterns = {"/SendProject"})
public class ProjectServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String code = req.getServletPath();
        boolean flag = false;
         switch (code){
            case "/SendProject":{
                String p_title = req.getParameter("p_title");
                String p_context = req.getParameter("p_context");
                String p_ids = req.getParameter("p_ids");
                out.print(p_title+p_context+p_ids);
                Project project = new Project(-1, ServiceFactory.getUserService().getUser().getU_no(),p_title,0,p_title,p_context,0);
                flag = ServiceFactory.getProjectService().insert(project);


                String[] ids = p_ids.split("#");

                for (int i = 0; i <ids.length ; i++) {
                    if(ids[i] != null){
                        Rate rate = new Rate(-1,ServiceFactory.getProjectService().query(project).get(0).getP_id(),Integer.valueOf(ids[i]),0,new Date(System.currentTimeMillis()));
                        if(flag){
                            flag = ServiceFactory.getRateService().insert(rate);
                        }
                    }

                }
                User user = ServiceFactory.getUserService().getUser();
                user.setU_type(1);
                flag = ServiceFactory.getUserService().update(user);
                if(flag){
                    resp.sendRedirect("main.jsp");
                }
                break;
            }
        }
    }
}
