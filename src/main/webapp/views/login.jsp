<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head>
</head>

<body>

	<!-- Normal Breadcrumb Begin -->
	<section class="normal-breadcrumb set-bg"
		data-setbg="img/normal-breadcrumb.jpg">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<div class="normal__breadcrumb__text">
						<h2>Login</h2>
						<p>Welcome to the official Anime blog.</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Normal Breadcrumb End -->

	<!-- Login Section Begin -->
	<section class="login spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="login__form">
						<h3>Login</h3>
						<c:if test="${not empty message}">
							<div class="alert alert-${alert}">${message}</div>
						</c:if>
						<form action="<c:url value='/dang-nhap?action=login'/>"
							id="formLogin" method="post">
							<div class="input__item">
								<input type="text" id="userName" name="userName" placeholder="Tên đăng nhập"> <span class="icon_mail"></span>
							</div>
							<div class="input__item">
								<input type="password" class="form-control" id="password" name="password" placeholder="Mật khẩu"> <span class="icon_lock"></span>
							</div>
							<button type="submit" class="site-btn">Đăng Nhập</button>
						</form>
						<a href="#" class="forget_pass">Quên Mật Khẩu</a>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="login__register">
						<h3>Bạn Chưa Có Tài Khoản</h3>
						<a href="<c:url value='/dang-ki'/>" class="primary-btn">Đăng kí</a>
					</div>
				</div>
			</div>
			<div class="login__social">
				<div class="row d-flex justify-content-center">
					<div class="col-lg-6">
						<div class="login__social__links">
							<span>or</span>
							<ul>
								<li><a href="#" class="facebook"><i
										class="fa fa-facebook"></i> Sign in With Facebook</a></li>
								<li><a href="#" class="google"><i class="fa fa-google"></i>
										Sign in With Google</a></li>
								<li><a href="#" class="twitter"><i
										class="fa fa-twitter"></i> Sign in With Twitter</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Login Section End -->

</body>

</html>