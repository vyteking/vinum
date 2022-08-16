<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//String includePage = request.getParameter("includePage");
    String includePage = (String)request.getAttribute("includePage");
    if(includePage== null){
    	includePage ="welcome.jsp";
    }
%>
 <%@ taglib  prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%> 


<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A layout example that shows off a responsive pricing table.">
    <title>Pricing Table &ndash; Layout Examples &ndash; Pure</title>
    <link rel="stylesheet" href="/css/pure/pure-min.css">
    <link rel="stylesheet" href="/css/pure/grids-responsive-min.css">
    <link rel="stylesheet" href="/layouts/pricing/styles.css">
    <link href="${pageContext.request.contextPath}/user/board/css/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<jsp:include page="./userinterface/header/header.jsp"/>

<%-- <jsp:include page="<%=includePage %>"></jsp:include> --%>
<%-- <div class="pure-menu pure-menu-horizontal">
    <a href="#" class="pure-menu-heading">
    	<img src = "images/Logo.jpg" width = "300" height = "50"/>
    </a>
    <ul class="pure-menu-list">
        <li class="pure-menu-item"><a href="#" class="pure-menu-link">Home</a></li>
        <li class="pure-menu-item pure-menu-selected"><a href="./user/login/loginpage.jsp" class="pure-menu-link">Login</a></li>
        <li class="pure-menu-item"><a href="#" class="pure-menu-link">Contact</a></li>
    </ul>
</div>--%>

<div class="banner">
    <h1 class="banner-head">
        당신의 와인을 추천해드립니다<br>
        
    </h1>
</div>

<div class="l-content">
    <div class="pricing-tables pure-g">
        <div class="pure-u-1 pure-u-md-1-3">
            <div class="pricing-table pricing-table-free">
                <div class="pricing-table-header">
                	
                    <h2></h2>

                    <span class="pricing-table-price">
                         <span>나만의 추천와인
                         찾기</span>
                    </span> 
                </div>

                <ul class="pricing-table-list">
                    <li>맛,도수 등을 통해 회원님에게 </br>
                    맞는 와인을 추천해드립니다</li>
                    
                </ul>

                <button class="button-choose pure-button" onClick = "location.href='./productlist/productCheck.jsp'">CLICK!</button>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-3">
            <div class="pricing-table pricing-table-biz pricing-table-selected">
                <div class="pricing-table-header" >
                	
                    <h2></h2>

                    <span class="pricing-table-price">
                        <span> 와인 검색하기</span>
                    </span>
                </div>

                <ul class="pricing-table-list">
                    <li>다양한 종류의 와인을 </br>
                    찾아보세요 !
                    </li>
                    
                </ul>

                <button class="button-choose pure-button">CLICK!</button>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-3">
            <div class="pricing-table pricing-table-enterprise">
                <div class="pricing-table-header">
                    <h2></h2>

                    <span class="pricing-table-price">
                         <span>추천식당 보기</span>
                    </span>
                </div>

                <ul class="pricing-table-list">
                    <li>Vinum이 추천하는 </br>
                    와인가게 !</li>
                    
                </ul>

                <button class="button-choose pure-button">CLICK!</button>
            </div>
        </div>
    </div> <!-- end pricing-tables -->

    <div class="information pure-g">
        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">Get started today</h3>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.
                </p>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">Pay monthly or annually</h3>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ullamco laboris nisi ut aliquip ex ea commodo
                    consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse.
                </p>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">24/7 customer support</h3>
                <p>
                    Cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                </p>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">Cancel your plan anytime</h3>
                <p>
                    Duis aute irure dolor in reprehenderit in voluptate velit esse
                    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                </p>
            </div>
        </div>
    </div> <!-- end information -->
</div> <!-- end l-content -->

<%-- <div class="footer l-box">
    <p>
        <a href="#">Try now</a> for 14 days. No credit card required. Header image courtesy of <a href='http://unsplash.com/'>Unsplash</a>.
    </p>
</div> --%>

<jsp:include page="./userinterface/footer/footer.jsp"/>

</body>
</html>