package PractiseProgram;

import java.util.Scanner;

public class ReverseString {
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Word :");
		String word = s.nextLine();
		
		word = word.trim();
		String reverse = "";
		
		char[] ch=word.toCharArray();
		
		for (int i = ch.length -1; i >= 0; i--)
		{
			reverse += ch [i]; 
		}
		
		System.out.println(" Reverse :" + reverse.trim());
		
	}

}
