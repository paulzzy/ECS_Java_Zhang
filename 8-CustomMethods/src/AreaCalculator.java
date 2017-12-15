import java.util.Scanner;

public class AreaCalculator
{

	public static double no()
	{
		int hello = 9;
		return hello;
	}
	
	public static void main(String[] args)
	{
		
		no();
		Scanner input = new Scanner(System.in);
		
		int userShape;
		
		System.out.println( "AREA OF SHAPES CALCULATOR\n" );
		
		do
		{	
			System.out.println( "1.) Triangle" );
			System.out.println( "2.) Rectangle" );
			System.out.println( "3.) Square" );
			System.out.println( "4.) Circle" );
			System.out.println( "5.) Quit" );
			System.out.println( "Select a shape to calculate the area of by entering one of the above numbers, or enter 5 to quit: ");
			userShape = input.nextInt();
			
			switch ( userShape )
			{
				case 1:
					calcTriangleArea();
					break;
				case 2:
					calcRectangleArea();
					break;
				case 3:
					calcSquareArea();
					break;
				case 4:
					calcCircleArea();
					break;
				case 5:
					break;
				default:
					System.out.println( "\nPlease enter a number from 1 to 5." );
					break;
			}
			
		} while ( userShape != 5 );
		
		System.out.println( "You quit the program." );
		
	}
	
	public static void calcTriangleArea()
	{
		
		Scanner input = new Scanner(System.in);
		
		double base, height, triangleArea;
		
		System.out.println( "\nYou have selected triangle." );
		
		System.out.print( "Please enter the base: ");
		base = input.nextDouble();
		
		System.out.print( "Please enter the height: ");
		height = input.nextDouble();
		
		triangleArea = height * base / 2;
		
		System.out.println( "The area of your triangle is " + triangleArea + " (with base " + base + " and height " + height + ").\n" );
		
	}
	
	public static void calcRectangleArea()
	{
		
		Scanner input = new Scanner(System.in);
		
		double base, height, rectangleArea;
		
		System.out.println( "\nYou have selected rectangle.");
		
		System.out.print( "Please enter the base: ");
		base = input.nextDouble();
		
		System.out.print( "Please enter the height: ");
		height = input.nextDouble();
		
		rectangleArea = height * base;
		
		System.out.println( "The area of your square is " + rectangleArea + " (with base " + base + " and height " + height + ").\n" );
		
	}
	
	public static void calcSquareArea()
	{
		
		Scanner input = new Scanner(System.in);
		
		double length, squareArea;
		
		System.out.println( "\nYou have selected square." );
		
		System.out.print( "Please enter the length: " );
		length = input.nextDouble();
		
		squareArea = Math.pow( length, 2 );
		
		System.out.println( "The area of your triangle is " + squareArea + " (with length " + length + ").\n" );
		
	}
	
	public static void calcCircleArea()
	{
		
		Scanner input = new Scanner(System.in);
		
		double radius, circleArea;
		
		System.out.println( "\nYou have selected circle." );
		
		System.out.print( "Please enter the radius: ");
		radius = input.nextDouble();
		
		circleArea = Math.PI * Math.pow( radius, 2 );
		
		System.out.println( "The area of your circle is approximately " + circleArea + " (with radius " + radius + ").\n" );
		
	}
	
}
