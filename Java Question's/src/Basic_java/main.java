package Basic_java;

class A {
	void run() {
		System.out.println("Hello");
	}
}

class B extends A {
	void run() {
		System.out.println("Hello1");
	}
}

public class main {
	public static void main(String[] s) {

		B b = new B();
//		A a=new A();
b.run();
	}
}
