package by.htp.lib;

public class Student {

	String name;
	int age;
	String notebook;
	String address;
	double avgmark;

	public Student() {

	}

	public Student(String name, int age, String notebook, String address, double avgmark) {
		this.name = name;
		this.age = age;
		this.notebook = notebook;
		this.address = address;
		this.avgmark = avgmark;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Student(String name, int age, String notebook, String address) {
		this.name = name;
		this.age = age;
		this.notebook = notebook;
		this.address = address;
	}

	public Student(String name, int age, String notebook, double avgmark) {
		this.name = name;
		this.age = age;
		this.notebook = notebook;
		this.avgmark = avgmark;
	}

}
