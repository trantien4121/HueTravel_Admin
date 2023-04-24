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

import dao.diemluutrudao;
import dao.diemthamquandao;

/**
 * Servlet implementation class CRUDDiemLuuTru
 */
@WebServlet("/CRUDDiemLuuTru")
public class CRUDDiemLuuTru extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CRUDDiemLuuTru() {
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
		String website = "";
		String tiennghi = "";
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
						String dirUrl = "E:\\trantien\\JavaNangCao\\HueTravel\\WebContent\\image_diemluutru";
						imagePath="image_diemluutru/"+ nameimg;
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
					if(field.equals("txtWebsite")) {
						website = fileItem.getString("UTF-8");
					}
					if(field.equals("txtTienNghi")) {
						tiennghi = fileItem.getString("UTF-8");
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
		
		
		//Them Diem Luu Tru
		diemluutrudao dltdao = new diemluutrudao();
		dltdao.addDiemLuuTru(ten, diachi, dienthoai, email, website, tiennghi, imagePath, gioithieu, tag);
		
		//Xoa Diem LuuTru
		if (request.getParameter("butxoadlt")!=null) {
			String IdString = request.getParameter("butxoadlt");
			int Id = Integer.parseInt(IdString);
			diemluutrudao dltdao2 = new diemluutrudao();
			dltdao2.deleteDiemLuuTru(Id);
		}
		//Sua Diem Luu Tru
		if (request.getParameter("butsuadlt")!=null) {
			String id_Old_String = request.getParameter("butsuadlt");
			int id_Old = Integer.parseInt(id_Old_String);
			
			String tenS= request.getParameter("txtTenSdlt");
			String diachiS = request.getParameter("txtDiaChiSdlt");
			String dienthoaiS = request.getParameter("txtDienThoaiSdlt");
			String emailS = request.getParameter("txtEmailSdlt");
			String websiteS = request.getParameter("txtWebsiteSdlt");
			String tiennghiS = request.getParameter("txtTienNghiSdlt");
			String gioithieuS = request.getParameter("txtGioiThieuSdlt");
			String tagS = request.getParameter("txtTagSdlt");
			
			
			diemluutrudao dltdao3 = new diemluutrudao();
			dltdao3.updateDiemLuuTru(id_Old, tenS, diachiS, dienthoaiS, emailS, websiteS, tiennghiS, gioithieuS, tagS);
			
		}
		
		response.sendRedirect("htadmin_Travel_diemluutru");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
