package Generics.maximum.problem;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MaxInteger{
	
	@Test
	public void float_Method_With_Max_At_1st_Position() {
		System.out.println("----------This is test case 1-----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 floats down below with first being the max of all three: ");
		System.out.print("Enter the value of first float (max of all three) : ");
		Float firstFloat = sc.nextFloat();
		System.out.println();
		System.out.print("Enter the value of second float : ");
		Float secondFloat = sc.nextFloat();
		System.out.println();
		System.out.print("Enter the value of third float : ");
		Float thirdFloat = sc.nextFloat();
		System.out.println();
		
		try {
			Calculate cal = new Calculate(firstFloat, secondFloat, thirdFloat);
			Float maxFloat = (Float) cal.mainMethodFirst();
			Assert.assertEquals(firstFloat, maxFloat);
		} catch (MaxValueException e) {
			// TODO: handle exception
			Assert.assertEquals(MaxValueException.ExceptionType.ENTERED_INVALID, e.type);
		}
	}
	
	@Test
	public void float_Method_With_Max_At_2nd_Position() {
		System.out.println("----------This is test case 2-----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 floats down below with second being the max of all three: ");
		System.out.print("Enter the value of first float : ");
		Float firstFloat = sc.nextFloat();
		System.out.println();
		System.out.print("Enter the value of second float (max of all three) : ");
		Float secondFloat = sc.nextFloat();
		System.out.println();
		System.out.print("Enter the value of third float : ");
		Float thirdFloat = sc.nextFloat();
		System.out.println();
		
		try {
			Calculate cal = new Calculate(firstFloat, secondFloat, thirdFloat);
			Float maxFloat = (Float) cal.mainMethodSecond();
			Assert.assertEquals(secondFloat, maxFloat);
		} catch (MaxValueException e) {
			// TODO: handle exception
			Assert.assertEquals(MaxValueException.ExceptionType.ENTERED_INVALID, e.type);
		}
	}
	
	@Test
	public void float_Method_With_Max_At_3rd_Position() {
		System.out.println("----------This is test case 3-----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 floats down below with third being the max of all three: ");
		System.out.print("Enter the value of first float : ");
		Float firstFloat = sc.nextFloat();
		System.out.println();
		System.out.print("Enter the value of second float : ");
		Float secondFloat = sc.nextFloat();
		System.out.println();
		System.out.print("Enter the value of third float (max of all three) : ");
		Float thirdFloat = sc.nextFloat();
		System.out.println();
		
		try {
			Calculate cal = new Calculate(firstFloat, secondFloat, thirdFloat);
			Float maxFloat = (Float) cal.mainMethodThird();
			Assert.assertEquals(thirdFloat, maxFloat);
		} catch (MaxValueException e) {
			// TODO: handle exception
			Assert.assertEquals(MaxValueException.ExceptionType.ENTERED_INVALID, e.type);
		}	
	}
}