package bean;

public class tourdulichbean {
	private int TourId;
	private String TourName;
	private String DiaChi;
	private String DienThoai;
	private String Email;
	private String HinhAnh;
	private String GioiThieu;
	private String TourTag;
	public int getTourId() {
		return TourId;
	}
	public void setTourId(int tourId) {
		TourId = tourId;
	}
	public String getTourName() {
		return TourName;
	}
	public void setTourName(String tourName) {
		TourName = tourName;
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
	public String getTourTag() {
		return TourTag;
	}
	public void setTourTag(String tourTag) {
		TourTag = tourTag;
	}
	public tourdulichbean(int tourId, String tourName, String diaChi, String dienThoai, String email, String hinhAnh,
			String gioiThieu, String tourTag) {
		super();
		TourId = tourId;
		TourName = tourName;
		DiaChi = diaChi;
		DienThoai = dienThoai;
		Email = email;
		HinhAnh = hinhAnh;
		GioiThieu = gioiThieu;
		TourTag = tourTag;
	}
	
	
}
