package Day11.Ex1;

public class 실행 {
	public static void main(String[] args) {
		
		// 1. phone 객체
		Phone phone = new Phone();
		// 2. phone 객체의 인스턴스멤버 호출
		phone.color="빨강";
		System.out.println(phone.color);
		phone.bell();
		phone.sendvoice("안녕");
		// 3. phone클래스는 smartPhone 멤버 호출
			// phone.wifi;
			// * 부모객체는 자식객체의 멤버 호출 불가능
		
		
		// 1.
		SmartPhone smartPhone = new SmartPhone();
		// 2. smartPhone 클래스는 phone 멤버 호출 가능
			// * 자식객체는 부모클래스의 멤버 호출 가능
		smartPhone.color="검정";
		System.out.println(smartPhone.color);
		smartPhone.bell();
		smartPhone.sendvoice("하이");
		
		// 1. p287 자식 클래스로 객체 만들
		SmartPhone myphone = new SmartPhone("갤럭시", "흰색");
		// 2. 자식클래스로 부모클래스의 멤버 호출
		System.out.println("모델 : " + myphone.model);
		System.out.println("색상 : " + myphone.color);
		// 3. 자식클래스가 본인 멤버 호출
		System.out.println("와이파이 상태 : " + myphone.wifi);
		// 4. 자식클래스로 부모클래스의 멤버 호출
		myphone.bell();
		myphone.sendvoice("여보세요");
		myphone.receiveVoice("안녕하세요!");
		myphone.sendvoice("네네 안녕하세요");
		myphone.hangUp();
		// 5. 자식클래스 본인 호출
		myphone.setWifi(true);
		myphone.internet();
		
		/*
			자동완성 메뉴
				필드 : 필드명, 자료형, 클래스명
				메소드 : 함수명, 
		
		*/
	}
}
