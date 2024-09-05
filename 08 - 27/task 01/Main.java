abstract class Employee{
    String name;
    double salary;
    String address;
    int age;

    Employee(String name, double salary, String address, int age){
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.age = age;
    }
    abstract void calculateSalary();
    abstract void displayEmployeeDetails();

}

class Manager extends Employee{

    Manager(String name, double salary, String address, int age){
        super(name,salary,address,age);
    }

    void calculateSalary(){
        this.salary = ((salary/100)*15) + salary;
        
    }
    void displayEmployeeDetails(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Age  : "+age);
        System.out.println("Salary : "+salary);
    }
}

class Worker extends Employee{

    Worker(String name, double salary, String address, int age){
        super(name,salary,address,age);
    }

    void calculateSalary(){
        this.salary = ((salary/100)*15) + salary;
    }
    void displayEmployeeDetails(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Age  : "+age);
        System.out.println("Salary : "+salary);
    }
}


public class Main {
    public static void main(String args[]){
        Manager manager = new Manager("Yashen Fernando", 100000, "Kalutara", 22);
        manager.calculateSalary();
        manager.displayEmployeeDetails();

        System.out.println("-------------------------------------------------------");

        Worker worker = new Worker("Pasindu Kawmina", 12000, "Anuaradapura", 23);
        worker.calculateSalary();
        worker.displayEmployeeDetails();
    }
    
}
