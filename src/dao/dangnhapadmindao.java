package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.dangnhapadminbean;

public class dangnhapadmindao {
	public dangnhapadminbean ktdn(String tendn, String pass) {
		try {
			KetNoi kn= new KetNoi();
			kn.KetNoi();
			String sql="select * from Admin where TenDangNhap=? and MatKhau=?";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			cmd.setString(1, tendn);
			cmd.setString(2, pass);
			ResultSet rs=cmd.executeQuery();
			dangnhapadminbean dn=null;
			if(rs.next()) {
				  int AdminId = rs.getInt("AdminId");
				  String TenDangNhap=rs.getString("TenDangNhap");
				  String MatKhau=rs.getString("MatKhau");
				  String Image = rs.getString("Image");
				  int Quyen = rs.getInt("Quyen");
				  dn=new dangnhapadminbean(AdminId, TenDangNhap, MatKhau, Image, Quyen);
			}
			rs.close();kn.cn.close();
			return dn;
		} catch (Exception e) {
			e.printStackTrace();return null;
		}
	}
}
