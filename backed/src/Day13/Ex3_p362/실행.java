package Day13.Ex3_p362;

public class 실행 {
	public static void main(String[] args) {
		
		// 1. 구현 객체 만들기
		RemoteControl rc = new SmartTelevison();
		
		rc.turnOn();
		rc.turnOff();
		/* rc.search(null); */
		
		// 2. 구현 객체 교체
		Searchable searchable = new SmartTelevison();
		searchable.search("Youtube");
	}
}
