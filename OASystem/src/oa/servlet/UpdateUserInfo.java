package oa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oa.bean.Update_info;
import oa.factory.ServiceFactory;
@WebServlet(name = "UpdateUserInfo",urlPatterns={"/updateinfo"})
public class UpdateUserInfo extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//response.setContentType("text/html");
		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//response.setContentType("text/html");
		String ui_no = request.getParameter("ui_no");
		String ui_name = request.getParameter("ui_name");
		String ui_pwd = request.getParameter("ui_pwd");
		String ui_email =request.getParameter("ui_email");
		String ui_phone = request.getParameter("ui_phone");
		String str = request.getParameter("u_type");
		String ui_statu = str.split(",")[0];
		String ui_ex_userno = request.getParameter("ui_ex_userno");
		Update_info update_info=new Update_info();
		update_info.setUi_no(ui_no);
		update_info.setUi_name(ui_name);
		update_info.setUi_pwd(ui_pwd);
		update_info.setUi_email(ui_email);
		update_info.setUi_phone(ui_phone);
		update_info.setUi_statu(Integer.valueOf(ui_statu));
		update_info.setUi_ex_userno(ui_ex_userno);
		boolean flag=ServiceFactory.getUpdate_INfoService().delete(update_info);
		if(flag){
			request.getRequestDispatcher("updateinfo.jsp").forward(request, response);
		}else{
			response.getWriter().print("<script> alert('�޸�ʧ��');window.location='updateinfo.jsp'</script>");
		}
	}

}
