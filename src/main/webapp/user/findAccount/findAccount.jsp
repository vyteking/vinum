<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./findAccountStyle.css" type="text/css">
</head>
<body>
<div class="findAccountBG" id="findAccountBG" name="findAccountBG">
	<div class="findAccountBox" id="findAccountDiv" name="findAccountDiv">
		<div class="findAccountMenus" id="findAccountMenus" name="findAccountMenus">
			<ul class="menuUL">
				<li class="menuLI"><h2 class="eachmenu" id="findAccountident" name="findAccountident">Find ID</h2></li>
				<li class="menuLI"><h2 class="eachmenu" id="findAccountPW" name="findAccountPW">Find Password</h2></li>
			</ul>
			<%--<h2 class="eachmenu" id="findAccountident" name="findAccountident">Find ID</h2>
			<h2 class="eachmenu" id="findAccountPW" name="findAccountPW">Find Password</h2>
			<div class="menuselect" id="menuselectcursor" name="menuselectcursor"></div> --%>
		</div>
		<div class="findAccountWindow" id="findAccountWindow" name="findAccountWindow">
			<form action="findID.do" method="POST" class="findAccountForm" id="findAccountidentForm" name="findAccountidentForm">
				<table class="findAccountTable" id="findAccountidentTable" name="findAccountidentTable">
					<caption class="findAccountTableTitle" id="findAccountidentTableCaption" name="findAccountidentTableCaption">Find ID</caption>
					<tr class="findAccountTableTR" id="findThroughUsername" name="findThroughUsername">
						<td class="findAccountTableTD"><label for="usernameinput" class="findAccountFormLabel" id="usernameinputlabel" name="usernameinputlabel">Username</label></td>
						<td class="findAccountTableTD"><input type="text" class="findAccountTextinput" id="findAccountUsernameinput" name="findAccountUsernameinput" required="required"></td>
					</tr>
					<tr class="findAccountTableTR" id="findThroughPhonenumber" name="findThroughPhonenumber">
						<td class="findAccountTableTD"><label for="phonenumberinput" class="findAccountFormLabel" id="phonenumberinputlabel" name="phonenumberinputlabel">Phone Number</label></td>
						<td class="findAccountTableTD"><input type="text" class="findAccountTextinput" id="findAccountPhonenumberinput" name="findAccountPhonenumberinput"></td>
					</tr>
					<tr class="findAccountTableTR" id="findThroughEMail" name="findThroughEMail">
						<td class="findAccountTableTD"><label for="emailinput" class="findAccountFormLabel" id="emailinputlabel" name="emailinputlabel">E-Mail</label></td>
						<td class="findAccountTableTD"><input type="email" class="findAccountTextinput" id="findAccountEMailinput" name="findAccountEMailinput"></td>
					</tr>
				</table>
				<div class="buttonslistDiv" id="buttonslistDiv" name="buttonslistDiv">
					<button class="findAccountButton" id="submitFindAccount" name="submitFindAccount" type="submit">Submit</button>
					<button class="findAccountButton" id="submitFindAccount" name="submitFindAccount" type="reset">Reset</button>
					<button class="findAccountButton" id="submitFindAccount" name="submitFindAccount" type="button" href="#">Cancel</button>
				</div>
			</form>
			<form action="findPassword.do" method="POST" class="findAccountForm" id="findAccountPWForm" name="findAccountPWForm">
				<table class="findAccountTable" id="findAccountidentTable" name="findAccountidentTable">
					<caption class="findAccountTableTitle" id="findAccountpasswordTableCaption" name="findAccountpasswordTableCaption">Find Password</caption>
					<tr class="findAccountTableTR" id="findThroughUsername" name="findThroughUsername">
						<td class="findAccountTableTD"><label for="usernameinput" class="findAccountFormLabel" id="usernameinputlabel" name="usernameinputlabel">Username</label></td>
						<td class="findAccountTableTD"><input type="text" class="findAccountTextinput" id="findAccountUsernameinput" name="findAccountUsernameinput" required="required"></td>
					</tr>
					<tr class="findAccountTableTR" id="findThroughIdent" name="findThroughIdent">
						<td class="findAccountTableTD"><label for="identinput" class="findAccountFormLabel" id="identinputlabel" name="identinputlabel" required="required">Ident</label></td>
						<td class="findAccountTableTD"><input type="text" class="findAccountTextinput" id="findAccountUsernameinput" name="findAccountUsernameinput"></td>
					</tr>
					<tr class="findAccountTableTR" id="findThroughPhonenumber" name="findThroughPhonenumber">
						<td class="findAccountTableTD"><label for="phonenumberinput" class="findAccountFormLabel" id="phonenumberinputlabel" name="phonenumberinputlabel">Phone Number</label></td>
						<td class="findAccountTableTD"><input type="text" class="findAccountTextinput" id="findAccountPhonenumberinput" name="findAccountPhonenumberinput"></td>
					</tr>
					<tr class="findAccountTableTR" id="findThroughEMail" name="findThroughEMail">
						<td class="findAccountTableTD"><label for="emailinput" class="findAccountFormLabel" id="emailinputlabel" name="emailinputlabel">E-Mail</label></td>
						<td class="findAccountTableTD"><input type="email" class="findAccountTextinput" id="findAccountEMailinput" name="findAccountEMailinput"></td>
					</tr>
					<tr class="findAccountTableTR" id="findThroughHintAsk" name="findThroughHintAsk">
						<td class="findAccountTableTD"><label for="passwordhintquestioninput" class="findAccountFormLabel" id="passwordhintquestioninputlabel" name="passwordhintquestioninputlabel">Hint</label></td>
						<td class="findAccountTableTD"><input type="text" class="findAccountTextinput" id="passwordhintquestioninput" name="passwordhintquestioninput"></td>
					</tr>
					<tr class="findAccountTableTR" id="findThroughHintAnswer" name="findThroughHintAnswer">
						<td class="findAccountTableTD"><label for="passwordhintanswerinput" class="findAccountFormLabel" id="passwordhintanswerinputlabel" name="passwordhintanswerinputlabel">Answer</label></td>
						<td class="findAccountTableTD"><input type="text" class="findAccountTextinput" id="passwordhintanswerinput" name="passwordhintanswerinput"></td>
					</tr>
				</table>
				<div class="buttonslistDiv" id="buttonslistDiv" name="buttonslistDiv">
					<button class="findAccountButton" id="submitFindAccount" name="submitFindAccount" type="submit">Submit</button>
					<button class="findAccountButton" id="resetFindAccount" name="resetFindAccount" type="reset">Reset</button>
					<button class="findAccountButton" id="cancelFindAccount" name="cancelFindAccount" type="button" href="#">Cancel</button>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>