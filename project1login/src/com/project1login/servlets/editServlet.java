package com.project1login.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.ha.backend.Sender;

import com.project1login.dao.UserDao;
import com.project1login.helper.connectionProvider;
import com.project1login.helper.helper;
import com.project1ogin.entities.User;


/**
 * Servlet implementation class editServlet
 */
@MultipartConfig
@WebServlet("/editServlet")
public class editServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editServlet() {
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
		//fetch all data
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String userEmail=request.getParameter("user_email");
		String userName=request.getParameter("user_name");
		String userPassword=request.getParameter("user_password");
		String userAbout=request.getParameter("user_about");
		javax.servlet.http.Part part=request.getPart("user_image");
		String userImage=part.getSubmittedFileName();
		
		//get user from the session
		
		HttpSession s = request.getSession();
		User user=(User)s.getAttribute("currentUser");
		user.setEmail(userEmail);
		user.setName(userName);
		user.setPassword(userPassword);
		user.setAbout(userAbout);
		String oldFile = user.getProfile();
		user.setProfile(userImage);
		
		//update database
		
		UserDao userdao = new UserDao(connectionProvider.getConnection());
		boolean ans=userdao.updateUser(user);
		if(ans) {

			
			String path= request.getRealPath("/")+"pics"+File.separator+user.getProfile();
			String oldFilePath=request.getRealPath("/")+"pics"+File.separator+oldFile;
			
			if(!oldFile.equals("default.png"))
			{
			helper.deleteFile(oldFilePath);
			
			
			if(helper.saveFIle(part.getInputStream(), path))
			{
			
				com.project1ogin.entities.Message msg = (com.project1ogin.entities.Message) new com.project1ogin.entities.Message("Profile Update","success" , "alert-success");
				s.setAttribute("msg", msg);
			}
			
		}else
		{
			out.println("not Updated");
			com.project1ogin.entities.Message msg = (com.project1ogin.entities.Message) new com.project1ogin.entities.Message("Something went wrong","error" , "alert-danger");
			s.setAttribute("msg", msg);
		}
		}
         response.sendRedirect("profile.jsp"); 
	}

}
