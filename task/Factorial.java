package task;

import java.util.Scanner;

public class Factorial {
	public static void main(String arg[])
	{
		 Scanner scanner=new Scanner(System.in);
	        System.out.print("Enter number : ");
	        int n=scanner.nextInt();
	      
	       
		int i,multi=1;
		for(i=1;i<=n;i++)
		{
			multi = multi * i;
		}
		System.out.println(":" +multi);
	}

}