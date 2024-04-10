<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng kí</title>
</head>
<body>
    <div class="container">
        <div class="register-form">
            <div class="main-div">
                <c:if test="${not empty message}">
                    <div class="alert alert-${alert}">${message}</div>
                </c:if>
                <form action="<c:url value='/dang-ki'/>" id="formLogin" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <input type="text" class="form-control" id="userName" name="userName" placeholder="Tên đăng nhập">
                    </div>

                    <div class="form-group">
                        <input type="text" class="form-control" id="fullName" name="fullName" placeholder="Tên đầy đủ">
                    </div>
                    
                    <div class="form-group">
                        <input type="file" class="form-control" id="photo" name="photo" placeholder="Ảnh">
                    </div>

                    <div class="form-group">
                        <input type="password" class="form-control" id="password" name="password" placeholder="Mật khẩu">
                    </div>

                    <div class="form-group">
                        <input type="password" class="form-control" id="repassword" name="repassword" placeholder="Nhập lại mật khẩu">
                    </div>

                  <!--   <input type="hidden" value="register" name="action" /> -->
                    <button type="submit" class="btn btn-primary">Đăng kí</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>