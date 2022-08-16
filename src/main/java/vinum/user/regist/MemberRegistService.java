package vinum.user.regist;

import vinum.user.MemberDAO;
import vinum.user.MemberVO;

import static vinum.JdbcUtil.*;

import java.sql.Connection;

public class MemberRegistService {

	public boolean registMember(MemberVO newMemberVO) {
		// TODO Auto-generated method stub
		boolean registSuccess = false;
		Connection con = getConnection();
		MemberDAO memberDAO = MemberDAO.getInstance();
		memberDAO.setConnection(con);
		
		int insertCount = memberDAO.insertMember(newMemberVO);
		
		if(insertCount > 0) {
			commit(con);
			registSuccess = true;
		}
		else {
			rollback(con);
		}
		close(con);
		
		return registSuccess;

	}

}
