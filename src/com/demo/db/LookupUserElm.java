package com.demo.db;

import java.sql.*;

import com.demo.servlet.UserElement;

public class LookupUserElm {
	public static UserElement find(String un, String pw) throws SQLException, ClassNotFoundException {
		System.out.println(un + "  " + pw);
		UserElement user = new UserElement();
		user.setUser(un);
		user.setPassword(pw);
		
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.
        		getConnection("jdbc:h2:~/test", "sa", "");
		
		String selectQuery = "Select * from CSVREAD";
		String insertQuery = "Insert into CSVREAD values(?,?)";
		PreparedStatement ps1=conn.prepareStatement(insertQuery);
		ps1.setString(1,un);
		ps1.setString(2,pw);
		boolean msg=ps1.execute();
	    PreparedStatement ps = conn.prepareStatement(selectQuery);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString(1)+"==="+rs.getString(2));
			
		}
		return user;

	}
}
