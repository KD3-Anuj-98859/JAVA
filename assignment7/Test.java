package assignment7;

public class Test {
    public static int calculateLength(String str) {
   	 if(str.length()>80)
   		 throw new ExceptionLineTooLong("The strings is too long");
   	 
   	 return str.length();
    }
    public static void main(String[] args) {
    	String str="jkjkfkjffjjfklfksfjkfjsfjskjfskjfkjfkjflfjljfljflasjflasjljlsjljsjsjkjdlflfjlfljlfkflsfljsllsf;lsjflsjf;lsfjdsl;jf";
    	try {
    	System.out.println("Length : "+calculateLength(str));
    	
    	}catch(ExceptionLineTooLong e) {
    	   System.out.println("Message "+e.getMessage());
    		//e.printStackTrace();
    		
    	}
    	System.out.println();
    }
}

