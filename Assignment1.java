import java.util.Scanner;

import org.jcp.xml.dsig.internal.dom.DOMCryptoBinary;

public class Assignment1 {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		Integer i=new Integer(num);//boxing
		String binary=Integer.toBinaryString(i);
		System.out.println("Binary Format : "+binary);
		String hexCode=Integer.toHexString(num);
		System.out.println("Hex Code : "+hexCode);
		String octal=Integer.toOctalString(num);
		System.out.println("Octal Code : "+octal);
		
		
		
		sc.close();
		
		
	}

}
