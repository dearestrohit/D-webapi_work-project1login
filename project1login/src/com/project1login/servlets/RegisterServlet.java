package com.project1login.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project1login.dao.UserDao;
import com.project1login.helper.connectionProvider;
import com.project1ogin.entities.User;

/**
 * Servlet implementation class RegisterServlet
 */

@WebServlet("/RegisterServlet")
@MultipartConfig
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	
	}

		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String check=request.getParameter("user_checkbox");
		if(check==null) {
			out.println("Box not checked");
		}
		else {
			String name=request.getParameter("user_name");
			String email=request.getParameter("user_email");
			String password=request.getParameter("user_password");
			String gender=request.getParameter("user_gender");
			String about=request.getParameter("user_about");
			String profile=request.getParameter("");
			
			User user=new User(name, email, password, gender,about,profile);
			
			UserDao dao=new UserDao(connectionProvider.getConnection());
		 if(dao.saveUser(user)) {
			out.println("Done");	
		 }
		 else {
			 
			 out.println("error");
		 }
		}
}
}
