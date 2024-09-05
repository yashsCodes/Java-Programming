abstract class Shape{
    abstract void printArea();
    void printSomething(){
        System.out.println("Shape");
    }
}


class Circle extends Shape{
    void printArea(){
        System.out.println("Circle Area is : ");
    }
}



class Abstraction{
    public static void main(String args[]){
        Circle circle = new Circle();
        circle.printSomething();
        circle.printArea();
    }
}