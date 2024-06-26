 <!-- Page Preloder -->
 <div id="preloder">
     <div class="loader"></div>
 </div>

 <!-- Header Section Begin -->
 <header class="header">
     <div class="container">
         <div class="row">
             <div class="col-lg-2">
                 <div class="header__logo">
                     <a href="./index.html">
                         <img src="img/logo.png" alt="">
                     </a>
                 </div>
             </div>
             <div class="col-lg-7">
                 <div class="header__nav">
                     <nav class="header__menu mobile-menu">
                         <ul>
                             <li class="active"><a href="<c:url value = '/trang-chu'/>">Homepage</a></li>
                             <li><a href="./categories.html">Categories <span class="arrow_carrot-down"></span></a>
                                 <ul class="dropdown">
                                     <li><a href="./categories.html">Categories</a></li>
                                     <li><a href="./anime-details.html">Anime Details</a></li>
                                     <li><a href="./anime-watching.html">Anime Watching</a></li>
                                     <li><a href="./blog-details.html">Blog Details</a></li>
                                     <li><a href="./signup.html">Sign Up</a></li>
                                     <li><a href="./login.html">Login</a></li>
                                 </ul>
                             </li>
                             <li><a href="<c:url value = '/blog'/>">Our Blog</a></li>
                             <li><a href="#">Contacts</a></li>
                         </ul>
                     </nav>
                 </div>
             </div>
             <div class="col-lg-3">
                 <div class="header__right">
                     <a href="#" class="search-switch"><span class="icon_search"></span></a>
                     <c:if test="${empty USERMODEL}">
                         <a href="<c:url value = '/dang-nhap?action=login'/>"><span class="icon_profile"></span></a>
                     </c:if>
                     <c:if test="${not empty USERMODEL}">
                         <a href="#">Wellcome, ${USERMODEL.fullName}</a>
                         <a href="<c:url value = '/profile'/>"><span class="icon_profile"></span></a>
                     </c:if>
                 </div>
             </div>
         </div>
         <div id="mobile-menu-wrap"></div>
     </div>
 </header>
 <!-- Header End -->

 <!-- Search model Begin -->
 <div class="search-model">
     <div class="h-100 d-flex align-items-center justify-content-center">
         <div class="search-close-switch"><i class="icon_close"></i></div>
         <form class="search-model-form">
             <input type="text" id="search-input" placeholder="Search here.....">
         </form>
     </div>
 </div>
 <!-- Search model end -->