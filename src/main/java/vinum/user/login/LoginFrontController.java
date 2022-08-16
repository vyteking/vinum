package vinum.user.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vinum.VinumAction;
import vinum.ActionForward;
import vinum.user.idCheck.MemberIdCheckAction;
import vinum.user.logout.LogoutAction;
import vinum.user.regist.MemberRegistAction;

/**
 * Servlet implementation class MemberFrontController
 */
@WebServlet("*.lo")
public class LoginFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginFrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("login------");
		// TODO Auto-generated method stub
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

		if (command.equals("/login.lo")) {
			action = new LoginAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (command.equals("/logout.lo")) {
			action = new LogoutAction();
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
