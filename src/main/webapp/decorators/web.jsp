<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="description" content="Anime Template">
<meta name="keywords" content="Anime, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Anime</title>

<!-- Google Font -->
<link href="https://fonts.googleapis.com/css2?family=Oswald:wght@300;400;500;600;700&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Mulish:wght@300;400;500;600;700;800;900&display=swap" rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="<c:url value='/template/css/bootstrap.min.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/font-awesome.min.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/elegant-icons.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/plyr.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/nice-select.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/owl.carousel.min.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/slicknav.min.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/style.css'/>" type="text/css">
<link href="https://vjs.zencdn.net/8.10.0/video-js.css" rel="stylesheet" />
</head>
<body>
	<!-- Navigation -->

	<%@ include file="/common/web/header.jsp"%>

	<dec:body />

	<!-- Footer -->
	<%@ include file="/common/web/footer.jsp"%>
	<!-- Js Plugins -->
	<script src="<c:url value='/template/js/jquery-3.3.1.min.js'/>"></script>
	<script src="<c:url value='/template/js/bootstrap.min.js'/>"></script>
	<script src="<c:url value='/template/js/player.js'/>"></script>
	<script src="<c:url value='/template/js/jquery.nice-select.min.js'/>"></script>
	<script src="<c:url value='/template/js/mixitup.min.js'/>"></script>
	<script src="<c:url value='/template/js/jquery.slicknav.js'/>"></script>
	<script src="<c:url value='/template/js/owl.carousel.min.js'/>"></script>
	<script src="<c:url value='/template/js/main.js'/>"></script>
</body>
</html>