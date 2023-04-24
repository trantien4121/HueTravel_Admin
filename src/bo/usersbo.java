package bo;

import java.util.ArrayList;

import bean.usersbean;
import dao.usersdao;


public class usersbo {
	usersdao udao = new usersdao();
	ArrayList <usersbean> ds;
	public ArrayList<usersbean> getUsers(){
		ds = udao.getUsers();
		return ds;
	}
}
