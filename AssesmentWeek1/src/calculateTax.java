import java.util.Scanner;

public class calculateTax {

	public static void tax() {
		int income;
		String gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Income");
		income = sc.nextInt();
		System.out.println("Write your Gender as M/F");
		sc.nextLine();
		gender = sc.nextLine();

		if (gender == "M") {
			if (income <= 1800000) {
				System.out.println(" No Tax ");

			} else if (income <= 500000) {
				System.out.println("Tax is" + income * 0.1);
			} else if (income <= 800000) {
				System.out.println("Tax is" + income * 0.2);
			} else {
				System.out.println("Tax is" + income * 0.3);
			}
		} else {
			if (income <= 190000) {
				System.out.println("No Tax");
			} else if (income <= 500000) {
				System.out.println("Tax is" + income * 0.1);
			} else if (income <= 800000) {
				System.out.println("Tax is" + income * 0.2);
			} else {
				System.out.println("Tax is" + income * 0.3);
			}

		}

	}

	public static void main(String[] args) {
		tax();

	}

}
