package oa.servlet;

import oa.bean.Apply;
import oa.bean.Resign;
import oa.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ResignServlet",urlPatterns = {"/ResignPendingServlet","/ResignAgreeServlet","/ResignDisagreeServlet"})
public class ResignServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //辞职
        String path = request.getServletPath();
        Resign resign = new Resign();
        switch (path){
            case "/ResignPendingServlet":{
                resign.setR_statu(0);
                List<Resign> res = ServiceFactory.getResignService().query(resign);
                request.getSession().setAttribute("res",res);
                //request.getRequestDispatcher("ResignPendingApproval.jsp").forward(request,response);
                break;
            }
            case "/ResignAgreeServlet":{
                resign.setR_statu(1);
                List<Resign> resagree = ServiceFactory.getResignService().query(resign);
                request.getSession().setAttribute("resagree",resagree);
                request.getRequestDispatcher("ResignPendingApproval.jsp").forward(request,response);
                break;
            }
            case "/ResignDisagreeServlet":{
                resign.setR_statu(2);
                List<Resign> resdisagree = ServiceFactory.getResignService().query(resign);
                request.getSession().setAttribute("resdisagree",resdisagree);
                request.getRequestDispatcher("ResignPendingApproval.jsp").forward(request,response);
                break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     this.doPost(request,response);
    }
}
