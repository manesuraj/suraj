package Rev;

public class Cat extends Animal {
	
	void run() {
		System.out.println("cat is running");
	}

	public static void main(String[] args) {
		Cat c = new Cat();
		c.run();
		c.eat();

	}

}
