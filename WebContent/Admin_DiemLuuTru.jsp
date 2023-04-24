<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
	integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
	integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.2.3/js/bootstrap.min.js"></script>

<title>Admin - Diem luu tru</title>
</head>
<style>
.nav-link {
	color: #5AA469;
	font-weight: 500;
}
</style>
<body>
	<div class="container-fluid">
		<div class="row flex-nowrap">
			<div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 bg-dark">
				<div
					class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">
					<a href="/"
						class="d-flex align-items-center pb-3 mb-md-0 me-md-auto text-white text-decoration-none">
						<span class="fs-5 d-none d-sm-inline">Hue Travel</span>
					</a>
					<ul
						class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start"
						id="menu">
						<li class="nav-item"><a href="htadminpage"
							class="nav-link align-middle px-0"> <i class="fs-4 bi-house"></i>
								<span class="ms-1 d-none d-sm-inline">Home</span>
						</a></li>
						<li class="nav-item"><a href="#"
							class="nav-link align-middle px-0"> <i
								class="fs-4 bi-speedometer2"></i> <span
								class="ms-1 d-none d-sm-inline">Dashboard</span>
						</a></li>

						<li class="nav-item"><a href="htadmin_UserManager"
							class="nav-link px-0 align-middle"> <i class="fs-4 bi-people"></i>
								<span class="ms-1 d-none d-sm-inline">User Manager</span>
						</a></li>
						<li><a href="#submenu3" data-bs-toggle="collapse"
							class="nav-link px-0 align-middle"> <i
								class="fs-4 bi-geo-alt-fill"></i> <span
								class="ms-1 d-none d-sm-inline">Travel Manager</span>
						</a>
							<ul class="collapse nav flex-column ms-1" id="submenu3"
								data-bs-parent="#menu">
								<li class="w-100"><a href="htadmin_Travel_diemthamquan"
									class="nav-link px-3"> <i class="bi bi-pin-map-fill"></i> <span
										class="d-none d-sm-inline">Visiting Places</span>
								</a></li>
								<li><a href="htadmin_Travel_DiemLuuTru" class="nav-link px-3"> <i
										class="bi bi-house-add"></i> <span class="d-none d-sm-inline">Accommodation</span>
								</a></li>
								<li><a href="htadmin_Travel_diemanuong" class="nav-link px-3"> <i
										class="bi bi-cup-hot"></i> <span class="d-none d-sm-inline">Eating
											Places</span>
								</a></li>
								<li><a href="htadmin_Travel_tourdulich" class="nav-link px-3"> <i
										class="bi bi-megaphone"></i> <span class="d-none d-sm-inline">Travel
											Tour</span>
								</a></li>
							</ul></li>
						<li class="nav-item"><a href="htadmin_BlogManager"
							class="nav-link px-0 align-middle"> <i
								class="fs-4 bi-chat-left-text-fill"></i> <span
								class="ms-1 d-none d-sm-inline">Blog Manager</span>
						</a></li>
					</ul>
					<hr>
					<div class="dropdown pb-4">
						<a href="#"
							class="d-flex align-items-center text-white text-decoration-none dropdown-toggle"
							id="dropdownUser1" data-bs-toggle="dropdown"
							aria-expanded="false"> <img src="${admin.getImage() }"
							alt="hugenerd" width="30" height="30" class="rounded-circle">
							<span class="d-none d-sm-inline mx-1">${admin.getTenDangNhap() }</span>
						</a>
						<ul class="dropdown-menu dropdown-menu-dark text-small shadow"
							aria-labelledby="dropdownUser1">
							<li><a class="dropdown-item" href="#">Settings</a></li>
							<li><a class="dropdown-item" href="#">Profile</a></li>
							<li>
								<hr class="dropdown-divider">
							</li>
							<li><a class="dropdown-item" href="#">Sign out</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="col py-3" id="">
				<div class="row g-2 pb-1">
					<div class="col-lg">
						<nav class="navbar bg-dark p-3">
							<div class="container-fluid">
								<form class="d-flex" role="search">
									<input class="form-control me-2" type="search"
										placeholder="Search" aria-label="Search">
									<button class="btn btn-outline-success" type="submit">Search</button>
								</form>
								<!-- <button type="submit" class="btn btn-primary p-2"
									style="margin-right: 1%">
									<i class="bi bi-plus-square"></i> <span
										style="margin-left: 4px">Add new</span>
								</button> -->
								<!-- Button trigger modal -->
								<button type="submit" class="btn btn-primary p-2"
									style="margin-left: 60%" data-bs-toggle="modal"
									data-bs-target="#exampleModal">
									<i class="bi bi-plus-square"></i> <span
										style="margin-left: 4px">Add new</span>
								</button>

								<!-- Modal -->
								<form action="CRUDDiemLuuTru" method="post" enctype= "multipart/form-data">
									<div class="modal fade" id="exampleModal" tabindex="-1"
										aria-labelledby="exampleModalLabel" aria-hidden="true">
										<div
											class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
											<div class="modal-content">
												<div class="modal-header">
													<h1 class="modal-title fs-5" id="exampleModalLabel">Thêm
														điểm lưu trú</h1>
													<button type="button" class="btn-close"
														data-bs-dismiss="modal" aria-label="Close"></button>
												</div>
												<div class="modal-body">
													<div class="form-group">
														<label for="Name" class="col-form-label">Tên điểm
															lưu trú:</label> <input type="text" class="form-control"
															id="ten" name="txtName">
													</div>
													<div class="form-group">
														<label for="DiaChi" class="col-form-label">Địa
															Chỉ:</label> <input type="text" class="form-control" id="diachi"
															name="txtDiaChi">
													</div>
													<div class="form-group">
														<label for="DienThoai" class="col-form-label">Điện 
														Thoại:</label> <input type="text" class="form-control" id="dienthoai"
															name="txtDienThoai">
													</div>
													<div class="form-group">
														<label for="Email" class="col-form-label">
														Email:</label> <input type="text" class="form-control" id="email"
															name="txtEmail">
													</div>
													<div class="form-group">
														<label for="Website" class="col-form-label">
														Website:</label> <input type="text" class="form-control" id="website"
															name="txtWebsite">
													</div>
													<div class="form-group">
														<label for="TienNghi" class="col-form-label">Tiện
															Nghi:</label> <input type="text" class="form-control"
															id="tiennghi" name="txtTienNghi">
													</div>
													<div class="form-group">
														<label for="HinhAnh" class="col-form-label">Ảnh:</label> <input
															type="file" name="txtAnh">
													</div>
													<div class="form-group">
														<label for="GioiThieu" class="col-form-label">Giới
															thiệu:</label>
														<textarea type="text" rows="4" class="form-control"
															id="gioithieu" name="txtGioiThieu"></textarea>
													</div>
													<div class="form-group">
														<label for="Tag" class="col-form-label">Tag:</label> <input
															type="text" class="form-control" id="tag" name="txtTag">
													</div>
												</div>
												<div class="modal-footer">
													<button type="button" class="btn btn-secondary"
														data-bs-dismiss="modal">Close</button>
													<button type="submit" name="butthemdlt"
														class="btn btn-primary">Add</button>
												</div>
											</div>
										</div>
									</div>
								</form>

							</div>
						</nav>
					</div>
				</div>
				<div class="row g-2">
					<div class="col">
						<table class="table table-dark table-bordered">
							<thead">
								<tr>
									<th class="pl-1">Id</th>
									<th class="pl-1">Tên</th>
									<th class="pl-1">Hình ảnh</th>
									<th class="pl-1">Địa chỉ</th>
									<th class="d-flex justify-content-center">&nbsp;</th>
								</tr>
							</thead>
							<tbody style="font-weight: 600">
								<c:forEach var="u" items="${dsDltru}">
									<tr>
										<td class="pl-1 pt-4">${u.getDiemLuuTruId()}</td>
										<td class="pl-1 pt-4">${u.getDiemLuuTruName()}</td>
										<td><img src="${u.getHinhAnh()}" width="80px"
											height="80px" class="pl-2 pt-2 pb-2" /></td>
										<td class="pl-1 pt-4">${u.getDiaChi()}</td>
										<td>
											<table class="table table-dark table-borderless">
												<th>
												<td class="pt-4">
													<!-- <button type="submit" class="btn btn-info">
														<i class="bi bi-eye"></i>
													</button> -->
													<button type="submit" class="btn btn-info"
														data-bs-toggle="modal"
														data-bs-target="#modalxem${u.getDiemLuuTruId()}">
														<i class="bi bi-eye"></i>
													</button>
													<div class="modal fade"
														id="modalxem${u.getDiemLuuTruId()}" tabindex="-1"
														aria-labelledby="exampleModalLabel" aria-hidden="true">
														<div
															class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
															<div class="modal-content">
																<div class="modal-header">
																	<h1 class="modal-title fs-5" id="exampleModalLabel"
																		style="color: black">Chi tiết điểm lưu trú</h1>
																	<button type="button" class="btn-close"
																		data-bs-dismiss="modal" aria-label="Close"></button>
																</div>
																<div class="modal-body">
																	<div class="form-group">
																		<label for="Name" class="col-form-label"
																			style="color: black">Tên điểm lưu trú:</label> <input
																			type="text" class="form-control"
																			value="${u.getDiemLuuTruName() }">
																	</div>
																	<div class="form-group">
																		<label for="DiaChi" class="col-form-label"
																			style="color: black">Địa Chỉ:</label> <input
																			type="text" class="form-control"
																			value="${u.getDiaChi()}">
																	</div>
																	<div class="form-group">
																		<label for="DienThoai" class="col-form-label"
																			style="color: black">Điện thoại:</label> <input
																			type="text" class="form-control"
																			value="${u.getDienThoai()}">
																	</div>
																	<div class="form-group">
																		<label for="Email" class="col-form-label"
																			style="color: black">Email:</label> <input
																			type="text" class="form-control"
																			value="${u.getEmail()}">
																	</div>
																	<div class="form-group">
																		<label for="Website" class="col-form-label"
																			style="color: black">Website:</label> <input
																			type="text" class="form-control"
																			value="${u.getWebsite()}">
																	</div>
																	<div class="form-group">
																		<label for="TienNghi" class="col-form-label"
																			style="color: black">Tiện nghi:</label> <input type="text"
																			class="form-control" value="${u.getTienNghi() }">
																	</div>
																	<div class="form-group">
																		<label for="HinhAnh" class="col-form-label"
																			style="color: black">Ảnh:</label> <img
																			src="${u.getHinhAnh()}" width="400px" height="200px"
																			class="pt-3">
																	</div>
																	<div class="form-group">
																		<label for="GioiThieu" class="col-form-label"
																			style="color: black">Giới thiệu:</label>
																		<textarea type="text" rows="4" class="form-control"
																			placeholder="${u.getGioiThieu() }"></textarea>
																	</div>
																	<div class="form-group">
																		<label for="Tag" class="col-form-label"
																			style="color: black">Tag:</label> <input type="text"
																			class="form-control"
																			value="${u.getDiemLuuTruTag() }">
																	</div>
																</div>
															</div>
														</div>
													</div>
												</td>
												<td class="pt-4">
													<!-- <form action="CRUDDiemLuuTru" method="post">
														<button type="submit" class="btn btn-success">
															<i class="bi bi-pencil-square"></i>
														</button>
													</form> -->
													<button type="submit" class="btn btn-success"
														data-bs-toggle="modal"
														data-bs-target="#modalsua${u.getDiemLuuTruId()}">
														<i class="bi bi-pencil-square"></i>
													</button>
													<form action="CRUDDiemLuuTru" method="post">
														<div class="modal fade"
															id="modalsua${u.getDiemLuuTruId()}" tabindex="-1"
															aria-labelledby="exampleModalLabel" aria-hidden="true">
															<div
																class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
																<div class="modal-content">
																	<div class="modal-header">
																		<h1 class="modal-title fs-5" id="exampleModalLabel"
																			style="color: black">Chỉnh sửa điểm lưu trú</h1>
																		<button type="button" class="btn-close"
																			data-bs-dismiss="modal" aria-label="Close"></button>
																	</div>
																	<div class="modal-body">
																		<div class="form-group">
																			<label for="Name" class="col-form-label"
																				style="color: black">Tên điểm lưu trú:</label> <input
																				type="text" class="form-control"
																				value="${u.getDiemLuuTruName()}" id="Name" name="txtTenSdlt">
																		</div>
																		<div class="form-group">
																			<label for="DiaChi" class="col-form-label"
																				style="color: black">Địa Chỉ:</label> <input
																				type="text" class="form-control"
																				value="${u.getDiaChi()}" id="DiaChi" name="txtDiaChiSdlt">
																		</div>
																		<div class="form-group">
																			<label for="DienThoai" class="col-form-label"
																				style="color: black">Điện thoại:</label> <input
																				type="text" class="form-control"
																				value="${u.getDienThoai()}" id="DienThoai" name="txtDienThoaiSdlt">
																		</div>
																		<div class="form-group">
																			<label for="Email" class="col-form-label"
																				style="color: black">Email:</label> <input
																				type="text" class="form-control"
																				value="${u.getEmail()}" id="Email" name="txtEmailSdlt">
																		</div>
																		<div class="form-group">
																			<label for="Website" class="col-form-label"
																				style="color: black">Website:</label> <input
																				type="text" class="form-control"
																				value="${u.getWebsite()}" id="Website" name="txtWebsiteSdlt">
																		</div>
																		<div class="form-group">
																			<label for="TienNghi" class="col-form-label"
																				style="color: black">Tiện Nghi:</label> <input
																				type="text" class="form-control"
																				value="${u.getTienNghi()}" id="TienNghi" name="txtTienNghiSdlt">
																		</div>
																		<div class="form-group">
																			<label for="HinhAnh" class="col-form-label"
																				style="color: black">Ảnh:</label> <img
																				src="${u.getHinhAnh()}" width="400px" height="200px"
																				class="pt-3">
																		</div>
																		<div class="form-group">
																			<label for="GioiThieu" class="col-form-label"
																				style="color: black">Giới thiệu:</label>
																			<textarea type="text" rows="4" class="form-control"
																				placeholder="${u.getGioiThieu()}" id="GioiThieu" name="txtGioiThieuSdlt"></textarea>
																		</div>
																		<div class="form-group">
																			<label for="Tag" class="col-form-label"
																				style="color: black">Tag:</label> <input type="text"
																				class="form-control"
																				value="${u.getDiemLuuTruTag()}" id="Tag" name="txtTagSdlt">
																		</div>
																	</div>
																	<div class="modal-footer">
																		<button type="button" class="btn btn-secondary"
																			data-bs-dismiss="modal">Close</button>
																		<button type="submit" name="butsuadlt" value="${u.getDiemLuuTruId()}"
																			class="btn btn-primary">Update</button>
																	</div>
																</div>
															</div>
														</div>
													</form>

												</td>
												<td class="pt-4">
													<form action="CRUDDiemLuuTru" method="post">
														<button type="submit" class="btn btn-danger"
															name="butxoadlt" value="${u.getDiemLuuTruId() }">
															<i class="bi bi-trash"></i>
														</button>
													</form>
												</td>
												</th>
											</table>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>

</html>