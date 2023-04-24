package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.blogbean;
import bean.diemanuongbean;
import bean.diemluutrubean;
import bean.diemthamquanbean;
import bean.tourdulichbean;
import bean.usersbean;
import bo.blogbo;
import bo.diemanuongbo;
import bo.diemluutrubo;
import bo.diemthamquanbo;
import bo.tourdulichbo;
import bo.usersbo;

/**
 * Servlet implementation class htadminpage
 */
@WebServlet("/htadminpage")
public class htadminpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htadminpage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		usersbo ubo = new usersbo();
		blogbo bbo = new blogbo();
		diemthamquanbo dtqbo = new diemthamquanbo();
		diemluutrubo dltbo = new diemluutrubo();
		diemanuongbo daubo = new diemanuongbo();
		tourdulichbo tdlbo = new tourdulichbo();
		
		ArrayList<usersbean> dsUsers = ubo.getUsers();
		ArrayList<blogbean> dsBlogs = bbo.getBlog();
		
		ArrayList<diemthamquanbean> dsDiemThamQuans = dtqbo.getDiemThamQuan();
		ArrayList<diemluutrubean> dsDiemLuuTrus = dltbo.getDiemLuuTru();
		ArrayList<diemanuongbean> dsDiemAnUongs = daubo.getDiemAnUong();
		ArrayList<tourdulichbean> dsTourDuLichs = tdlbo.getTourDuLich();
		
		int numOfTravels = dsDiemThamQuans.size() + dsDiemLuuTrus.size()
							+ dsDiemAnUongs.size() + dsTourDuLichs.size();
		
		int numOfUsers = dsUsers.size();
		int numOfBlogs = dsBlogs.size();
		
		request.setAttribute("numOfUsers", numOfUsers);
		request.setAttribute("numOfTravels", numOfTravels);
		request.setAttribute("numOfBlogs", numOfBlogs);
		
		RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
