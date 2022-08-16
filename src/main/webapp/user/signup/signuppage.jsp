<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./signuppagestyle.css" type="text/css">
<title>Insert title here</title>
</head>
<body>
<div class="signupBG" id="signupBG" name="signupBG">
	<form action="signup.do" method="POST" class="signupform" id="signupform" name="signupform">
		<div class="signupbox" id="signupboxdiv" name="signupboxdiv">
			<div class="signupboxlabel" id="signupboxtitle" name="signupboxtitle">
				<label class="signupboxlabel" id="signupboxtitle" name="signupboxtitle">Join</label>
			</div>
			<table class="signuptable" id="signuptable" name="signuptable">
				<tr class="signuptableTR" id="signupident" name="signupident">
					<td class="signuptableTD"><label for="identHere" class="signupboxlabel">ID</label></td>
					<td class="signuptableTD"><input type="text" class="signuptextinput" id="identHere" name="identHere" placeholder="ID here" required/><br>
					<a href="#" id="confirmIDDuplication" name="confirmIDDuplication">Confirm ID Duplication</a></td>
				</tr>
				<tr class="signuptableTR" id="signupidentconfirm" name="signupidentconfirm">
					<td class="signuptableTD"><label for="identconfirmHere" class="signupboxlabel">Confirm ID</label></td>
					<td class="signuptableTD"><input type="text" class="signuptextinput" id="identconfirmHere" name="identconfirmHere" placeholder="Confirm ID" required/></td>
				</tr>
				<tr class="signuptableTR" id="signuppassword" name="signuppassword">
					<td class="signuptableTD"><label for="passwordHere" class="signupboxlabel">Password</label></td>
					<td class="signuptableTD"><input type="password" class="signuptextinput" id="passwordHere" name="passwordHere" placeholder="Password Here" required/></td>
				</tr>
				<tr class="signuptableTR" id="signuppasswordconfirm" name="signuppasswordconfirm">
					<td class="signuptableTD"><label for="passwordconfirmHere" class="signupboxlabel">Confirm Password</label></td>
					<td class="signuptableTD"><input type="password" class="signuptextinput" id="passwordconfirmHere" name="passwordconfirmHere" placeholder="Confirm Password" required /></td>
				</tr>
				<tr class="signuptableTR" id="signupnickname" name="signupnickname">
					<td class="signuptableTD"><label for="nicknameHere" class="signupboxlabel">Nickname</label></td>
					<td class="signuptableTD"><input type="text" class="signuptextinput" id="nicknameHere" name="nicknameHere" placeholder="Nickname Here"/></td>
				</tr>
				<tr class="signuptableTR" id="signupEMail" name="signupEMail">
					<td class="signuptableTD"><label for="emailHere" class="signupboxlabel">E-Mail</label></td>
					<td class="signuptableTD"><input type="email" class="signuptextinput" id="emailHere" name="emailHere" placeholder="E-Mail Here"/></td>
				</tr>
				<tr class="signuptableTR" id="signupphonenumber" name="signupphonenumber">
					<td class="signuptableTD"><label for="phonenumberHere" class="signupboxlabel">Phone Number</label></td>
					<td class="signuptableTD"><input type="text" class="signuptextinput" id="phonenumberHere" name="phonenumberHere" placeholder="Phone Number Here"/></td>
				</tr>
			</table>
			<table class="signupboxBtnDiv" id="signupboxbuttonslist" name="signupboxbuttonslist">
				<tr>
					<td><button class="signupboxbuttons" id="submitSignup" name="submitsignup" type="submit">signup</button></td>
					<td><button class="signupboxbuttons" id="resetSignup" name="resetsignup" type="reset">reset</button></td>
					<td><button class="signupboxbuttons" id="cancelSignup" name="resetsignup" type="button" href="#">cancel</button></td>
				</tr>
			</table>
		</div>
	</form>
</div>
</body>
</html>