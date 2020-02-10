package PractiseProgram;

import java.util.Scanner;

public class CalculateAverage {
	public static void main (String[] args)
	{
		double total = 0;
		double[] numbers = {19, 12.89, 200, 16.5, 13.7};
		
		for (int i = 0; i < numbers.length; i++)
		{
			total = total + numbers[i];
		}
		
		double average = total / numbers.length;
		
		System.out.format("average: %.3f", average);
		
 	}

}
