package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import dao.tourdulichdao;

/**
 * Servlet implementation class CRUDTour
 */
@WebServlet("/CRUDTour")
public class CRUDTour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CRUDTour() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String imagePath = "";
		String ten = "";
		String diachi = "";
		String dienthoai = "";
		String email = "";
		String gioithieu = "";
		String tag = "";
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
		try {
			List<FileItem> fileItems = upload.parseRequest(request);// Lấy về các đối tượng gửi lên
			// duyệt qua các đối tượng gửi lên từ client gồm file và các control
			for (FileItem fileItem : fileItems) {
				if (!fileItem.isFormField()) {// Nếu ko phải các control=>upfile lên
					// xử lý file
					String nameimg = fileItem.getName();
					if (!nameimg.equals("")) {
						// Lấy đường dẫn hiện tại, chủ ý xử lý trên dirUrl để có đường dẫn đúng
//					String dirUrl = request.getServletContext().getRealPath("") +  File.separator + "files";
						String dirUrl = "E:\\trantien\\JavaNangCao\\HueTravel\\WebContent\\image_tour";
						imagePath="image_tour/"+ nameimg;
						File dir = new File(dirUrl);
						if (!dir.exists()) {// nếu ko có thư mục thì tạo ra
							dir.mkdir();
						}
						String fileImg = dirUrl + File.separator + nameimg;
						File file = new File(fileImg);// tạo file
						try {
							fileItem.write(file);// lưu file
							System.out.println("UPLOAD THÀNH CÔNG...!");
							System.out.println("Đường dẫn lưu file là: " + dirUrl);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} else// Neu la control
				{
					
					String field = fileItem.getFieldName();
					if(field.equals("txtName")) {
						ten = fileItem.getString("UTF-8");
					}
					if(field.equals("txtDiaChi")) {
						diachi = fileItem.getString("UTF-8");
					}
					if(field.equals("txtDienThoai")) {
						dienthoai = fileItem.getString("UTF-8");
					}
					if(field.equals("txtEmail")) {
						email = fileItem.getString("UTF-8");
					}
					if(field.equals("txtGioiThieu")) {
						gioithieu = fileItem.getString("UTF-8");
					}
					if(field.equals("txtTag")) {
						tag = fileItem.getString("UTF-8");
					}
				}
				
			}
			
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		//System.out.println(ten + diachi + tinhtrang+ gia + imagePath+ gioithieu + tag);
		//System.out.println(imagePath);
		
		
		//Them Tour du lich
		tourdulichdao tdao = new tourdulichdao();
		tdao.addTourDuLich(ten, diachi, dienthoai, email, imagePath, gioithieu, tag);
		
		//Xoa Tour du lich
		if (request.getParameter("butxoatdl")!=null) {
			String IdString = request.getParameter("butxoatdl");
			int Id = Integer.parseInt(IdString);
			tourdulichdao tdao2 = new tourdulichdao();
			tdao2.deleteTourDuLich(Id);
		}
		//Sua Tour Du lich
		if (request.getParameter("butsuatdl")!=null) {
			String id_Old_String = request.getParameter("butsuatdl");
			int id_Old = Integer.parseInt(id_Old_String);
			
			String tenS= request.getParameter("txtTenS");
			String diachiS = request.getParameter("txtDiaChiS");
			String dienthoaiS = request.getParameter("txtDienThoaiS");
			String emailS = request.getParameter("txtEmailS");
			String gioithieuS = request.getParameter("txtGioiThieuS");
			String tagS = request.getParameter("txtTagS");
			
			tourdulichdao tdao3 = new tourdulichdao();
			tdao3.updateTourDuLich(id_Old, tenS, diachiS, dienthoaiS, emailS, gioithieuS, tagS);
			
		}
		
		response.sendRedirect("htadmin_Travel_tourdulich");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
