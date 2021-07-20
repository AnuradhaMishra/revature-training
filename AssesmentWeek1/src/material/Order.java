package material;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Lapi l1 = new Lapi("Dell", "i10");
		Lapi l2 = new Lapi("Apple", "i6");
		Lapi l3 = new Lapi("Acer", "i9");
		Lapi l4 = new Lapi("HP", "i5");
		Lapi l5 = new Lapi("Asus", "AMD");
		Accessories a1 = new Accessories("Bags", 2000);
		Accessories a2 = new Accessories("Shoes", 2500);
		Accessories a3 = new Accessories("Sunglasses", 1000);
		Accessories a4 = new Accessories("Watch", 4000);
		System.out.println("What are you looking for :- \n1.Laptop or \n2. Accessories \nEnter your choice : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("Enter the number of quantities : ");
		int quantity = sc.nextInt();
		switch (i) {
		case 1:
			Lapi o = new Lapi();
			o.out(quantity);
			break;
		case 2:
			Accessories o2 = new Accessories();
			o2.out(quantity);
			break;
		default:
			System.out.println("You have chosen the wrong option!!!\nEXITING!!!");
			break;
		}
	}

}
