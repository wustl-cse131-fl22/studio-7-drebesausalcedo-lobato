package studio7;

public class Rectangle {

	private double width;
	private double length;
	private double area;
	private double perimeter;

	public Rectangle(double initwidth, double initlength) {
		width = initwidth;
		length = initlength;
		area = width * length;
		perimeter = 2 * width + 2 * length;
	}

	/*
	 * Decide wether it is smaller than another rectangle
	 */
	public boolean sizeTest(double otherArea) {
		if (area < otherArea) {
			return true;
		} else {
			return false;
		}
	}
	/*
	 * Decide wether it is a square 
	 */
	public boolean square() {
		if (width== length) {
			return true;
		}
		else {
			return false;
		}
	}
	public double getArea()
	{
		return area;
	}
	public double getPerimeter()
	{
		return perimeter;
	}
	 // toString() method
    public String toString() 
    { 
      return "area "+ area + " perimeter " + perimeter;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Rectangle r1= new Rectangle(3,4);
	Rectangle r2 = new Rectangle(5,5);
	
	System.out.println("is r1 smaller than r2"+ r1.sizeTest(r2.getArea()));
	System.out.println("is r1 a square"+ r1.square());
	System.out.println("is r2 a square"+ r2.square());
	System.out.println(r1);
	System.out.println(r2);
	
	
	}

}
