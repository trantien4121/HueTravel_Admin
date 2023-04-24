package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.usersbean;


public class usersdao {
	public static ArrayList<usersbean> getUsers(){
		ArrayList<usersbean> ds= new ArrayList<usersbean>();
		
		try {
			//b1: Ket noi vao csdl
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			//b2: Lay du lieu ve
			String sql = "select * from Users";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			//b3: Luu tat ca du lieu vao mang ds
			while(rs.next()) {
				int userId = rs.getInt("UserId");
				String username = rs.getString("Username"); 
				String password = rs.getString("Password"); 
				String image = rs.getString("Image"); 
				ds.add(new usersbean(userId, username, password, image));
			}
			//b4: Dong ket noi
			rs.close();
			kn.cn.close();
			return ds;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	public static void main(String[] args) {
		ArrayList<usersbean> ds = getUsers();
		for(usersbean i: ds) {
			System.out.println(i.getUserId() + i.getUsername() + i.getPassword() + i.getImage());
		}
	}
}
