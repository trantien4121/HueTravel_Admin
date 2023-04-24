package bo;

import java.util.ArrayList;

import bean.blogbean;
import dao.blogdao;

public class blogbo {
	blogdao bdao = new blogdao();
	ArrayList <blogbean> ds;
	public ArrayList<blogbean> getBlog(){
		ds = bdao.getBlog();
		return ds;
	}
}
