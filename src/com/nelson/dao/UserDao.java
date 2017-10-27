package com.nelson.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nelson.domain.User;
import com.nelson.utils.C3p0;

public class UserDao {

	public List<User> getAllUser() {
		List<User> list = new ArrayList<User>();
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select * from user_ifon";

		try {
			con = C3p0.getConnection();
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setSex(rs.getString("sex"));
				u.setEmail(rs.getString("email"));
				u.setPhone(rs.getString("phone"));

				list.add(u);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		C3p0.release(con, pstm, rs);
		return list;
		
	}
	
	public boolean Check(String username,String password) throws Exception {
		boolean c = false;
		Connection con = C3p0.getConnection();
		String sql = "select * from user_ifon where username =? and password =?";
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setString(1, username);
		pstm.setString(2, password);
		ResultSet rs = pstm.executeQuery();
		if(rs.next())
			c=true;
		else
			c=false;
		return c;
	}
}
