package Shopping;

import java.util.*;

public class Launch {

	static ArrayList<Person> arList=new ArrayList<Person>(); 
	static Scanner scan1=new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("shopmore.com");
		System.out.println();
		System.out.println("\t\t\t*******|SHOPMORE|*******");
		System.out.println();
		System.out.println("\t\t\t*****Welcome to SHOPMORE*****");
		System.out.println();
		String name=null;;
		String phoneNum=null;
		System.out.println("Enter your name");
		while(true) {
			name=scan.nextLine();

			if(!name.contains(" "))
				break;
			System.out.println("Invalid name!! Re-enter your name..");
		}

		System.out.println("Enter your phone number(10 digit)");
				while(true) {
		phoneNum=scan.next();

				if(phoneNum.length()==10)
					break;
				System.out.println("Invalid number!! Re-enter your number..");
				}
		System.out.println();
		System.out.println("\t\t\t***Welcome "+name+" to SHOPMORE***");
		System.out.println();
		System.out.println("**********************************************************************************");
		System.out.println();

		homePage();
	}

	public static void homePage() {

		System.out.println("\t\t\t***Welcome to Home Page***");
		System.out.println();
		System.out.println("Categories");
		System.out.println("1. Clothes\r\n" + 
				"2. Electronics\r\n" + 
				"3. HomeApplication\r\n" + 
				"4. Sports\r\n" + 
				"5. Health\r\n" + 
				"6. View Cart\r\n" + 
				"7. Remove Cart\r\n" +
				"8. Billing\r\n"+ 
				"9. Exit\r\n" + 
				"");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			Clothes.chooseClothes();
			break;

		case 2:
			Electronics.chooseElectronics();
			break;

		case 3:
			HomeApplication.chooseApplication();
			break;

		case 4:
			Sports.chooseSports();
			break;

		case 5:
			Health.chooseHealth();
			break;

		case 6:
			viewCart();
			homePage();
			break;

		case 7:
			removeCart();
			break;
			
		case 8:
			Bill.billing();
			break;

		case 9:
			System.out.println("\t\t\t*#*#*#*# THANK YOU FOR SHOPPING WITH US *#*#*#*#");
			System.exit(0);
			break;

		default:
			try {
				throw new InvalidInputException();
			}catch(InvalidInputException e) {
				System.out.println(e);
				System.out.println("#######################################################################################");
				System.out.println("Please enter valid input");
				homePage();
			}
		}
	}

	public static void viewCart() {
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-20s%-140s%-20s%-20s%-20s","Sl.No","|Item","|Cost","|Quantity","|Total");
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(int i=0;i<arList.size();i++) {
			System.out.printf("%-20s%-140s%-20s%-20s%-20s",(i+1),arList.get(i).getBrand(),arList.get(i).getCost(),arList.get(i).getQuantity(),arList.get(i).getTotal());
			System.out.println();
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
	}

	public static void removeCart() {

		System.out.println("Do you want to remove from cart? y/n");

		if(scan1.next().equalsIgnoreCase("n")) {
			//			homePage();

			System.out.println("Do you want to go for the billing (y/n)");

			if(scan1.next().equalsIgnoreCase("y"))
				Bill.billing();

			else
				homePage();

		}

		else {

			if(!arList.isEmpty()) {
				System.out.println("Enter the serial number of item to be removed");
				int itemToBeRemoved=scan1.nextInt();
				arList.remove(itemToBeRemoved-1);
				System.out.println("Item successfully removed");
				homePage();
			}
			else {
				System.out.println("Your cart has nothing to be removed");
				homePage();
			}
		}
	}
}

