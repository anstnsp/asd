package test.gura.computer.cart.dto;

public class CartDto {
	private int idx;
	private int productNum;
	private String memberId;
	private int amount;
	private String brand;
	private String regdate;
	private String saveFileName;
	private String productName;
	private int price;
	private int money;
	
	
	
	public CartDto (){}



	public CartDto(int productNum, String memberId, int amount) {
		super();
		this.productNum = productNum;
		this.memberId = memberId;
		this.amount = amount;
	}



	public int getIdx() {
		return idx;
	}



	public void setIdx(int idx) {
		this.idx = idx;
	}



	public int getProductNum() {
		return productNum;
	}



	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}



	public String getMemberId() {
		return memberId;
	}



	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
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



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}





	
	
}
