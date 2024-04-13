<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
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
		<h1>Chào mừng đến với trang Admin của chúng tôi!</h1>

		<div class="main-content">
		
				<table border="1px solid black">
					<tr>
						<th>Tên Blog</th>
						<th>Nội dung</th>
						<th>Tác giả</th>
					</tr>
					<c:forEach var="item" items="${blogList}" varStatus="status">
						<c:if test="${status.index <6}">
						 
						<tr>
							<td>${item.title}</td>
							<td>${item.content}</td>
							<td>${item.author}</td>

						</tr>
						
						</c:if>
					</c:forEach>

				</table>
			
		</div>
	</div>

</body>

</html>