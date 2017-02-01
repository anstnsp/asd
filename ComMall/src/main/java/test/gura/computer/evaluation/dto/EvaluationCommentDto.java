package test.gura.computer.evaluation.dto;

public class EvaluationCommentDto {
	private int comNum;
	private String comWriter;
	private String comContent;
	private String comTarget_id; // 댓글의 대상이 되는 아이디
	private int comRef_group; // 댓글의 그룹(원 글의 num과 같음)
	private int comComment_group; // 댓글 내에서의 그룹
	private int comSort_group;
	private String regdate;

	public EvaluationCommentDto() {
	}

	public EvaluationCommentDto(int comNum, String comWriter, String comContent, String comTarget_id, int comRef_group,
			int comComment_group, int comSort_group, String regdate) {
		super();
		this.comNum = comNum;
		this.comWriter = comWriter;
		this.comContent = comContent;
		this.comTarget_id = comTarget_id;
		this.comRef_group = comRef_group;
		this.comComment_group = comComment_group;
		this.comSort_group = comSort_group;
		this.regdate = regdate;
	}

	public int getComNum() {
		return comNum;
	}

	public void setComNum(int comNum) {
		this.comNum = comNum;
	}

	public String getComWriter() {
		return comWriter;
	}

	public void setComWriter(String comWriter) {
		this.comWriter = comWriter;
	}

	public String getComContent() {
		return comContent;
	}

	public void setComContent(String comContent) {
		this.comContent = comContent;
	}

	public String getComTarget_id() {
		return comTarget_id;
	}

	public void setComTarget_id(String comTarget_id) {
		this.comTarget_id = comTarget_id;
	}

	public int getComRef_group() {
		return comRef_group;
	}

	public void setComRef_group(int comRef_group) {
		this.comRef_group = comRef_group;
	}

	public int getComComment_group() {
		return comComment_group;
	}

	public void setComComment_group(int comComment_group) {
		this.comComment_group = comComment_group;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getComSort_group() {
		return comSort_group;
	}

	public void setComSort_group(int comSort_group) {
		this.comSort_group = comSort_group;
	}

}