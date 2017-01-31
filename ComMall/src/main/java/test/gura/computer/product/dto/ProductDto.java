package test.gura.computer.product.dto;

public class ProductDto {
	private int productNum;
	private String productName;
	private String brand;
	private String content;
	private int price;
	private int viewCount;
	private String regdate;
	
	private String saveFileName;	//파일 시스템에 저장된 파일명
	private long fileSize;			//파일의 크기 byte
	
	private int startRowNum; //시작 row 번호
	private int endRowNum;   //끝 row 번호
	private int prevNum;     //이전 글의 글번호
	private int nextNum;     //다음 글의 글번호 
	
	
	public ProductDto(){}


	public ProductDto(int productNum, String productName, String brand, String content, int price, int viewCount,
			String regdate, String saveFileName, long fileSize, int startRowNum, int endRowNum, int prevNum,
			int nextNum) {
		super();
		this.productNum = productNum;
		this.productName = productName;
		this.brand = brand;
		this.content = content;
		this.price = price;
		this.viewCount = viewCount;
		this.regdate = regdate;
		this.saveFileName = saveFileName;
		this.fileSize = fileSize;
		this.startRowNum = startRowNum;
		this.endRowNum = endRowNum;
		this.prevNum = prevNum;
		this.nextNum = nextNum;
	}


	public int getProductNum() {
		return productNum;
	}


	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getViewCount() {
		return viewCount;
	}


	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}


	public String getSaveFileName() {
		return saveFileName;
	}


	public void setSaveFileName(String saveFileName) {
		this.saveFileName = saveFileName;
	}


	public long getFileSize() {
		return fileSize;
	}


	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
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
	