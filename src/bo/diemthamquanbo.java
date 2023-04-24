package bo;

import java.util.ArrayList;

import bean.diemthamquanbean;
import dao.diemthamquandao;

public class diemthamquanbo {
	diemthamquandao dtqdao = new diemthamquandao();
	ArrayList <diemthamquanbean> ds;
	public ArrayList<diemthamquanbean> getDiemThamQuan(){
		ds = dtqdao.getDiemThamQuan();
		return ds;
	}
}
