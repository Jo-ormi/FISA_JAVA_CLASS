package step02overloading;

public class OverloadingTest {

	public static void main(String[] args) {
//		오버 로딩 == 중복 정의
		Mouse jerry = new Mouse();
		
		Mouse jay = new Mouse(15);
		
		Mouse jamie = new Mouse("제이미");
		
		Mouse joo = new Mouse(15, "주");
		
//		Mouse joo = new Mouse("주", 15); 
//		컴파일러 입장에서 String, int 를 받는 생성자는 존재하지 않기 때문에 에러
		

	}

}
