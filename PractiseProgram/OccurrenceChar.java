package PractiseProgram;

import java.util.Scanner;

public class OccurrenceChar {
	public static void main(String[] args)
	{
	
	 Scanner s = new Scanner(System.in);
	 System.out.print("Statement :");
     String state = s.nextLine();
     char ch = 'e';
     
     int occurrence = 0;
     
     for(int i = 0; i <state.length(); i++)
     {
    	 if(ch == state.charAt(i))
    	 {
    		 occurrence++;
    	 }
     }
     System.out.println("Occurrence of " + ch + "=" + occurrence);
	}
	
}
