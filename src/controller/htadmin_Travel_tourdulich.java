package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.tourdulichbean;
import bo.tourdulichbo;

/**
 * Servlet implementation class htadmin_Travel_tourdulich
 */
@WebServlet("/htadmin_Travel_tourdulich")
public class htadmin_Travel_tourdulich extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htadmin_Travel_tourdulich() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		tourdulichbo tbo = new tourdulichbo();
		ArrayList<tourdulichbean> dsTour = tbo.getTourDuLich();
		request.setAttribute("dsTour", dsTour);
		RequestDispatcher rd = request.getRequestDispatcher("Admin_TourDuLich.jsp");
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
