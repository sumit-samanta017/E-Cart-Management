package Shopping;

import java.util.Scanner;

public class Bill {
	
	static Scanner scan1=new Scanner(System.in); 
	
	public static void billing() {
			
			int total=0;
			
			for(int i=0;i<Launch.arList.size();i++) {
				
				total+=Launch.arList.get(i).getTotal();
			}
			Launch.viewCart();
			System.out.println();
			System.out.println("--------------------------------------------------------");
			System.out.println("Your total bill is "+total);
			System.out.println("--------------------------------------------------------");	
		
		System.out.println();
		
		System.out.println("Do you want to continue shopping (y/n)");
		
		if(scan1.next().equalsIgnoreCase("y")) {
			
			Launch.homePage();
			
		}
		
		else {
			
			System.out.println("\t\t\t*#*#*#*# THANK YOU FOR SHOPPING WITH US *#*#*#*#");
			System.exit(0);
		}
		
	}

}
