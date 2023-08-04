package rays.equal.hashcod;

public class Employee {
	private int id = 0;
	private String name = null;
	
	public Employee(int id , String name) {
		this.id=id;
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
