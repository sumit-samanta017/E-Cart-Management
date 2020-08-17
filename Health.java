package Shopping;

import java.util.Scanner;

public class Health {

	static Scanner scan1=new Scanner(System.in);
	Person p;
	static Health health=new Health();

	//*******************************########################### CHOOSING HEALTH ##############################***********************************

	public static void chooseHealth() {

		System.out.println("******************************************************************************************");
		System.out.println("HEALTH");
		System.out.println("******************************************************************************************");

		System.out.println("1. Protein Supplements\r\n"
				+ "2. Vitamin Supplements\r\n"
				+ "3. Health Drinks\r\n"
				+ "4. Previous Page\r\n"
				+ "5. Home Page\r\n"
				+ "6. Exit\r\n"
				+ "");

		switch(scan1.nextInt()) {

		case 1:
			System.out.println("*****************************************************************************************");
			System.out.println("PROTEIN SUPPLEMENTS");
			health.chooseProteinSupplements();
			break;

		case 2:
			System.out.println("*****************************************************************************************");
			System.out.println("VITAMIN SUPPLEMENTS");
			health.chooseVitaminSupplements();
			break;

		case 3:
			System.out.println("*****************************************************************************************");
			System.out.println("HEALTH DRINKS");
			health.chooseHealthDrinks();
			break;

		case 4:
			chooseHealth();
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
				chooseHealth();
			}

		}

		System.out.println("Do you want to go for the billing (y/n)");

		if(scan1.next().equalsIgnoreCase("y"))
			Bill.billing();

		else
			Launch.homePage();

	}

	//*******************************########################### CHOOSING PROTEIN SUPPLEMENTS ##############################***********************************

	public void chooseProteinSupplements() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Endura Mass Weight Gainers/Mass Gainers\t\t\t\t\t\t\tRate=Rs.536\r\n"
				+ "2. Optimum Nutrition Gold Standard 100% Whey Protein  (907 g, Chocolate Peanut Butter)\t\tRate=Rs.2,404\r\n"
				+ "3. Optimum Nutrition Micronized Creatine  (300 g, Unflavored)\t\t\t\t\tRate=Rs.825\r\n"
				+ "4. Ultimate Nutrition Prostar 100% Whey Protein  (2.39 kg, Chocolate Creme)\t\t\tRate=Rs.3,151\r\n" + 
				"5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter your choice");

		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Endura Mass Weight Gainers/Mass Gainers", 536, scan1.nextInt());
			p.setTotal(536*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Optimum Nutrition Gold Standard 100% Whey Protein  (907 g, Chocolate Peanut Butter)", 2404, scan1.nextInt());
			p.setTotal(2404*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Optimum Nutrition Micronized Creatine  (300 g, Unflavored)", 825, scan1.nextInt());
			p.setTotal(825*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Ultimate Nutrition Prostar 100% Whey Protein  (2.39 kg, Chocolate Creme)", 3151, scan1.nextInt());
			p.setTotal(3151*p.getQuantity());
			break;

		case 5:
			chooseHealth();
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
				chooseProteinSupplements();
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

	//*******************************########################### CHOOSING VITAMIN SUPPLEMENTS ##############################***********************************

	public void chooseVitaminSupplements() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. WOW Life Science Body Cleanse Capsules  (60 No)\t\t\t\t\tRate=Rs.505\r\n" + 
				"2. GNC Herbal Plus Triple Ginseng Root (Vegetarian) Enhances Men's Vitality  (90 No)\tRate=Rs.9,099\r\n" + 
				"3. MuscleBlaze VITE Multivitamin  (90 No)\t\t\t\t\t\tRate=Rs.484\r\n"
				+ "4. Muscletech Essential Series platinum MULTI VITAMIN  (90 No)\t\t\t\tRate=Rs.1,087\r\n" + 
				"5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");

		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("WOW Life Science Body Cleanse Capsules  (60 No)", 505, scan1.nextInt());
			p.setTotal(505*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("GNC Herbal Plus Triple Ginseng Root (Vegetarian) Enhances Men's Vitality  (90 No)", 9099, scan1.nextInt());
			p.setTotal(9099*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("MuscleBlaze VITE Multivitamin  (90 No)", 484, scan1.nextInt());
			p.setTotal(484*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Muscletech Essential Series platinum MULTI VITAMIN  (90 No)", 1087, scan1.nextInt());
			p.setTotal(1087*p.getQuantity());
			break;

		case 5:
			chooseHealth();
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
				chooseVitaminSupplements();
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

	//*******************************########################### CHOOSING HEALTH DRINKS ##############################***********************************

	public void chooseHealthDrinks() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. CARBO PLUS Carboplus Instant Nutrition Drink  (500 g, Green Apple Flavored)\t\t\tRate=Rs.500\r\n"
				+ "2. Cadbury Bournvita Health Drink Nutrition Drink  (500 g, Chocolate Flavored)\t\t\tRate=Rs.204\r\n" + 
				"3. Ensure Diabetes Care Vanilla Delight Nutrition Drink  (400 g, Vanilla Flavored)\t\tRate=Rs.656\r\n" + 
				"4. PediaSure Premium Chocolate Nutrition Drink  (1 kg, Premium Chocolate Flavored)\t\tRate=Rs.1,180\r\n" + 
				"5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("CARBO PLUS Carboplus Instant Nutrition Drink  (500 g, Green Apple Flavored)", 500, scan1.nextInt());
			p.setTotal(500*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Cadbury Bournvita Health Drink Nutrition Drink  (500 g, Chocolate Flavored)", 204, scan1.nextInt());
			p.setTotal(204*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Ensure Diabetes Care Vanilla Delight Nutrition Drink  (400 g, Vanilla Flavored)", 656, scan1.nextInt());
			p.setTotal(656*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("PediaSure Premium Chocolate Nutrition Drink  (1 kg, Premium Chocolate Flavored)", 1180, scan1.nextInt());
			p.setTotal(1180*p.getQuantity());
			break;

		case 5:
			chooseHealth();
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
				chooseHealthDrinks();
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
