package bean;

public class diemanuongbean {
	private int DiemAnUongId;
	private String DiemAnUongName;
	private String DiaChi;
	private String DienThoai;
	private String ThoiGianHoatDong;
	private String HinhAnh;
	private String GioiThieu;
	private String DiemAnUongTag;
	public int getDiemAnUongId() {
		return DiemAnUongId;
	}
	public void setDiemAnUongId(int diemAnUongId) {
		DiemAnUongId = diemAnUongId;
	}
	public String getDiemAnUongName() {
		return DiemAnUongName;
	}
	public void setDiemAnUongName(String diemAnUongName) {
		DiemAnUongName = diemAnUongName;
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
	public String getThoiGianHoatDong() {
		return ThoiGianHoatDong;
	}
	public void setThoiGianHoatDong(String thoiGianHoatDong) {
		ThoiGianHoatDong = thoiGianHoatDong;
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
	public String getDiemAnUongTag() {
		return DiemAnUongTag;
	}
	public void setDiemAnUongTag(String diemAnUongTag) {
		DiemAnUongTag = diemAnUongTag;
	}
	public diemanuongbean(int diemAnUongId, String diemAnUongName, String diaChi, String dienThoai,
			String thoiGianHoatDong, String hinhAnh, String gioiThieu, String diemAnUongTag) {
		super();
		DiemAnUongId = diemAnUongId;
		DiemAnUongName = diemAnUongName;
		DiaChi = diaChi;
		DienThoai = dienThoai;
		ThoiGianHoatDong = thoiGianHoatDong;
		HinhAnh = hinhAnh;
		GioiThieu = gioiThieu;
		DiemAnUongTag = diemAnUongTag;
	}
	
}
