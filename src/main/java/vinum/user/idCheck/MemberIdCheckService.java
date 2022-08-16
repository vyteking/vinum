package vinum.user.idCheck;

import static vinum.JdbcUtil.*;

import java.sql.Connection;

import vinum.user.MemberDAO;
public class MemberIdCheckService {

	public boolean existId(String memberId) {
		// TODO Auto-generated method stub
		boolean existId =false;
		Connection con = getConnection();
		MemberDAO memberDAO = MemberDAO.getInstance();
		memberDAO.setConnection(con);
		
		String existMemberId = memberDAO.selectExistMemberId(memberId);
		if(existMemberId != null) {
			existId =true;	
		}
		close(con);
		return existId;
	}

}
