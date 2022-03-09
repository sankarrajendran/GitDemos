package san.learn.gitproject;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> l = new ArrayList<>();
	l.add(new Student("S",1));
	l.add(new Student("P",4));
	l.add(new Student("E",2));
	l.add(new Student("V",5));
	l.add(new Student("G",3));
		
	l.stream().forEach(System.out::println);
	System.out.println("-------------------");
	l.parallelStream().forEach(System.out::println);
	}

	
	
}

class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}