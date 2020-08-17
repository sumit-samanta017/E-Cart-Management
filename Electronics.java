package Shopping;

import java.util.*;

class Electronics {
	static Scanner scan1=new Scanner(System.in);
	Person p;
	static Electronics ecs=new Electronics();

	//*********************************************************#############################################################*****************************************************
	//**************************************************************** CHOOSING ELECTRONICS ****************************************************************************

	public static void chooseElectronics() {
		System.out.println("******************************************************************************************");
		System.out.println("Electronics");
		System.out.println("******************************************************************************************");

		System.out.println("1. Mobile's\r\n" + 
				"2. Television's\r\n" + 
				"3. Washing Machine's\r\n" + 
				"4. Laptop's\r\n" + 
				"5. Camera's\r\n" + 
				"6. Home Page\r\n" + 
				"7. Exit\r\n" + 
				"");

		System.out.println("Enter your choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("*****************************************************************************************");
			System.out.println("MOBILES");
			ecs.chooseMobile();
			break;

		case 2:
			System.out.println("*****************************************************************************************");
			System.out.println("TELEVISIONS");
			ecs.chooseTV();
			break;

		case 3:
			System.out.println("*****************************************************************************************");
			System.out.println("WASHING MACHINES");
			ecs.chooseWashingMachine();
			break;

		case 4:
			System.out.println("*****************************************************************************************");
			System.out.println("LAPTOPS");
			ecs.chooseLaptop();

		case 5:
			System.out.println("*****************************************************************************************");
			System.out.println("CAMERAS");
			ecs.chooseCamera();
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
				chooseElectronics();
			}
		}
	}

	//*************************************************************** CHOOSING MOBILES ************************************************************************************

	public void chooseMobile() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Realme 5i\t\t\tRate=Rs.8,999\r\n" + 
				"2. Redmi 8\t\t\tRate=Rs.7,999\r\n" + 
				"3. Vivo Z1Pro\t\t\tRate=Rs.13,990\r\n" + 
				"4. Asus ROG Phone ||\t\tRate=Rs.37,999\r\n" + 
				"5. Asus Zenfone 5z\t\tRate=Rs.32,999\r\n" + 
				"6. Moto G8 Plus\t\t\tRate=Rs.13,999\r\n" + 
				"7. Previous Page\r\n" + 
				"8. Home Page\r\n" + 
				"9. Exit\r\n" + 
				"");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Realme 5i",8999,scan1.nextInt());
			p.setTotal(8999*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Redmi 8",7999,scan1.nextInt());
			p.setTotal(7999*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Vivo Z1Pro",13990,scan1.nextInt());
			p.setTotal(13990*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Asus ROG Phone ||",37999,scan1.nextInt());
			p.setTotal(37999*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Asus Zenfone 5z",32999,scan1.nextInt());
			p.setTotal(32999*p.getQuantity());
			break;

		case 6:
			System.out.println("Enter the quantity");
			p=new Person("Moto G8 Plus",13999,scan1.nextInt());
			p.setTotal(13999*p.getQuantity());
			break;

		case 7:
			chooseElectronics();
			break;

		case 8:
			Launch.homePage();
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
				chooseMobile();
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

	//******************************************************************** CHOOSING TV **********************************************************************************

	public void chooseTV() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Sony\t\t\tRate=Rs.1,50,000\r\n" + 
				"2. Samsung\t\tRate=Rs.1,00,000\r\n" + 
				"3. Onida\t\tRate=Rs.85,000\r\n" + 
				"4. LG\t\t\tRate=Rs.50,000\r\n" + 
				"5. Previous Page\r\n" + 
				"6. Home Page\r\n" +
				"7. Exit\r\n" +
				"");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Sony",150000,scan1.nextInt());
			p.setTotal(150000*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Samsung",100000,scan1.nextInt());
			p.setTotal(100000*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Onida",85000,scan1.nextInt());
			p.setTotal(85000*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("LG",50000,scan1.nextInt());
			p.setTotal(50000*p.getQuantity());
			break;

		case 5:
			chooseElectronics();
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
				chooseTV();
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

	//************************************************************ CHOOSING WASHING MACHINES *********************************************************************************

	public void chooseWashingMachine() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Whirlpool\t\tRate=Rs.16,499\r\n" + 
				"2. Godrej\t\tRate=Rs.12,499\r\n" + 
				"3. Onida\t\tRate=Rs.10,899\r\n" + 
				"4. Bosch\t\tRate=Rs.14,999\r\n" + 
				"5. Previous Page\r\n" + 
				"6. Home Page\r\n" +
				"7. Exit\r\n" +
				"");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Whirlpool",16499,scan1.nextInt());
			p.setTotal(16499*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Godrej",12499,scan1.nextInt());
			p.setTotal(12499*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Onida",10899,scan1.nextInt());
			p.setTotal(10899*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Bosch",14999,scan1.nextInt());
			p.setTotal(14999*p.getQuantity());
			break;

		case 5:
			chooseElectronics();
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
				chooseWashingMachine();
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

	//*************************************************************** CHOOSING LAPTOP *************************************************************************************

	public void chooseLaptop() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Acer Predator\t\tRate=Rs.67,990\r\n" + 
				"2. HP Omen\t\t\tRate=Rs.81,990\r\n" + 
				"3. MSI G Ryzen\t\t\tRate=Rs.69,990\r\n" + 
				"4. Lenovo Ideapad L340\t\tRate=Rs.72,990\r\n" + 
				"5. Dell XPS 15\t\t\tRate=Rs.2,49,990\r\n" +
				"6. Previous Page\r\n" + 
				"7. Home Page\r\n" +
				"8. Exit\r\n" +
				"");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Acer Predator",67990,scan1.nextInt());
			p.setTotal(67990*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("HP Omen",81990,scan1.nextInt());
			p.setTotal(81990*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("MSI G Ryzen",69990,scan1.nextInt());
			p.setTotal(69990*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Lenovo Ideapad L340",72990,scan1.nextInt());
			p.setTotal(72990*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Dell XPS 15",249990,scan1.nextInt());
			p.setTotal(249990*p.getQuantity());
			break;

		case 6:
			chooseElectronics();
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
				chooseLaptop();
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

	//******************************************************************* CHOOSING CAMERAS *****************************************************************************

	public void chooseCamera() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Nikon D3500\t\t\tRate=Rs.28,999\r\n" + 
				"2. Canon EOS 200D ||\t\tRate=Rs.47,999\r\n" + 
				"3. Canon M50\t\t\tRate=Rs.49,999\r\n" + 
				"4. Sony ILCE-6000L/B\t\tRate=Rs.40,999\r\n" + 
				"5. Nikon D5600\t\t\tRate=Rs.38,999\r\n" +
				"6. Previous Page\r\n" + 
				"7. Home Page\r\n" +
				"8. Exit\r\n" +
				"");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Nikon D3500",28999,scan1.nextInt());
			p.setTotal(28999*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Canon EOS 200D ||",47999,scan1.nextInt());
			p.setTotal(47999*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Canon M50",49999,scan1.nextInt());
			p.setTotal(49999*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Sony ILCE-6000L/B",40999,scan1.nextInt());
			p.setTotal(40999*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Nikon D5600",38999,scan1.nextInt());
			p.setTotal(38999*p.getQuantity());
			break;

		case 6:
			chooseElectronics();
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
				chooseLaptop();
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
