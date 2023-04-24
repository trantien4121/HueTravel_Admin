package bean;

public class diemthamquanbean {
	private int DiemThamQuanId;
	private String DiemThamQuanName;
	private String DiaChi;
	private String TinhTrang;
	private String Gia;
	private String HinhAnh;
	private String GioiThieu;
	private String DiemThamQuanTag;
	public int getDiemThamQuanId() {
		return DiemThamQuanId;
	}
	public void setDiemThamQuanId(int diemThamQuanId) {
		DiemThamQuanId = diemThamQuanId;
	}
	public String getDiemThamQuanName() {
		return DiemThamQuanName;
	}
	public void setDiemThamQuanName(String diemThamQuanName) {
		DiemThamQuanName = diemThamQuanName;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getTinhTrang() {
		return TinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		TinhTrang = tinhTrang;
	}
	public String getGia() {
		return Gia;
	}
	public void setGia(String gia) {
		Gia = gia;
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
	public String getDiemThamQuanTag() {
		return DiemThamQuanTag;
	}
	public void setDiemThamQuanTag(String diemThamQuanTag) {
		DiemThamQuanTag = diemThamQuanTag;
	}
	public diemthamquanbean(int diemThamQuanId, String diemThamQuanName, String diaChi, String tinhTrang, String gia,
			String hinhAnh, String gioiThieu, String diemThamQuanTag) {
		super();
		DiemThamQuanId = diemThamQuanId;
		DiemThamQuanName = diemThamQuanName;
		DiaChi = diaChi;
		TinhTrang = tinhTrang;
		Gia = gia;
		HinhAnh = hinhAnh;
		GioiThieu = gioiThieu;
		DiemThamQuanTag = diemThamQuanTag;
	}
	
	
}
