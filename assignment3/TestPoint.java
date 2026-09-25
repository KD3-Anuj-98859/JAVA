package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2d;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 : ");
		int x = sc.nextInt();
		System.out.println("Enter y1 : ");
		int y = sc.nextInt();
		System.out.println("Enter x2 : ");
		int x2 = sc.nextInt();
		System.out.println("Enter y2 : ");
		int y2 = sc.nextInt();

		Point2d p1 = new Point2d(x, y);
		Point2d p2 = new Point2d(x2, y2);
		  p1.getDetails();
		 p2.getDetails();
		if (p1.isEqual(p2)) {
			System.out.println("p1 & p2 are located at the same position");
		} else {
			System.out.println(" distance between p1 & p2 : " + p1.calculateDistance(p2));
		}

		double distance = p1.calculateDistance(p2);
		System.out.println(distance);

	}
}