package com.demo.db;

import java.sql.*;

import com.demo.servlet.UserElement;

public class LookupUserElm {
	public static boolean find(String un, String pw) throws SQLException, ClassNotFoundException {
		System.out.println(un + "  " + pw);
		UserElement user = new UserElement();
		user.setUser(un);
		user.setPassword(pw);
		
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.
        		getConnection("jdbc:h2:~/test", "sa", "");
		
		String selectQuery = "SELECT * FROM CSVREAD WHERE user LIKE ?";

		
		boolean flag=false;
	    PreparedStatement ps = conn.prepareStatement(selectQuery);
	    ps.setString(1,un+"%");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString(1)+"==="+rs.getString(2));
			String pass = rs.getString(2);
			System.out.println(pass.equals(pw));
			if(pass.equals(pw)){
				flag = true;
			}
			
		}
		return flag;

	}
}
