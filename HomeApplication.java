package Shopping;

import java.util.Scanner;

class HomeApplication {

	static Scanner scan1=new Scanner(System.in);
	Person p;
	static HomeApplication homeAp=new HomeApplication();

	//*********************************************************#############################################################*****************************************************
	//**************************************************************** CHOOSING HOME APPLICATION ****************************************************************************

	public static void chooseApplication() {
		System.out.println("******************************************************************************************");
		System.out.println("HOME APPLICATION");
		System.out.println("******************************************************************************************");

		System.out.println("1. Kitchen Storage and Containers\r\n" + 
				"2. Gardening Store\r\n" + 
				"3. Home Automation\r\n" + 
				"4. Home Furnishing\r\n" +  
				"5. Home Page\r\n" + 
				"6. Exit\r\n" + 
				"");

		System.out.println("Enter your choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("*****************************************************************************************");
			System.out.println("KITCHEN STORAGE AND CONTAINERS");
			homeAp.kitchenStorage();
			break;

		case 2:
			System.out.println("*****************************************************************************************");
			System.out.println("GARDENING STORE");
			homeAp.gardeningStore();
			break;

		case 3:
			System.out.println("*****************************************************************************************");
			System.out.println("HOME AUTOMATION");
			homeAp.homeAutomation();
			break;

		case 4:
			System.out.println("*****************************************************************************************");
			System.out.println("HOME FURNISHING");
			homeAp.homeFurnishing();
			break;

		case 5:
			Launch.homePage();
			break;

		case 6:
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
				chooseApplication();
			}
		}
	}

	//*********************************************************** CHOOSING HOME FURNISHING *******************************************************************************
	public void homeFurnishing() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Bathroom Linen\t\t\tRate=Rs.480\r\n"
				+ "2. Bedding & Linen\t\t\tRate=Rs.180\r\n"
				+ "3. Carpets & Rugs\t\t\tRate=Rs.150\r\n"
				+ "4. Curtains & Accessories\t\tRate=Rs.350\r\n"
				+ "5. Diwan Cover Sets\t\t\tRate=Rs.200\r\n"
				+ "6. Previous Page\r\n"
				+ "7. Home Page\r\n"
				+ "8. Exit\r\n"
				+ "");	

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Bathroom Linen",480,scan1.nextInt());
			p.setTotal(480*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Bedding & Linen",180,scan1.nextInt());
			p.setTotal(180*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Carpets & Rugs",150,scan1.nextInt());
			p.setTotal(150*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Curtains & Accessories",350,scan1.nextInt());
			p.setTotal(350*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Diwan Cover Sets",200,scan1.nextInt());
			p.setTotal(200*p.getQuantity());
			break;

		case 6:
			chooseApplication();
			break;

		case 7:
			Launch.homePage();
			break;

		case 8:
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
				homeFurnishing();
			}	
		}

		System.out.println("Are you sure you want to add "+p.getQuantity()+" items to cart\nDo you want to continue y/n?");
		if(scan1.next().equalsIgnoreCase("y")) {
			Launch.arList.add(p);
			System.out.println(p.getQuantity()+" items added to cart");
		}

		System.out.println("Do you want to go for the billing (y/n)");

		if(scan1.next().equalsIgnoreCase("y"))
			Bill.billing();

		else
			Launch.homePage();
	}


	//************************************************************ CHOOSING KITCHEN STORAGE *******************************************************************************

	public void kitchenStorage() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Milton Medical Box\t\tRate=Rs.189\r\n" + 
				"2. Milton Hexa Pet Jar\t\tRate=Rs.549\r\n" + 
				"3. Princeware Twister\t\tRate=Rs.640\r\n" + 
				"4. MasterCook\t\t\tRate=Rs.449\r\n" + 
				"5. Previous Page\r\n" + 
				"6. Home Page\r\n" +
				"7. Exit\r\n" +
				"");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Milton Medical Box",189,scan1.nextInt());
			p.setTotal(189*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Milton Hexa Pet Jar",549,scan1.nextInt());
			p.setTotal(549*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Princeware Twister",640,scan1.nextInt());
			p.setTotal(640*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("MasterCook",449,scan1.nextInt());
			p.setTotal(449*p.getQuantity());
			break;

		case 5:
			chooseApplication();
			break;

		case 6:
			Launch.homePage();
			break;

		case 7:
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
				kitchenStorage();
			}
		}

		System.out.println("Are you sure you want to add "+p.getQuantity()+" items to cart\nDo you want to continue y/n?");
		if(scan1.next().equalsIgnoreCase("y")) {
			Launch.arList.add(p);
			System.out.println(p.getQuantity()+" items added to cart");
		}

		System.out.println("Do you want to go for the billing (y/n)");

		if(scan1.next().equalsIgnoreCase("y"))
			Bill.billing();

		else
			Launch.homePage();
	}

	//**************************************************************** CHOOSE GARDENING STORE ******************************************************************************

	public void gardeningStore() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. KRINA CLICK STORE Gardening Shoulder Glove\t\t\t\t\t\tRate=Rs.347\r\n" + 
				"2. KR STORE 5 Liter Garden Plants Watering Can\t\t\t\t\t\tRate=Rs.525\r\n" + 
				"3. KR STORE 1.25 Liter Handheld Garden Spray Bottle Pump 1.25 L Hand Held Sprayer\tRate=Rs.325\r\n" + 
				"4. shop93 store Bottle Spray Gun - Used in Car Wash, Gardening 1 L Hand Held Sprayer\tRate=Rs.379\r\n" + 
				"5. Previous Page\r\n" + 
				"6. Home Page\r\n" +
				"7. Exit\r\n" +
				"");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("KRINA CLICK STORE Gardening Shoulder Glove",347,scan1.nextInt());
			p.setTotal(347*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("KR STORE 5 Liter Garden Plants Watering Can",525,scan1.nextInt());
			p.setTotal(525*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("KR STORE 1.25 Liter Handheld Garden Spray Bottle Pump 1.25 L Hand Held Sprayer",325,scan1.nextInt());
			p.setTotal(325*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("shop93 store Bottle Spray Gun - Used in Car Wash, Gardening 1 L Hand Held Sprayer",379,scan1.nextInt());
			p.setTotal(379*p.getQuantity());
			break;

		case 5:
			chooseApplication();
			break;

		case 6:
			Launch.homePage();
			break;

		case 7:
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
				gardeningStore();
			}
		}

		System.out.println("Are you sure you want to add "+p.getQuantity()+" items to cart\nDo you want to continue y/n?");
		if(scan1.next().equalsIgnoreCase("y")) {
			Launch.arList.add(p);
			System.out.println(p.getQuantity()+" items added to cart");
		}

		System.out.println("Do you want to go for the billing (y/n)");

		if(scan1.next().equalsIgnoreCase("y"))
			Bill.billing();

		else
			Launch.homePage();
	}

	//**************************************************************** HOME AUTOMATION ***************************************************************************************

	public void homeAutomation() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. TRP TRADERS 4 Way Wireless Remote Control Switch For Fans And Light 3 A Four Way Electrical Switch\t\tRate=Rs.699\r\n" + 
				"2. Gadget Hero's Universal Handlebar Accident Prevention Hazard Light Switch 3 A One Way Electrical Switch\tRate=Rs.350\r\n" + 
				"3. SHOP4U 10 A One Way Electrical Switch\t\t\t\t\t\t\t\t\tRate=Rs.96\r\n" + 
				"4. DOTT Modular Remote Control Switch For 1 Light & 1 Fan\t\t\t\t\t\t\tRate=Rs.1598\r\n" + 
				"5. Previous Page\r\n" + 
				"6. Home Page\r\n" +
				"7. Exit\r\n" +
				"");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("TRP TRADERS 4 Way Wireless Remote Control Switch For Fans And Light 3 A Four Way Electrical Switch",699,scan1.nextInt());
			p.setTotal(699*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Gadget Hero's Universal Handlebar Accident Prevention Hazard Light Switch 3 A One Way Electrical Switch",350,scan1.nextInt());
			p.setTotal(350*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("SHOP4U 10 A One Way Electrical Switch",96,scan1.nextInt());
			p.setTotal(96*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("DOTT Modular Remote Control Switch For 1 Light & 1 Fan",1598,scan1.nextInt());
			p.setTotal(1598*p.getQuantity());
			break;

		case 5:
			chooseApplication();
			break;

		case 6:
			Launch.homePage();
			break;

		case 7:
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
				homeAutomation();
			}
		}

		System.out.println("Are you sure you want to add "+p.getQuantity()+" items to cart\nDo you want to continue y/n?");
		if(scan1.next().equalsIgnoreCase("y")) {
			Launch.arList.add(p);
			System.out.println(p.getQuantity()+" items added to cart");
		}

		System.out.println("Do you want to go for the billing (y/n)");

		if(scan1.next().equalsIgnoreCase("y"))
			Bill.billing();

		else
			Launch.homePage();
	}
}

