<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>

<head>
  
</head>

<body>
  
    <!-- Normal Breadcrumb Begin -->
    <section class="normal-breadcrumb set-bg" data-setbg="img/normal-breadcrumb.jpg">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <div class="normal__breadcrumb__text">
                        <h2>Sign Up</h2>
                        <p>Welcome to the official Anime blog.</p>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Normal Breadcrumb End -->

    <!-- Signup Section Begin -->
    <section class="signup spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <div class="login__form">
                        <h3>Sign Up</h3>
                        <c:if test="${not empty message}">
							<div class="alert alert-${alert}">${message}</div>
						</c:if>
                        <form action="<c:url value='/dang-ki'/>" id="formRegister" method="post">
                            <div class="input__item">
                                <input type="text" id="userName" name="userName" placeholder="Tên đăng nhập">
                                <span class="icon_profile"></span>
                            </div>
                            
                            <div class="input__item">
                                <input type="email" id="email" name="email" placeholder="Email">
                                <span class="icon_mail"></span>
                            </div>
                            
                            <div class="input__item">
                                <input type="password" id="password" name="password" placeholder="Mật khẩu">
                                <span class="icon_lock"></span>
                            </div>
                            <div class="input__item">
                                <input type="password" id="repassword" name="repassword" placeholder="Nhập lại mật khẩu">
                                <span class="icon_lock"></span>
                            </div>
                            <button type="submit" class="site-btn">Đăng kí</button>
                        </form>
                        <h5>Already have an account? <a href="#">Log In!</a></h5>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="login__social__links">
                        <h3>Login With:</h3>
                        <ul>
                            <li><a href="#" class="facebook"><i class="fa fa-facebook"></i> Sign in With Facebook</a>
                            </li>
                            <li><a href="#" class="google"><i class="fa fa-google"></i> Sign in With Google</a></li>
                            <li><a href="#" class="twitter"><i class="fa fa-twitter"></i> Sign in With Twitter</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Signup Section End -->

</body>

</html>