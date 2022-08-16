package vinum.user.login;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vinum.VinumAction;
import vinum.ActionForward;

public class LoginAction implements VinumAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("memberId");
		String passwd = request.getParameter("memberPasswd");
		
		System.out.println("id = " + id);
		System.out.println("passwd = " + passwd);
		
		MemberLoginService memberLoginService = new MemberLoginService();
		
		boolean loginSuccess = memberLoginService.login(id,passwd);
		ActionForward forward = null;
		
		if(loginSuccess) {
			HttpSession session = request.getSession();
			session.setAttribute("loginId",id);
			forward = new ActionForward();
			forward.setUrl("/vinum/index.jsp");
			forward.setRedirect(true);
		}else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('로그인실패')");
			out.println("history.back()");
			out.println("</script>");
		}
		return forward;
	}

}
