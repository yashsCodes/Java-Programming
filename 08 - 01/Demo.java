class Box{
    int width;
    int height;

    Box(int width){
        this(width, width);
    }

    Box(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void calculateArea(){
        int area = height*width;
        System.out.println("Area is : " + area);
    }

    public void calculatePerimeter(){
        int perimeter = 2(width+height);
        System.out.println("Perimeter is : " + perimeter);
    }
}

class Main{
    public static void main(String args[]){
        Box box1 = new Box(10);
        System.out.println(box1.width +" , "+box1.height);

        Box box2 = new Box(10,12);
        System.out.println(box2.width +" , "+box2.height);
    }
}