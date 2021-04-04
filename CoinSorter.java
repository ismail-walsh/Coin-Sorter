
import java.util.Scanner;//Import the Scanner Class to allow for user input
import java.util.concurrent.TimeUnit;//Import the Time Unit Class to allow for time delays 


public class CoinSorter {
    
	String currency; //declaring currency variable as a string
	int answer;//declaring answer variable as an integer
	int minCoinIn;//declaring minCoinIn variable as an integer
	int maxCoinIn; //declaring maxCoinIn variable as an integer
	int CoinIn;//declaring CoinIn variable as an integer
	double desired_coin;//declaring desired_coin variable as an integer
	
	Scanner sc = new Scanner(System.in);//creating scanner class from java.util package
	
	public CoinSorter (String currency, int minCoinIn , int maxCoinIn, String coinList)
    {
       /* This constructor initialises the following properties: 
        * currency, minimum value to exchange, maximum value to exchange and the initial list of coin denominations.*/
		currency = "£";
		minCoinIn = 20;
		maxCoinIn = 3000;
		coinList = "£2, £1, 50p, 20p, 10p";
    }

	public CoinSorter(int CoinIn)
    {
       //This method sets the corresponding attribute values
		CoinIn = 0;
		System.out.println("Welcome to Coin Sorter!");
    
    }
	
	public void setCurrency(String currency) throws InterruptedException
    {
		//This method sets the corresponding attribute values
    	System.out.println("The only currency available is £ Sterling");
		TimeUnit.SECONDS.sleep(2);
         }
   
    
    public void setminCoinIn(int minCoinIn) throws InterruptedException
    {
    	//This method sets the corresponding attribute values
    	System.out.println("Please enter your desired Minimum input: ");//originally 2p minimum input unless changed 
    	minCoinIn = sc.nextInt(); //Using the scanner class to allow the user to input their minimum value
    	System.out.println("minimum Coin Input: " + minCoinIn);
		TimeUnit.SECONDS.sleep(2); //This causes a 2 second time delay in the program, allowing the user to read the message before returning to menu
    }
    
    public void setmaxCoinIn(int maxCoinIn) throws InterruptedException
    {
    	//This method sets the corresponding attribute values
    	System.out.println("Please enter your desired Maximum input: ");//originally £30 maximum input unless changed 
    	maxCoinIn = sc.nextInt(); //Using the scanner class to allow the user to input their Maximum value
    	System.out.println("Maximum Coin Input: " + maxCoinIn);
		TimeUnit.SECONDS.sleep(2);//This causes a 2 second time delay in the program, allowing the user to read the message before returning to menu
    }
    
    public void getCurrency()
	{
		// This method returns the corresponding attribute values.
    	System.out.println("Currency => £ Sterling");
	}
    
   public void getMinCoinIn(int minCoinIn)
	{
	// This method returns the corresponding attribute values.
    	System.out.println("Minimum input => £30");
    	
	}
    
    public void getMaxCoinIn(int maxCoinIn)
	{
    	// This method returns the corresponding attribute values.
    	System.out.println("Minimum input => 20p");
	}
    
    public void printCoinList()//:String
	{
    	/*This method prints the contents of the coin list, indicating what denominations are currently in circulation.*/
	    System.out.println("The current coin denominations are in circulation: £2, £1, 50p, 20p, 10p");
	}
    
