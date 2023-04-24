package bo;

import java.util.ArrayList;

import bean.diemluutrubean;
import dao.diemluutrudao;

public class diemluutrubo {
	diemluutrudao dltdao = new diemluutrudao();
	ArrayList <diemluutrubean> ds;
	public ArrayList<diemluutrubean> getDiemLuuTru(){
		ds = dltdao.getDiemLuuTru();
		return ds;
	}
}
