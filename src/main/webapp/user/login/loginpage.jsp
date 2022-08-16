<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./loginpagestyle.css" type="text/css">
<title>Login</title>
</head>
<body>
<div class="loginBG" id="loginBG" name="loginBG">
	<form action="/vinum/login.lo" method="POST" class="loginform" id="loginform" name="loginform">
		<div class="loginbox" id="loginboxdiv" name="loginboxdiv">
			<div class="loginboxlabel" id="loginboxtitleDiv" name="loginboxtitle">
				<label class="loginboxlabel" id="loginboxtitle" name="loginboxtitle">Login</label>
			</div>
			<table class="logintable" id="logintable" name="logintable">
				<tr class="logintableTR" id="loginident" name="loginident">
					<td class="logintableTD"><label for="identHere" class="loginboxlabel">ID</label></td>
					<td class="logintableTD"><input type="text" class="logintextinput" id="identHere" name="memberId" placeholder="ID here"/></td>
				</tr>
				<tr class="logintableTR" id="loginpassword" name="loginpassword">
					<td class="logintableTD"><label for="passwordHere" class="loginboxlabel">Password</label></td>
					<td class="logintableTD"><input type="password" class="logintextinput" id="passwordHere" name="memberPasswd" placeholder="Password Here"/></td>
				</tr>
			</table>
			<%-- 
			<div class="loginbox" id="loginident" name="loginident">
				<label for="identHere" class="loginboxlabel">ID</label>
				<input type="text" id="identHere" name="identHere" placeholder="ID here"/>
			</div>
			<div class="loginbox" id="loginpassword" name="loginpassword">
				<label for="passwordHere" class="loginboxlabel">Password</label>
				<input type="password" id="passwordHere" name="passwordHere" placeholder="Password Here"/>
			</div>--%>
			<table class="loginboxBtnDiv" id="loginboxbuttonslist" name="loginboxbuttonslist">
				<tr>
					<td><button class="loginboxbuttons" id="submitLogin" name="submitLogin" type="submit">login</button></td>
					<td><button class="loginboxbuttons" id="resetLogin" name="resetLogin" type="reset">reset</button></td>
				</tr>
				<tr>
					<td><button class="loginboxbuttons" id="signupBtn" name="signupBtn" type="button" formaction="signuppage.do">singup</button></td>
					<td><button class="loginboxbuttons" id="findAccountBtn" name="findAccountBtn" type="button" formaction="#">find account</button></td>
				</tr>
			</table>
		</div>
	</form>
</div>
</body>
</html>