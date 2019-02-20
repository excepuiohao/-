package oa.servlet;

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
import java.util.List;

/**
 * Created by St01 on 2017-10-10.
 */
@WebServlet(name = "RateServlet",urlPatterns = {"/LookOverRate","/GOSubmitRate","/DOSubmitRate"})
public class RateServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String servlet = request.getServletPath();  //获取Servlet请求名

        List<Project> projectlist =  ServiceFactory.getProjectService().query(new Project());
        List<Rate> ratelist = ServiceFactory.getRateService().query(new Rate());

        switch (servlet){
            case "/LookOverRate":{  //查看进度Servlet
                request.setAttribute("ratelist",ratelist);
                request.setAttribute("projectlist",projectlist);

                request.getRequestDispatcher("p_lookover_rate.jsp").forward(request,response);

            }break;
            case "/GOSubmitRate":{  //进入提交进度Servlet
                request.getSession().setAttribute("ratelist",ratelist);
                request.getRequestDispatcher("p_submit_rate.jsp").forward(request,response);
            }break;
            case "/DOSubmitRate":{  //进行提交进度Servlet
                int r_rate = Integer.valueOf((String)request.getParameter("r_rate"));
                Rate rate1 = ratelist.get(0);
                rate1.setR_rate(ratelist.get(0).getR_rate()+r_rate);
                boolean flag = ServiceFactory.getRateService().updateAll(rate1);
                if (flag){  //插入成功
                    response.setContentType("text/html;charset=utf-8");
                    response.getWriter().print("<script>alert('提交成功');window.location='LookOverRate'</script>");
                }else{  //插入失败
                    response.setContentType("text/html;charset=utf-8");
                    response.getWriter().print("<script>alert('提交失败');window.location='GOSubmitRate'</script>");
                }
            }break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
