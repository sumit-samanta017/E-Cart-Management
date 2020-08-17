package Shopping;

import java.util.*;

class Clothes {

	static Scanner scan1=new Scanner(System.in);
	Person p;
	static Clothes c=new Clothes();

	//********************************************* CHOOSING CLOTHES ********************************************************************8

	public static void chooseClothes() {
		System.out.println("******************************************************************************************");
		System.out.println("CLOTHES");
		System.out.println("******************************************************************************************");

		System.out.println("1. Men's\r\n" + 
				"2. Women's\r\n" + 
				"3. Kid's\r\n" + 
				"4. Home page\r\n" + 
				"5. Exit\r\n" + 
				"");

		System.out.println("Enter your choice");
		switch(scan1.nextInt()) {//Choosing types of clothes

		case 1:
			System.out.println("*****************************************************************************************");
			System.out.println("MEN");
			menTypesOfClothes();
			break;

		case 2:
			System.out.println("*****************************************************************************************");
			System.out.println("WOMEN");
			womenTypesOfClothes();
			break;

		case 3:
			System.out.println("*****************************************************************************************");
			System.out.println("KIDS");
			kidTypesOfClothes();
			break;

		case 4:
			Launch.homePage();
			break;

		case 5:
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
				chooseClothes();
			}
		}
	}

	//************************************************************##############################################################**********************************************	

	//************************************************************ FOR MEN ***************************************************************************************

	public static void menTypesOfClothes() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Tshirts\r\n" + 
				"2. Shirts\r\n" + 
				"3. Pants\r\n" + 
				"4. Shorts\r\n" + 
				"5. Previous Page\r\n" + 
				"6. Home Page\r\n" + 
				"7. Exit\r\n" + 
				"");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("*****************************************************************************************");
			System.out.println("TSHIRTS");
			c.menTShirt();
			break;

		case 2:
			System.out.println("*****************************************************************************************");
			System.out.println("SHIRTS");
			c.menShirt();
			break;

		case 3:
			System.out.println("*****************************************************************************************");
			System.out.println("PANTS");
			c.menPants();
			break;

		case 4:
			System.out.println("*****************************************************************************************");
			System.out.println("SHORTS");
			c.menShorts();
			break;

		case 5:
			chooseClothes();
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
				menTypesOfClothes();
			}
		}
	}

	//*********************************************************************** MEN T-SHIRTS ************************************************************************8

	public void menTShirt() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Puma\t\t\t\tRate=Rs.900\r\n" + 
				"2. U.S.polo\t\t\tRate=Rs.850\r\n" + 
				"3. PeterEnglend\t\t\tRate=Rs.840\r\n" + 
				"4. Adidas\t\t\tRate=Rs.860\r\n" + 
				"5. Lacoste\t\t\tRate=Rs.950\r\n" + 
				"6. Gucci\t\t\tRate=Rs.908\r\n" + 
				"7. Previous Page\r\n" + 
				"8. Home Page\r\n" + 
				"9. Exit\r\n" + 
				"");
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Puma",900,scan1.nextInt());
			p.setTotal(900*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("U.S.Polo",850,scan1.nextInt());
			p.setTotal(850*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Peter England",840,scan1.nextInt());
			p.setTotal(840*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Adidas",860,scan1.nextInt());
			p.setTotal(860*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Lacoste",950,scan1.nextInt());
			p.setTotal(950*p.getQuantity());
			break;

		case 6:
			System.out.println("Enter the quantity");
			p=new Person("Gucci",908,scan1.nextInt());
			p.setTotal(908*p.getQuantity());
			break;

		case 7:
			menTypesOfClothes();
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
				menTShirt();
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

	//**************************************************************** MEN SHIRTS **********************************************************************************

	public void menShirt() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Louis Philippe\t\tRate=Rs.1000\r\n" + 
				"2. John Players\t\t\tRate=Rs.1500\r\n" + 
				"3. Levi's\t\t\tRate=Rs.1320\r\n" + 
				"4. Tommy Hilfiger\t\tRate=Rs.1540\r\n" + 
				"5. Versace\t\t\tRate=Rs.2000\r\n" + 
				"6. Hugo Boss\t\t\tRate=Rs.2540\r\n" + 
				"7. Previouspage\r\n" + 
				"8. Home Page\r\n" + 
				"9. Exit\r\n" + 
				"");
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Louis Philippe",1000,scan1.nextInt());
			p.setTotal(1000*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("John Players",1500,scan1.nextInt());
			p.setTotal(1500*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Levis",1320,scan1.nextInt());
			p.setTotal(1320*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Tommy Hilfiger",1540,scan1.nextInt());
			p.setTotal(1540*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Versace",2000,scan1.nextInt());
			p.setTotal(2000*p.getQuantity());
			break;

		case 6:
			System.out.println("Enter the quantity");
			p=new Person("Hugo Boss",2540,scan1.nextInt());
			p.setTotal(2540*p.getQuantity());
			break;

		case 7:
			menTypesOfClothes();
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
				menShirt();
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

	//**************************************************************** MEN PANTS ******************************************************************************

	public void menPants() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Louis Philippe\t\tRate=Rs.1000\r\n" +
				"2. John Players\t\t\tRate=Rs.1300\r\n" +
				"3. Levi's\t\t\tRate=Rs.1320\r\n" +
				"4. Tommy Hilfiger\t\tRate=Rs.1500\r\n" +
				"5. Gucci\t\t\tRate=Rs.1000\r\n" +
				"6. Previous Page\r\n" +
				"7. Home Page\r\n" +
				"8. Exit\r\n" +
				"");
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Louis Philippe",1000,scan1.nextInt());
			p.setTotal(1000*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("John Players",1300,scan1.nextInt());
			p.setTotal(1300*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Levi's",1320,scan1.nextInt());
			p.setTotal(1320*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Tommy Hilfiger",1500,scan1.nextInt());
			p.setTotal(1500*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Gucci",1000,scan1.nextInt());
			p.setTotal(1000*p.getQuantity());
			break;

		case 6:
			menTypesOfClothes();
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
				menPants();
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

	//*********************************************************************** MEN SHORTS *************************************************************************8

	public void menShorts() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Nike\t\t\tRate=Rs.1271\r\n" +
				"2. Jockey\t\tRate=Rs.600\r\n" +
				"3. Forest Club\t\tRate=Rs.285\r\n" +
				"4. Wildcraft\t\tRate=Rs.649\r\n" +
				"5. Reebok\t\tRate=Rs.1049\r\n" +
				"6. Previouspage\r\n" +
				"7. Home Page\r\n" +
				"8. Exit\r\n" +
				"");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Nike",1271,scan1.nextInt());
			p.setTotal(1271*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Jockey",600,scan1.nextInt());
			p.setTotal(600*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Forest Club",285,scan1.nextInt());
			p.setTotal(285*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Wildcraft",649,scan1.nextInt());
			p.setTotal(649*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Reebok",1049,scan1.nextInt());
			p.setTotal(1049*p.getQuantity());
			break;

		case 6:
			menTypesOfClothes();
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
				menShorts();
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

	//#############################################################*******************************************************************###################################
	//******************************************************************** FOR WOMEN *******************************************************************************************

	public static void womenTypesOfClothes() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. TShirts\r\n" + 
				"2. Shirts\r\n" + 
				"3. Pants\r\n" + 
				"4. Sarees\r\n" +
				"5. Previous page\r\n" + 
				"6. Home Page\r\n" + 
				"7. Exit\r\n" + 
				"");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("*****************************************************************************************");
			System.out.println("TSHIRTS");
			c.womenTShirt();
			break;

		case 2:
			System.out.println("*****************************************************************************************");
			System.out.println("SHIRTS");
			c.womenShirt();
			break;

		case 3:
			System.out.println("*****************************************************************************************");
			System.out.println("PANTS");
			c.womenPants();
			break;

		case 4:
			System.out.println("*****************************************************************************************");
			System.out.println("SAREES");
			c.womenSarees();
			break;

		case 5:
			chooseClothes();
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
				womenTypesOfClothes();
			}
		}
	}

	//************************************************************************ WOMEN T-SHIRT ********************************************************************

	public void womenTShirt() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Puma\t\t\t\tRate=Rs.800\r\n" + 
				"2. U.S.polo\t\t\tRate=Rs.950\r\n" + 
				"3. PeterEnglend\t\t\tRate=Rs.840\r\n" + 
				"4. Adidas\t\t\tRate=Rs.660\r\n" + 
				"5. Lacoste\t\t\tRate=Rs.950\r\n" + 
				"6. Gucci\t\t\tRate=Rs.900\r\n" + 
				"7. Previous Page\r\n" + 
				"8. Home Page\r\n" + 
				"9. Exit\r\n" + 
				"");
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Puma",800,scan1.nextInt());
			p.setTotal(800*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("U.S.Polo",950,scan1.nextInt());
			p.setTotal(950*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Peter England",840,scan1.nextInt());
			p.setTotal(840*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Adidas",660,scan1.nextInt());
			p.setTotal(660*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Lacoste",950,scan1.nextInt());
			p.setTotal(950*p.getQuantity());
			break;

		case 6:
			System.out.println("Enter the quantity");
			p=new Person("Gucci",900,scan1.nextInt());
			p.setTotal(900*p.getQuantity());
			break;

		case 7:
			womenTypesOfClothes();
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
				womenTShirt();
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

	//******************************************************************* WOMEN SHIRT *******************************************************************************8

	public void womenShirt() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Louis Philippe\t\tRate=Rs.1040\r\n" + 
				"2. John Players\t\t\tRate=Rs.1200\r\n" + 
				"3. Levi's\t\t\tRate=Rs.1120\r\n" + 
				"4. Tommy Hilfiger\t\tRate=Rs.1500\r\n" + 
				"5. Versace\t\t\tRate=Rs.1800\r\n" + 
				"6. Hugo Boss\t\t\tRate=Rs.2240\r\n" + 
				"7. Previous Page\r\n" + 
				"8. Home Page\r\n" + 
				"9. Exit\r\n" + 
				"");
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Louis Philippe",1040,scan1.nextInt());
			p.setTotal(1040*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("John Players",1200,scan1.nextInt());
			p.setTotal(1200*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Levis",1120,scan1.nextInt());
			p.setTotal(1120*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Tommy Hilfiger",1500,scan1.nextInt());
			p.setTotal(1500*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Versace",1800,scan1.nextInt());
			p.setTotal(1800*p.getQuantity());
			break;

		case 6:
			System.out.println("Enter the quantity");
			p=new Person("Hugo Boss",2240,scan1.nextInt());
			p.setTotal(2240*p.getQuantity());
			break;

		case 7:
			womenTypesOfClothes();
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
				womenShirt();
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

	//********************************************************************* WOMEN PANTS ***************************************************************************

	public void womenPants() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Louis Philippe\t\tRate=Rs.1200\r\n" +
				"2. John Players\t\t\tRate=Rs.1350\r\n" +
				"3. Levi's\t\t\tRate=Rs.1120\r\n" +
				"4. Tommy Hilfiger\t\tRate=Rs.1400\r\n" +
				"5. Gucci\t\t\tRate=Rs.1600\r\n" +
				"6. Previous Page\r\n" +
				"7. Home Page\r\n" +
				"8. Exit\r\n" +
				"");
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Louis Philippe",1200,scan1.nextInt());
			p.setTotal(1200*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("John Players",1350,scan1.nextInt());
			p.setTotal(1350*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Levi's",1120,scan1.nextInt());
			p.setTotal(1120*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Tommy Hilfiger",1400,scan1.nextInt());
			p.setTotal(1400*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Gucci",1600,scan1.nextInt());
			p.setTotal(1600*p.getQuantity());
			break;

		case 6:
			womenTypesOfClothes();
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
				womenPants();
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

	//**************************************************************************** WOMEN SAREES *********************************************************************

	public void womenSarees() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Saara\t\t\tRate=Rs.499\r\n" +
				"2. SNH Export\t\t\tRate=Rs.625\r\n" +
				"3. Anand Sarees\t\t\tRate=Rs.449\r\n" +
				"4. Perfect Wear\t\t\tRate=Rs.1049\r\n" +
				"5. Previous Page\r\n" +
				"6. Home Page\r\n" +
				"7. Exit\r\n" +
				"");
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Saara",499,scan1.nextInt());
			p.setTotal(499*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("SNH Export",625,scan1.nextInt());
			p.setTotal(625*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Anand Sarees",449,scan1.nextInt());
			p.setTotal(449*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Perfect Wear",1049,scan1.nextInt());
			p.setTotal(1049*p.getQuantity());
			break;

		case 5:
			womenTypesOfClothes();
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
				womenSarees();
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

	//***************************************************################################################################****************************************************
	//************************************************************************ FOR KIDS **************************************************************************************

	public static void kidTypesOfClothes() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Tshirts\r\n" + 
				"2. Shirts\r\n" + 
				"3. Pants\r\n" + 
				"4. Track Pants\r\n" + 
				"5. Previous Page\r\n" + 
				"6. Home Page\r\n" + 
				"7. Exit\r\n" + 
				"");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("*****************************************************************************************");
			System.out.println("TSHIRTS");
			c.kidTShirt();
			break;

		case 2:
			System.out.println("*****************************************************************************************");
			System.out.println("SHIRTS");
			c.kidShirt();
			break;

		case 3:
			System.out.println("*****************************************************************************************");
			System.out.println("PANTS");
			c.kidPant();
			break;

		case 4:
			System.out.println("*****************************************************************************************");
			System.out.println("TRACK PANTS");
			c.kidTrackSuit();
			break;

		case 5:
			chooseClothes();
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
				kidTypesOfClothes();
			}
		}
	}

	//*********************************************************************** KID T-SHIRT ********************************************************************************

	public void kidTShirt() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Allen Solly\t\t\tRate=Rs.619\r\n" + 
				"2. Miss & Chief\t\t\tRate=Rs.759\r\n" + 
				"3. Provogue\t\t\tRate=Rs.319\r\n" + 
				"4. BARE KIDS\t\t\tRate=Rs.449\r\n" + 
				"5. Sevnix\t\t\tRate=Rs.299\r\n" + 
				"6. Flying Machine Kids\t\tRate=Rs.289\r\n" + 
				"7. Previous Page\r\n" + 
				"8. Home Page\r\n" + 
				"9. Exit\r\n" + 
				"");
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Allen Solly",619,scan1.nextInt());
			p.setTotal(619*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Miss & Chief",759,scan1.nextInt());
			p.setTotal(759*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Provogue",319,scan1.nextInt());
			p.setTotal(319*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("BARE KIDS",449,scan1.nextInt());
			p.setTotal(449*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Sevnix",299,scan1.nextInt());
			p.setTotal(299*p.getQuantity());
			break;

		case 6:
			System.out.println("Enter the quantity");
			p=new Person("Flying Machine Kids",289,scan1.nextInt());
			p.setTotal(289*p.getQuantity());
			break;

		case 7:
			kidTypesOfClothes();
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
				kidTShirt();
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

	//****************************************************************** KID SHIRT ***********************************************************************************

	public void kidShirt() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. Indian Terrain\t\tRate=Rs.459\r\n" + 
				"2. US Polo Kids\t\t\tRate=Rs.669\r\n" + 
				"3. Allen Solly\t\t\tRate=Rs.759\r\n" + 
				"4. Provogue\t\t\tRate=Rs.489\r\n" + 
				"5. Pepe Jeans\t\t\tRate=Rs.749\r\n" + 
				"6. GINI & JONY\t\t\tRate=Rs.579\r\n" + 
				"7. Previous Page\r\n" + 
				"8. Home Page\r\n" + 
				"9. Exit\r\n" + 
				"");
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Indian Terrain",459,scan1.nextInt());
			p.setTotal(459*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("US Polo Kids",669,scan1.nextInt());
			p.setTotal(669*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Allen Solly",759,scan1.nextInt());
			p.setTotal(759*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Provogue",489,scan1.nextInt());
			p.setTotal(489*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Pepe Jeans",749,scan1.nextInt());
			p.setTotal(749*p.getQuantity());
			break;

		case 6:
			System.out.println("Enter the quantity");
			p=new Person("GINI & JONY",579,scan1.nextInt());
			p.setTotal(579*p.getQuantity());
			break;

		case 7:
			kidTypesOfClothes();
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
				kidShirt();
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

	//********************************************************************** KID PANTS ************************************************************************************

	public void kidPant() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. KYADA KIDS\t\t\tRate=Rs.599\r\n" +
				"2. Manzon\t\t\tRate=Rs.272\r\n" +
				"3. x2o\t\t\t\tRate=Rs.539\r\n" +
				"4. Kuchipoo\t\t\tRate=Rs.569\r\n" +
				"5. Cherokee\t\t\tRate=Rs.269\r\n" +
				"6. Previous Page\r\n" +
				"7. Home Page\r\n" +
				"8. Exit\r\n" +
				"");
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("KYADA KIDS",599,scan1.nextInt());
			p.setTotal(599*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Manzon",272,scan1.nextInt());
			p.setTotal(272*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("x2o",539,scan1.nextInt());
			p.setTotal(539*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Kuchipoo",569,scan1.nextInt());
			p.setTotal(569*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("Cherokee",269,scan1.nextInt());
			p.setTotal(269*p.getQuantity());
			break;

		case 6:
			kidTypesOfClothes();
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
				kidPant();
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

	//*********************************************************************** KID TRACK SUITS *****************************************************************************

	public void kidTrackSuit() {

		System.out.println("*****************************************************************************************");

		System.out.println("1. IndiWeaves\t\t\tRate=Rs.899\r\n" +
				"2. Burdy\t\t\tRate=Rs.449\r\n" +
				"3. POWERHAWKE\t\t\tRate=Rs.699\r\n" +
				"4. Shaun\t\t\tRate=Rs.808\r\n" +
				"5. VDG\t\t\t\tRate=Rs.608\r\n" +
				"6. Previous Page\r\n" +
				"7. Home Page\r\n" +
				"8. Exit\r\n" +
				"");
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("IndiWeaves",899,scan1.nextInt());
			p.setTotal(899*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Burdy",449,scan1.nextInt());
			p.setTotal(449*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("POWERHAWKE",699,scan1.nextInt());
			p.setTotal(699*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Shaun",808,scan1.nextInt());
			p.setTotal(808*p.getQuantity());
			break;

		case 5:
			System.out.println("Enter the quantity");
			p=new Person("VDG",608,scan1.nextInt());
			p.setTotal(608*p.getQuantity());
			break;

		case 6:
			kidTypesOfClothes();
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
				kidTrackSuit();
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
