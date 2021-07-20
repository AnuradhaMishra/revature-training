import java.util.Scanner;

public class grossEggs {
	
	
	public  static void display() {
		int total;
		 int gross;
		 int dozen;
		 int left;
		 int remain;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Total Eggs");
	total = sc.nextInt();
	
	gross = total/144;
	remain = total%144;
	dozen = remain/12;
	left = remain%12;
	System.out.println("Your Number of eggss is " +gross+" gross "+dozen+" dozen "+left);
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		display();
	}

}
