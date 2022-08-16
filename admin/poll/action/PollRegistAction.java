package vinum.admin.poll.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vinum.ActionForward;
import vinum.VinumAction;
import vinum.admin.poll.service.PollRegistService;
import vinum.admin.poll.vo.PollVO;

public class PollRegistAction implements VinumAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String pollAnswer = request.getParameter("pollAnswer");
		//...
		
		PollVO pollVO = new PollVO();
		pollVO.setPollAnswer(pollAnswer);
		//...
		
		
		PollRegistService pollRegistService = new PollRegistService();
		boolean registSuccess = pollRegistService.registPoll(pollVO);
		
		ActionForward forward = null;
		if(registSuccess) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setUrl("pollList.po");
		}
		else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('등록실패')");
			out.println("history.back()");
			out.println("</script>");
		}
		return forward;
	}

}
