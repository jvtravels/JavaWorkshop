package PractiseProgram;

import java.util.Scanner;

public class CountvowelsConsonant {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
	      System.out.print("Enterany Alpha:");
	      String state = s.nextLine();
	      
	      int vcount=0 , ccount =0;
	      state = state.toLowerCase();
	      for (int i =0; i < state.length(); i++)
	      {
	    	  char ch = state.charAt(i);
	    	  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	    	  {
	    		  vcount++;
	    	  }
	    	  else if ((ch >= 'a' && ch <='z'))
	    	  {
	    		  ccount++;
	    	  }
	      }
	      System.out.println("no vowels: " + vcount);
	      System.out.println("no consonants: " + ccount);
	      
	}

}
