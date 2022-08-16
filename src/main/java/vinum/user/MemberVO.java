package vinum.user;
//DTO ���ҵ� ���� �ϰ� ����
public class MemberVO {
	private String memberId; //�ĺ���
	private String memberPassword;
	private String membernickname;
	private String memberEmail;
	private String memberphone;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	/**
	 * @return the membernickname
	 */
	public String getMembernickname() {
		return membernickname;
	}
	/**
	 * @param membernickname the membernickname to set
	 */
	public void setMembernickname(String membernickname) {
		this.membernickname = membernickname;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	/**
	 * @return the memberphone
	 */
	public String getMemberphone() {
		return memberphone;
	}
	/**
	 * @param memberphone the memberphone to set
	 */
	public void setMemberphone(String memberphone) {
		this.memberphone = memberphone;
	}
}
