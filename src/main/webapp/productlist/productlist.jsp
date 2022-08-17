<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>productlist</title>
</head>
<body>
	<div class="productlistBG" id="productlistBG" name="productlistBG">
		<jsp:include page="../productsearch/searchbar.jsp"></jsp:include>
		<div class="productlistDiv" id="productlistDiv" name="productlistDiv">
			<jsp:include page="./productlist_eachproduct.jsp"/>
		</div>
		<jsp:include page="./productlistadminbuttons.jsp"/>
		<jsp:include page="../userinterface/pagination/pagination.jsp"/>
	</div>
</body>
</html>