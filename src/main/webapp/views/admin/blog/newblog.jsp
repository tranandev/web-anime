<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head>

</head>

<body>
	<div class="container">
		<h1>Chào mừng đến với trang New Blog</h1>

		<c:if test="${not empty USERMODEL}">
			<li class="nav-item"><a class="nav-link" href='#'>Wellcome,
					${USERMODEL.fullName}</a></li>
			<li class="nav-item"><a class="nav-link" href='<c:url value="/thoat?action=logout"/>'>Thoát</a></li>
		</c:if>
		<form action="<c:url value='/admin-blog?type=newblog'/>" id="formNew" method="post">

			<div class="form-group">
				<input type="text" class="form-control" id="title" name="title" placeholder="Tiêu đề">
			</div>

			<div class="form-group">
				<input type="text" class="form-control" id="content" name="content" placeholder="Nội dung">
			</div>
			
			<div class="form-group">
				<input type="text" class="form-control" id="author" name="author" placeholder="Tác giả">
			</div>

			<!-- <input type="hidden" value="newfilm" name="type" /> -->
			<button type="submit" class="btn btn-primary">Thêm</button>

		</form>
	</div>

</body>

</html>