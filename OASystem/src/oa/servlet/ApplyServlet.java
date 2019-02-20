package oa.servlet;

import oa.Utils.StringUtils;
import oa.Utils.out;
import oa.bean.*;
import oa.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

@WebServlet(name = "ApplyServlet",urlPatterns = {"/HoldayApplyServlet","/ResignApplyServlet","/WorkOverApplyServer","/UpdateInfoApplyServlet"})
public class ApplyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        User u = ServiceFactory.getUserService().getUser();
        int u_id = u.getU_id();
        String u_no = u.getU_no();
        String[] time = null;
        String[] timened = null;
        boolean flag = true;
        switch(path){
            case "/HoldayApplyServlet":
                String a_type = req.getParameter("holdaytype");
                String a_info = req.getParameter("reason");
                String a_ex_userno = req.getParameter("leadno");
                String a_start_time = req.getParameter("begindate");
                String a_end_time = req.getParameter("enddate");
                String a_day = req.getParameter("time");
                out.print(a_type+":"+a_ex_userno+":"+a_day);
                time = a_start_time.split("-");
                timened = a_end_time.split("-");
                Apply apply =new Apply(u_id,Integer.parseInt(a_type), StringUtils.valueOf(a_info),Integer.parseInt(a_ex_userno),new Date(Integer.parseInt(time[0]),Integer.parseInt(time[1]),Integer.parseInt(time[2])),new Date(Integer.parseInt(timened[0]),Integer.parseInt(timened[1]),Integer.parseInt(timened[2])),Integer.parseInt(a_day));
                out.print(apply.toString());
                flag = ServiceFactory.getApplyService().insert(apply);
                if(flag){
                    resp.getWriter().print("<script>alert('�����ѷ�������ȴ����');window.location='main.jsp';</script>");

                }else {
                    resp.getWriter().print("<script>alert('����ʧ��');window.location='HoldayApply.jsp';</script>");
                }
                break;
            case "/ResignApplyServlet":
                String r_info = req.getParameter("reason");
                String r_ex_userno = req.getParameter("leadno");
                flag = ServiceFactory.getResignService().insert(new Resign(u_id,StringUtils.valueOf(r_info),r_ex_userno));
                if(flag){
                    resp.getWriter().print("<script>alert('�����ѷ�������ȴ����');window.location='main.jsp';</script>");
                }else {
                    resp.getWriter().print("<script>alert('����ʧ��');window.location='Resign.jsp';</script>");
                }
                break;
            case "/WorkOverApplyServer":
                String wa_info = req.getParameter("reason");
                String wa_ex_userno = req.getParameter("leadno");
                String wa_start_time = req.getParameter("begindate");
                String wa_end_time = req.getParameter("enddate");
                String wa_day = req.getParameter("time");
                time = wa_start_time.split("-");
                 timened = wa_end_time.split("-");
                flag = ServiceFactory.getWorkOverService().insert(new WorkOver(u_id,new Date(Integer.valueOf(time[0]),Integer.valueOf(time[1]),Integer.valueOf(time[2])),new Date(Integer.valueOf(timened[0]),Integer.valueOf(timened[1]),Integer.valueOf(timened[2])),Integer.parseInt(wa_day),StringUtils.valueOf(wa_info),Integer.parseInt(wa_ex_userno)));
                if(flag){
                    resp.getWriter().print("<script>alert('�����ѷ�������ȴ����');window.location='main.jsp';</script>");

                }else {
                    resp.getWriter().print("<script>alert('����ʧ��');window.location='WorkOverApply.jsp';</script>");
                }
                break;

            case "/UpdateInfoApplyServlet":
                String ui_name = req.getParameter("uname");
                String ui_email = req.getParameter("uemail");
                String ui_phone = req.getParameter("uphone");
                String ui_ex_userno = req.getParameter("leadno");
                flag = ServiceFactory.getUpdate_INfoService().insert(new Update_info(u_no,StringUtils.valueOf(ui_name),StringUtils.valueOf(ui_email),ui_phone,ui_ex_userno));
                if(flag){
                    resp.getWriter().print("<script>alert('�����ѷ�������ȴ����');window.location='main.jsp';</script>");

                }else {
                    resp.getWriter().print("<script>alert('����ʧ��');window.location='UpdateInfoApply.jsp';</script>");
                }
                break;


        }
    }
}
