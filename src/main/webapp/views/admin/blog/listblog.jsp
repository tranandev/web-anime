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
		<h1>Chào mừng đến với trang Admin Blog của chúng tôi!</h1>

		<c:if test="${not empty USERMODEL}">
			<li class="nav-item"><a class="nav-link" href='#'>Wellcome,
					${USERMODEL.fullName}</a></li>
			<li class="nav-item"><a class="nav-link" href='<c:url value="/admin-blog?type=newblog"/>'>Thêm Blog</a></li>
			<li class="nav-item"><a class="nav-link" href='<c:url value="/thoat?action=logout"/>'>Thoát</a></li>
		</c:if>

		<div class="main-content">
			<form action="<c:url value='/admin-blog'/>" id="formSubmit" method="get">
				<table border="1px solid black">
					<tr>
						<th>Tên Blog</th>
						<th>Nội dung</th>
						<th>Tác giả</th>
					</tr>
					<c:forEach var="item" items="${blogs}">
						<tr>
							<td>${item.title}</td>
							<td>${item.content}</td>
							<td>${item.author}</td>
							
							<td><a href="<c:url value='/admin-blog?type=edit&id=${item.id}'/>">update</a>

								<a href="<c:url value='/admin-blog?type=delete&id=${item.id}'/>">delete</a>
						</tr>
					</c:forEach>

				</table>
				<div class="container">
					<nav aria-label="Page navigation">
						<ul class="pagination" id="pagination"></ul>
						<input type="hidden" value="" id="type" name="type" />
						<input type="hidden" value="" id="page" name="page" />
						<input type="hidden" value="" id="maxPageItem" name="maxPageItem" />
						<input type="hidden" value="" id="sortName" name="sortName" />
						<input type="hidden" value="" id="sortBy" name="sortBy" />
						<input type="hidden" value="" id="totalPage" name="totalPage" />
					</nav>
				</div>
			</form>
		</div>
	</div>

	<script type="text/javascript">
		var totalPage = ${pageModel.totalPage};
		var currentPage = ${pageModel.page};
		var limit = 5;
		$(function () {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages: totalPage,
				visiblePages: 10,
				startPage: currentPage,
				onPageClick: function (event, page) {
					if (currentPage != page) {
						$('#type').val('list');
						$('#maxPageItem').val(limit);
						$('#page').val(page);
						$('#sortName').val('title');
						$('#sortBy').val('asc');
						$('#totalPage').val(totalPage);
						$('#formSubmit').submit();
					}
				}
			});
		});
	</script>

</body>

</html>