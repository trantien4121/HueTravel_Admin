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
import bean.diemthamquanbean;
import bo.diemthamquanbo;

/**
 * Servlet implementation class htadmin_Travel_diemthamquan
 */
@WebServlet("/htadmin_Travel_diemthamquan")
public class htadmin_Travel_diemthamquan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htadmin_Travel_diemthamquan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		diemthamquanbo dtqbo = new diemthamquanbo();
		ArrayList<diemthamquanbean> dsDtquan = dtqbo.getDiemThamQuan();
		request.setAttribute("dsDtquan", dsDtquan);
		RequestDispatcher rd = request.getRequestDispatcher("Admin_DiemThamQuan.jsp");
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
