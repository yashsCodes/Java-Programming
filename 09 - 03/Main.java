class Student{
    int stuNo;
    String name;

    Student(int stuNo, String name){
        this.stuNo = stuNo;
        this.name = name;
    }

    public String toString(){ 
        return "student id : " + stuNo+" , "+" name : "+name; 
    }
}

class Main{
    public static void main(String args[]){
        Student student = new Student(101,"Yashen");
        System.out.println(student);
    }
}