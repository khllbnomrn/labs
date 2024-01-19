package lab2;

public class Rectangle extends shape implements printable{
	
	private double length;
	private double height;
	
	public Rectangle (double height, double length)
	{
		this.height=height;
		this.length=length;
	}
	
	public double calculateArea() 
	{
		return height*length;
	}
	
	public void print()
	{
		System.out.println("Rectangle");
	}
	

}
