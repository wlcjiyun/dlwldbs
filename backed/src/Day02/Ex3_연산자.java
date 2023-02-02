package Day02;

public class Ex3_연산자 {
	public static void main(String[] args) {
		
		// 1. 부호/증감 연산자
		int x = +10;
		int y = -10;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		System.out.println("x++ : " + (x++)); // 10
		System.out.println("x : " + x); // 11
		System.out.println("++x : " + (++x)); // 12
		
		System.out.println("y-- : " + (y--)); // -10
		System.out.println("y : " + y); // -11
		System.out.println("--y : " + (--y)); // -12
		
		// 2. 산술 연산자
		System.out.println("x+y : " + (x+y)); // 0
		System.out.println("x-y : " + (x-y)); // 20
		System.out.println("x*y : " + (x*y)); 
		System.out.println("5/3 : " + (5/3)); // 몫
		System.out.println("5%3 : " + (5%3)); // 나머지
		
		// 3. 비교 연산자
		System.out.println("x==y : " + (x==y));
		System.out.println("x!=y : " + (x!=y));
		System.out.println("x>y : " + (x>y));
		System.out.println("x<y : " + (x<y));
		System.out.println("x>=y : " + (x>=y));
		System.out.println("x<=y : " + (x<=y));
		
		System.out.println("strl.equals(str2) : " + ("유재석".equals("유재석")));
		System.out.println("strl.equals(str2) : " + (!"유재석".equals("유재석")));
		
		System.out.println("5<x<20 : " + (x>5 && x<20));
		
		// 5. 대입 연산자
		int z =30;
		z += x; 
		System.out.println( "z+=x : " + (z));
		// 6. 삼항 연산자
		String 결과 = (x>=20) ? "합격" : "불합격";
		
		// 7. 연결 연산자
		String 연결문자1 = "유재석"+"10";
		String 연결문자2 = "유재석"+10;
		String 연결문자3 = "유재석"+10+20;
		String 연결문자4 = "유재석"+(10+20);
		
	}
}
