
public class Info {
	private Integer age;
	private String name;
	
	public Info(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Integer getAgse() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Info [age=" + age + ", name=" + name + "]";
	}

	
	public int compareTo(Object o) {
		Info info=(Info)o;
		   return this.getName().compareTo(info.getName());
	}
	
	

}

