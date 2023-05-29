package step01class;

public class DisneyWorld {

	public static void main(String[] args) {
		// 미키 마우스 생성
		// 참조 타입(Mouse) 참조변수 = new 참조타입();
		Mouse mickey = new Mouse();
		System.out.println(mickey);
		
		// name 필드에 "미키마우스" 초기와
		mickey.name = "미키마우스";
		System.out.println(mickey.name);
		System.out.println(mickey.age);
		System.out.println(mickey.country);
		
		mickey.sing();

	}

}
