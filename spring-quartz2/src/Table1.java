
public class Table1 {

	private String name;
	private String jum;
	private String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJum() {
		return jum;
	}
	public void setJum(String jum) {
		this.jum = jum;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Table1 [name=" + name + ", jum=" + jum + ", age=" + age + "]";
	}
	
	
}
