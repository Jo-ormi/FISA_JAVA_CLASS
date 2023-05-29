package step04settergetter;

public class MouseTest2 {

	public static void main(String[] args) {
		// 검은색 미키 마우스 생성
		Mouse2 mickey = new Mouse2("black");
		
		// 지브리 직원이 디즈니에 침투
		// Mouse 클래스의 color 필드는 비공개 상태라 접근할 수 없음
//		mickey.color = "white"; // The field Mouse2.color is not visible
//		System.out.println(mickey.color); //The field Mouse2.color is not visible
		
		mickey.setColor("white");
		System.out.println(mickey.getColor());
		
	}

}
