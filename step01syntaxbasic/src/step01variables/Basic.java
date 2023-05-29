package step01variables;

public class Basic {

	public static void main(String[] args) {
		// 변수의 선언, 초기화, 할당 차이
		
		// 변수의 선언 단 한번만 가능
		// 변수나 상수에 담긴 값을 읽거나 값을 새롭게 할당하기 위해서 가장 먼저 수행되어야하는 작업
		
		int a; // 정수형 타입의 변수 a 선언
		
//		System.out.println(a); // Error. variable a might not have been initialized
		
		// 변수의 초기화 - 할당의 특별한 형태, 가장 처음으로 할당한다는 의미
		a = 5;
		System.out.println(a); 
		
		
		// 변수의 할당 - 기존의 값을 새로운 값으로 변경할 때
		a = 10; // a에 담긴 5의 값을 10으로 변경(할당)
		
		// 변수의 초기화의 특징 - 선언과 함께 한 번에 사용 가능
		int b = 10; // 선언과 초기화를 동시에 수행
	}

}
