package oa.servlet;

import oa.bean.Apply;
import oa.bean.Resign;
import oa.bean.WorkOver;
import oa.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SelectApplyServlet",urlPatterns = {"/PendingServlet","/AgreeServlet","/DisagreeServlet"})
public class SelectApplyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请假的申请
        String code =request.getServletPath();
        Apply apply = new Apply();
        switch (code){
            case "/PendingServlet":{
                  apply.setA_statu(0);
                  List<Apply> app = ServiceFactory.getApplyService().query(apply);
                  //request.setAttribute("app",app);
               /* request.setAttribute("applylist",ServiceFactory.getApplyService().query(new Apply()));*/
                  request.getSession().setAttribute("app",app);
                  //request.getRequestDispatcher("holidayPendingApproval.jsp").forward(request,response);
                break;
            }
            case "/AgreeServlet":{
              apply.setA_statu(1);
              List<Apply> appAgree = ServiceFactory.getApplyService().query(apply);
              request.getSession().setAttribute("appAgree",appAgree);
              /*request.getRequestDispatcher("holidayPendingApproval.jsp").forward(request,response);*/

              break;
            }
            case "/DisagreeServlet":{
               /* Resign resign = new Resign();
                resign.setR_statu(0);
                List<Resign> res = ServiceFactory.getResignService().query(resign);
                resign.setR_statu(1);
                List<Resign> resAgree = ServiceFactory.getResignService().query(resign);
                resign.setR_statu(2);
                List<Resign> resDisagree = ServiceFactory.getResignService().query(resign);
                request.setAttribute("res",res);
                request.setAttribute("resAgree",resAgree);
                request.setAttribute("resDisagree",resDisagree);
                request.getRequestDispatcher("")*/
                /*request.setAttribute("resignlist",ServiceFactory.getResignService().query(new Resign()));
                request.getRequestDispatcher("showPendingApproval.jsp").forward(request,response);*/
                apply.setA_statu(2);
                List<Apply> appDisagree = ServiceFactory.getApplyService().query(apply);
                request.getSession().setAttribute("appDisagree",appDisagree);
               /* request.getRequestDispatcher("holidayPendingApproval.jsp").forward(request,response);*/
                break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
