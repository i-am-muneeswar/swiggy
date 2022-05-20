package com.swiggy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.swiggy.entity.SwiggyUser;

public class SwiggyDAO implements SwiggyDAOInterface {
	
	Connection con = null;
	
	public SwiggyDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public int createProfileDAO(SwiggyUser su) {
		
		int i = 0;
		
		try {

			PreparedStatement ps = con.prepareStatement("insert into SwiggyUser values(?,?,?,?)");
			ps.setString(1, su.getName());
			ps.setString(2, su.getPassword());
			ps.setString(3, su.getEmail());
			ps.setString(4, su.getAddress());
		
			i = ps.executeUpdate();
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
		
	}

}
