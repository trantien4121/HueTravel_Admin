package bean;

public class diemluutrubean {
	private int DiemLuuTruId;
	private String DiemLuuTruName;
	private String DiaChi;
	private String DienThoai;
	private String Email;
	private String Website;
	private String TienNghi;
	private String HinhAnh;
	private String GioiThieu;
	private String DiemLuuTruTag;
	public int getDiemLuuTruId() {
		return DiemLuuTruId;
	}
	public void setDiemLuuTruId(int diemLuuTruId) {
		DiemLuuTruId = diemLuuTruId;
	}
	public String getDiemLuuTruName() {
		return DiemLuuTruName;
	}
	public void setDiemLuuTruName(String diemLuuTruName) {
		DiemLuuTruName = diemLuuTruName;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getDienThoai() {
		return DienThoai;
	}
	public void setDienThoai(String dienThoai) {
		DienThoai = dienThoai;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public String getTienNghi() {
		return TienNghi;
	}
	public void setTienNghi(String tienNghi) {
		TienNghi = tienNghi;
	}
	public String getHinhAnh() {
		return HinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		HinhAnh = hinhAnh;
	}
	public String getGioiThieu() {
		return GioiThieu;
	}
	public void setGioiThieu(String gioiThieu) {
		GioiThieu = gioiThieu;
	}
	public String getDiemLuuTruTag() {
		return DiemLuuTruTag;
	}
	public void setDiemLuuTruTag(String diemLuuTruTag) {
		DiemLuuTruTag = diemLuuTruTag;
	}
	public diemluutrubean(int diemLuuTruId, String diemLuuTruName, String diaChi, String dienThoai, String email,
			String website, String tienNghi, String hinhAnh, String gioiThieu, String diemLuuTruTag) {
		super();
		DiemLuuTruId = diemLuuTruId;
		DiemLuuTruName = diemLuuTruName;
		DiaChi = diaChi;
		DienThoai = dienThoai;
		Email = email;
		Website = website;
		TienNghi = tienNghi;
		HinhAnh = hinhAnh;
		GioiThieu = gioiThieu;
		DiemLuuTruTag = diemLuuTruTag;
	}
	
	
}
