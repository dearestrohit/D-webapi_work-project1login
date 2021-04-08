package com.project1login.servlets;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.startup.SetContextPropertiesRule;

import com.mysql.cj.protocol.Message;
import com.project1login.dao.UserDao;
import com.project1login.helper.connectionProvider;
import com.project1ogin.entities.User;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//fetch data from login page
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String userEmail=request.getParameter("email");
		String userPassword=request.getParameter("password");
		
		UserDao dao = new UserDao(connectionProvider.getConnection());
		User u=dao.getUserByEmailAndPassword(userEmail, userPassword);
		
		if(u==null) {
			//out.println("invalid username and password");
			com.project1ogin.entities.Message msg = (com.project1ogin.entities.Message) new com.project1ogin.entities.Message("invalid details! try with another","error" , "alert-danger");
			HttpSession s = request.getSession();
			s.setAttribute("msg", msg);
			
			response.sendRedirect("LoginPage.jsp");
		}
		else {
			HttpSession s=request.getSession();
			s.setAttribute("currentUser", u);
			response.sendRedirect("profile.jsp");
		}
	}

}
