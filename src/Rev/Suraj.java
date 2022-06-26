package Rev;

public class Suraj {
	
	int id;
	String name;
	String clgName;
	
	public Suraj(int id,String name,String clgName){
		this.id=id;
		this.name=name;
		this.clgName=clgName;
	}

	public static void main(String[] args) {
		
		Suraj s = new Suraj(101,"suraj","pvpit");
		Suraj s1 = new Suraj(102,"sachin","pvpit");
		System.out.println(s.name);
		
		

	}

}
