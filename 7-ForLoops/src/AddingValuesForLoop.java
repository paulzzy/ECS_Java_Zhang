import java.util.Scanner;

public class AddingValuesForLoop { public static void main(String[] args) {Scanner input = new Scanner(System.in);
		
		int userNum = input.nextInt();
		long total = 0;
		
		input.close();
		
		for ( int i = 0; i <= userNum; i++ )
		{
			System.out.print( i + " " );
			total += i;
		}
		
		System.out.println( "\nTotal is " + total + "." );
	}
	
}
