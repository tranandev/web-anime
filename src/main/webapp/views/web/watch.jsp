<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head>
 
</head>

<body>
   

    <!-- Breadcrumb Begin -->
    <div class="breadcrumb-option">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb__links">
                        <a href="./index.html"><i class="fa fa-home"></i> Home</a>
                        <a href="./categories.html">Categories</a>
                        <a href="#">Romance</a>
                        <span>Fate Stay Night: Unlimited Blade</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->

    <!-- Anime Section Begin -->
    <section class="anime-details spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="anime__video__player">
                        <video id="player" playsinline controls data-poster="./videos/anime-watch.jpg">
                            <source src="file/${film.file}" type="video/mp4" />
                            <!-- Captions are optional -->
                            <track kind="captions" label="English captions" src="#" srclang="en" default />
                        </video>
                    </div>
                    <div class="anime__details__episodes">
                        <div class="section-title">
                            <h5>List Name</h5>
                        </div>
                        <c:forEach var="episode" begin="1" end="${film.episode}">
                              <a href="<c:url value = '/xem-phim?type=watch&id=1&episode=${episode}'/>">Ep ${episode}</a>
                     </c:forEach> 
                       
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-8">
                    <div class="anime__details__review">
                        <div class="section-title">
                            <h5>Reviews</h5>
                        </div>
                         <c:forEach var="item" items="${comment}">
                        <div class="anime__review__item">
                            <div class="anime__review__item__pic">
                                <img src="img/anime/review-1.jpg" alt="">
                            </div>
                            <div class="anime__review__item__text">
                               <h6>${item.fullName} - <span>1 Hour ago</span></h6>
                                    <p>${item.content}</p>
                            </div>
                        </div>
                        </c:forEach>
                    
                    </div>
                    
                     <c:if test="${not empty USERMODEL}">
                    <div class="anime__details__form">
                        <div class="section-title">
                            <h5>Your Comment</h5>
                        </div>
                             <form action="<c:url value = '/xem-phim?type=newComment'/>" method="post">
                                <textarea id="content" name="content" placeholder="Your Comment"></textarea>
                                <input type="hidden" id="userid" name="userId" value="${USERMODEL.id}">
                                <input type="hidden" id="filmid" name="filmId" value="${film.id}">
                                <button type="submit"><i class="fa fa-location-arrow"></i> Review</button>
                        </form>
                    </div>
                    </c:if>
                </div>
            </div>
        </div>
    </section>
    <!-- Anime Section End -->

</body>

</html>