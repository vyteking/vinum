package vinum.admin.poll.service;

import static vinum.JdbcUtil.*;

import java.sql.Connection;

import vinum.admin.poll.vo.PollVO;
import vinum.poll.PollDAO;
import vinum.user.MemberDAO;

public class PollRegistService {
	
	public boolean registPoll(PollVO pollVO) {
		// TODO Auto-generated method stub
		boolean registSuccess = false;
		Connection con = getConnection();
		PollDAO pollDAO = PollDAO.getInstance();
		pollDAO.setConnection(con);
		
		int insertCount = pollDAO.insertPollAdmin(pollVO);
		if(insertCount > 0) {
			commit(con);
			registSuccess = true;
		}
		else {
			rollback(con);
		}
		return registSuccess;
	}

}
