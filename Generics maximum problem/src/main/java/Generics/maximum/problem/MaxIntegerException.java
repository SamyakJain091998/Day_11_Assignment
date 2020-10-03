package Generics.maximum.problem;

public class MaxIntegerException extends Exception{
	
	private static String exceptionMessage;
	
	enum ExceptionType{
		ENTERED_INVALID;
	}
	
	ExceptionType type;
	
	public MaxIntegerException(ExceptionType type, String message) {
		super(message);
		this.type = type;
		this.exceptionMessage = message;
	}
	
	public static String getExceptionMessage() {
		return exceptionMessage;
	}
}