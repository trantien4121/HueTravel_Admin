package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.diemluutrubean;

public class diemluutrudao {
	public static ArrayList<diemluutrubean> getDiemLuuTru() {
		ArrayList<diemluutrubean> ds = new ArrayList<diemluutrubean>();

		try {
			// b1: Ket noi vao csdl
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			// b2: Lay du lieu ve
			String sql = "select * from DiemLuuTru";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			// b3: Luu tat ca du lieu vao mang ds
			while (rs.next()) {
				int DiemLuuTruId = rs.getInt("DiemLuuTruId");
				String DiemLuuTruName = rs.getString("DiemLuuTruName");
				String diachi = rs.getString("DiaChi");
				String dienthoai = rs.getString("DienThoai");
				String email = rs.getString("Email");
				String website = rs.getString("Website");
				String tiennghi = rs.getString("TienNghi");
				String hinhanh = rs.getString("HinhAnh");
				String gioithieu = rs.getString("GioiThieu");
				String DiemLuuTrutag = rs.getString("DiemLuuTruTag");
				ds.add(new diemluutrubean(DiemLuuTruId, DiemLuuTruName, diachi, dienthoai, email, website, tiennghi,
						hinhanh, gioithieu, DiemLuuTrutag));
			}
			// b4: Dong ket noi
			rs.close();
			kn.cn.close();
			return ds;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public boolean addDiemLuuTru(String ten, String diachi, String dienthoai, String email, String website,
			String tiennghi, String hinhanh, String gioithieu, String tag) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		if (ten.equals("") || diachi.equals("") || dienthoai.equals("") || email.equals("") || website.equals("")
				|| tiennghi.equals("") || hinhanh.equals("") || gioithieu.equals("") || tag.equals("")) {
			return false;
		} else {
			String sql = "insert into DiemLuuTru(DiemLuuTruName, DiaChi, DienThoai, Email, Website, TienNghi, HinhAnh, GioiThieu, DiemLuuTruTag)\r\n"
					+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			try {
				PreparedStatement ps = kn.cn.prepareStatement(sql);
				ps.setString(1, ten);
				ps.setString(2, diachi);
				ps.setString(3, dienthoai);
				ps.setString(4, email);
				ps.setString(5, website);
				ps.setString(6, tiennghi);
				ps.setString(7, hinhanh);
				ps.setString(8, gioithieu);
				ps.setString(9, tag);
				return ps.executeUpdate() > 0;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
	}

	public boolean updateDiemLuuTru(int Id, String ten, String diachi, String dienthoai, String email, String website,
			String tiennghi, String gioithieu, String tag) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();

		String sql = "update DiemLuuTru	\r\n"
				+ "set DiemLuuTruName=?, DiaChi=?, DienThoai=?, Email=?, Website=?, TienNghi=?, GioiThieu=?, DiemLuuTruTag=?\r\n"
				+ "where DiemLuuTruId=?";
		try {
			PreparedStatement ps = kn.cn.prepareStatement(sql);
			ps.setString(1, ten);
			ps.setString(2, diachi);
			ps.setString(3, dienthoai);
			ps.setString(4, email);
			ps.setString(5, website);
			ps.setString(6, tiennghi);
			ps.setString(7, gioithieu);
			ps.setString(8, tag);
			ps.setInt(9, Id);
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;

	}

	public boolean deleteDiemLuuTru(int Id) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "DELETE FROM DiemLuuTru where DiemLuuTruId=?";
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
		ArrayList<diemluutrubean> ds = getDiemLuuTru();
		for (diemluutrubean i : ds) {
			System.out.println(i.getDiemLuuTruId() + " " + i.getDiemLuuTruName() + " " + i.getDiaChi() + " "
					+ i.getDienThoai() + " " + i.getEmail() + " " + i.getWebsite() + " " + i.getTienNghi() + " "
					+ i.getHinhAnh() + " " + i.getGioiThieu() + " " + i.getDiemLuuTruTag());
		}
	}
}