    public void coinCalculator() throws InterruptedException//:String
	{
		/* This method takes two values; the total value to exchange and a coin type, 
		 * in order to calculate and return the maximum number of coins of the input coin type that can be exchanged, 
		 * in addition to the remainder as a string.*/ 
    	int division;
    	int remainder;
    	
    	System.out.println("Please enter your coins into the machine => ");
    	
    	//This is a fail safe using if statements that prevents input of values exceeding min/max inputs. This will not let the user progress without entering an acceptable value
        CoinIn = sc.nextInt();
        if (CoinIn < 20) 
        {
           System.out.println("Input too low, retrieve rejected coins below!");
           //The currency was either invalid or unsupported so the program must ask for again
           coinCalculator();
         }
        
        else if (CoinIn > 3000) 
        {
           System.out.println("Input too high, retrieve rejected coins below!");
           //The currency was either invalid or unsupported so the program must ask for again
           coinCalculator();
         }
        System.out.println("Select a coin denomination: ");
        System.out.println("Enter 200 for £2");
		System.out.println("Enter 100 for £1");
		System.out.println("Enter 50  for 50p");
		System.out.println("Enter 20  for 20p");
		System.out.println("Enter 10  for 10p");
		System.out.println("Enter 5   for 5p");
		desired_coin = sc.nextInt();//Scanner Class used in order to allow user input of desired denomination
		
    	
		division = (int) (CoinIn/desired_coin);//This will return the integer value of how many coins of their denomination can be dispensed
		remainder = (int) (CoinIn%desired_coin);//This expression will calculate the remainder of the above calculation, thus detailing the coins returned
		System.out.println("A total of " + division + " x " + desired_coin + " coins can be exchanged, with a remainder of " + remainder + "p.");
		
		System.out.println("Do you Wish to proceed?");
		System.out.println(" ");
		System.out.println("1 - Yes");
		System.out.println("2 - No");
		answer = sc.nextInt();//Scanner Class used in order to allow user input of their answer
		
		if (answer == 2)
		{
		    // This sequence allows for some realism, so a loading message was added
			System.out.println("Loading....");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the loading message before retuneing to the main menu
		    testCoinSorter cs2 = new testCoinSorter();//Create object for testCoinSorter.java
			cs2.Txt_Menu();//return to main menu by calling the Text menu method in the testCoinSorter.java file   
		}
	   
	   else if (answer == 1)
		{
		   //This is another instance of a sequence attempting realism by printing dispensing and loading messages to the console
		   System.out.println("Dispensing....");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the printed message before the next
		    System.out.println("Please collect your coins.");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the printed message before the next
		    System.out.println("Thank you!");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the printed message before the next
		    System.out.println("Next Customer.");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the message before returning to the main menu
		    testCoinSorter cs2 = new testCoinSorter();//Create object for testCoinSorter.java
			cs2.Txt_Menu(); //return to main menu by calling the Text menu method in the testCoinSorter.java file
		}
	   
	   else {
		   System.out.println("Invalid answer !");
	          //The answer was invalid so the program must ask for another
		   System.out.println("Do you Wish to proceed?");//asking for confirmation allows for realism
		   System.out.println(" ");
		   System.out.println("1 - Yes");
		   System.out.println("2 - No");
		   answer = sc.nextInt();//Scanner Class used in order to allow user input of their answer
	   }
	}

