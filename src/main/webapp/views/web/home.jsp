<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head>

</head>

<body>

	<!-- Hero Section Begin -->
	<section class="hero">
		<div class="container">
			<div class="hero__slider owl-carousel">
				<div class="hero__items set-bg" data-setbg="<c:url value='/template/img/hero/hero-1.jpg'/>">
					<div class="row">
						<div class="col-lg-6">
							<div class="hero__text">
								<div class="label">Adventure</div>
								<h2>Fate / Stay Night: Unlimited Blade Works</h2>
								<p>After 30 days of travel across the world...</p>
								<a href="#"><span>Watch Now</span> <i class="fa fa-angle-right"></i></a>
							</div>
						</div>
					</div>
				</div>
				<div class="hero__items set-bg" data-setbg="img/hero/hero-1.jpg">
					<div class="row">
						<div class="col-lg-6">
							<div class="hero__text">
								<div class="label">Adventure</div>
								<h2>Fate / Stay Night: Unlimited Blade Works</h2>
								<p>After 30 days of travel across the world...</p>
								<a href="#"><span>Watch Now</span> <i class="fa fa-angle-right"></i></a>
							</div>
						</div>
					</div>
				</div>
				<div class="hero__items set-bg" data-setbg="img/hero/hero-1.jpg">
					<div class="row">
						<div class="col-lg-6">
							<div class="hero__text">
								<div class="label">Adventure</div>
								<h2>Fate / Stay Night: Unlimited Blade Works</h2>
								<p>After 30 days of travel across the world...</p>
								<a href="#"><span>Watch Now</span> <i class="fa fa-angle-right"></i></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Hero Section End -->

	<!-- Product Section Begin -->
	<section class="product spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">

					<!--  POPULAR SHOWS     -->
					<div class="popular__product">
						<div class="row">
							<div class="col-lg-8 col-md-8 col-sm-8">
								<div class="section-title">
									<h4>Popular Shows</h4>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-4">
								<div class="btn__all">
									<a href="#" class="primary-btn">View All <span class="arrow_right"></span></a>
								</div>
							</div>
						</div>
						<div class="row">
							<c:forEach var="item" items="${film}">
								<div class="col-lg-4 col-md-6 col-sm-6">
									<div class="product__item">
										<div class="product__item__pic set-bg" data-setbg="images/film/${item.photo}">
											<div class="ep">${item.currentEpisode}/${item.episode}</div>
											<div class="comment">
												<i class="fa fa-comments"></i> 11
											</div>
											<div class="view">
												<i class="fa fa-eye"></i> ${item.view}
											</div>
										</div>
										<div class="product__item__text">
											<ul>
												<li>Active</li>
												<li>${item.categoryName}</li>
											</ul>
											<h5>
												<a
													href="<c:url value = '/xem-phim?type=details&id=${item.id}'/>">${item.title}</a>
											</h5>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>

					<!--  TRENDING NOWS     -->
					<div class="trending__product">
						<div class="row">
							<div class="col-lg-8 col-md-8 col-sm-8">
								<div class="section-title">
									<h4>Trending Now</h4>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-4">
								<div class="btn__all">
									<a href="#" class="primary-btn">View All <span class="arrow_right"></span></a>
								</div>
							</div>
						</div>
						<div class="row">
							<c:forEach var="item" items="${film}">
								<div class="col-lg-4 col-md-6 col-sm-6">
									<div class="product__item">
										<div class="product__item__pic set-bg" data-setbg="images/film/${item.photo}">
											<div class="ep">${item.currentEpisode}/${item.episode}</div>
											<div class="comment">
												<i class="fa fa-comments"></i> 11
											</div>
											<div class="view">
												<i class="fa fa-eye"></i> ${item.view}
											</div>
										</div>
										<div class="product__item__text">
											<ul>
												<li>Active</li>
												<li>${item.categoryName}</li>
											</ul>
											<h5>
												<a href="#">${item.title}</a>
											</h5>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>

					<!--  RECENTLY ADDED SHOWS    -->
					<div class="recent__product">
						<div class="row">
							<div class="col-lg-8 col-md-8 col-sm-8">
								<div class="section-title">
									<h4>Recently Added Shows</h4>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-4">
								<div class="btn__all">
									<a href="#" class="primary-btn">View All <span class="arrow_right"></span></a>
								</div>
							</div>
						</div>
						<div class="row">
							<c:forEach var="item" items="${film2}">
								<div class="col-lg-4 col-md-6 col-sm-6">
									<div class="product__item">
										<div class="product__item__pic set-bg" data-setbg="images/film/${item.photo}">
											<div class="ep">${item.currentEpisode}/${item.episode}</div>
											<div class="comment">
												<i class="fa fa-comments"></i> 11
											</div>
											<div class="view">
												<i class="fa fa-eye"></i> ${item.view}
											</div>
										</div>
										<div class="product__item__text">
											<ul>
												<li>Active</li>
												<li>${item.categoryName}</li>
											</ul>
											<h5>
												<a href="#">${item.title}</a>
											</h5>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>

					<!--  LIVE ACTION    -->
					<div class="live__product">
						<div class="row">
							<div class="col-lg-8 col-md-8 col-sm-8">
								<div class="section-title">
									<h4>Live Action</h4>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-4">
								<div class="btn__all">
									<a href="#" class="primary-btn">View All <span class="arrow_right"></span></a>
								</div>
							</div>
						</div>
						<div class="row">
							<c:forEach var="item" items="${film}">
								<div class="col-lg-4 col-md-6 col-sm-6">
									<div class="product__item">
										<div class="product__item__pic set-bg" data-setbg="images/film/${item.photo}">
											<div class="ep">${item.currentEpisode}/${item.episode}</div>
											<div class="comment">
												<i class="fa fa-comments"></i> 11
											</div>
											<div class="view">
												<i class="fa fa-eye"></i> ${item.view}
											</div>
										</div>
										<div class="product__item__text">
											<ul>
												<li>Active</li>
												<li>${item.categoryName}</li>
											</ul>
											<h5>
												<a href="#">${item.title}</a>
											</h5>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>

				</div>
				<div class="col-lg-4 col-md-6 col-sm-8">
					<div class="product__sidebar">
						<div class="product__sidebar__view">
							<div class="section-title">
								<h5>Top Views</h5>
							</div>
							<ul class="filter__controls">
								<li class="active" data-filter="*">Day</li>
								<li data-filter=".week">Week</li>
								<li data-filter=".month">Month</li>
								<li data-filter=".years">Years</li>
							</ul>
							<div class="filter__gallery">
								<c:forEach var="item" items="${film}" varStatus="status">
									<c:if test="${status.index < 4}">
										<div class="product__sidebar__view__item set-bg mix day years"
											data-setbg="img/sidebar/tv-1.jpg">
											<div class="ep">${item.currentEpisode}/${item.episode}</div>
											<div class="view">
												<i class="fa fa-eye"></i> ${item.view}
											</div>
											<h5>
												<a href="#">${item.title}</a>
											</h5>
										</div>
									</c:if>
								</c:forEach>
							</div>
						</div>
						<div class="product__sidebar__comment">
							<div class="section-title">
								<h5>New Comment</h5>
							</div>
							<c:forEach var="item" items="${new2}">
								<div class="product__sidebar__comment__item">
									<div class="product__sidebar__comment__item__pic">
										<img src="img/sidebar/comment-1.jpg" alt="">
									</div>
									<div class="product__sidebar__comment__item__text">
										<ul>
											<li>Active</li>
											<li>Movie</li>
										</ul>
										<h5> <a href="#">${item.title}</a> </h5>
										<h5> ${item.fullName} - ${item.createdDate} </h5>
										<span><i class="fa fa-comment"></i> ${item.content}</span>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Product Section End -->

</body>

</html>