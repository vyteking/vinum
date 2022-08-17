package vinum.wineproduct;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vinum.ActionForward;
import vinum.VinumAction;
import vinum.wineproduct.winedelete.WineDeleteAction;
import vinum.wineproduct.wineinsert.WineInsertAction;
import vinum.wineproduct.winelist.SearchAction;
import vinum.wineproduct.wineupdate.WineUpdateAction;

/**
 * Servlet implementation class Winecontroller
 */
@WebServlet({ "/Winecontroller", "*.vin" })
public class Winecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Winecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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

		if (command.equals("/search.vin")) {
			action = new SearchAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (command.equals("/productinfoadd.vin")) {
			action = new WineInsertAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*else if (command.equals("/productinfoeditwindow.vin")) {
			//action = new LogoutAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		else if (command.equals("/productinfoedit.vin")) {
			action = new WineUpdateAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (command.equals("/productinfodelete.vin")) {
			action = new WineDeleteAction();
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
