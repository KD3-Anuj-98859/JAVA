package assignment7;

public class ExceptionLineTooLong extends RuntimeException{

     public ExceptionLineTooLong(String msg) {
    	 super(msg);
     }

	 @Override
	 public String getMessage() {
		return super.getMessage();
	 }
     
     
     
}
