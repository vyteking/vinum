<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./productinfoviewbuttons.css">
</head>
<body>
	<div class="productinfoviewoptionslist" id="productinfoviewoptionslist">
		<button class="optionbutton" id="wineinfoeditbutton" formaction="./productinfoedit.jsp">Edit</button>
		<button class="optionbutton" id="wineinfodeletebutton" formaction="productinfodelete.vin">Delete</button>
	</div>
</body>
</html>