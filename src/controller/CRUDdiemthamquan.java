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

import dao.diemthamquandao;

/**
 * Servlet implementation class CRUDdiemthamquan
 */
@WebServlet("/CRUDdiemthamquan")
public class CRUDdiemthamquan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CRUDdiemthamquan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		if (request.getParameter("butthemdtq")!=null) {
//			
//			response.sendRedirect("Hello.jsp");
//			//Su dung multipart/formdata thi request.getParameter luon nhan gia tri null
//			
//		}
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		
		String imagePath = "";
		String ten = "";
		String diachi = "";
		String tinhtrang = "";
		String gia = "";
		String gioithieu = "";
		String tag = "";

		
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
						String dirUrl = "E:\\trantien\\JavaNangCao\\HueTravel\\WebContent\\image_diemthamquan";
						imagePath="image_diemthamquan/"+ nameimg;
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
					if(field.equals("txtTinhTrang")) {
						tinhtrang = fileItem.getString("UTF-8");
					}
					if(field.equals("txtGia")) {
						gia = fileItem.getString("UTF-8");
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
//		System.out.println(ten + diachi + tinhtrang+ gia + imagePath+ gioithieu + tag);
//		System.out.println(imagePath);
		
		
		//Them Diem Tham Quan
		diemthamquandao dtqdao = new diemthamquandao();
		dtqdao.addDiemThamQuan(ten, diachi, tinhtrang, gia, imagePath, gioithieu, tag);
		
		//Xoa Diem Tham Quan
		if (request.getParameter("butxoadtb")!=null) {
			String IdString = request.getParameter("butxoadtb");
			int Id = Integer.parseInt(IdString);
			diemthamquandao dtqdao2 = new diemthamquandao();
			dtqdao2.deleteDiemThamQuan(Id);
		}
		//Sua Diem Tham Quan
		if (request.getParameter("butsuadtq")!=null) {
			String id_Old_String = request.getParameter("butsuadtq");
			int id_Old = Integer.parseInt(id_Old_String);
			
			String tenS= request.getParameter("txtTenS");
			String diachiS = request.getParameter("txtDiaChiS");
			String tinhtrangS = request.getParameter("txtTinhTrangS");
			String giaS = request.getParameter("txtGiaS");
			String gioithieuS = request.getParameter("txtGioiThieuS");
			String tagS = request.getParameter("txtTagS");
			
			diemthamquandao dtqdao3 = new diemthamquandao();
			dtqdao3.updateDiemThamQuan(id_Old, tenS, diachiS, tinhtrangS, giaS, gioithieuS, tagS);
		}
		
		response.sendRedirect("htadmin_Travel_diemthamquan");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
