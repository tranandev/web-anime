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
			<li class="nav-item"><a class="nav-link"
				href='<c:url value="/thoat?action=logout"/>'>Thoát</a></li>
		</c:if>
		<form action="<c:url value='/admin-new?type=newfilm'/>" id="formNew" method="post" enctype="multipart/form-data">

			<div class="form-group">
				<input type="text" class="form-control" id="title" name="title"
					placeholder="Tên Film">
			</div>

			<div class="form-group">
				<select class="form-control" id="categoryId" name="categoryId">
					<option value="">Chọn loại bài viết</option>
					<c:forEach var="item" items="${category}">
						<option value="${item.id}">${item.name}</option>
					</c:forEach>
				</select>
			</div>
			
				<div class="form-group">
				<input type="file" class="form-control" id="photo" name="photo"
					placeholder="Ảnh">
			</div>

			<div class="form-group">
				<input type="text" class="form-control" id="episode" name="episode"
					placeholder="Số Tập">
			</div>

			<div class="form-group">
				<input type="text" class="form-control" id="currentEpisode"
					name="currentEpisode" placeholder="Sô tập hiện tại">
			</div>

			<!-- <input type="hidden" value="newfilm" name="type" /> -->
			<button type="submit" class="btn btn-primary">Thêm</button>

		</form>
	</div>

</body>
</html>

