import java.util.Scanner;//Import the Scanner Class to allow for user input
import java.util.concurrent.TimeUnit;//Import the Time Unit Class to allow for time delays

public class testCoinSorter {
	
	int Menu_Selection;//declaring Menu_Selection variable as an integer
	Scanner sc=new Scanner(System.in);//creating scanner class from java.util package
	CoinSorter cs1 = new CoinSorter(0);//Create object for CoinSorter.java
	
	public void getStartMenu() {
		
		//Printing the main menu and allowing a choice via the scanner class
	    System.out.println("***Coin Sorter - Main Menu***");
		System.out.println("1 - Coin calculator");
		System.out.println("2 - Multiple coin calculator");
		System.out.println("3 - Print coin list");
		System.out.println("4 - Set details");
		System.out.println("5 - Display program configurations");
		System.out.println("6 - Quit the program");
		
		Menu_Selection = sc.nextInt();//using scanner class to allow for user input
	}
		
	public void getSubMenu() throws InterruptedException {
		
		int setMax;//declaring variable as an integer
		int setMin;//declaring setMin variable as an integer
		CoinSorter cs1 = new CoinSorter(0);//Create object for CoinSorter.java
		System.out.println("***Set Details Sub-Menu***");
	    System.out.println("1 - Set Currency");
	    System.out.println("2 - Set minimum coin input value ");
	    System.out.println("3 - Set maximum coin input value");
	    System.out.println("4 - Return to main menu");
	    Menu_Selection = sc.nextInt();//Using scanner class to allow for user input
		   
		   if( Menu_Selection == 1) {
			   cs1.setCurrency(null);//Calling the set currency method from CoinSorter.java
			   Txt_Menu();//Calling Text menu method 
		   }
		   
		   if( Menu_Selection == 2) {
			   int minCoinIn = 0;//declaring variable as an integer
			cs1.setminCoinIn(minCoinIn);//Calling method from CoinSorter.java
			   Txt_Menu();//Calling Text menu method 
		   }
		   
		   if( Menu_Selection == 3) {
			   int maxCoinIn = 0;//declaring variable as an integer
			cs1.setmaxCoinIn(maxCoinIn);//Calling method from CoinSorter.java
			   Txt_Menu();//Calling Text menu method 
		   }
		   
		   if( Menu_Selection == 4) {
			   Txt_Menu();//Calling Text menu method
		   }
	}
		
	public void Txt_Menu() throws InterruptedException {
			
		        getStartMenu();//Calling getStartMenu method
		       
		        //If Option 1 
			   if (Menu_Selection == 1)
				{
				    cs1.coinCalculator();//Calling method from CoinSorter.java
				}
			
			 //If not option 1, but Option 2 
			   else if (Menu_Selection == 2)
				{
				    cs1.multiCoinCalculator();//Calling method from CoinSorter.java
				}
			   
			 //If Option 3 
			   else if (Menu_Selection == 3)
				{
				   System.out.println("Loading....");
				   TimeUnit.SECONDS.sleep(1);
				   cs1.printCoinList();//Calling method from CoinSorter.java
				   System.out.println("Loading....");
				   TimeUnit.SECONDS.sleep(1);
				   Txt_Menu();//Calling Text menu method
				}
			   
			 //If Option 4 
			   else if (Menu_Selection == 4)
				{
				  getSubMenu();//Calling getSubMenu method
				}
			   
			 //If Option 5 
			   else if (Menu_Selection == 5)
				{
				    cs1.displayProgramConfigs();//Calling method from CoinSorter.java
				}
			   
			 //If Option 6 
			   else if (Menu_Selection == 6)
				{
				   System.out.println("Thank you!");
				   TimeUnit.SECONDS.sleep(1);
                   System.out.println("Next Customer.");
				   TimeUnit.SECONDS.sleep(1);
				   System.out.println("Loading....");
				   TimeUnit.SECONDS.sleep(1);
				   Txt_Menu();//Calling Text menu method
				}
			   
			   else {
				      System.out.println("Invalid Selection!");
			          //The selection was invalid so the program must ask for another
				      Txt_Menu();//Calling Text menu method
			         }
}
		
	public static void main(String[] args) throws InterruptedException {
		//create objects
		testCoinSorter cs2 = new testCoinSorter();//creating scanner class from java.util package
		cs2.Txt_Menu();//Create object for CoinSorter.java
	}

}
