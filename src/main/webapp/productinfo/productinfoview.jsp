<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./productinfoview.css">
</head>
<body>
	<div class="productinfobox" id="productinfobox">
		<p class="productinfo" id="productnumber">#</p>
		<h1 class="productinfo" id="producttitle">title</h1>
		<div class="productinfo" id="productimageslist">
			<div class="productimage" id="productimagethumbnail">image</div>
			<div class="productimage" id="productimagethumbnail">image</div>
			<div class="productimage" id="productimagethumbnail">image</div>
			<div class="productimage" id="productimagethumbnail">image</div>
		</div>
		<div class="productinfo" id="productgeneralinfobox">
			<table class="productinfo" id="productinfotable">
				<tr class="productinfotableTR" id="productcountryregion">
					<td class="productinfotableTD"><label class="productinfotablelabel" for="productcountryregion">region</label></td>
					<td class="productinfotableTD"><p class="productinfotabletext" id="productcountryregion">regionname</p></td>
				</tr>
				<tr class="productinfotableTR" id="productkind">
					<td class="productinfotableTD"><label class="productinfotablelabel" for="productkind">kind</label></td>
					<td class="productinfotableTD"><p class="productinfotabletext" id="productkind">kindname</p></td>
				</tr>
				<tr class="productinfotableTR" id="productsugarcontent">
					<td class="productinfotableTD"><label class="productinfotablelabel" for="productsugarcontent">sugarcontent</label></td>
					<td class="productinfotableTD"><p class="productinfotabletext" id="productsugarcontent">0</p></td>
				</tr>
				<tr class="productinfotableTR" id="productacidity">
					<td class="productinfotableTD"><label class="productinfotablelabel" for="productacidity">acidity</label></td>
					<td class="productinfotableTD"><p class="productinfotabletext" id="productacidity">0</p></td>
				</tr>
				<tr class="productinfotableTR" id="productbody">
					<td class="productinfotableTD"><label class="productinfotablelabel" for="productbody">body</label></td>
					<td class="productinfotableTD"><p class="productinfotabletext" id="productbody">0</p></td>
				</tr>
				<tr class="productinfotableTR" id="producttannin">
					<td class="productinfotableTD"><label class="productinfotablelabel" for="producttannin">tannin</label></td>
					<td class="productinfotableTD"><p class="productinfotabletext" id="producttannin">0</p></td>
				</tr>
				<tr class="productinfotableTR" id="productprice">
					<td class="productinfotableTD"><label class="productinfotablelabel" for="productprice">price</label></td>
					<td class="productinfotableTD"><p class="productinfotabletext" id="productprice">$</p></td>
				</tr>
				<tr class="productinfotableTR" id="productfood">
					<td class="productinfotableTD"><label class="productinfotablelabel" for="productfood">recommendable foods</label></td>
					<td class="productinfotableTD"><p class="productinfotabletext" id="productfood">foods</p></td>
				</tr>
			</table>
			<p class="productinfo" id="productdescription">description</p>
		</div>
	</div>
</body>
</html>