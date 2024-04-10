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
		<h1>Chào mừng đến với trang Delete của chúng tôi!</h1>
		
		 <c:if test="${not empty USERMODEL}">
              <li class="nav-item">
                <a class="nav-link" href='#'>Wellcome, ${USERMODEL.fullName}</a>
              </li>
                <li class="nav-item">
                <a class="nav-link" href='<c:url value="/admin-new?action=newfilm"/>'>Thêm Film</a>
              </li>
               <li class="nav-item">
                <a class="nav-link" href='<c:url value="/admin-new?action=edit"/>'>Cập Nhật Film</a>
              </li>
                <li class="nav-item">
                <a class="nav-link" href='<c:url value="/admin-new?action=delete"/>'>Xoá Film</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href='<c:url value="/thoat?action=logout"/>'>Thoát</a>
              </li>
            </c:if>
          
            
              <table border="1px solid black">
                <tr>
                    <th>Tên Anime</th>
                    <th>Thể Loại</th>
                    <th>Lượt View</th>
                    <th>Sô Tập</th>
                    <th>Số Tập Hiện Tại</th>
                    <th>Đánh Giá</th>
                </tr>
            <c:forEach var="item" items="${films}">
                <tr>
                    <td>${item.title}</td>
                    <td>${item.categoryName}</td>
                    <td>${item.view}</td>
                    <td>${item.episode}</td>
                    <td>${item.currentEpisode}</td>
                    <td>${item.rate}</td>
     
                    <td>
                        <a href="#">update</a>
                        <a href="#">delete</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
	</div>

</body>
</html>

