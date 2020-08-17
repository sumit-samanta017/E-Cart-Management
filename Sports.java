package Shopping;

import java.util.Scanner;

public class Sports {

	static Scanner scan1=new Scanner(System.in);
	Person p;
	static Sports sports=new Sports();


	//*******************************########################### CHOOSING SPORTS ##############################***********************************
	public static void chooseSports() {

		System.out.println("******************************************************************************************");
		System.out.println("SPORTS");
		System.out.println("******************************************************************************************");

		System.out.println("1. Cricket\r\n"
				+ "2. Badminton\r\n"
				+ "3. Cycling\r\n"
				+ "4. Football\r\n"
				+ "5. Swimming\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit"
				+ "");

		System.out.println("Enter your choice");

		//Choosing type of Sports

		switch(scan1.nextInt()) {

		case 1:
			System.out.println("*****************************************************************************************");
			System.out.println("CRICKET");
			chooseCricket();
			break;

		case 2:
			System.out.println("*****************************************************************************************");
			System.out.println("BADMINTON");
			chooseBadminton();
			break;

		case 3:
			System.out.println("*****************************************************************************************");
			System.out.println("CYCLING");
			chooseCycling();
			break;

		case 4:
			System.out.println("*****************************************************************************************");
			System.out.println("FOOTBALL");
			chooseFootball();
			break;

		case 5:
			System.out.println("*****************************************************************************************");
			System.out.println("SWIMMING");
			chooseSwimming();
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
				chooseSports();
			}
		}

	}


	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING CRICKET ##############################***********************************


	public static void chooseCricket() {

		System.out.println("******************************************************************************************");
		System.out.println("1. Cricket Bats\r\n"
				+ "2. Cricket Balls\r\n"
				+ "3. Cricket Kits\r\n"
				+ "4. Cricket Gloves\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		switch(scan1.nextInt()) {

		case 1:
			System.out.println("******************************************************************************************");
			System.out.println("CRICKET BATS");
			sports.choosingCricketBats();
			break;

		case 2:
			System.out.println("******************************************************************************************");
			System.out.println("CRICKET BALLS");
			sports.choosingCricketBalls();
			break;

		case 3:
			System.out.println("******************************************************************************************");
			System.out.println("CRICKET KITS");
			sports.choosingCricketKits();
			break;

		case 4:
			System.out.println("******************************************************************************************");
			System.out.println("CRICKET GLOVES");
			sports.choosingCricketGloves();
			break;


		case 5:
			chooseSports();
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
				chooseCricket();
			}
		}

	}


	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING BADMINTON ##############################***********************************


	public static void chooseBadminton() {

		System.out.println("******************************************************************************************");
		System.out.println("1. Badminton Racquet\r\n"
				+ "2. Shuttles\r\n"
				+ "3. Badminton Kits\r\n"
				+ "4. Badminton Bag\r\n"
				+ "5. Badminton Grip\r\n"
				+ "6. Previous Page\r\n"
				+ "7. Home Page\r\n"
				+ "8. Exit\r\n"
				+ "");

		switch(scan1.nextInt()) {

		case 1:
			System.out.println("******************************************************************************************");
			System.out.println("BADMINTON RACQUET");
			sports.choosingBadmintonRacquet();
			break;

		case 2:
			System.out.println("******************************************************************************************");
			System.out.println("SHUTTLES");
			sports.choosingShuttles();
			break;

		case 3:
			System.out.println("******************************************************************************************");
			System.out.println("BADMINTON KITS");
			sports.choosingBadmintonKits();
			break;

		case 4:
			System.out.println("******************************************************************************************");
			System.out.println("BADMINTON BAG");
			sports.choosingBadmintonBag();
			break;

		case 5:
			System.out.println("******************************************************************************************");
			System.out.println("BADMINTON GRIP");
			sports.choosingBadmintonGrip();
			break;

		case 6:
			chooseSports();
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
				chooseBadminton();
			}	
		}

	}


	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING CYCLE ##############################***********************************


	public static void chooseCycling() {

		System.out.println("******************************************************************************************");
		System.out.println("1. Cycles\r\n"
				+ "2. Cycling Spares\r\n"
				+ "3. Cycling Kits\r\n"
				+ "4. Electric Cycle\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		switch(scan1.nextInt()) {

		case 1:
			System.out.println("******************************************************************************************");
			System.out.println("CYCLES");
			sports.choosingCycles();
			break;

		case 2:
			System.out.println("******************************************************************************************");
			System.out.println("CYCLING SPARES");
			sports.choosingCyclingSpares();
			break;

		case 3:
			System.out.println("******************************************************************************************");
			System.out.println("CYCLING KITS");
			sports.choosingCyclingKits();
			break;

		case 4:
			System.out.println("******************************************************************************************");
			System.out.println("ELECTRIC CYCLE");
			sports.choosingElectricCycle();
			break;

		case 5:
			chooseSports();
			break;

		case 6:
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
				chooseCycling();
			}	

		}	

	}

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING FOOTBALL ##############################***********************************

	public static void chooseFootball() {

		System.out.println("******************************************************************************************");
		System.out.println("1. Footballs\r\n"
				+ "2. Football Gloves\r\n"
				+ "3. Football Guards\r\n"
				+ "4. Football Bags\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		switch(scan1.nextInt()) {

		case 1:
			System.out.println("******************************************************************************************");
			System.out.println("FOOTBALLS");
			sports.choosingFootballs();
			break;

		case 2:
			System.out.println("******************************************************************************************");
			System.out.println("FOOTBALL GLOVES");
			sports.choosingFootballGloves();
			break;

		case 3:
			System.out.println("******************************************************************************************");
			System.out.println("FOOTBALL GUARDS");
			sports.choosingFootballGuards();
			break;

		case 4:
			System.out.println("******************************************************************************************");
			System.out.println("FOOTBALL BAGS");
			sports.choosingFootballBags();
			break;

		case 5:
			System.out.println("******************************************************************************************");
			chooseSports();
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
				chooseFootball();
			}	

		}

	}

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING SWIMMING ##############################***********************************

	public static void chooseSwimming() {
		System.out.println("******************************************************************************************");
		System.out.println("1. Swimming Paddle\r\n"
				+ "2. Swimming Goggles\r\n"
				+ "3. Swimming Caps\r\n"
				+ "4. Previous Page\r\n"
				+ "5. Home Page\r\n"
				+ "6. Exit\r\n"
				+ "");

		switch(scan1.nextInt()) {

		case 1:
			System.out.println("******************************************************************************************");
			System.out.println("SWIMMING PADDLE");
			sports.choosingSwimmingPaddle();
			break;

		case 2:
			System.out.println("******************************************************************************************");
			System.out.println("SWIMMING GOGGLES");
			sports.choosingSwimmingGoggles();
			break;

		case 3:
			System.out.println("******************************************************************************************");
			System.out.println("SWIMMING CAPS");
			sports.choosingSwimmingCaps();
			break;

		case 4:
			System.out.println("******************************************************************************************");
			chooseSports();
			break;

		case 5:
			System.out.println("******************************************************************************************");
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
				chooseSwimming();
			}	

		}

	}

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING CRICKET BATS ##############################***********************************

	public void choosingCricketBats() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. MRF ENDORSED | for Light/Hard Tennis Ball [with Cover] (1000-1200 g)\tRate=Rs.400\r\n"
				+ "2. SS SUPER POWER KW Kashmir Willow Cricket Bat  (1.180 – 1.250 kg)\tRate=Rs.1399\r\n"
				+ "3. Spartan MS Dhoni RUN Kashmir Willow Cricket Bat  (1162)\t\tRate=Rs.1499\r\n"
				+ "4. SG RSD SPARK Kashmir Willow Cricket Bat  (1.180 – 1.250 kg)\t\tRate=rs.1549\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("MRF ENDORSED | for Light/Hard Tennis Ball [with Cover] (1000-1200 g)", 400, scan1.nextInt());
			p.setTotal(400*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("SS SUPER POWER KW Kashmir Willow Cricket Bat  (1.180 – 1.250 kg)", 1399, scan1.nextInt());
			p.setTotal(1399*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Spartan MS Dhoni RUN Kashmir Willow Cricket Bat  (1162)", 1499, scan1.nextInt());
			p.setTotal(1499*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("SG RSD SPARK Kashmir Willow Cricket Bat  (1.180 – 1.250 kg)", 1549, scan1.nextInt());
			p.setTotal(1549*p.getQuantity());
			break;

		case 5:
			chooseCricket();
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
				choosingCricketBats();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING CRICKET BALLS ##############################***********************************

	public void choosingCricketBalls() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Willage Tennis Ball Light Weight Green Color,(Pack of 6)\t\tRate=Rs.192\r\n"
				+ "2. CLUB 2 Part Balls Set of 2 Cricket Leather Ball  (Pack of 2, Maroon)\tRate=Rs.234\r\n"
				+ "3. CLUB 4 pc BALL Cricket Leather Ball  (Pack of 1, Red)\t\tRate=Rs.299\r\n"
				+ "4. Kookaburra KB Pace White-PW Cricket Leather Ball  (Pack of 1, White)\tRate=Rs.999\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n" + 
				"");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Willage Tennis Ball Light Weight Green Color,(Pack of 6)", 192, scan1.nextInt());
			p.setTotal(192*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("CLUB 2 Part Balls Set of 2 Cricket Leather Ball  (Pack of 2, Maroon)", 234, scan1.nextInt());
			p.setTotal(234*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("CLUB 4 pc BALL Cricket Leather Ball  (Pack of 1, Red)", 299, scan1.nextInt());
			p.setTotal(299*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Kookaburra KB Pace White-PW Cricket Leather Ball  (Pack of 1, White)", 999, scan1.nextInt());
			p.setTotal(999*p.getQuantity());
			break;

		case 5:
			chooseCricket();
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
				choosingCricketBalls();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING CRICKET KITS ##############################***********************************

	public void choosingCricketKits() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. SUNLEY Sarthak Junior Combo Cricket Kit (Bat Size : 3(For 8 Years Kids))\tRate=Rs.685\r\n" + 
				"2. Vicky Supreme Cricket Kit\t\t\t\t\t\t\tRate=Rs.649\r\n" + 
				"3. BDM SuperLite Cricket Kit Cricket Kit (Bat Size: 4(Age Group 9 - 11 Years))\tRate=Rs.4,099\r\n" + 
				"4. Pioneer Cricket Set 4 Cricket Kit\t\t\t\t\t\tRate=Rs.567\r\n" + 
				"5. Previous Page\r\n" +
				"6. Home Page\r\n" +
				"7. Exit\r\n"
				+ "");


		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("SUNLEY Sarthak Junior Combo Cricket Kit (Bat Size : 3(For 8 Years Kids))", 685, scan1.nextInt());
			p.setTotal(685*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Vicky Supreme Cricket Kit", 649, scan1.nextInt());
			p.setTotal(649*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("BDM SuperLite Cricket Kit Cricket Kit (Bat Size: 4(Age Group 9 - 11 Years))", 4099, scan1.nextInt());
			p.setTotal(4099*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Pioneer Cricket Set 4 Cricket Kit", 567, scan1.nextInt());
			p.setTotal(567*p.getQuantity());
			break;

		case 5:
			chooseCricket();
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
				choosingCricketKits();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING CRICKET GLOVES ##############################***********************************

	public void choosingCricketGloves() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. JetFire Basic Batting Gloves Combo With Best Inner Gloves Batting Gloves(Multicolor)\tRate=Rs.349\r\n" + 
				"2. SG Ecolite Batting Gloves (Assorted)\t\t\t\t\t\t\tRate=Rs.579\r\n" + 
				"3. SG CAMPUS YOUTH RH Batting Gloves (Assorted)\t\t\t\t\t\tRate=Rs.479\r\n" + 
				"4. Kookaburra KB Blaze 100(RH)-Mens Batting Gloves (Black, Orange & Red)\t\tRate=Rs.849\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("JetFire Basic Batting Gloves Combo With Best Inner Gloves Batting Gloves(Multicolor)", 349, scan1.nextInt());
			p.setTotal(349*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("SG Ecolite Batting Gloves (Assorted)", 579, scan1.nextInt());
			p.setTotal(579*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("SG CAMPUS YOUTH RH Batting Gloves (Assorted)", 479, scan1.nextInt());
			p.setTotal(479*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Kookaburra KB Blaze 100(RH)-Mens Batting Gloves (Black, Orange & Red)", 849, scan1.nextInt());
			p.setTotal(849*p.getQuantity());
			break;

		case 5:
			chooseCricket();
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
				choosingCricketGloves();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING BADMINTON RACQUET ##############################***********************************

	public void choosingBadmintonRacquet() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. ADIDAS SpielerP09 Blue Unstrung Badminton Racquet (Pack of: 1, 84 g)\t\tRate=Rs.2,679\r\n" + 
				"2. Yonex GR 303 F Red Strung Badminton Racquet  (Pack of: 1, 95 g)\t\tRate=Rs.510\r\n" + 
				"3. Li-Ning Smash XP-1 Red, Gold Strung Badminton Racquet\t\t\tRate=Rs.500\r\n" + 
				"4. ADIDAS Wucht P5 Pink Strung Badminton Racquet  (Pack of: 1, 117 g)\t\tRate=Rs.5,699\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("ADIDAS SpielerP09 Blue Unstrung Badminton Racquet (Pack of: 1, 84 g)", 2679, scan1.nextInt());
			p.setTotal(2679*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Yonex GR 303 F Red Strung Badminton Racquet  (Pack of: 1, 95 g)", 510, scan1.nextInt());
			p.setTotal(510*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Li-Ning Smash XP-1 Red, Gold Strung Badminton Racquet", 500, scan1.nextInt());
			p.setTotal(500*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("ADIDAS Wucht P5 Pink Strung Badminton Racquet  (Pack of: 1, 117 g)", 5699, scan1.nextInt());
			p.setTotal(5699*p.getQuantity());
			break;

		case 5:
			chooseBadminton();
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
				choosingBadmintonRacquet();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING SHUTTLES ##############################***********************************

	public void choosingShuttles() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Yonex MAVIS 350 - Green Cap Nylon Shuttle - Yellow  (Slow, 75, Pack of 6)\t\tRate=Rs.749\r\n" + 
				"2. Vista BOXER Feather Shuttle - White  (Medium Slow, 76, Pack of 10)\t\t\tRate=Rs.189\r\n"
				+ "3. Yonex Aeroclub-TR Feather Shuttle - Multicolor  (Medium, 77, Pack of 12)\t\tRate=Rs.1,099\r\n" + 
				"4. Li-Ning Championship Nylon Shuttle - Yellow  (Slow, 75, Pack of 6)\t\t\tRate=Rs.467\r\n" + 
				"5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Yonex MAVIS 350 - Green Cap Nylon Shuttle - Yellow  (Slow, 75, Pack of 6)", 749, scan1.nextInt());
			p.setTotal(749*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Vista BOXER Feather Shuttle - White  (Medium Slow, 76, Pack of 10)", 189, scan1.nextInt());
			p.setTotal(189*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Yonex Aeroclub-TR Feather Shuttle - Multicolor  (Medium, 77, Pack of 12)", 1099, scan1.nextInt());
			p.setTotal(1099*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Li-Ning Championship Nylon Shuttle - Yellow  (Slow, 75, Pack of 6)", 467, scan1.nextInt());
			p.setTotal(467*p.getQuantity());
			break;

		case 5:
			chooseBadminton();
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
				choosingShuttles();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING BADMINTON KITS ##############################***********************************    

	public void choosingBadmintonKits() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Feroc Wide body Badminton Racquet Badminton Kit\t\tRate=Rs.390\r\n" + 
				"2. Silver's Flex-Combo-4 Badminton Kit\t\t\t\tRate=Rs.295\r\n" + 
				"3. Silver's FIRE Badminton Kit (2 Racquets with Cover)\t\tRate=Rs.589\r\n" + 
				"4. Rk Son 98098 Badminton Kit\t\t\t\t\tRate=Rs.280\r\n" + 
				"5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Feroc Wide body Badminton Racquet Badminton Kit", 390, scan1.nextInt());
			p.setTotal(390*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Silver's Flex-Combo-4 Badminton Kit", 295, scan1.nextInt());
			p.setTotal(295*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Silver's FIRE Badminton Kit (2 Racquets with Cover)", 589, scan1.nextInt());
			p.setTotal(589*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Rk Son 98098 Badminton Kit", 280, scan1.nextInt());
			p.setTotal(280*p.getQuantity());
			break;

		case 5:
			chooseBadminton();
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
				choosingBadmintonKits();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING BADMINTON BAG ##############################***********************************       

	public void choosingBadmintonBag() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Triumph Pro-303 Lime/blue Badminton Kit Bag\t\tRate=Rs.899\r\n"
				+ "2. Li-Ning ABDP374-2 (Blue, Kit Bag)\t\t\tRate=Rs.1,701\r\n"
				+ "3. Li-Ning Elite Kit-Bag with Shoe Bag (Black, Kit Bag)\tRate=Rs.1,990\r\n" + 
				"4. ADIDAS VS3 Holdall (White, Kit Bag)\t\t\tRate=Rs.1,999\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Triumph Pro-303 Lime/blue Badminton Kit Bag", 899, scan1.nextInt());
			p.setTotal(899*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Li-Ning ABDP374-2 (Blue, Kit Bag)", 1701, scan1.nextInt());
			p.setTotal(1701*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Li-Ning Elite Kit-Bag with Shoe Bag (Black, Kit Bag)", 1990, scan1.nextInt());
			p.setTotal(1990*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("ADIDAS VS3 Holdall (White, Kit Bag)", 1999, scan1.nextInt());
			p.setTotal(1999*p.getQuantity());
			break;

		case 5:
			chooseBadminton();
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
				choosingBadmintonBag();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING BADMINTON GRIP ##############################***********************************         

	public void choosingBadmintonGrip() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Arrowmax PROFESSIONAL DOTTED RACKET GRIP / PACK OF 3 Super Tacky (Multicolor, Pack of 3)\tRate=Rs.165\r\n" + 
				"2. Yonex ET 902 E Super Smooth Tacky  (Multicolor, Pack of 5)\t\t\t\t\tRate=Rs.399\r\n" + 
				"3. Li-Ning GP18 Badminton Racquet Replacement Grip, Black Diamond  (Black, Pack of 1)\t\tRate=Rs.210\r\n" + 
				"4. Yonex YONEX GRIP AC7405 Diamond  (Black, Red, Blue, Pack of 3)\t\t\t\tRate=Rs.549\r\n" + 
				"5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Arrowmax PROFESSIONAL DOTTED RACKET GRIP / PACK OF 3 Super Tacky (Multicolor, Pack of 3)", 165, scan1.nextInt());
			p.setTotal(165*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Yonex ET 902 E Super Smooth Tacky  (Multicolor, Pack of 5)", 399, scan1.nextInt());
			p.setTotal(399*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Li-Ning GP18 Badminton Racquet Replacement Grip, Black Diamond  (Black, Pack of 1)", 210, scan1.nextInt());
			p.setTotal(210*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Yonex YONEX GRIP AC7405 Diamond  (Black, Red, Blue, Pack of 3)", 549, scan1.nextInt());
			p.setTotal(549*p.getQuantity());
			break;

		case 5:
			chooseBadminton();
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
				choosingBadmintonGrip();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING CYCLES ##############################***********************************

	public void choosingCycles() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Hero Skyper 26T 26 T Mountain/Hardtail Cycle (Single Speed, Black)\t\tRate=Rs.5,099\r\n" + 
				"2. Hercules Roadeo A50 Large 26 T Mountain/Hardtail Cycle (21 Gear, Yellow)\tRate=Rs.11,999\r\n" + 
				"3. Hero Sapphire 27T 700C T Road Cycle  (Single Speed, Black, Yellow)\t\tRate=Rs.7,299\r\n" +  
				"4. Urban Terrain UT3000A27.5 Alloy MTB with 21 Shimano Gear\t\t\tRate=Rs.12,999\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter your choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Hero Skyper 26T 26 T Mountain/Hardtail Cycle (Single Speed, Black)", 5099, scan1.nextInt());
			p.setTotal(5099*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Hercules Roadeo A50 Large 26 T Mountain/Hardtail Cycle (21 Gear, Yellow)", 11999, scan1.nextInt());
			p.setTotal(11999*p.getQuantity());
			break;


		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Hero Sapphire 27T 700C T Road Cycle  (Single Speed, Black, Yellow)", 7299, scan1.nextInt());
			p.setTotal(7299*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Urban Terrain UT3000A27.5 Alloy MTB with 21 Shimano Gear", 12999, scan1.nextInt());
			p.setTotal(12999*p.getQuantity());
			break;

		case 5:
			chooseCycling();
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
				choosingCycles();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING CYCLING SPARES ##############################***********************************

	public void choosingCyclingSpares() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Dragon 15 Function Waterproof Bicycle Computer Odometer\t\t\tRate=Rs.260\r\n"
				+ "2. ShivExim Bicycle Atom Mudguard\t\t\t\t\t\tRate=Rs.195\r\n"
				+ "3. cycle world New Pair Cycling Lock-on Anti-slip Bicycle Handlebar\t\tRate=Rs.189\r\n"
				+ "4. Gadget Deals Shiman Premium 3*7 Speed & 3*7 Vitesses Gear Shifter\t\tRate=Rs.440\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Dragon 15 Function Waterproof Bicycle Computer Odometer", 260, scan1.nextInt());
			p.setTotal(260*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("ShivExim Bicycle Atom Mudguard", 195, scan1.nextInt());
			p.setTotal(195*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("cycle world New Pair Cycling Lock-on Anti-slip Bicycle Handlebar", 189, scan1.nextInt());
			p.setTotal(189*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Gadget Deals Shiman Premium 3*7 Speed & 3*7 Vitesses Gear Shifter", 440, scan1.nextInt());
			p.setTotal(440*p.getQuantity());
			break;

		case 5:
			chooseCycling();
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
				choosingCyclingSpares();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING CYCLING KITS ##############################***********************************

	public void choosingCyclingKits() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Dark Horse Bicycle Maintenance 14 in 1 Multi Function Tool Kit Cycling Kit\tRate=Rs.299\r\n" + 
				"2. Viva Sports VB-6108 Cycling Kit\t\t\t\t\t\tRate=Rs.1,300\r\n"
				+ "3. Vista 4BLUE Cycling Kit\t\t\t\t\t\t\tRate=Rs.272\r\n"
				+ "4. zorro sports BLACK CYCLING KIT Cycling Kit\t\t\t\t\tRate=Rs.230\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1 .nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Dark Horse Bicycle Maintenance 14 in 1 Multi Function Tool Kit Cycling Kit", 299, scan1.nextInt());
			p.setTotal(299*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Viva Sports VB-6108 Cycling Kit", 1300, scan1.nextInt());
			p.setTotal(1300*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Vista 4BLUE Cycling Kit", 272, scan1.nextInt());
			p.setTotal(272*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("zorro sports BLACK CYCLING KIT Cycling Kit", 230, scan1.nextInt());
			p.setTotal(230*p.getQuantity());
			break;

		case 5:
			chooseCycling();
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
				choosingCyclingKits();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING ELECTRIC CYCLE ##############################***********************************

	public void choosingElectricCycle() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Elife Air 20 inches Lithium-ion (Li-ion) Electric Cycle (Black, Single Speed)\t\tRate=Rs.35,999\r\n"
				+ "2. Lectro Clix Multi Speed 26 inches Lithium-ion (Li-ion) Electric Cycle (Blue, 7 Gear)\t\tRate=Rs.26,999\r\n" + 
				"3. Autonix VOLTIC | Titanium | Electric Bicycle\t\t\t\t\t\t\tRate=Rs.22,000\r\n"
				+ "4. Nibe Motors S1 Series Electric Cycle 26 inches Lithium-ion\t\t\t\t\tRate=Rs.36,666\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Elife Air 20 inches Lithium-ion (Li-ion) Electric Cycle (Black, Single Speed)", 35999, scan1.nextInt());
			p.setTotal(35999*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Lectro Clix Multi Speed 26 inches Lithium-ion (Li-ion) Electric Cycle (Blue, 7 Gear)", 26999, scan1.nextInt());
			p.setTotal(26999*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Autonix VOLTIC | Titanium | Electric Bicycle", 22000, scan1.nextInt());
			p.setTotal(22000*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Nibe Motors S1 Series Electric Cycle 26 inches Lithium-ion", 36666, scan1.nextInt());
			p.setTotal(36666*p.getQuantity());
			break;

		case 5:
			chooseCycling();
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
				choosingCyclingKits();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING FOOTBALLS ##############################***********************************

	public void choosingFootballs() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Vector X ATTACKER Football - Size : 5\tRate=Rs.269\r\n"
				+ "2. Nivia Storm Football - Size : 5\t\tRate=Rs.386\r\n"
				+ "3. Cosco Berlin Football - Size : 5\t\tRate=Rs.500\r\n"
				+ "4. Nova Play Cyclone Football - Size : 5\tRate=Rs.349\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Vector X ATTACKER Football - Size : 5", 269, scan1.nextInt());
			p.setTotal(269*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Nivia Storm Football - Size : 5", 386, scan1.nextInt());
			p.setTotal(386*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Cosco Berlin Football - Size : 5", 500, scan1.nextInt());
			p.setTotal(500*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Nova Play Cyclone Football - Size : 5", 349, scan1.nextInt());
			p.setTotal(349*p.getQuantity());
			break;

		case 5:
			chooseFootball();
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
				choosingFootballs();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING FOOTBALL GLOVES ##############################***********************************

	public void choosingFootballGloves() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Nivia Goalkeeper Goalkeeping Gloves\t\tRate=Rs.399\r\n"
				+ "2. Nivia Raptor Torrido Goalkeeping Gloves\tRate=Rs.840\r\n"
				+ "3. Kobo Supreme Goalkeeping Gloves\t\tRate=Rs.740\r\n"
				+ "4. Nike GS0331-560 Goalkeeping Gloves\t\tRate=Rs.1,340\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Nivia Goalkeeper Goalkeeping Gloves", 399, scan1.nextInt());
			p.setTotal(399*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Nivia Raptor Torrido Goalkeeping Gloves", 840, scan1.nextInt());
			p.setTotal(840*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Kobo Supreme Goalkeeping Gloves", 740, scan1.nextInt());
			p.setTotal(740*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Nike GS0331-560 Goalkeeping Gloves", 1340, scan1.nextInt());
			p.setTotal(1340*p.getQuantity());
			break;

		case 5:
			chooseFootball();
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
				choosingFootballGloves();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING FOOTBALL GUARDS ##############################***********************************

	public void choosingFootballGuards() {

		System.out.println("******************************************************************************************");

		System.out.println("1. Nivia Vortex Football Shin Guard\t\tRate=Rs.170\r\n"
				+ "2. Nivia WISDOM-2018 Football Shin Guard\tRate=Rs.139\r\n"
				+ "3. ADIDAS Youth Messi Football Shin Guard\tRate=Rs.896\r\n"
				+ "4. Nike NK J Guard Football Shin Guard\t\tRate=Rs.805\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Nivia Vortex Football Shin Guard", 170, scan1.nextInt());
			p.setTotal(170*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Nivia WISDOM-2018 Football Shin Guard", 139, scan1.nextInt());
			p.setTotal(139*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("ADIDAS Youth Messi Football Shin Guard", 896, scan1.nextInt());
			p.setTotal(896*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Nike NK J Guard Football Shin Guard", 805, scan1.nextInt());
			p.setTotal(805*p.getQuantity());
			break;

		case 5:
			chooseFootball();
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
				choosingFootballGuards();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING FOOTBALL BAGS ##############################***********************************

	public void choosingFootballBags() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Nivia Dominator Shoe Pouch\t\t\tRate=Rs.430\r\n"
				+ "2. F Gear Britain V2 Football bag\t\tRate=Rs.898\r\n"
				+ "3. JJ Jonex SLING01\t\t\t\tRate=Rs.299\r\n"
				+ "4. Ceela Sports Training Shoe Bag\t\tRate=Rs.249\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Nivia Dominator Shoe Pouch", 430, scan1.nextInt());
			p.setTotal(430*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("F Gear Britain V2 Football bag", 898, scan1.nextInt());
			p.setTotal(898*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("JJ Jonex SLING01", 299, scan1.nextInt());
			p.setTotal(299*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Ceela Sports Training Shoe Bag", 249, scan1.nextInt());
			p.setTotal(249*p.getQuantity());
			break;

		case 5:
			chooseFootball();
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
				choosingFootballBags();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING SWIMMING PADDLE ##############################***********************************

	public void choosingSwimmingPaddle() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Nivia Flash Fins (UK4-6) Bolster Paddles\t\tRate=Rs.690\r\n"
				+ "2. Vector X Swimming hand Paddle\t\t\tRate=Rs.369\r\n"
				+ "3. Speedo Biofuse FinRed/Black Bolster Paddles\t\tRate=Rs.3,499\r\n"
				+ "4. DC swimming paddle\t\t\t\t\tRate=Rs.749\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Nivia Flash Fins (UK4-6) Bolster Paddles", 690, scan1.nextInt());
			p.setTotal(690*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Vector X Swimming hand Paddle", 369, scan1.nextInt());
			p.setTotal(369*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Speedo Biofuse FinRed/Black Bolster Paddles", 3499, scan1.nextInt());
			p.setTotal(3499*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("DC swimming paddle", 749, scan1.nextInt());
			p.setTotal(749*p.getQuantity());
			break;

		case 5:
			chooseSwimming();
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
				choosingSwimmingPaddle();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING SWIMMING GOGGLES ##############################***********************************

	public void choosingSwimmingGoggles() {
		
		System.out.println("******************************************************************************************");

		System.out.println("1. Lord Adjustable Blue Swimming Goggles\t\tRate=Rs.91\r\n"
				+ "2. HOMMER Whale With Ear Plug Swimming Goggles\t\tRate=Rs.128\r\n"
				+ "3. Nivia UNICORE Swimming Goggles\t\t\tRate=Rs.409\r\n"
				+ "4. Credence Aqua Swimming Goggles\t\t\tRate=Rs.145\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");

		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {

		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Lord Adjustable Blue Swimming Goggles", 91, scan1.nextInt());
			p.setTotal(91*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("HOMMER Whale With Ear Plug Swimming Goggles", 128, scan1.nextInt());
			p.setTotal(128*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("Nivia UNICORE Swimming Goggles", 409, scan1.nextInt());
			p.setTotal(409*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Credence Aqua Swimming Goggles", 145, scan1.nextInt());
			p.setTotal(145*p.getQuantity());
			break;

		case 5:
			chooseSwimming();
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
				choosingSwimmingGoggles();
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

	//************************************************************##############################################################**********************************************	

	//*******************************########################### CHOOSING SWIMMING CAPS ##############################***********************************
	
	public void choosingSwimmingCaps() {
		
		System.out.println("******************************************************************************************");
		
		System.out.println("1. Nivia PRO SILICONE Swimming Cap\tRate=Rs.199\r\n"
				+ "2. Nivia CLASSIC Swimming Cap\t\tRate=Rs.150\r\n"
				+ "3. TG SWIMMING CAP Swimming Cap\t\tRate=Rs.178\r\n"
				+ "4. Nivia UNISWIM Swimming Cap\t\tRate=Rs.249\r\n"
				+ "5. Previous Page\r\n"
				+ "6. Home Page\r\n"
				+ "7. Exit\r\n"
				+ "");
		
		System.out.println("Enter the choice");
		switch(scan1.nextInt()) {
		
		case 1:
			System.out.println("Enter the quantity");
			p=new Person("Nivia PRO SILICONE Swimming Cap", 199, scan1.nextInt());
			p.setTotal(199*p.getQuantity());
			break;

		case 2:
			System.out.println("Enter the quantity");
			p=new Person("Nivia CLASSIC Swimming Cap", 150, scan1.nextInt());
			p.setTotal(150*p.getQuantity());
			break;

		case 3:
			System.out.println("Enter the quantity");
			p=new Person("TG SWIMMING CAP Swimming Cap", 178, scan1.nextInt());
			p.setTotal(178*p.getQuantity());
			break;

		case 4:
			System.out.println("Enter the quantity");
			p=new Person("Nivia UNISWIM Swimming Cap", 249, scan1.nextInt());
			p.setTotal(249*p.getQuantity());
			break;

		case 5:
			chooseSwimming();
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
				choosingSwimmingCaps();
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
