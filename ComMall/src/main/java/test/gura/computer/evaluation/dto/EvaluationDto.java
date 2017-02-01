package test.gura.computer.evaluation.dto;

public class EvaluationDto {
	private int evaNum;
	private int productNum;
	private String evaTitle;
	private String evaWriter;
	private String evaContent;
	private String regdate;

	private int startRowNum; // 시작 row 번호
	private int endRowNum; // 끝 row 번호
	private int prevNum; // 이전 글의 글 번호
	private int nextNum; // 다음 글의 글 번호

	public EvaluationDto() {
	}

	public EvaluationDto(int evaNum, int productNum, String evaTitle, String evaWriter, String evaContent,
			String regdate, int startRowNum, int endRowNum, int prevNum, int nextNum) {
		super();
		this.evaNum = evaNum;
		this.productNum = productNum;
		this.evaTitle = evaTitle;
		this.evaWriter = evaWriter;
		this.evaContent = evaContent;
		this.regdate = regdate;
		this.startRowNum = startRowNum;
		this.endRowNum = endRowNum;
		this.prevNum = prevNum;
		this.nextNum = nextNum;
	}

	public int getEvaNum() {
		return evaNum;
	}

	public void setEvaNum(int evaNum) {
		this.evaNum = evaNum;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getEvaTitle() {
		return evaTitle;
	}

	public void setEvaTitle(String evaTitle) {
		this.evaTitle = evaTitle;
	}

	public String getEvaWriter() {
		return evaWriter;
	}

	public void setEvaWriter(String evaWriter) {
		this.evaWriter = evaWriter;
	}

	public String getEvaContent() {
		return evaContent;
	}

	public void setEvaContent(String evaContent) {
		this.evaContent = evaContent;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getStartRowNum() {
		return startRowNum;
	}

	public void setStartRowNum(int startRowNum) {
		this.startRowNum = startRowNum;
	}

	public int getEndRowNum() {
		return endRowNum;
	}

	public void setEndRowNum(int endRowNum) {
		this.endRowNum = endRowNum;
	}

	public int getPrevNum() {
		return prevNum;
	}

	public void setPrevNum(int prevNum) {
		this.prevNum = prevNum;
	}

	public int getNextNum() {
		return nextNum;
	}

	public void setNextNum(int nextNum) {
		this.nextNum = nextNum;
	}

}