<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Trang chủ</title>
	<link rel="stylesheet" href="styles.css">
</head>

<body>
	<div class="container">
		<h1>Chào mừng đến với trang New Film của chúng tôi!</h1>

		<c:if test="${not empty USERMODEL}">
			<li class="nav-item"><a class="nav-link" href='#'>Wellcome,
					${USERMODEL.fullName}</a></li>
			<li class="nav-item"><a class="nav-link" href='<c:url value="/thoat?action=logout"/>'>Thoát</a></li>
		</c:if>
		<form action="<c:url value='/admin-blog?type=edit'/>" id="formEdit" method="post">

			<div class="form-group">
				<input type="text" class="form-control" id="title" name="title" value="${blog.title}">
			</div>


			<div class="form-group">
				<input type="text" class="form-control" id="content" name="content" value="${blog.content}">
			</div>

			<div class="form-group">
				<input type="text" class="form-control" id="author=" name ="author" value="${blog.author}">
			</div>
			<input type="hidden" value="${blog.id}" name="id" />
			<button type="submit" class="btn btn-primary">Thêm</button>

		</form>
	</div>

</body>

</html>