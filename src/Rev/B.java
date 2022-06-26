package Rev;

public class B extends A {
	
	public void run() {
		System.out.println("i am running");
	}

	public static void main(String[] args) {
		B b = new B();
		b.run();
		b.show();

	}

}
