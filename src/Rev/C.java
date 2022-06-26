package Rev;

public class C extends B {
	
	void eat() {
		System.out.println(" i am eating");
	}

	public static void main(String[] args) {
		C c = new C();
		c.show();
		c.run();
		c.eat();

	}

}
