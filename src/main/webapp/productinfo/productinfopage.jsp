<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>productinfopage</title>
</head>
<body>
	<jsp:include page="../productsearch/searchbar.jsp"></jsp:include>
	<jsp:include page="./productinfoview.jsp"></jsp:include>
	<jsp:include page="./productinfoviewbuttons.jsp"></jsp:include>
</body>
</html>