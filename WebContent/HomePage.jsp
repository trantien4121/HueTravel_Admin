<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/6.2.1/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Sriracha">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<!-- Popper Js -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>

<!-- Bootstrap 4 Framework -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>


<title>Huế Travel</title>
</head>
<style>
.nav-item {
	position: relative;
}

.header__cart-notice {
	position: absolute;
	top: 0px;
	right: 90px;
	padding: 1px 5px;
	font-size: 0.6rem;
	/* line-height: 1rem; */
	border: 2px solid #7B6BEE;
	border-radius: 50%;
	background-color: #fff;
	color: #7B68EE;
}

/* begin filter css */
.home-filter {
	display: flex;
	align-items: center;
	padding: 12px 22px;
	border-radius: 2px;
	background-color: rgba(0, 0, 0, 0.04);
}

.home-filter__label {
	font-size: 16px;
	font-weight: 500;
	color: #333;
	margin-right: 16px;
}

.home-filter__btn {
	background-color: #fff;
	min-width: 90px;
	margin-right: 12px;
	font-weight: 500;
}

.home-filter__page {
	display: flex;
	align-items: center;
	margin-left: auto;
	/*Tự động dịch*/
}

.home-filter__page-num {
	font-size: 16px;
	color: black;
	margin-right: 22px;
}

.home-filter__page-current {
	color: #7B68EE;
}

.home-filter__page-control {
	border-radius: 2px;
	overflow: hidden;
	display: flex;
	width: 72px;
	height: 36px;
}

.home-filter__page-btn {
	flex: 1;
	display: flex;
	background-color: #7B68EE;
	text-decoration: none;
}

.home-filter__page-btn--disable {
	cursor: default;
	background-color: #f9f9f9;
}

.home-filter__page-btn--disable .home-filter__page-icon {
	color: #ccc;
}

.home-filter__page-btn:first-child {
	border-right: 1px solid #EEE;
}

.home-filter__page-icon {
	font-size: 16px;
	margin: auto;
	color: #fff;
}

/* end filter css */
</style>

