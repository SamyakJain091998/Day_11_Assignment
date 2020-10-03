package Generics.maximum.problem;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MaxInteger{
	
	@Test
	public void string_Method_With_Max_At_1st_Position() {
		System.out.println("----------This is test case 1-----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values you want to enter for a particular type : ");
		int numberOfValue = sc.nextInt();
		
		switch (numberOfValue) {
		case 3: {
			System.out.println("Enter 3 strings down below with first being the max of all three: ");
			System.out.print("Enter the value of first string (max of all three) : ");
			String firstString = sc.nextLine();
			System.out.println();
			System.out.print("Enter the value of second string : ");
			String secondString = sc.nextLine();
			System.out.println();
			System.out.print("Enter the value of third string : ");
			String thirdString = sc.nextLine();
			System.out.println();
			
			try {
				Calculate cal = new Calculate(firstString, secondString, thirdString);
				String maxString = (String) cal.mainMethodFirst();
				Assert.assertEquals(firstString, maxString);
			} catch (MaxValueException e) {
				// TODO: handle exception
				Assert.assertEquals(MaxValueException.ExceptionType.ENTERED_INVALID, e.type);
			}
			break;
		}
		case 4: {
			System.out.println("Enter 4 strings down below with first being the max of all four: ");
			System.out.println("Enter the value of first string (max of all four) : ");
			String firstString = sc.next();
			System.out.println("Enter the value of second string : ");
			String secondString = sc.next();
			System.out.println("Enter the value of third string : ");
			String thirdString = sc.next();
			System.out.println("Enter the value of fourth string : ");
			String fourthString = sc.next();
			try {
				Calculate cal = new Calculate(firstString, secondString, thirdString, fourthString);
				String maxString = (String) cal.mainMethodFirst();
				Assert.assertEquals(firstString, maxString);
			} catch (MaxValueException e) {
				// TODO: handle exception
				Assert.assertEquals(MaxValueException.ExceptionType.ENTERED_INVALID, e.type);
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + numberOfValue);
		}
	}

	@Test
	public void string_Method_With_Max_At_2nd_Position() {
		System.out.println("----------This is test case 2-----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 strings down below with second being the max of all three: ");
		System.out.print("Enter the value of first string : ");
		String firstString = sc.nextLine();
		System.out.println();
		System.out.print("Enter the value of second string (max of all three) : ");
		String secondString = sc.nextLine();
		System.out.println();
		System.out.print("Enter the value of third string : ");
		String thirdString = sc.nextLine();
		System.out.println();
		
		try {
			Calculate cal = new Calculate(firstString, secondString, thirdString);
			String maxString = (String) cal.mainMethodSecond();
			Assert.assertEquals(secondString, maxString);
		} catch (MaxValueException e) {
			// TODO: handle exception
			Assert.assertEquals(MaxValueException.ExceptionType.ENTERED_INVALID, e.type);
		}
	}
	
	@Test
	public void string_Method_With_Max_At_3rd_Position() {
		System.out.println("----------This is test case 3-----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 floats down below with third being the max of all three: ");
		System.out.print("Enter the value of first float : ");
		String firstString = sc.nextLine();
		System.out.println();
		System.out.print("Enter the value of second float : ");
		String secondString = sc.nextLine();
		System.out.println();
		System.out.print("Enter the value of third float (max of all three) : ");
		String thirdString = sc.nextLine();
		System.out.println();
		
		try {
			Calculate cal = new Calculate(firstString, secondString, thirdString);
			String maxString = (String) cal.mainMethodThird();
			Assert.assertEquals(thirdString, maxString);
		} catch (MaxValueException e) {
			// TODO: handle exception
			Assert.assertEquals(MaxValueException.ExceptionType.ENTERED_INVALID, e.type);
		}	
	}
}
