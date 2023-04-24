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
import bean.usersbean;
import bo.blogbo;
import bo.usersbo;

/**
 * Servlet implementation class htadmin_BlogManager
 */
@WebServlet("/htadmin_BlogManager")
public class htadmin_BlogManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htadmin_BlogManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		blogbo bbo = new blogbo();
		ArrayList<blogbean> dsBlogs = bbo.getBlog();
		request.setAttribute("dsBlogs", dsBlogs);
		RequestDispatcher rd = request.getRequestDispatcher("Admin_BlogManager.jsp");
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
