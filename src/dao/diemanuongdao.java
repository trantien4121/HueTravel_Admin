package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.diemanuongbean;

public class diemanuongdao {
	public static ArrayList<diemanuongbean> getDiemAnUong(){
		ArrayList<diemanuongbean> ds= new ArrayList<diemanuongbean>();
		
		try {
			//b1: Ket noi vao csdl
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			//b2: Lay du lieu ve
			String sql = "select * from DiemAnUong";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			//b3: Luu tat ca du lieu vao mang ds
			while(rs.next()) {
				int diemanuongId = rs.getInt("DiemAnUongId");
				String diemanuongName = rs.getString("DiemAnUongName");
				String diachi = rs.getString("DiaChi");
				String dienthoai = rs.getString("DienThoai");
				String thoigian = rs.getString("ThoiGianHoatDong");
				String hinhanh = rs.getString("HinhAnh");
				String gioithieu = rs.getString("GioiThieu");
				String diemanuongtag = rs.getString("DiemAnUongTag");
				ds.add(new diemanuongbean(diemanuongId, diemanuongName, diachi, dienthoai, thoigian, hinhanh, gioithieu, diemanuongtag));
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
	public boolean addDiemAnUong(String ten, String diachi, String dienthoai, String thoigian, String hinhanh,
			String gioithieu, String tag) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		if (ten.equals("") || diachi.equals("") || dienthoai.equals("") || thoigian.equals("") || hinhanh.equals("")
				|| gioithieu.equals("") || tag.equals("")) {
			return false;
		} else {
			String sql = "insert into DiemAnUong(DiemAnUongName, DiaChi, DienThoai, ThoiGianHoatDong, HinhAnh, GioiThieu, DiemAnUongTag)\r\n"
					+ "values(?, ?, ?, ?, ?, ?, ?)";
			try {
				PreparedStatement ps = kn.cn.prepareStatement(sql);
				ps.setString(1, ten);
				ps.setString(2, diachi);
				ps.setString(3, dienthoai);
				ps.setString(4, thoigian);
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

	public boolean updateDiemAnUong(int Id, String ten, String diachi, String dienthoai, String thoigian, String gioithieu,
			String tag) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();

		String sql = "update DiemAnUong\r\n"
				+ "set DiemAnUongName=?, DiaChi=?, DienThoai=?, ThoiGianHoatDong=?, GioiThieu=?, DiemAnUongTag=?"
				+ " where DiemAnUongId =?";
		try {
			PreparedStatement ps = kn.cn.prepareStatement(sql);
			ps.setString(1, ten);
			ps.setString(2, diachi);
			ps.setString(3, dienthoai);
			ps.setString(4, thoigian);
			ps.setString(5, gioithieu);
			ps.setString(6, tag);
			ps.setInt(7, Id);
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;

	}

	public boolean deleteDiemAnUong(int Id) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "DELETE FROM DiemAnUong where DiemAnUongId=?";
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
		ArrayList<diemanuongbean> ds = getDiemAnUong();
		for(diemanuongbean i: ds) {
			System.out.println(i.getDiemAnUongId() + " " + i.getDiemAnUongName() + " " + i.getDiaChi()
			+ " " + i.getDienThoai() + " " + i.getThoiGianHoatDong() + " " 
			+ i.getHinhAnh() + " " + i.getGioiThieu() + " " + i.getDiemAnUongTag());
		}
	}
}
