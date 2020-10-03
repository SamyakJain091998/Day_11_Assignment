package Generics.maximum.problem;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MaxInteger {
	
	@Test
	public void integer_Method_With_Max_At_1st_Position() {
		System.out.println("----------This is test case 1-----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integers down below with first being the max of all three: ");
		System.out.print("Enter the value of first integer (max of all three) : ");
		Integer firstInt = sc.nextInt();
		System.out.println();
		System.out.print("Enter the value of second integer : ");
		Integer secondInt = sc.nextInt();
		System.out.println();
		System.out.print("Enter the value of third integer : ");
		Integer thirdInt = sc.nextInt();
		System.out.println();
		
		try {
			Calculate cal = new Calculate(firstInt, secondInt, thirdInt);
			Integer maxInt = cal.mainMethodFirst();
			Assert.assertEquals(firstInt, maxInt);
		} catch (MaxIntegerException e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void integer_Method_With_Max_At_2nd_Position() {
		System.out.println("----------This is test case 2-----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integers down below with second being the max of all three: ");
		System.out.print("Enter the value of first integer : ");
		Integer firstInt = sc.nextInt();
		System.out.println();
		System.out.print("Enter the value of second integer (max of all three) : ");
		Integer secondInt = sc.nextInt();
		System.out.println();
		System.out.print("Enter the value of third integer : ");
		Integer thirdInt = sc.nextInt();
		System.out.println();
		
		try {
			Calculate cal = new Calculate(firstInt, secondInt, thirdInt);
			Integer maxInt = cal.mainMethodSecond();
			Assert.assertEquals(secondInt, maxInt);
		} catch (MaxIntegerException e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void integer_Method_With_Max_At_3rd_Position() {
		System.out.println("----------This is test case 3-----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integers down below with third being the max of all three: ");
		System.out.print("Enter the value of first integer : ");
		Integer firstInt = sc.nextInt();
		System.out.println();
		System.out.print("Enter the value of second integer : ");
		Integer secondInt = sc.nextInt();
		System.out.println();
		System.out.print("Enter the value of third integer (max of all three) : ");
		Integer thirdInt = sc.nextInt();
		System.out.println();
		
		try {
			Calculate cal = new Calculate(firstInt, secondInt, thirdInt);
			Integer maxInt = cal.mainMethodThird();
			Assert.assertEquals(thirdInt, maxInt);
		} catch (MaxIntegerException e) {
			// TODO: handle exception
			Assert.assertEquals(MaxIntegerException.ExceptionType.ENTERED_INVALID, e.type);
		}	
	}
}
