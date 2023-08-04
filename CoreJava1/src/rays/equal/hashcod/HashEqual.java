package rays.equal.hashcod;

public class HashEqual {
	
	private int id = 0;
	private String name = null;
	private String address= null;
	
	
	public HashEqual(int id, String name ) {
		
		this.id=id;
		this.name= name;
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
	@Override
	public String toString() {
		
		return id+" "+name;
	}
@Override
	public boolean equals(Object obj) {
	if(!(obj instanceof HashEqual)) {
		return true;
	}
	
		HashEqual h = (HashEqual) obj;
		boolean b= this.id==h.id && this.name==h.name;
		return b;
		
		
	}@Override
	public int hashCode() {
	String str = this.id + this.name + this.address;
	
		return str.hashCode();
	}
	
}
