package demo.javalang;

public class MySecondApp {

	public static void main(String[] args) {
		System.out.println("Hello World");
		AnotherClass.hello();
	}
}

class AnotherClass {
	static void hello() {
		System.out.println("Hello from AnotherClass");
	}
}