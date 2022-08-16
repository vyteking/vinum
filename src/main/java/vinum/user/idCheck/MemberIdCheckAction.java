package vinum.user.idCheck;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vinum.user.idCheck.MemberIdCheckService;
import vinum.VinumAction;
import vinum.ActionForward;

public class MemberIdCheckAction implements VinumAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String memberId = request.getParameter("memberId");
		MemberIdCheckService memberIdCheckService = new MemberIdCheckService();
		
		boolean idExist = memberIdCheckService.existId(memberId);
		request.setAttribute("idExist", idExist);
		request.setAttribute("memberId", memberId);
		ActionForward forward = new ActionForward();
		forward.setUrl("idCheck.jsp");
		
		return forward;
	}

}
