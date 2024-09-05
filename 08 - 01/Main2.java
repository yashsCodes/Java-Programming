class Main2{
    public static void main(String args[]){
        Yashen yashen = new Yashen();
        yashen.print();
    }
}

class Student{
    String name;
    int age;
}

class Yashen extends Student{
    public void print(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);


    }
}