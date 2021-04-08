package com.project1login.helper;
import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
import com.mysql.cj.jdbc.result.*;


public class connectionProvider {
Connection con=null;
java.sql.PreparedStatement pst;
public static Connection getConnection() {
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/project1login","root","");
		return conn;
	}
	catch (Exception e) {
		System.out.println(e);
		return null;
	}
}
	
}