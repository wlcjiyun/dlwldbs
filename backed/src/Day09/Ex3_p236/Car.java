package Day09.Ex3_p236;

/*
	return : 메소드의 실행을 강제 종료 후 호출했던 곳으로 돌아감
	
*/
public class Car { // 클래스 [ JVM 메소드영역 로드]
	
	// 1. 필드
	int gas;
	
	// 2. 생성자
	Car(){}
	Car(int gas){this.gas = gas;}
	
	// 3. 메소드
		// 1. 리턴타입 X / 인수 O [int형 매개변수]
		void setGas(int gas) { // gas 필드에 데이터를 저장하는 함수
			this.gas = gas;
		}
		// 2. 리턴타입 O / 인수 X
		boolean isLeftGas() { // gas의 여부 확인 함수
			if(gas == 0) {
				System.out.println("gas가 없습니다");
				return false;
			}
			System.out.println("gas가 있습니다");
			return true;
		}
		// 3. 리턴타입 X / 인수 X
		void run() { // 자동차 달리는(gas=0일때까지) 함수
			while(true) { // 무한루프 ( 종료조건 : gas = 0 이면 return )
				if(gas>0) { // 만약에 gas가 0보다 크면
					System.out.println("달립니다.(gas의 잔량 " + gas + ")");
					gas--; // gas 줄이기
				}else {
					System.out.println("멈춥니다.(gas잔령 " + gas + ")");
					return; // 함수 종료 == while문 종료
				}
			}
		}
}
