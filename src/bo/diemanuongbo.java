package bo;

import java.util.ArrayList;

import bean.diemanuongbean;
import dao.diemanuongdao;

public class diemanuongbo {
	diemanuongdao daadao = new diemanuongdao();
	ArrayList <diemanuongbean> ds;
	public ArrayList<diemanuongbean> getDiemAnUong(){
		ds = daadao.getDiemAnUong();
		return ds;
	}
}
