package bean;

public class usersbean {
	private int UserId;
	private String Username;
	private String Password;
	private String Image;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public usersbean(int userId, String username, String password, String image) {
		super();
		UserId = userId;
		Username = username;
		Password = password;
		Image = image;
	}
	
	
}
