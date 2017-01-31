package test.gura.computer.qna.dto;

public class QAAnswerDto {
	private int answerNum;
	private String answerWriter;
	private String content;
	private int answerRef_num;
	private String regdate;
	
	QAAnswerDto(){}

	public QAAnswerDto(int answerNum, String answerWriter, String content, int answerRef_num, String regdate) {
		super();
		this.answerNum = answerNum;
		this.answerWriter = answerWriter;
		this.content = content;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