    public void multiCoinCalculator() throws InterruptedException//:String
	{
		/* This method takes two values; the total value to exchange and a coin type to exclude, 
		 * in order to calculate and return the maximum number of coins of the input coin type that can 
		 * be exchanged while excluding the input coin type, in addition to the remainder as a string.*/
    	
    	int firstcalc, secondcalc, thirdcalc, fourthcalc, fifthcalc, sixthcalc, seventhcalc, eighthcalc;
    	int first_remainder, second_remainder, third_remainder, fourth_remainder, fifth_remainder, sixth_remainder, 
    	seventh_remainder, eighth_remainder;//declare calculation variables
    	
    	//Fail safe using if statements in order to ensure min and max values are respected
    	System.out.println("Please enter your coins into the machine => ");
        CoinIn = sc.nextInt();
        if (CoinIn < 20) 
        {
           System.out.println("Input too low, retrieve rejected coins below!");
           //The currency was either invalid or unsupported so the program must ask for again
           multiCoinCalculator();
         }
        
        else if (CoinIn > 3000) 
        {
           System.out.println("Input too high, retrieve rejected coins below!");
           //The currency was either invalid or unsupported so the program must ask for again
           multiCoinCalculator();
         }
    
    	System.out.println("Coins Inputted: " + CoinIn);
    	System.out.println("The coins exchanged are: ");
    	
    	
		firstcalc = CoinIn/200; //How many £2 coins
		first_remainder = CoinIn%200; //How much remains
		System.out.println(firstcalc + "  x £2");
		
		if (first_remainder >= 0) {
			CoinIn = first_remainder;//if the above did not yield zero, the remainder is used for the mext denomination. Hence higher coins take priority
		}
		
		secondcalc = CoinIn/100; //How many £1 Coins
		second_remainder = CoinIn%100; //How much remains
		System.out.println(secondcalc + "  x £1");
		
		if (second_remainder >= 0) {
			CoinIn = second_remainder;//if the above did not yield zero, the remainder is used for the mext denomination. Hence higher coins take priority
		}
		
		thirdcalc = CoinIn/50; //How many 50p coins
		third_remainder = CoinIn%50; //How much remains
		System.out.println(thirdcalc + "  x 50p");
		
		if (third_remainder >= 0) {
			CoinIn = third_remainder;//if the above did not yield zero, the remainder is used for the mext denomination. Hence higher coins take priority
		}
		
		fourthcalc = CoinIn/20; //How many 20p coins
		fourth_remainder = CoinIn%20; //How much remains
		System.out.println(fourthcalc + "  x 20p");
		
		if (fourth_remainder >= 0) {
			CoinIn = fourth_remainder;//if the above did not yield zero, the remainder is used for the mext denomination. Hence higher coins take priority
		}
		
		fifthcalc = CoinIn/10; //How many 10p coins
		fifth_remainder = CoinIn%10; //How much remains
		System.out.println(fifthcalc + "  x 10p");
		System.out.println("With a remainder of: " + fifth_remainder + "p");
		
		System.out.println("Do you Wish to proceed?");
		System.out.println(" ");
		System.out.println("1 - Yes");
		System.out.println("2 - No");
		answer = sc.nextInt();//Scanner Class used in order to allow user input of their answer
		
		if (answer == 2)
		{
		    System.out.println("Loading....");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the loading message before returning to the main menu
		    testCoinSorter cs2 = new testCoinSorter();//Create object for testCoinSorter.java
			cs2.Txt_Menu();//return to main menu by calling the Text menu method in the testCoinSorter.java file   
		}
		
	    else if (answer == 1)
		{
		    System.out.println("Dispensing....");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the message before next message
		    System.out.println("Please collect your coins.");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the message before next message
		    System.out.println("Thank you!");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the message before next message
		    System.out.println("Next Customer.");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the message before returning to the main menu
		    testCoinSorter cs2 = new testCoinSorter();//Create object for testCoinSorter.java
			cs2.Txt_Menu();//return to main menu by calling the Text menu method in the testCoinSorter.java file  
		}
	   
	   else {
		   System.out.println("Invalid answer !");
	          //The answer was invalid so the program must ask for another
		   System.out.println("Do you Wish to proceed?");
		   System.out.println(" ");
		   System.out.println("1 - Yes");
		   System.out.println("2 - No");
		   answer = sc.nextInt();//Scanner Class used in order to allow user input of their answer
	   }
		
	}

	public void displayProgramConfigs() throws InterruptedException//:String
	{
		/*This method returns the following as a string: 
		 * The current currency and the current minimum and maximum value accepted as input.*/
	   System.out.println("The following currencies and coin values are as follows:");
	   getCurrency();//calling the get currency method as it contains the desired information
	   getMinCoinIn(minCoinIn);//calling the get minCoinIn method as it contains the desired information
	   getMaxCoinIn(maxCoinIn);//calling the get maxCoinIn method as it contains the desired information
	   
	   System.out.println("Do you Wish to proceed?\n\n1 - Yes\n2 - No");
	   answer = sc.nextInt();
	   
	   if (answer == 2)
		{
		    System.out.println("Thank you!");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the message before next message
            System.out.println("Next Customer.");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the message before next message
		    System.out.println("Loading....");
		    TimeUnit.SECONDS.sleep(1);//A 1 second delay is utilised so that the user can see the message before returning to the main menu
		    testCoinSorter cs2 = new testCoinSorter();//Create object for testCoinSorter.java
			cs2.Txt_Menu();//return to main menu by calling the Text menu method in the testCoinSorter.java file   
		}
	   
	   else if (answer == 1)
		{
		   System.out.println("Return to Main Menu");
		   testCoinSorter cs2 = new testCoinSorter();//Create object for testCoinSorter.java
		   cs2.Txt_Menu();//return to main menu by calling the Text menu method in the testCoinSorter.java file
		}
	   
	   else {
		   System.out.println("Invalid answer !");
	          //The answer was invalid so the program must ask for another
		   System.out.println("Do you Wish to proceed?");
		   System.out.println(" ");
		   System.out.println("1 - Yes");
		   System.out.println("2 - No");
		   answer = sc.nextInt();
	   }
	}	
}
