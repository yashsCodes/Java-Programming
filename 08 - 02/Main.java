class Student1{
	String name;
	int age;
	
	Student1(String name, int age){
		System.out.println("Call the contructor");
		this.name = name;
		this.age = age;
	}
	
	Student1 (Student1 student){
		this.name = student.name;
		this.age = student.age;
	}
	
}

class Main{
	
	public static void main(String args[]){
		Student1 student = new Student1("Yashen", 22);
		Student1 student2 = new Student1(student);
		
		System.out.println(student.name +" "+student.age);
		System.out.println(student2.name +" "+student2.age);
	}
}
