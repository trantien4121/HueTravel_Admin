package bo;

import java.util.ArrayList;

import bean.tourdulichbean;
import dao.tourdulichdao;

public class tourdulichbo {
	tourdulichdao tdao = new tourdulichdao();
	ArrayList <tourdulichbean> ds;
	public ArrayList<tourdulichbean> getTourDuLich(){
		ds = tdao.getTourDuLich();
		return ds;
	}
}
