package vinum.user.login;

import static vinum.JdbcUtil.*;

import java.sql.Connection;

import vinum.user.MemberDAO;

public class MemberLoginService {

	public boolean login(String memberId, String memberPasswd) {
		// TODO Auto-generated method stub
		boolean loginSuccess = false;
		Connection con = getConnection();
		MemberDAO memberDAO = MemberDAO.getInstance();
		memberDAO.setConnection(con);
		
		String loginId = memberDAO.selectLoginId(memberId,memberPasswd);
		if(loginId!=null) {
			loginSuccess =true;
		}
		close(con);
		return loginSuccess;
	}

}
