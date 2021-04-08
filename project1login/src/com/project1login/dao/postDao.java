package com.project1login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Statement;
import com.project1ogin.entities.category;

public class postDao {
	Connection con;

	public postDao(Connection con) {
		super();
		this.con = con;
	}
  
	public ArrayList<category> getAllCategories(){
		ArrayList<category> list= new ArrayList<>();
		try {
			String q = "select * from category";
	       java.sql.Statement st= this.con.createStatement();
			 ResultSet set= st.executeQuery(q);
			
			while(set.next()) {
				int cid = set.getInt("cid");
				String name = set.getString("name");
				String description = set.getString("description");
				category c = new category(cid, name, description);
				list.add(c);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
}
