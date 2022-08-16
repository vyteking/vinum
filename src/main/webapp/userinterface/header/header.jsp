<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="/css/pure/pure-min.css">
	<link rel="stylesheet" href="/css/pure/grids-responsive-min.css">
	<link rel="stylesheet" href="/layouts/pricing/styles.css">
</head>
<body>
<div class="pure-menu pure-menu-horizontal">
    <a href="#" class="pure-menu-heading">
    	<img src = "images/Logo.jpg" width = "300" height = "50"/>
    </a>
    <ul class="pure-menu-list">
        <li class="pure-menu-item"><a href="#" class="pure-menu-link">Home</a></li>
        <%if(session.getAttribute("loginId") == null){ %>
        <li class="pure-menu-item pure-menu-selected"><a href="./user/login/loginpage.jsp" class="pure-menu-link">Login</a></li>
        <%}
        else{
        %>
         <li class="pure-menu-item pure-menu-selected"><a href="/vinum/logout.lo" class="pure-menu-link">Logout</a></li>
        <%
        }
        %>
        <li class="pure-menu-item"><a href="#" class="pure-menu-link">Contact</a></li>
    </ul>
</div>
</body>
</html>