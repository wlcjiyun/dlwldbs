package 과제.과제11;

public class ProductDto {
	
	// 필드
	private int pno;
	private String pname;
	private int pprice;
	private int pstock;
	
	// 생성자( 빈, 풀 )
	public ProductDto() {}
	public ProductDto(int pno, String pname, int pprice, int pstock) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pprice = pprice;
		this.pstock = pstock;
	}
	
	// 메소드( setter&getter | toString() )
	@Override
	public String toString() {
		return "MemberDto [pno=" + pno + ", pname=" + pname + ", pprice=" + pprice + ", pstock=" + pstock + "]";
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
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
	public int getPstock() {
		return pstock;
	}
	public void setPstock(int pstock) {
		this.pstock = pstock;
	}
}
