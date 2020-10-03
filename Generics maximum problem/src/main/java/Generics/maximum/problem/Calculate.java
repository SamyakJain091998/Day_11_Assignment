package Generics.maximum.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Calculate <E extends Comparable<E>> {

	private E firstValue;
	private E secondValue;
	private E thirdValue;
	private E fourthValue;
	private E max;
	private List<E> arrList = new ArrayList<>();
	
	public Calculate(E firstValue, E secondValue, E thirdValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
		arrList.add(firstValue);
		arrList.add(secondValue);
		arrList.add(thirdValue);
	}
	
	public Calculate(E firstValue, E secondValue, E thirdValue, E fourthValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
		this.fourthValue = fourthValue;
		arrList.add(firstValue);
		arrList.add(secondValue);
		arrList.add(thirdValue);
		arrList.add(fourthValue);
	}
	
	public void printMaxValue() {
		System.out.println("Max value is : " + max);
	}
		
	
	public E calculateMax() {
		
		Collections.sort(arrList);
		System.out.println("Array List after sorting is : " + arrList);
//		E max = firstValue;
//		for(E i : arrList) {
//			if(i.compareTo(max) > 0) {
//				max = i;
//			}
//		}
//		this.max = max;
//		if(secondValue.compareTo(max) > 0) {
//			max = secondValue;
//		}
//		if(thirdValue.compareTo(max) > 0) {
//			max = thirdValue;
//		}
		System.out.println("Max string is : " + arrList.get(arrList.size()-1));
//		printMaxValue();
		return arrList.get(arrList.size()-1);
	}
	
	public E Return_Value_Based_On_Condition(E valueToCalculate, String exceptionMsg) throws MaxValueException{
		E dummyString = calculateMax();
		try {
			if(dummyString != valueToCalculate) {
				throw new MaxValueException(MaxValueException.ExceptionType.ENTERED_INVALID, exceptionMsg);
			}
			return dummyString;
		} catch (Exception e) {
			// TODO: handle exception
//			StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//			System.out.println("Stacktrace elements are : " + elements);
			e.printStackTrace();
		}
		return dummyString;		
	}
	
	public E mainMethodFirst() throws MaxValueException {
		String exceptionMsg = "The first value you entered should be the max of all three.";
		E result = Return_Value_Based_On_Condition(firstValue, exceptionMsg);
		return result;
	}

	public E mainMethodSecond() throws MaxValueException {
		String exceptionMsg = "The second value you entered should be the max of all three.";
		E result = Return_Value_Based_On_Condition(secondValue, exceptionMsg);
		return result;
	}

	public E mainMethodThird() throws MaxValueException {
		String exceptionMsg = "The third value you entered should be the max of all three.";
		E result = Return_Value_Based_On_Condition(thirdValue, exceptionMsg);
		return result;
	}
}