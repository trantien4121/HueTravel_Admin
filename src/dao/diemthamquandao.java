package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.diemthamquanbean;

public class diemthamquandao {
	public static ArrayList<diemthamquanbean> getDiemThamQuan() {
		ArrayList<diemthamquanbean> ds = new ArrayList<diemthamquanbean>();

		try {
			// b1: Ket noi vao csdl
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			// b2: Lay du lieu ve
			String sql = "select * from DiemThamQuan";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			// b3: Luu tat ca du lieu vao mang ds
			while (rs.next()) {
				int DiemThamQuanId = rs.getInt("DiemThamQuanId");
				String DiemThamQuanName = rs.getString("DiemThamQuanName");
				String diachi = rs.getString("DiaChi");
				String tinhtrang = rs.getString("TinhTrang");
				String gia = rs.getString("Gia");
				String hinhanh = rs.getString("HinhAnh");
				String gioithieu = rs.getString("GioiThieu");
				String DiemThamQuantag = rs.getString("DiemThamQuanTag");
				ds.add(new diemthamquanbean(DiemThamQuanId, DiemThamQuanName, diachi, tinhtrang, gia, hinhanh,
						gioithieu, DiemThamQuantag));
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

	public boolean addDiemThamQuan(String ten, String diachi, String tinhtrang, String gia, String hinhanh,
			String gioithieu, String tag) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		if (ten.equals("") || diachi.equals("") || tinhtrang.equals("") || gia.equals("") || hinhanh.equals("")
				|| gioithieu.equals("") || tag.equals("")) {
			return false;
		} else {
			String sql = "insert into DiemThamQuan(DiemThamQuanName, DiaChi, TinhTrang, Gia, HinhAnh, GioiThieu, DiemThamQuanTag)\r\n"
					+ "values(?,?,?,?,?,?,?)";
			try {
				PreparedStatement ps = kn.cn.prepareStatement(sql);
				ps.setString(1, ten);
				ps.setString(2, diachi);
				ps.setString(3, tinhtrang);
				ps.setString(4, gia);
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

	public boolean updateDiemThamQuan(int Id, String ten, String diachi, String tinhtrang, String gia, String gioithieu,
			String tag) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();

		String sql = "update DiemThamQuan\r\n"
				+ "set DiemThamQuanName=?, DiaChi=?, TinhTrang=?, Gia=?, GioiThieu=?, DiemThamQuanTag=?"
				+ " where DiemThamQuanId =?";
		try {
			PreparedStatement ps = kn.cn.prepareStatement(sql);
			ps.setString(1, ten);
			ps.setString(2, diachi);
			ps.setString(3, tinhtrang);
			ps.setString(4, gia);
			ps.setString(5, gioithieu);
			ps.setString(6, tag);
			ps.setInt(7, Id);
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;

	}

	public boolean deleteDiemThamQuan(int Id) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql = "DELETE FROM DiemThamQuan where DiemThamQuanId=?";
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
		ArrayList<diemthamquanbean> ds = getDiemThamQuan();
		for (diemthamquanbean i : ds) {
			System.out.println(i.getDiemThamQuanId() + " " + i.getDiemThamQuanName() + " " + i.getDiaChi() + " "
					+ i.getTinhTrang() + " " + i.getGia() + " " + i.getHinhAnh() + " " + i.getGioiThieu() + " "
					+ i.getDiemThamQuanTag());
		}
	}
}
