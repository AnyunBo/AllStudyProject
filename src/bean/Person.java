package bean;

/**
 * @author bingbo
 *
 */
public class Person {
	private String name;
	private int age;
	private String six;

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

	public String getSix() {
		return six;
	}

	public void setSix(String six) {
		this.six = six;
	}

	public Person(String name, int age, String six) {
		this.name = name;
		this.age = age;
		this.six = six;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		this.name = name;
	}

	public Person() {

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", six=" + six + "]";
	}

}
