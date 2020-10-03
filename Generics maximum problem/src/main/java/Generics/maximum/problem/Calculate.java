package Generics.maximum.problem;

public class Calculate {

	private Integer firstInt, secondInt, thirdInt;
	
	public Calculate(Integer firstInt, Integer secondInt, Integer thirdInt) {
		this.firstInt = firstInt;
		this.secondInt = secondInt;
		this.thirdInt = thirdInt;
	}

	public Integer calculateMax() {
		Integer max = firstInt;
		if(secondInt.compareTo(max) > 0) {
			max = secondInt;
		}
		if(thirdInt.compareTo(max) > 0) {
			max = thirdInt;
		}
		return max;
	}
	
	public Integer Return_Integer_Based_On_Condition(Integer integerToCalculate) throws MaxIntegerException{
		Integer dummyInt = calculateMax();
		try {
			if(dummyInt != integerToCalculate) {
				throw new MaxIntegerException(MaxIntegerException.ExceptionType.ENTERED_INVALID, "The third integer you entered should be the max of all three.");
			}
			return dummyInt;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dummyInt;		
	}
	
	public Integer mainMethodFirst() throws MaxIntegerException {
		Integer result = Return_Integer_Based_On_Condition(firstInt);
		return result;
	}

	public Integer mainMethodSecond() throws MaxIntegerException {
		Integer result = Return_Integer_Based_On_Condition(secondInt);
		return result;
	}

	public Integer mainMethodThird() throws MaxIntegerException {
		Integer result = Return_Integer_Based_On_Condition(thirdInt);
		return result;
	}
}
