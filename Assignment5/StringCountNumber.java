package com.sunbeam.string;

import java.util.Scanner;

public class StringCountNumber {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		str = sc.nextLine();
		int count = 0;
		String[] arr = str.trim().split(" ");
		for (String str1 : arr) {
			count += str1.length();
		}
		System.out.println("Length : " + count);
	}

}
