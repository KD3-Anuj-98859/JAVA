import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double totalBill = 0;
		int qty = 0;
		Food food=null;
		int ch;
		while ((ch = getChoice()) != 0) {
			switch (ch) {
			case 1: {
				food = new Food("Dosa", 80.00);
				System.out.println("Enter qty : ");
				qty = sc.nextInt();
				totalBill += food.getTotalPrice();
				break;
			}
			case 2: {
				food = new Food("Samosa", 15.00);
				System.out.println("Enter qty : ");
				qty = sc.nextInt();
				food.setQty(qty);
				qty = sc.nextInt();
				totalBill += food.getTotalPrice();
				break;
			}
			case 3: {
				food = new Food("Idli ", 40.00);
				System.out.println("Enter qty : ");
				qty = sc.nextInt();
				food.setQty(qty);
				totalBill += food.getTotalPrice();
				break;
			}
			case 4: {
				food = new Food("Wada", 40.00);
				System.out.println("Enter qty : ");
				qty = sc.nextInt();
				food.setQty(qty);
				totalBill += food.getTotalPrice();
				break;
			}
			case 5: {
				food = new Food("Poha", 20.00);
				System.out.println("Enter qty : ");
				qty = sc.nextInt();
				food.setQty(qty);
				totalBill += food.getTotalPrice();
				break;
			}
			case 6: {
				food = new Food("chai", 15.00);
				System.out.println("Enter qty : ");
				qty = sc.nextInt();
				totalBill += food.getTotalPrice();
				break;
			}
			case 7:{

				System.out.println("------------Bill------------");
			
				System.out.println("Price        : "+totalBill);
			}
			default: {
				System.out.println("Invailid Input : ");

			}
			
			
			}
			
		}
		
		
		

	}



	public static int getChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Dosa ");
		System.out.println("2. Samosa ");
		System.out.println("3 Idli ");
		System.out.println("4 wada ");
		System.out.println("5 poha ");
		System.out.println("6 chai ");
		System.out.println("Generate bill : ");
		System.out.println("Enter choice : ");
		int choice = sc.nextInt();

		return choice;
	}
}

class Food {
	String food;
	double price;
	int qty;

	Food() {

	}

	Food(String food, double price) {
		this.food = food;
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getQty() {
		return this.qty;
	}
	
	public void setfood(String Food) {
		this.food=food;
	}
    
	public String getFood() {
		return this.food;
	}
	
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter food Name :");
		this.food = sc.nextLine();
		System.out.println("Enter price : ");
		this.price = sc.nextDouble();
		System.out.println("Enter qty : ");
		this.qty = sc.nextInt();
	}

	public double getTotalPrice() {
		return price * qty;
	}

}