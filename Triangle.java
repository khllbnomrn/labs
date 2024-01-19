package lab2;

public class Triangle extends shape implements printable{

	private double base;
	private double height;
	
	public Triangle (double height, double base)
	{
		this.height=height;
		this.base=base;
	}
	
	public double calculateArea()
	{
		return (base*height)/2;
	}
	
	public void print()
	{
		System.out.println("Triangle");
	}
}
