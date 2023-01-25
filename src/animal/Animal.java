package animal;

public class Animal {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	 Animal(String name,int age) {
	        this.name = name;
	        this.age = age;
	 }

	 public void say() {
	    	System.out.println ( this.name + "です。"+ age + "歳です。");
	    }
}
