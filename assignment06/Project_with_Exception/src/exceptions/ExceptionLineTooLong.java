package exceptions;

public class ExceptionLineTooLong extends RuntimeException{
	
	private String message;
	private String field;
	
	public ExceptionLineTooLong()
	{
		message = " ";
		field = " ";
	}
	
	public ExceptionLineTooLong(String message, String field)
	{
		this.message = message;
		this.field = field;
	}
	
	@Override
	public void printStackTrace() 
	{
		System.out.println("Exception : " + message);
		System.out.println("Field : " + field);
	}

}
