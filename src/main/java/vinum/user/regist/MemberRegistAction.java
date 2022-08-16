package vinum.user.regist;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vinum.VinumAction;
import vinum.user.login.MemberLoginService;
import vinum.user.regist.MemberRegistService;
import vinum.ActionForward;
import vinum.user.MemberVO;

public class MemberRegistAction implements VinumAction {
	private String registerrormessage = "등록실패";
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("memberId");
		String passwd = request.getParameter("memberPasswd");
		String name = request.getParameter("membernickname");
		String email = request.getParameter("memberEmail");
		String phone = request.getParameter("memberphone");
		
		MemberVO newMemberVO = new MemberVO();
		newMemberVO.setMemberId(id);
		newMemberVO.setMemberPassword(passwd);
		newMemberVO.setMembernickname(name);
		newMemberVO.setMemberEmail(email);
		newMemberVO.setMemberphone(phone);
		
		MemberRegistService memberRegistService = new MemberRegistService();
		boolean registSuccess = memberRegistService.registMember(newMemberVO);

		ActionForward forward = null;
		response.setContentType("text/html;charset=UTF-8");
		if (registSuccess) {
			HttpSession session = request.getSession();
			session.setAttribute("loginId", id);
			forward = new ActionForward();
			forward.setUrl("index.jsp");
			forward.setRedirect(true);
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert(\""+registerrormessage+"\")");
			out.println("history.back()");
			out.println("</script>");
		}

		return forward;
	}

}
