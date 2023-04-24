package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.tourdulichbean;

public class tourdulichdao {
	public static ArrayList<tourdulichbean> getTourDuLich(){
		ArrayList<tourdulichbean> ds= new ArrayList<tourdulichbean>();
		
		try {
			//b1: Ket noi vao csdl
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			//b2: Lay du lieu ve
			String sql = "select * from TourDuLich";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			//b3: Luu tat ca du lieu vao mang ds
			while(rs.next()) {
				int TourDuLichId = rs.getInt("TourId");
				String TourName = rs.getString("TourName");
				String diachi = rs.getString("DiaChi");
				String dienthoai = rs.getString("DienThoai");
				String Email = rs.getString("Email");
				String hinhanh = rs.getString("HinhAnh");
				String gioithieu = rs.getString("GioiThieu");
				String TourDuLichtag = rs.getString("TourTag");
				ds.add(new tourdulichbean(TourDuLichId, TourName, diachi, dienthoai, Email, hinhanh, gioithieu, TourDuLichtag));
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
	public boolean addTourDuLich(String ten, String diachi, String dienthoai, String email, String hinhanh,
			String gioithieu, String tag) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		if (ten.equals("") || diachi.equals("") || dienthoai.equals("") || email.equals("") || hinhanh.equals("")
				|| gioithieu.equals("") || tag.equals("")) {
			return false;
		} else {
			String sql = "insert into TourDuLich(TourName, DiaChi, dienthoai, email, HinhAnh, GioiThieu, TourTag)\r\n"
					+ "values(?, ?, ?, ?, ?, ?, ?)";
			try {
				PreparedStatement ps = kn.cn.prepareStatement(sql);
				ps.setString(1, ten);
				ps.setString(2, diachi);
				ps.setString(3, dienthoai);
				ps.setString(4, email);
				ps.setString(5, hinhanh);
				ps.setString(6, gioithieu);
				ps.setString(7, tag);
				return ps.executeUpdate() > 0;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
	}

	public boolean updateTourDuLich(int Id, String ten, String diachi, String dienthoai, String email, String gioithieu,
			String tag) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();

		String sql = "update TourDuLich\r\n"
				+ "set TourName=?, DiaChi=?, DienThoai=?, Email=?, GioiThieu=?, TourTag=?"
				+ " where TourId =?";
		try {
			PreparedStatement ps = kn.cn.prepareStatement(sql);
			ps.setString(1, ten);
			ps.setString(2, diachi);
			ps.setString(3, dienthoai);
			ps.setString(4, email);
			ps.setString(5, gioithieu);
			ps.setString(6, tag);
			ps.setInt(7, Id);
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;

	}

	public boolean deleteTourDuLich(int Id) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "DELETE FROM TourDuLich where TourId=?";
		try {
			PreparedStatement ps = kn.cn.prepareStatement(sql);
			ps.setInt(1, Id);
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public static void main(String[] args) {
		ArrayList<tourdulichbean> ds = getTourDuLich();
		for(tourdulichbean i: ds) {
			System.out.println(i.getTourId() + " " + i.getTourName() + " " + i.getDiaChi()
			+ " " + i.getDienThoai() + " " + i.getEmail() + " " 
			+ i.getHinhAnh() + " " + i.getGioiThieu() + " " + i.getTourTag());
		}
	}
}
