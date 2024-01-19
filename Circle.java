package lab2;

public class Circle extends shape implements printable{

		private double radius;
		
		public Circle (double radius)
		{
			this.radius=radius;
		}
		
		public double calculateArea()
		{
			return 3.14*radius*radius;
		}
		
		public void print()
		{
			System.out.println("Circle");
		}
}
