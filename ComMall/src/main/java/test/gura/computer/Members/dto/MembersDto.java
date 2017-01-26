package test.gura.computer.Members.dto;

public class MembersDto {
	private String memberId;
	private String memberPwd;
	private String memberEmail;
	private String memberPhone;
	private String memberAddr;
	private String regdate;
	
	public MembersDto(){};

	public MembersDto(String memberId, String memberPwd, String memberEmail, String memberPhone, String memberAddr,
			String regdate) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddr = memberAddr;
		this.regdate = regdate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddr() {
		return memberAddr;
	}

	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	};
	
	
	
}
