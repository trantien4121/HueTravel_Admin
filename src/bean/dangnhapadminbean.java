package bean;

public class dangnhapadminbean {
	private int AdminId;
	private String TenDangNhap;
	private String MatKhau;
	private String Image;
	private int Quyen;
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getTenDangNhap() {
		return TenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		TenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public int getQuyen() {
		return Quyen;
	}
	public void setQuyen(int quyen) {
		Quyen = quyen;
	}
	public dangnhapadminbean(int adminId, String tenDangNhap, String matKhau, String image, int quyen) {
		super();
		AdminId = adminId;
		TenDangNhap = tenDangNhap;
		MatKhau = matKhau;
		Image = image;
		Quyen = quyen;
	}
	
	
}
