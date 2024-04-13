<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
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
                        <h2>Our Blog</h2>
                        <p>Welcome to the official AnimeÂ blog.</p>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Normal Breadcrumb End -->

    <!-- Blog Section Begin -->
    <section class="blog spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <div class="row">
                    <c:forEach var="blog" items="${blogList}" varStatus="status">
                     <c:if test="${status.index <6}">
                       <c:if test="${status.index == 0}">
                        <div class="col-lg-12">
                            <div class="blog__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                         <c:if test="${status.index == 1}">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item small__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                         <c:if test="${status.index == 2}">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item small__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                        <c:if test="${status.index == 3}">
                        <div class="col-lg-12">
                            <div class="blog__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                        <c:if test="${status.index == 4}">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item small__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                        <c:if test="${status.index == 5}">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item small__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                        </c:if>
                          </c:forEach>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="row">
                     <c:forEach var="blog" items="${blogList}" varStatus="status">
                     <c:if test="${status.index >5}">
                    <c:if test="${status.index == 6}">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item small__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                        <c:if test="${status.index == 7}">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item small__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                        <c:if test="${status.index == 8}">
                        <div class="col-lg-12">
                            <div class="blog__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                        <c:if test="${status.index == 9}">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item small__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                        <c:if test="${status.index == 10}">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item small__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                        <c:if test="${status.index == 11}">
                        <div class="col-lg-12">
                            <div class="blog__item set-bg" data-setbg="images/blog/${blog.photo}">
                                <div class="blog__item__text">
                                    <p><span class="icon_calendar"></span> ${blog.author}</p>
                                    <h4><a href="#">${blog.title}</a></h4>
                                </div>
                            </div>
                        </div>
                        </c:if>
                        </c:if>
                          </c:forEach>
                    </div>
                </div>
              
            </div>
        </div>
    </section>
    <!-- Blog Section End -->

</body>

</html>