class CalculateArea{
	void calculateCircleArea(double width, double height){
		double area = width * height;
		System.out.println(area);
	}
}

class Area extends CalculateArea{
	
}

class Inheritance{
	
	public static void main(String args[]){
		Area area = new Area();
		area.calculateCircleArea(12,30);
	}
}