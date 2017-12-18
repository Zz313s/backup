package com.internousdev.login.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResuktSet;
import java.sql.SQLException;
import com.internousdev.login.dto.LoginDTO;
import com.internousdqv.login.util.DBConnector;

public class LoginDAO {
	public LoginDTO dto =newq LoginDTO();
	DBConnector db =new DBConnector();
	Connection con = db.get Connection();
	String sql ="select * from user where user_name=? and password=?";

	try {
		PreparedStatement ps =con.prepareStatement(sql);
		ps.setString(1,name);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();

		if(rs.next()) {
			dto.setName(rs.getString("user_name"));
			dto.setPassword(rs.getString("password"));
		}
	}catch(SQLException e) {
		e.printStackTrace();

	}finally {
		con.close();
	}
	return dto;

}
}