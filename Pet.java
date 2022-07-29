package package2;


public class Pet {
	private String name;
	private int age;
	private String location;
	private String type;
	
	public void pet() {
		name = "";
		age = 0;
		location = "";
		type = "";
	}
	
	public void pet(String nm, int age, String loc, String typ) {
		name = nm;
		this.age = age;
		location = loc;
		type = typ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}
	
	public void setLoc(String loc) {
		this.location = loc;
	}

	
	
	
	
}
