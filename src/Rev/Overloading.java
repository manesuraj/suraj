package Rev;

public class Overloading {
	
	public void run(int a,String name) {
		System.out.println("i am running");
	}
	public void run(String name,int a) {
		System.out.println("we are running");
	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.run(101,"suraj");
		

	}

}
