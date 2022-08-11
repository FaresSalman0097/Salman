package co.classesinjava;

public class A2ClassStudent {

	String name;
	int age;
	char section;
	double marks;
	
	public A2ClassStudent(){
		this.name= name;
		this.age = age;
		this.section= section;
		this.marks = marks;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public String getName() {
		return name;	
	}
	public int getAge() {
		return age;
		
	}
	public char getSection() {
		return section;
		
	}
	public double getMarks() {
		return marks;
	}
	
	public static void main(String[] args) {
		A2ClassStudent salman = new A2ClassStudent();
		salman.name="Salman";
		salman.age= 28;
		salman.section ='A';
		salman.marks = 99.99;
		System.out.println(salman.getSection());
		System.out.println(salman.getMarks());
	}
}
