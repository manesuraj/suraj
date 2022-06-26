package Abstraction;

public class App implements I1{
	
	public void display() {
		System.out.println(" i am happy");
	}
	
	public void run() {
		System.out.println("i am running");
	}

	public static void main(String[] args) {
		
		App a = new App();
		a.display();
		a.run();
	}

}
