package workers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;



//import sorting.DailyWorker;


//import sorting.DailyWorker;

public class Sorting {
	
	public static void main(String[] args) {
		List<DailyWorker> a = new ArrayList<DailyWorker>();
		a.add(new DailyWorker(" Ramu   ",  19000, "D"));
		a.add(new DailyWorker(" Gyan   ",  14000, "D"));
		a.add(new DailyWorker(" Neeraj ", 55000, "D"));
		a.add(new DailyWorker(" Ashish ", 17000, "D"));
		
		Collections.sort(a,new Comparator<DailyWorker>() {

			@Override
			public int compare(DailyWorker o1, DailyWorker o2) {
				if(o1.getSalary()>o2.getSalary()) {
					return 1;
				}
				else
				return -1;
			}
			
			
			
		
		});
		
		
		System.out.println(a);
		
		
		
		
		
		
		List<SalariedWorker> s = new ArrayList<SalariedWorker>();
		s.add(new SalariedWorker(" Romika  ", 80000, "S"));
		s.add(new SalariedWorker(" Ankit   ",  24000, "S"));
		s.add(new SalariedWorker(" Manak   ",  55000, "S"));
		s.add(new SalariedWorker(" Ashish  ",  18000, "S"));
		
		Collections.sort(s,new Comparator<SalariedWorker>() {

			@Override
			public int compare(SalariedWorker o1, SalariedWorker o2) {
				if(o1.getSalary()>o2.getSalary()) {
					return 1;
				}
				else
				return -1;
			}
			
			
			
		
		});
		
		
		System.out.println(s);
		
}
}
