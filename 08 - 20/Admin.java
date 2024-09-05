class Student{
	private String name;
	private int age;
	private int year;
	private double grade; 
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		if(age >0 && age < 100){
			this.age = age;
		}else{
			System.out.println("Age Cant be less than 0 and more than 100.");
		}
		
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setGrade(double grade){
		if(grade < 4){
			this.grade = grade;
		}else{
			System.out.println("Grade Cant be more than 4");
		}
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getYear(){
		return year;
	}
	
	public double getGrade(){
		return grade;
	}
}

class Admin{
	public static void main(String args[]){
		Student student = new Student();
		student.setName("Pasindu");
		student.setAge(22);
		student.setYear(1);
		student.setGrade(3.9);
		
		System.out.println("Name : "+student.getName());
		System.out.println("Age : "+student.getAge());
		System.out.println("Year : "+student.getYear());
		System.out.println("Grade : "+student.getGrade());
		
	}
}