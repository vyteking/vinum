package vinum.admin.poll.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vinum.ActionForward;
import vinum.VinumAction;
import vinum.admin.poll.action.PollRegistAction;
import vinum.user.login.LoginAction;
import vinum.user.logout.LogoutAction;

/**
 * Servlet implementation class PollFrontController
 */
public class PollFrontController extends HttpServlet {
	// TODO Auto-generated method stub
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	String requestURI = request.getRequestURI();
	// 요청 URL : http://localhost:8088/LoginProject/login.me
	// requestURI : /LoginProject/login.me

	String contextPath = request.getContextPath();
	// 요청 URL : http://localhost:8088/LoginProject/login.me
	// contextPath : /LoginProject

	String command = requestURI.substring(contextPath.length());
	// /login.me
	// 2. 요청별 비지니스로직 실행
	ActionForward forward = null;
	VinumAction action = null;

	if (command.equals("/pollRegist.po")) {
		action = new PollRegistAction();
		try {
			forward = action.execute(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 3.뷰페이지로 포워딩
	if (forward != null) {
		// 요청처리가 제대로되었다면..
		if (forward.isRedirect()) {
			response.sendRedirect(forward.getUrl());
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getUrl());
			dispatcher.forward(request, response);
		}
	}
	
}// doget에 요청처리.

/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
 *      response)
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	request.setCharacterEncoding("UTF-8");
	doGet(request, response);
}// Post방식으로 넘어왔을 때 한글처리를 해야하는 경우.. request.setCharacterEncoding("UTF-8");

}

