package oa.servlet;

import oa.bean.Apply;
import oa.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SubmitApplyServlet",urlPatterns = {"/SubmitAgreeApplyServlet","/SubmitDisagreeApplyServlet"})
public class SubmitApplyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请假的审批
        String code = request.getServletPath();
        Apply apply = new Apply();
        String u_id = request.getParameter("u_id");
        apply.setU_id(Integer.parseInt(u_id));
        boolean flag = false;
        switch (code) {
            case "/SubmitAgreeApplyServlet": {

                apply = ServiceFactory.getApplyService().query(apply).get(0);
                apply.setA_statu(1);
                flag = ServiceFactory.getApplyService().updateAll(apply);
                //request.setAttribute("app",app);
               /* request.setAttribute("applylist",ServiceFactory.getApplyService().query(new Apply()));*/
                //request.getRequestDispatcher("holidayPendingApproval.jsp").forward(request,response);
                break;
            }
            case "/SubmitDisagreeApplyServlet": {
                apply = ServiceFactory.getApplyService().query(apply).get(0);
                apply.setA_statu(2);
                flag = ServiceFactory.getApplyService().updateAll(apply);
                break;
            }
        }
        if(flag){
            request.getRequestDispatcher("holidayPendingApproval.jsp").forward(request,response);
        }
        else {
            request.getRequestDispatcher("holidayPendingApproval.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
