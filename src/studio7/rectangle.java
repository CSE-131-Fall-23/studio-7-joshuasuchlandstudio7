package studio7;

public class rectangle {

	private double rectangleLength = 0;
	private double rectangleWidth = 0;
	private boolean isSquare = false;
	
	public rectangle(double length, double width) {
		rectangleLength = length;
		rectangleWidth = width;
		if (rectangleLength == rectangleWidth) {
			isSquare = true;
		}
	}
	
	public double area() {
		double area = rectangleLength*rectangleWidth;
		return area;
	}
	
	public double perimeter() {
		double perimeter = 2*rectangleLength + 2*rectangleWidth;
		return perimeter;
	}
	
	public boolean isSquare() {
		return isSquare;
	}
	
	public  boolean compareSize(rectangle r1) {
		if (this.area() > r1.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangle one = new rectangle(5, 4);
		rectangle two = new rectangle(5, 5);
		System.out.println(one.area());
		System.out.println(one.perimeter());
		System.out.println("square?" + two.isSquare());
		System.out.println("Is rectangle one bigger than rectangle two: " + one.compareSize(two));
	}

}
