package Test;

public class MrYoo {

	public static void main(String[] args) {
		Teacher Yoo = new Teacher("유정호", (byte) 50, "Male", 185, 40, "일산", "우리대", 30, 30000, "JAVA", false);
		System.out.println(Yoo);
		System.out.println(Yoo.getHeight());
		System.out.println(Yoo.getWeight());
		Yoo.setAge((byte) 20);
		System.out.println(Yoo);

		System.out.println();
		Yoo.matching(15, "Male", "JAVASCRIPT", "일산", 0);
	}

}
