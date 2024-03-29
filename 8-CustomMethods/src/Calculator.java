import java.util.Scanner;

public class Calculator
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		double num1, num2;
		String operator;
		
		System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println( "Welcome to the RPN calculator with redundant methods!" );
		System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println( "Please enter two numbers, then an operator (+, -, *, /, ^): ");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		operator = input.next();
		
		input.close();
		
		switch ( operator )
		{
			case "+": System.out.println( "= " + add(num1, num2) );
			case "-": System.out.println( "= " + sub(num1, num2) );
			case "*": System.out.println( "= " + mul(num1, num2) );
			case "/": System.out.println( "= " + div(num1, num2) );
			case "^": System.out.println( "= " + exp(num1, num2) );
		}
		
	}
	
	public static double add(double a, double b)
	{
		
		return a + b;
		
	}
	
	public static double sub(double a, double b)
	{
		
		return a - b;
		
	}
	
	public static double mul(double a, double b)
	{
		
		return a * b;
		
	}
	
	public static double div(double a, double b)
	{
		
		return a / b;
		
	}
	
	public static double exp(double a, double b)
	{
		
		return Math.pow(a, b);
		
	}
}
