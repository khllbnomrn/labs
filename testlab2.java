package lab2;
import java.util.*;

public class test {

	public static void main(String[] args) {
		
		Scanner std = new Scanner(System.in);
		
		System.out.print("input Circle radius : ");
		int radius=std.nextInt();
		System.out.print("input Rectangle length : ");
		int Rlength=std.nextInt();
		System.out.print("input Rectangle height : ");
		int Rheight=std.nextInt();
		System.out.print("input Square side : ");
		int Sqside=std.nextInt();
		System.out.print("input Triangle base : ");
		int Tbase=std.nextInt();
		System.out.print("input Triangle height : ");
		int Theight=std.nextInt();
		
		Circle circle = new Circle(radius);
		Triangle triangle = new Triangle(Theight,Tbase);
		Square square = new Square(Sqside);
		Rectangle rectangle = new Rectangle(Rheight,Rlength);
		
		shape[] shapes ={circle, triangle,rectangle, square};
		
		for (int i=0; i<shapes.length;i++)
		{
			if (shapes[i] instanceof printable)
			{
				System.out.println(shapes[i].calculateArea());
				if (shapes[i] instanceof Circle)
				{
				((Circle)shapes[i]).print();
				}
				if (shapes[i] instanceof Rectangle)
				{
				((Rectangle)shapes[i]).print();
				}
				if (shapes[i] instanceof Triangle)
				{
				((Triangle)shapes[i]).print();
				}
				if (shapes[i] instanceof Square)
				{
				((Square)shapes[i]).print();
				}
		
			}
			
			
		}
		
	}

}