<body style="padding-top: 80px">
	<nav class="navbar navbar-expand-lg navbar-light fixed-top"
		style="background-color: #7B68EE; height: 12vh">


		<a class="navbar-brand ml-5 pl-5" href="#" style="padding-top: 10px">
			<img src="images/logo_rb_black.png" alt="Logo" height="120x"
			width="150px">
		</a>



		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent"
			style="font-weight: 600; font-size: 15px">
			<ul class="navbar-nav mr-auto" style="font-family: Sriracha;">
				<li class="nav-item"><a class="nav-link" href="htsachservlet"
					style="color: #fff; margin-left: 80px"><i class="fa fa-home"
						aria-hidden="true"></i> Trang chủ <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link ml-4"
					href="htthanhtoanservlet" style="color: #fff"> <i
						class="fa-solid fa-location-dot"></i> Điểm tham quan
				</a></li>
				<li class="nav-item"><a class="nav-link ml-4"
					href="htthanhtoanservlet" style="color: #fff"> <i
						class="fa-solid fa-house-signal"></i> Điểm lưu trú
				</a></li>
				<li class="nav-item"><a class="nav-link ml-4"
					href="htthanhtoanservlet" style="color: #fff"> <i
						class="fa fa-coffee" aria-hidden="true"></i> Điểm ăn uống
				</a></li>
				<li class="nav-item"><a class="nav-link ml-4"
					href="htthanhtoanservlet" style="color: #fff"> <i
						class="fa-brands fa-blogger"></i> Blog du lịch
				</a></li>
			</ul>
			<ul class="navbar-nav ml-3" style="font-family: Sriracha;">
				<li>
					<!-- <a href="dangnhapservlet"
					style="color: #fff; text-decoration: none;"> <i
						class="fa fa-user" aria-hidden="true"></i> Register
					</a> -->
					<button type="button" data-toggle="modal" class="btn"
						style="color: white" data-target="#modalDangKy">
						<i class="fa fa-user" aria-hidden="true"></i> Register
					</button>
				</li>

			</ul>
			<ul class="navbar-nav mr-3 pr-5" style="font-family: Sriracha;">
				<li>
					<!-- <a href="dangnhapservlet" style="color: #fff; text-decoration: none;">
                        <i class="fa fa-user-circle" aria-hidden="true"></i>
                        Login
                    </a> --> <!-- Button Login trigger modal -->
					<button type="button" data-toggle="modal" class="btn"
						style="color: white" data-target="#modalDangNhap">
						<i class="fa fa-user-circle" aria-hidden="true"></i> Login
					</button>


				</li>
			</ul>
		</div>
	</nav>

	<!-- Modal Dang Nhap -->
	<div class="modal fade" id="modalDangNhap" tabindex="0"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered  modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<section class="vh-80">
						<div class="container-fluid">
							<div class="row">
								<div class="col-sm-6 text-black">

									<div class="px-5 ms-xl-4" style="padding-bottom: 20px">
										<img src="images/logo_rb_black.png" alt="Logo" height="120x"
											width="150px">
									</div>

									<div
										class="d-flex align-items-center h-custom-2 px-3 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

										<form action="dangnhapservlet" method="post"
											style="width: 23rem;">
											<div class="form-outline mb-2 form-group">
												<input type="text" id="form2Example18" name="txtUserName"
													class="form-control form-control-lg" /> <label
													class="form-label" for="form2Example18">Username</label>
											</div>

											<div class="form-outline mb-2 form-group">
												<input type="password" id="form2Example28"
													name="txtPassword" class="form-control form-control-lg" />
												<label class="form-label" for="form2Example28">Password</label>
											</div>
											<div class="pt-1 mb-4">
												<button class="btn btn-info btn-lg btn-block" type="submit"
													name="btnLogin">Login</button>
											</div>

											<p class="small mb-1 pb-lg-2">
												<a class="text-muted" href="#!">Forgot password?</a>
											</p>
											<p>
												Don't have an account? <a href="#!" class="link-info">Register
													here</a>
											</p>

										</form>

									</div>

								</div>
								<div class="col-sm-6 px-0 d-none d-sm-block">
									<img src="images/bg5.jpg" alt="Login image" class="w-100 vh-50"
										style="object-fit: cover; object-position: left; height: 65vh">
								</div>
							</div>
						</div>
					</section>
				</div>
			</div>
		</div>
	</div>

	<!-- Modal Dang Ky -->
	<div class="modal fade" id="modalDangKy" tabindex="0"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div
			class="modal-dialog modal-dialog-centered modal-dialog-scrollable modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<section class="vh-80">
						<div class="container-fluid">
							<div class="row">
								<div class="col-sm-6 text-black">

									<div class="px-5 ms-xl-4" style="padding-bottom: 20px">
										<img src="images/logo_rb_black.png" alt="Logo" height="120x"
											width="150px">
									</div>

									<div
										class="d-flex align-items-center h-custom-2 px-2 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

										<form action="dangnhapservlet" method="post"
											style="width: 23rem;">
											<div class="form-outline mb-2 form-group">
												<input type="text" id="form2Example18" name="txtUserNameDK"
													class="form-control form-control-lg" /> <label
													class="form-label" for="form2Example18">Username</label>
											</div>

											<div class="form-outline mb-2 form-group">
												<input type="password" id="form2Example28"
													name="txtPasswordDK" class="form-control form-control-lg" />
												<label class="form-label" for="form2Example28">Password</label>
											</div>

											<div class="form-outline mb-2 form-group">
												<input type="password" id="form2Example28"
													name="txtPasswordAgainDK"
													class="form-control form-control-lg" /> <label
													class="form-label" for="form2Example28">Confirm
													Password</label>
											</div>

											<div class="form-group">
												<label for="HinhAnh" class="col-form-label">Ảnh Đại
													diện:</label> <input type="file" name="txtAnh">
											</div>

											<div class="pt-1 mb-4">
												<button class="btn btn-info btn-lg btn-block" type="submit"
													name="btnLogin">Register</button>
											</div>
											<p>
												Have an account? <a href="#modalDangNhap" class="link-info">Login
													here</a>
											</p>

										</form>

									</div>

								</div>
								<div class="col-sm-6 px-0 d-none d-sm-block">
									<img src="images/bg6.jpg" alt="Login image" class="w-100 vh-50"
										style="object-fit: cover; object-position: left; height: 84vh">
								</div>
							</div>
						</div>
					</section>
				</div>
			</div>
		</div>
	</div>

	<main>
		<div class="slide-image" style="margin-top: -5px;">
			<div id="carouselExampleIndicators" class="carousel slide"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselExampleIndicators" data-slide-to="0"
						class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="images/bg1.jpg" class="d-block w-100" alt="..."
							height="500px">
						<div class="carousel-caption d-none d-md-block">
							<h5 style="font-family: Sriracha;">Đại Nội - Kinh thành Huế</h5>
						</div>
					</div>
					<div class="carousel-item">
						<img src="images/bg4.jpg" class="d-block w-100" alt="..."
							height="500px">
						<div class="carousel-caption d-none d-md-block">
							<h5 style="font-family: Sriracha;">Chùa Thiên Mụ - Sông
								Hương</h5>
						</div>
					</div>
					<div class="carousel-item">
						<img src="images/bg3.jpg" class="d-block w-100" alt="..."
							height="500px">
						<div class="carousel-caption d-none d-md-block">
							<h5 style="font-family: Sriracha;">TP Huế nhìn từ trên cao</h5>
						</div>
					</div>
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>

		<div class="introduce-hue mt-5">
			<div class="row">
				<div class="col-8 offset-2 d-flex justify-content-center">
					<h3 style="font-family: Sriracha;">Welcome to Hue, The land of
						the ancient capital</h3>
				</div>
				<div class="col-10 offset-1 d-flex justify-content-center mt-3"
					style="text-align: justify">
					<h5 style="font-family: Sriracha;">Với di sản văn hoá thế
						giới, với cảnh quan thiên nhiên, với nhiều di tích lịch sử, các
						sản phẩm đặc sản, nhất là nhà vườn là một nét độc đáo tiêu biểu
						của Huế như: nhà vườn An Hiên, Lạc Tịnh Viên, nhà vườn Ngọc Sơn
						Công Chúa, Tỳ Bà Trang, Tịnh Gia Viên... cùng với hệ thống khách
						sạn, nhà hàng, các dịch vụ phục vụ khác, thành phố đã và đang trở
						thành một trung tâm du lịch rất hấp dẫn khách du lịch đến Huế. Huế
						không chỉ cuốn hút du khách bởi những nét đẹp văn hóa, lịch sử,
						những nét đẹp cổ kính, mà còn thu phục lòng người bởi sự thân
						thiện của con người xứ Huế, sự dịu dàng, ngọt ngào của người con
						gái Huế khiến ai cũng phải si mê hay những cơn mưa bất chợt tháng
						mười tạo nên những cảm giác trầm mặc, lắng đọng và cũng thật lãng
						mạn. Những nét đẹp ấy, khiến du khách không khỏi khôn nguôi, nhớ
						thương khi rời xa đất Huế. Đến với Huế là đến với những nét đẹp
						nên thơ, hữu tình.</h5>
				</div>
			</div>
		</div>

		<div class="travel-skill mt-5">
			<div class="col-8 offset-2 d-flex justify-content-center">
				<h3 style="font-family: Sriracha;">Đến - Khám phá - Trải nghiệm</h3>
			</div>
		</div>

		<div class="line d-flex justify-content-center mt-1">
			<div class="line" style="border-bottom: 3px solid; width: 30%"></div>
		</div>

		<div class="row mt-5">

			<div class="col-10 offset-1">
				<div class="row">
					<div class="col-4">
						<div class="row d-flex justify-content-center mb-2">
							<span style="font-family: Sriracha; font-size: 24px;">1.
								Đi đâu?</span>
						</div>
						<div class="row d-flex flex-row pr-4">
							<div id="carouselExampleIndicators2" class="carousel slide"
								data-ride="carousel">
								<ol class="carousel-indicators">
									<li data-target="#carouselExampleIndicators2" data-slide-to="0"
										class="active"></li>
									<li data-target="#carouselExampleIndicators2" data-slide-to="1"></li>
									<li data-target="#carouselExampleIndicators2" data-slide-to="2"></li>
								</ol>
								<div class="carousel-inner">
									<div class="carousel-item active">
										<img src="image_diemthamquan/lt1.jpg" class="d-block w-100"
											width="100%" height="240px" style="border-radius: 20px;">
										<div class="carousel-caption d-none d-md-block">
											<h5 style="font-family: Sriracha; margin-bottom: 140px;">Lăng
												Tự Đức</h5>
										</div>
									</div>
									<div class="carousel-item">
										<img src="image_diemthamquan/dc1.jpeg" class="d-block w-100"
											width="100%" height="240px" style="border-radius: 20px;">
										<div class="carousel-caption d-none d-md-block">
											<h5 style="font-family: Sriracha; margin-bottom: 140px;">Chùa
												Thiên Mụ</h5>
										</div>
									</div>
									<div class="carousel-item">
										<img src="image_diemthamquan/st4.jpg" class="d-block w-100"
											width="100%" height="240px" style="border-radius: 20px;">
										<div class="carousel-caption d-none d-md-block">
											<h5 style="font-family: Sriracha; margin-bottom: 140px;">Hồ
												Khe Ngang</h5>
										</div>
									</div>
								</div>
								<a class="carousel-control-prev"
									href="#carouselExampleIndicators2" role="button"
									data-slide="prev"> <span class="carousel-control-prev-icon"
									aria-hidden="true"></span> <span class="sr-only">Previous</span>
								</a> <a class="carousel-control-next"
									href="#carouselExampleIndicators2" role="button"
									data-slide="next"> <span class="carousel-control-next-icon"
									aria-hidden="true"></span> <span class="sr-only">Next</span>
								</a>
							</div>
						</div>
					</div>
					<div class="col-4">
						<div class="row d-flex justify-content-center mb-2">
							<span style="font-family: Sriracha; font-size: 24px;">1.
								Ăn gì?</span>
						</div>
						<div class="row d-flex flex-row pr-4">
							<div id="carouselExampleIndicators3" class="carousel slide"
								data-ride="carousel">
								<ol class="carousel-indicators">
									<li data-target="#carouselExampleIndicators3" data-slide-to="0"
										class="active"></li>
									<li data-target="#carouselExampleIndicators3" data-slide-to="1"></li>
									<li data-target="#carouselExampleIndicators3" data-slide-to="2"></li>
								</ol>
								<div class="carousel-inner">
									<div class="carousel-item active">
										<img src="image_diemanuong/bbh1.jpg" class="d-block w-100"
											width="100%" height="240px" style="border-radius: 20px;">
										<div class="carousel-caption d-none d-md-block">
											<h5 style="font-family: Sriracha; margin-bottom: 140px;">Bún
												bò Huế</h5>
										</div>
									</div>
									<div class="carousel-item">
										<img src="image_diemanuong/bh1.jpg" class="d-block w-100"
											width="100%" height="240px" style="border-radius: 20px;">
										<div class="carousel-caption d-none d-md-block">
											<h5 style="font-family: Sriracha; margin-bottom: 140px;">Các
												loại bánh Huế</h5>
										</div>
									</div>
									<div class="carousel-item">
										<img src="image_diemanuong/ch1.jpg" class="d-block w-100"
											width="100%" height="240px" style="border-radius: 20px;">
										<div class="carousel-caption d-none d-md-block">
											<h5 style="font-family: Sriracha; margin-bottom: 140px;">Chè
												Huế</h5>
										</div>
									</div>
								</div>
								<a class="carousel-control-prev"
									href="#carouselExampleIndicators3" role="button"
									data-slide="prev"> <span class="carousel-control-prev-icon"
									aria-hidden="true"></span> <span class="sr-only">Previous</span>
								</a> <a class="carousel-control-next"
									href="#carouselExampleIndicators3" role="button"
									data-slide="next"> <span class="carousel-control-next-icon"
									aria-hidden="true"></span> <span class="sr-only">Next</span>
								</a>
							</div>
						</div>
					</div>
					<div class="col-4">
						<div class="row d-flex justify-content-center mb-2">
							<span style="font-family: Sriracha; font-size: 24px;">1. Ở
								đâu?</span>
						</div>
						<div class="row d-flex flex-row pr-4">
							<div id="carouselExampleIndicators4" class="carousel slide"
								data-ride="carousel">
								<ol class="carousel-indicators">
									<li data-target="#carouselExampleIndicators4" data-slide-to="0"
										class="active"></li>
									<li data-target="#carouselExampleIndicators4" data-slide-to="1"></li>
									<li data-target="#carouselExampleIndicators4" data-slide-to="2"></li>
								</ol>
								<div class="carousel-inner">
									<div class="carousel-item active">
										<img src="image_diemluutru/ht1.jpg" class="d-block w-100"
											width="100%" height="240px" style="border-radius: 20px;">
										<div class="carousel-caption d-none d-md-block">
											<h5 style="font-family: Sriracha; margin-bottom: 140px;">Các
												khách sạn sang trọng</h5>
										</div>
									</div>
									<div class="carousel-item">
										<img src="image_diemluutru/nt1.jpg" class="d-block w-100"
											width="100%" height="240px" style="border-radius: 20px;">
										<div class="carousel-caption d-none d-md-block">
											<h5 style="font-family: Sriracha; margin-bottom: 140px;">Nhà
												nghỉ đầy đủ tiện nghi</h5>
										</div>
									</div>
									<div class="carousel-item">
										<img src="image_diemluutru/hs1.jpg" class="d-block w-100"
											width="100%" height="240px" style="border-radius: 20px;">
										<div class="carousel-caption d-none d-md-block">
											<h5 style="font-family: Sriracha; margin-bottom: 140px;">Homestay
												phóng khoáng</h5>
										</div>
									</div>
								</div>
								<a class="carousel-control-prev"
									href="#carouselExampleIndicators4" role="button"
									data-slide="prev"> <span class="carousel-control-prev-icon"
									aria-hidden="true"></span> <span class="sr-only">Previous</span>
								</a> <a class="carousel-control-next"
									href="#carouselExampleIndicators4" role="button"
									data-slide="next"> <span class="carousel-control-next-icon"
									aria-hidden="true"></span> <span class="sr-only">Next</span>
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>

		<div class="travel-knowleadge mt-5">
			<div class="col-8 offset-2 d-flex justify-content-center">
				<h3 style="font-family: Sriracha;">Bạn cần biết - Cẩm năng du
					lịch Huế</h3>
			</div>
		</div>

		<div class="line d-flex justify-content-center mt-1">
			<div class="line" style="border-bottom: 3px solid; width: 30%"></div>
		</div>

		<div class="row mt-5">

			<div class="col-10 offset-1"
				style="background-color: #413F42; height: 54vh; border-radius: 20px;">
				<section class="row">
					<div class="col mt-4">
						<ul class="nav d-flex justify-content-center" id="myTab"
							role="tablist">
							<li class="nav-item" role="presentation"
								style="border-right: 3px solid white; line-height: 10px; height: 24px;">
								<a class="nav-link active" id="userEditing-tab"
								data-toggle="tab" href="#muadulich" role="tab"
								aria-controls="userEditing" aria-selected="true"> <span
									style="font-family: Sriracha; font-size: 20px; color: rgb(231, 231, 116);">Mùa
										du lịch</span>
							</a>
							</li>
							<li class="nav-item" role="presentation"
								style="border-right: 3px solid white; line-height: 10px; height: 24px;">
								<a class="nav-link" id="userList-tab" data-toggle="tab"
								href="#giave" role="tab" aria-controls="userList"
								aria-selected="false"> <span
									style="font-family: Sriracha; font-size: 20px; color: rgb(231, 231, 116);">Giá
										vé</span>
							</a>
							</li>
							<li class="nav-item" role="presentation"
								style="border-right: 3px solid white; line-height: 10px; height: 24px;">
								<a class="nav-link" id="userList-tab" data-toggle="tab"
								href="#phuongtiendilai" role="tab" aria-controls="userList"
								aria-selected="false"> <span
									style="font-family: Sriracha; font-size: 20px; color: rgb(231, 231, 116);">Phương
										tiện đi lại</span>
							</a>
							</li>
							<li class="nav-item" role="presentation"
								style="border-right: 3px solid white; line-height: 10px; height: 24px;">
								<a class="nav-link" id="userList-tab" data-toggle="tab"
								href="#sodienthoaicanbiet" role="tab" aria-controls="userList"
								aria-selected="false"> <span
									style="font-family: Sriracha; font-size: 20px; color: rgb(231, 231, 116);">Số
										điện thoại cần biết</span>
							</a>
							</li>
							<li class="nav-item" role="presentation"
								style="border-right: 3px solid white; line-height: 10px; height: 24px;">
								<a class="nav-link" id="userList-tab" data-toggle="tab"
								href="#quytacungxu" role="tab" aria-controls="userList"
								aria-selected="false"> <span
									style="font-family: Sriracha; font-size: 20px; color: rgb(231, 231, 116);">Quy
										tắc ứng xử</span>
							</a>
							</li>
							<li class="nav-item" role="presentation"
								style="line-height: 10px; height: 24px;"><a
								class="nav-link" id="userList-tab" data-toggle="tab"
								href="#tinhtranggiaothong" role="tab" aria-controls="userList"
								aria-selected="false"> <span
									style="font-family: Sriracha; font-size: 20px; color: rgb(231, 231, 116);">Tình
										trạng giao thông</span>
							</a></li>
						</ul>
						<div class="tab-content" id="myTabContent">
							<div class="tab-pane fade show active" id="muadulich"
								role="tabpanel" aria-labelledby="userEditing-tab">
								<div class="row">
									<div class="col-4 mt-5">
										<img src="images/muadulich.jpg" alt="" width="100%"
											style="border-radius: 20px;">
									</div>
									<div class="col-8 mt-5">
										<h5
											style="font-family: Sriracha; color: #7B68EE; line-height: 30px; text-align: justify;">
											1. Mùa du lịch Huế</h5>
										<h6
											style="font-family: Sriracha; color: white; line-height: 26px; text-align: justify;">
											Khi nhắc đến Huế, chắc hẳn ai ai cũng liên tưởng đến thành
											phố của hai mùa mưa nắng. Thừa hưởng chế độ bức xạ nhiệt dồi
											dào và nền nhiệt cao, đặc trưng cho khí hậu nhiệt đới gió mùa
											nóng ẩm, mưa nhiều (mùa nắng từ tháng 3 đến tháng 8, mùa mưa
											từ tháng 8 đến tháng 2 năm sau). Mỗi một mùa, xứ Huế lại có
											một vẻ đẹp riêng cần khám phá. Đối với những người chưa đến
											Huế lần nào hoặc muốn tìm hiểu văn hóa Cố đô thì nên chọn dịp
											Festival Huế, thường được diễn ra vào giữa cuối tháng 4 đến
											giữa đầu tháng 5. Vào thời điểm này, du khách vừa được thưởng
											thức vẻ đẹp mộng mơ của xứ Huế, vừa được khám phá những nét
											văn hóa lễ hội đặc sắc miễn Cố đô.</h6>
									</div>
								</div>
							</div>
							<div class="tab-pane fade" id="giave" role="tabpanel"
								aria-labelledby="userList-tab">
								<div class="row">
									<div class="col-4 mt-5">
										<img src="images/giave.jpg" alt="" width="100%" height="236vh"
											style="border-radius: 20px;">
									</div>
									<div class="col-8 mt-5">
										<h5
											style="font-family: Sriracha; color: #7B68EE; line-height: 30px; text-align: justify;">
											2. Giá vé trung bình của các điểm tham quan</h5>
										<h6
											style="font-family: Sriracha; color: white; line-height: 26px; text-align: justify;">
											Được biết, từ năm 2022, mức vé tham quan khu Di sản Huế áp
											dụng thống nhất cho du khách quốc tế và nội địa, với các loại
											vé theo từng điểm và vé tham quan gộp tuyến. Vé tham quan
											Hoàng cung Huế (gồm khu Đại nội và Bảo tàng Cổ vật Cung đình
											Huế) có mức giá 200.000 đồng/người lớn và 40.000 đồng/trẻ em.
											Các di tích lăng Minh Mạng, Tự Đức, Khải Định có mức vé tham
											quan 150.000 đồng/người lớn/điểm. Các lăng Gia Long, Thiệu
											Trị, Đồng Khánh, điện Hòn Chén, đàn Nam Giao, cung An Định có
											mức vé 50.000 đồng/người lớn/điểm. Vé tham quan theo tuyến có
											các mức giá 420.000 đồng, 530.000 đồng, 580.000 đồng/người
											lớn, tùy theo số lượng điểm gộp di tích Huế.</h6>
									</div>
								</div>
							</div>
							<div class="tab-pane fade" id="phuongtiendilai" role="tabpanel"
								aria-labelledby="userList-tab">
								<div class="row">
									<div class="col-4 mt-5">
										<img src="images/phuongtiendilai.jpg" alt="" width="100%"
											height="236vh" style="border-radius: 20px;">
									</div>
									<div class="col-8 mt-5">
										<h5
											style="font-family: Sriracha; color: #7B68EE; line-height: 30px; text-align: justify;">
											3. Các phương tiện đi lại chủ yếu bạn có thể thử ở Huế</h5>
										<h6
											style="font-family: Sriracha; color: white; line-height: 26px; text-align: justify;">
											Di chuyển bằng xe cá nhân là loại hình di chuyển thoải mái
											nhất bởi bạn có thể chủ động về thời gian và điểm đến mà
											không phải phụ thuộc vào bất kỳ ai. Hơn nữa, hình thức này
											còn giúp bạn tiết kiệm được khoản chi phí thuê xe không nhỏ.
											Tuy nhiên, vì chặng đường di chuyển dài nên việc tự lái xe sẽ
											dễ gây mệt mỏi, tốn thời gian. Vì thế, lái xe cá nhân chỉ phù
											hợp cho chuyến du lịch dài ngày và nên có ít nhất 2 tài xế.
											Bên cạnh đó, xe đạp cũng là một phương tiện đi lại bạn nên
											thử nếu muôn ngắm nhìn vẻ đẹp Huế 1 cách trọn vẹn và nên thơ
											nhất.</h6>
									</div>
								</div>
							</div>
							<div class="tab-pane fade" id="sodienthoaicanbiet"
								role="tabpanel" aria-labelledby="userList-tab">
								<div class="row">
									<div class="col-4 mt-5">
										<img src="images/sodienthoai.jpg" alt="" width="100%"
											height="236vh" style="border-radius: 20px;">
									</div>
									<div class="col-8 mt-5">
										<h5
											style="font-family: Sriracha; color: #7B68EE; line-height: 30px; text-align: justify;">
											4. Danh sách các số điện thoại có thể cần thiết cho bạn khi
											đến Huế</h5>
										<h6
											style="font-family: Sriracha; color: white; line-height: 26px; text-align: justify;">

											Khi đến du lịch Huế – không chỉ quan tâm đến vé máy bay hay
											các phương tiện để đến đó, mà bạn cần có số điện thoại của
											từng dịch vụ giao thông… Hãy lưu những số dưới đây để thuận
											tiện hơn khi đến Huế du lịch. + Công an thành phố:
											0234.3822166 – 069.4149204 + Công an phòng quản lý Xuất –
											Nhập cảnh: 0234.3824678 – 3897770 + Cấp cứu: 11 + Cứu hỏa:
											114 + Cảnh sát cơ động: 113 + Taxi Thành Công:
											0234.3.57.57.57 – 0234.6.57.57.57 + Bến xe khách Huế (phía
											Bắc): 0234. 3522716 + Bến xe khách Huế (phía Nam):
											0234.826065 + Ga xe lửa: 0234.3822175. + Sân bay Huế:
											0234.3861131</h6>
									</div>
								</div>
							</div>
							<div class="tab-pane fade" id="quytacungxu" role="tabpanel"
								aria-labelledby="userList-tab">
								<div class="row">
									<div class="col-4 mt-5">
										<img src="images/quytacungxu.jpg" alt="" width="100%"
											height="236vh" style="border-radius: 20px;">
									</div>
									<div class="col-8 mt-5">
										<h5
											style="font-family: Sriracha; color: #7B68EE; line-height: 30px; text-align: justify;">
											5. Bộ quy tắc ứng xử khi đến Huế</h5>
										<h6
											style="font-family: Sriracha; color: white; line-height: 26px; text-align: justify;">
											Đây là những Quy định mang tính chuẩn mực nhằm định hướng
											hành vi, thái độ, thói quen, cách thức ứng xử văn minh của tổ
											chức và cá nhân khi tham gia các hoạt động du lịch tại tỉnh
											Thừa Thiên Huế. Bộ quy tắc ứng xử văn minh được Sở Du lịch
											Thừa Thiên Huế đưa ra, thể hiện dưới dạng file hình ảnh đính
											kèm chú thích bằng hai ngôn ngữ tiếng Việt và tiếng Anh với
											mục đích nâng cao nhận thức của người dân, các doanh nghiệp
											địa phương và du khách đến Huế. Qua đó, từng bước hình thành
											thói quen, hành vi ứng xử văn minh, thái độ lịch sự, thân
											thiện trong hoạt động du lịch trên địa bàn tỉnh Thừa Thiên
											Huế.</h6>
									</div>
								</div>
							</div>
							<div class="tab-pane fade" id="tinhtranggiaothong"
								role="tabpanel" aria-labelledby="userList-tab">
								<div class="row">
									<div class="col-4 mt-5">
										<img src="images/tinhtranggiaothong.jpg" alt="" width="100%"
											height="236vh" style="border-radius: 20px;">
									</div>
									<div class="col-8 mt-5">
										<h5
											style="font-family: Sriracha; color: #7B68EE; line-height: 30px; text-align: justify;">
											6. Tình trạng giao thông ở Huế</h5>
										<h6
											style="font-family: Sriracha; color: white; line-height: 26px; text-align: justify;">
											Giao thông chính là đầu mối liên kết giữa các lĩnh vực kinh
											doanh, du lịch và điểm đến, là tác nhân trong việc phát triển
											tổng thể của cả nền kinh tế. Hạ tầng giao thông phục vụ du
											lịch, kết nối các điểm đến ở Huế lâu nay được đánh giá đang
											còn là trở lực cho sự phát triển của du lịch Cố đô. Hạ tầng
											giao thông dường như chưa được đánh giá đúng vai trò của nó
											trong việc phát triển du lịch. Hiệu suất của mạng lưới cơ sở
											hạ tầng giao thông về phát triển du lịch tại các điểm đến
											chưa tương xứng với du lịch tỉnh nhà.</h6>
									</div>
								</div>
							</div>
						</div>
					</div>
				</section>
			</div>
		</div>

		<div class="travel-knowleadge mt-5">
			<div class="col-8 offset-2 d-flex justify-content-center">
				<h3 style="font-family: Sriracha;">Bản đồ du lịch Huế</h3>
			</div>
		</div>
		<div class="line d-flex justify-content-center mt-1">
			<div class="line" style="border-bottom: 3px solid; width: 30%"></div>
		</div>

		<div class="col-10 offset-1 mt-5">
			<iframe
				src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3826.1291938400577!2d107.58651901430153!3d16.468994632976013!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3141a128741c5679%3A0x62de08b9b66b85d3!2zQ-G6p3UgVHLGsOG7nW5nIFRp4buBbg!5e0!3m2!1svi!2s!4v1668951929980!5m2!1svi!2s"
				width="100%" height="450" style="border: 0; border-radius: 20px;"
				allowfullscreen="" loading="lazy"
				referrerpolicy="no-referrer-when-downgrade"> </iframe>
		</div>

		</div>

	</main>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>

</html>