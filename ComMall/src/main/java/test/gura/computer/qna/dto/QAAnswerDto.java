package test.gura.computer.qna.dto;

public class QAAnswerDto {
	private int answerNum;
	private String answerWriter;
	private String answerContent;
	private int answerRef_num;
	private String regdate;
	
	public QAAnswerDto(){}

	public QAAnswerDto(int answerNum, String answerWriter, String answerContent, int answerRef_num, String regdate) {
		super();
		this.answerNum = answerNum;
		this.answerWriter = answerWriter;
		this.answerContent = answerContent;
		this.answerRef_num = answerRef_num;
		this.regdate = regdate;
	}

	public int getAnswerNum() {
		return answerNum;
	}

	public void setAnswerNum(int answerNum) {
		this.answerNum = answerNum;
	}

	public String getAnswerWriter() {
		return answerWriter;
	}

	public void setAnswerWriter(String answerWriter) {
		this.answerWriter = answerWriter;
	}

	public String getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	public int getAnswerRef_num() {
		return answerRef_num;
	}

	public void setAnswerRef_num(int answerRef_num) {
		this.answerRef_num = answerRef_num;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	
	
	
}
