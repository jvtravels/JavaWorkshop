package PractiseProgram;

import java.util.Scanner;

public class DuplicateChar {
	public static void main(String[] args)
	{
		 Scanner s = new Scanner(System.in);
	      System.out.print("Enter any String Statement:");
	      String state = s.nextLine();
	      
	      int cnt =0;
	      
	     char[] inp = state.toCharArray();
	     System.out.println("Duplicate :");
	     
	     for (int i = 0; i <state.length(); i++)
	     {
	    	 for (int j = i +1; j <state.length(); j++)
	    	 {
	    		 if (inp [i] == inp [j])
	    		 {
	    			 System.out.println(inp[j]);
	    			 cnt++;
	    			 break;
	    		 }
	    	 }
	     }
	     
       
	}

}
