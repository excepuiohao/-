package oa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oa.bean.User;
import oa.factory.ServiceFactory;
@WebServlet(name = "AddUserInfo",urlPatterns={"/addinfo"})
public class AddUserInfo extends HttpServlet {

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

		response.setContentType("text/html");
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
			throws ServletException, IOException {//���Ա����Ϣ
		response.setContentType("text/html");
		String u_no = request.getParameter("u_no");
		String u_name = request.getParameter("u_name");
		String u_pwd = request.getParameter("u_pwd");
		String u_email = request.getParameter("u_email");
		String u_phone = request.getParameter("u_phone");
		String str = request.getParameter("u_type");
		String u_type = str.split(",")[0];
		String lead_no = request.getParameter("lead_no");
		User user =new User();
		user.setU_no(u_no);
		user.setU_name(u_name);
		user.setU_pwd(u_pwd);
		user.setU_email(u_email);
		user.setU_phone(u_phone);
		user.setU_type(Integer.valueOf(u_type));
		user.setLead_no(lead_no);
		boolean flag=ServiceFactory.getUserService().insert(user);
		if(flag){
			request.getRequestDispatcher("addinfo.jsp").forward(request, response);
		}else{
			response.getWriter().print("<script> alert('���ʧ��');window.location='addinfo.jsp'</script>");
		}
	}

}
