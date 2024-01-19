package lab2;

public class Square extends Rectangle implements printable {


	private double side;
	
	public Square (double side)
	{
		super(side,side);
		
	}
	

	public void print()
	{
		System.out.println("Square");
	}
}
