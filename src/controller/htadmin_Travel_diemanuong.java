package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.diemanuongbean;
import bo.diemanuongbo;

/**
 * Servlet implementation class htadmin_Travel_diemanuong
 */
@WebServlet("/htadmin_Travel_diemanuong")
public class htadmin_Travel_diemanuong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htadmin_Travel_diemanuong() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		diemanuongbo daubo = new diemanuongbo();
		ArrayList<diemanuongbean> dsDau = daubo.getDiemAnUong();
		request.setAttribute("dsDau", dsDau);
		RequestDispatcher rd = request.getRequestDispatcher("Admin_DiemAnUong.jsp");
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
