package prctice.Day03;

public class ProductDto {
	private String pname;
	private int pprice;
	
	public ProductDto() {}

	public ProductDto(String pname, int pprice) {
		super();
		this.pname = pname;
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "ProductDto [pname=" + pname + ", pprice=" + pprice + "]";
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	
}
