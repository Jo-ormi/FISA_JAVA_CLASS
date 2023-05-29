package step01class;

public class Mouse {

	// 일반적으로 필드, 메서드 순으로 작성

	// 멤버 필드
	String name;
	String country;
	int age;
	String religion;
	String address;

	// 멤버 메서드
	void sing() {
		System.out.println("찍찍");
		System.out.println(name + " 찍찍");
	}

	// 기본 생성자 - 생성자도 메서드 (특별한 메서드)
	// 생성자 이름은 클래스명과 동일해야함
	// 인스턴스 생설될 떄 사용하는 특별한 메서드
	// new 뒤에 사용할 수 있는 메서드는 생성자만 가능
	public Mouse() {
		System.out.println("defalut constructor called");
	}

	// 매개변수가 있는 생성자
	// 생성자 이름은 클래스명과 동일해야함
	public Mouse(String name, String country, int age, String religion, String address) {
			this.name = name;
			this.country = country;
			this.age = age;
			this.religion = religion;
			this.address = address;
		}

	// toString() 생기기 전까지는 주소값 리턴
	// toString() 생기면 객체 정보 원하는 형태로 리턴
	// Mouse [name=null, country=null, age=0, religion=null, address=null]
	@Override
	public String toString() {
		return "Mouse [name=" + name + ", country=" + country + ", age=" + age + ", religion=" + religion + ", address="
				+ address + "]";
	}
	
	//alt=shift+s :GeEnerate toString();
	
	

}
