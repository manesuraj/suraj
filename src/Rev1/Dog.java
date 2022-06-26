package Rev1;

public class Dog extends Animal {
	
	public void eat() {
		System.out.println("dog eating meat");
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		Dog d = new Dog();
		d.eat();
		Animal c = new Dog();
		c.eat();

	}

}
