package vinum.user.logout;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vinum.VinumAction;
import vinum.ActionForward;

public class LogoutAction implements VinumAction{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ActionForward forward = null;
		HttpSession session =  request.getSession();
	    session.invalidate();
	    //response.sendRedirect("index.jsp");
		forward = new ActionForward();
		forward.setUrl("/vinum/index.jsp");
		forward.setRedirect(true);
		
		return forward;
	}
}
