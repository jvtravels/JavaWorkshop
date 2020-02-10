package PractiseProgram;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
    	
    	 Scanner s = new Scanner(System.in);
	      System.out.print("Enterany Alpha:");
	      char Alpha = s.next().charAt(0);
        
        if(Alpha == 'a' || Alpha == 'e' || Alpha == 'i' || Alpha == 'o' || Alpha == 'u' )
            System.out.println(Alpha + " is vowel");
        else
            System.out.println(Alpha + " is consonant");
    }
}