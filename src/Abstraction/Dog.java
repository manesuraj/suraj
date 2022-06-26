package Abstraction;

public class Dog extends Animal {
	
    public  void run() {
		System.out.println("Animal is running");
	}
	public  void eat() {
		System.out.println("Animal is eating");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.run();
		d.eat();

	}

}
