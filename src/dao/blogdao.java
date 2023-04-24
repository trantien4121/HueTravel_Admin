package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.blogbean;

public class blogdao {
	public static ArrayList<blogbean> getBlog() {
		ArrayList<blogbean> ds = new ArrayList<blogbean>();

		try {
			// b1: Ket noi vao csdl
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			// b2: Lay du lieu ve
			String sql = "select * from Blog";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			// b3: Luu tat ca du lieu vao mang ds
			while (rs.next()) {
				int blogId = rs.getInt("BlogId");
				int userId = rs.getInt("UserId");
				String hinhanh = rs.getString("HinhAnh");
				String tieude = rs.getString("TieuDe");
				String noidung = rs.getString("NoiDung");
				int luotlike = rs.getInt("LuotLike");
				ds.add(new blogbean(blogId, userId, hinhanh, tieude, noidung, luotlike));
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

	public boolean deleteBlog(int blogId) {
		KetNoi kn = new KetNoi();
		kn.KetNoi();

		String sql = "DELETE FROM Blog where BlogId=?";
		try {
			PreparedStatement ps = kn.cn.prepareStatement(sql);
			ps.setInt(1, blogId);
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public static void main(String[] args) {
		ArrayList<blogbean> ds = getBlog();
		for (blogbean i : ds) {
			System.out.println(
					i.getBlogId() + i.getUserId() + i.getHinhAnh() + i.getTieuDe() + i.getNoiDung() + i.getLuotLike());
		}
	}
}
