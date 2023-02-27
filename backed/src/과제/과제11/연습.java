package 과제.과제11;

import java.util.ArrayList;

public class 연습 {

	public static void main(String[] args) {
		
		
		// 
		String 이름1 = "강호동";
		String 이름2 = "강호동";
		String 이름3 = "강호동";
		String 이름4 = "강호동";
		String 이름5 = "강호동";
		
		// 동일한 타입 여러개를 한곳에 저장  배열vs 리스트 
		String[] 배열 = new String[5];
		
			배열[0] = 이름1;
			배열[1] = 이름2;
			배열[2] = 이름3;
			배열[3] = 이름4;
			배열[4] = 이름5;
			

			
		ArrayList< String > 리스트 = new ArrayList<>();
		
			리스트.add( 이름1 );
			리스트.add( 이름2 );
			리스트.add( 이름3 );
			리스트.add( 이름4 );
			리스트.add( 이름5 );
			
			리스트.get(0);
		// DTO 객체 1개 ---> 여러개 일때 한곳에 담기		
			ProductDto dto1 = new ProductDto();
			ProductDto dto2 = new ProductDto();
			ProductDto dto3 = new ProductDto();
			ProductDto dto4 = new ProductDto();
			ProductDto dto5 = new ProductDto();
			
			
			ProductDto[] 배열2 = new ProductDto[5];
			ArrayList< ProductDto > 리스트2 = new ArrayList<>();
			
			
		// 리스트 혹은 배열내 모든 항목 호출 방법2가지
			// 1.  for 
			for( int i = 0 ; i< 리스트2.size() ; i++ ) {
				리스트.get(i).toString();
			}
			// 2.  향상된 for 
			for( ProductDto dto : 리스트2 ) {
				dto.toString();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}
	
	
}
