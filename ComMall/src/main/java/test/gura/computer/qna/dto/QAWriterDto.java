 package test.gura.computer.qna.dto;

public class QAWriterDto {
	private int writerNum;
	private String writerMainquestion;
	private String writerDetailquestion;
	private String writerWriter;
	private String regdate;
	
	private int startRowNum;	// 시작 row 번호
	private int endRowNum;		// 끝 row 번호
	private int prevNum;		// 이전 글의 글번호
	private int nextNum;		// 다음 글의 글번호
	
	public QAWriterDto(){}

	public QAWriterDto(int writerNum, String writerMainquestion, String writerDetailquestion, String writerWriter,
			String regdate, int startRowNum, int endRowNum, int prevNum, int nextNum) {
		super();
		this.writerNum = writerNum;
		this.writerMainquestion = writerMainquestion;
		this.writerDetailquestion = writerDetailquestion;
		this.writerWriter = writerWriter;
		this.regdate = regdate;
		this.startRowNum = startRowNum;
		this.endRowNum = endRowNum;
		this.prevNum = prevNum;
		this.nextNum = nextNum;
	}

	public int getWriterNum() {
		return writerNum;
	}

	public void setWriterNum(int writerNum) {
		this.writerNum = writerNum;
	}

	public String getWriterMainquestion() {
		return writerMainquestion;
	}

	public void setWriterMainquestion(String writerMainquestion) {
		this.writerMainquestion = writerMainquestion;
	}

	public String getWriterDetailquestion() {
		return writerDetailquestion;
	}

	public void setWriterDetailquestion(String writerDetailquestion) {
		this.writerDetailquestion = writerDetailquestion;
	}

	public String getWriterWriter() {
		return writerWriter;
	}

	public void setWriterWriter(String writerWriter) {
		this.writerWriter = writerWriter;
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
