package Day11.Ex7;
import java.util.ArrayList;

import Day11.Ex6.HankookTire;
import Day11.Ex6.KumhoTire;
import Day11.Ex6.Tire;
public class 실행2 {
	public static void main(String[] args) {
		
		
		Tire tire = new Tire();
		KumhoTire kumhoTire = new KumhoTire();
		HankookTire hankookTire = new HankookTire();
		
		// 1. 참조 타입의 자동 타입 변환
		Tire temp = tire;
			Tire temp2 = kumhoTire;
				Tire temp3 = hankookTire;
					Object temp4 = temp3;
					
		// 2. 강제 타입 변환
		Tire tire2 = (Tire)temp4;
		KumhoTire kumhoTire2 = (KumhoTire)tire;
			HankookTire hankookTire2 = (HankookTire)tire;
		
		// 3. 매개변수, 리턴타입
		Tire result = 함수1( kumhoTire2 );
		KumhoTire result2 = (KumhoTire) 함수2( (KumhoTire)temp2 );
		
		// 4. 배열, ArrayList : 동일한 타입만 가능
		ArrayList<KumhoTire> kumhoList = new ArrayList<>();
		kumhoList.add(kumhoTire);		// O
		//kumhoList.add(hankookTire); 	// X
		//kumhoList.add(tire);	 		// X
		// ------->
		ArrayList<Tire> TireList = new ArrayList<>();
		TireList.add(kumhoTire);	// O
		TireList.add(hankookTire);	// O
		TireList.add(tire);			// O
	}
	public static KumhoTire 함수1( Tire tire ) {return new KumhoTire();}
	public static Tire 함수2(KumhoTire kumhoTire) {return new Tire();}
}
