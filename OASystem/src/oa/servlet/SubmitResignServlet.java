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

@WebServlet(name = "SubmitResignServlet",urlPatterns = {"/SubmitAgreeResignServlet","/SubmitDisagreeResignServlet"})
public class SubmitResignServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //辞职的审批
        String code = request.getServletPath();
        Resign resign = new Resign();
        String u_id = request.getParameter("u_id");
        resign.setU_id(Integer.parseInt(u_id));
        boolean flag = false;
        switch (code) {
            case "/SubmitAgreeResignServlet": {

                resign = ServiceFactory.getResignService().query(resign).get(0);
                resign.setR_statu(1);
                flag = ServiceFactory.getResignService().updateAll(resign);
                //request.setAttribute("app",app);
               /* request.setAttribute("applylist",ServiceFactory.getApplyService().query(new Apply()));*/
                //request.getRequestDispatcher("holidayPendingApproval.jsp").forward(request,response);
                break;
            }
            case "/SubmitDisagreeApplyServlet": {
                resign = ServiceFactory.getResignService().query(resign).get(0);
                resign.setR_statu(2);
                flag = ServiceFactory.getResignService().updateAll(resign);
                break;
            }
        }
        if(flag){
            request.getRequestDispatcher("ResignPendingApproval.jsp").forward(request,response);
        }
        else {
            request.getRequestDispatcher("ResignPendingApproval.jsp").forward(request,response);
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
