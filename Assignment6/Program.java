package com.cdac.bookmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.cdac.collections.Book;

public class Program {
	public static List<Bookk> list = new ArrayList<Bookk>();
	public static Scanner sc = new Scanner(System.in);


	public static Bookk[] getInstance() {
		Bookk arr[] = {new Bookk("978-0134685991", 45.99, "Joshua Bloch", 12),
		new Bookk("978-0596009206", 88.50, "Eric sreeman", 25),
		new Bookk("978-0596009205", 18.50, "Eric ireeman", 25),
		new Bookk("978-0596009202", 98.50, "Eric kreeman", 25),
		new Bookk("978-0596009301", 78.50, "Eric preeman", 25),
		new Bookk("978-0596009305", 228.50, "Eric nreeman", 25),
		new Bookk("978-0132350884", 42.00, "Robert C. Martin", 8)};

		return arr;
	}

	public static void addBook(Bookk[] arr) {
		for (Bookk book : arr) {
			list.add(book);
		}
	}

	public static void displayForward() {
		ListIterator<Bookk> lisitr = list.listIterator();
		while (lisitr.hasNext()) {
			Bookk book = lisitr.next();
			System.out.println(book);
		}
	}

	public static void displayBackward() {
		ListIterator<Bookk> listItr = list.listIterator(list.size());
		while (listItr.hasPrevious()) {
			Bookk book = listItr.previous();
			System.out.println(book);
		}
	}

	public static boolean delete(String arr[]) {
		String isbn = arr[0];
		Bookk book = new Bookk();
		book.setIsbn(isbn);
		if (list.contains(book)) {
			list.remove(book);
			return true;
		}
		return false;
	}

	public static void acceptRecord(String arr[]) {
		System.out.println("Enter isbn id : ");
		arr[0] = sc.next();
	}

	public static void main(String[] args) {
		String arr1[] = new String[1];
		System.out.println("Book Management ");
		int choice = 0;
		do {
			System.out.println("1. Add new book in list");
			System.out.println("2. Display all books in forward order");
			System.out.println("3. Display all books in reverse order");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Sort all books by price in desc order -- list.sort()");
			System.out.println("Enter Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Bookk arr[] = Program.getInstance();
				Program.addBook(arr);
				break;
			case 2:
				Program.displayForward();
				break;
			case 3:
				Program.displayBackward();
				break;
			case 4:
				Program.acceptRecord(arr1);
				boolean status = Program.delete(arr1);
				System.out.println(status);
				break;
			case 5:
				Collections.sort(list, new sortByPrice());
				break;
			}
		} while (choice != 0);
	}

}
class sortByPrice implements Comparator<Bookk>{
	public int compare(Bookk b1,Bookk b2) {
		return Double.compare(b2.getPrice(),b1.getPrice());
	}
}