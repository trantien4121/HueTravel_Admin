package bean;

public class blogbean {
	private int BlogId;
	private int UserId;
	private String HinhAnh;
	private String TieuDe;
	private String NoiDung;
	private int LuotLike;
	public int getBlogId() {
		return BlogId;
	}
	public void setBlogId(int blogId) {
		BlogId = blogId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getHinhAnh() {
		return HinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		HinhAnh = hinhAnh;
	}
	public String getTieuDe() {
		return TieuDe;
	}
	public void setTieuDe(String tieuDe) {
		TieuDe = tieuDe;
	}
	public String getNoiDung() {
		return NoiDung;
	}
	public void setNoiDung(String noiDung) {
		NoiDung = noiDung;
	}
	public int getLuotLike() {
		return LuotLike;
	}
	public void setLuotLike(int luotLike) {
		LuotLike = luotLike;
	}
	public blogbean(int blogId, int userId, String hinhAnh, String tieuDe, String noiDung, int luotLike) {
		super();
		BlogId = blogId;
		UserId = userId;
		HinhAnh = hinhAnh;
		TieuDe = tieuDe;
		NoiDung = noiDung;
		LuotLike = luotLike;
	}
	
	
}
