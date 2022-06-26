package Rev;

public class AutoPromotion {
	
	void run(int... a) {
		System.out.println("i am running");
	}
	void run(String name) {
		System.out.println("we are running");
	}

	public static void main(String[] args) {
		AutoPromotion a = new AutoPromotion();
		a.run(10,20,30,40,50);

	}

}
