package rays.equal.hashcod;

public class TestHashEqual {
	public static void main(String[] args) {
		
		HashEqual h1= new HashEqual(01, "dipanshu");
		HashEqual h2= new HashEqual(01, "dipanshu");
		Employee e1 = new Employee(01, "shivam");
		
		
//		System.out.println(h1);
//		System.out.println(h2);
		
		System.out.println(e1.equals(h1));
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
		
	}

}
