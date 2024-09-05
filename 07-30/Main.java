import java.util.Scanner;
class Main{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius : ");
		double userInput = input.nextDouble();
		
		Area area = new Area(userInput);
		
		
	}
	
}

class Area{
	static final double PI = 22/7;
	double radius;
	double area;
	
	Area(double radius){
		this.radius = radius;
		 area = PI * radius * radius;
		 System.out.println(area);
	}
}