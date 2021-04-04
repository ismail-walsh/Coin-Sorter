# Coin-Sorter
A Java Coin Sorter Application. Allows the user to enter an input (number of coins to exchange) and program will calculate how many of their desired output can be dispensed.

This Program uses Pound sterling (£) as the default currency. Note: 1 pound is equal to 100 pennies e.g. £1 = 100p.
The following coins (in order of priority) are in circulation in the scope of this program:
•	£2 (equivalent to 200p)
•	£1 (equivalent to 100p)
•	50p
•	20p
•	10p
The minimum input value for exchange in pennies is 0 (inclusive). The maximum input value for exchange in pennies is capped at 10,000 (inclusive).
The program should enable the user to check, at most, how many coins of a certain denomination can be exchanged given an input value in pennies and the denomination. It should also print the remainder. For example, given the input value of 352 pennies and the input denomination of £1 coins, the output should be three £1 coins and a remainder of 52p.
Given a total value in pennies and a coin denomination to exclude, the program should also allow the user to determine how many coins and what denominations (prioritising the higher denominations) they can exchange for while excluding a certain coin denomination. The remainder should also be printed. For example, given 563 pennies and excluding the £2 coin, we can exchange for five £1 coins, one 50p coin and one 10p coin, with a remainder of 3p.
The program should also have several utility functions; all user input should be validated to ensure the robustness of user input/output. The user should also be able to print the current configurations of the program (current currency, min/max coin to exchange).



Textual Menu: Must utilise test class called testCoinSorter. Also a main method, which should create and initialise a CoinSorter object. After initialising a CoinSorter object, the user should be presented with the following menu:
***Coin Sorter - Main Menu***
1 - Coin calculator
2 - Multiple coin calculator
3 - Print coin list
4 - Set details
5 - Display program configurations
6 - Quit the program
These menu choices should be repeated until the user quits. Option 1 and 2 should prompt the user to enter some values, where the input values should be validated before being passed to the relevant methods in order to generate some results.
When Option 4 is chosen, the user should be presented with the following sub-menu allowing them to interactively set the following details for the program:
***Set Details Sub-Menu***
1 - Set currency
2 - Set minimum coin input value
3 - Set maximum coin input value
4 - Return to main menu
These menu choices should be repeated until the user chooses Option 4 in the Sub-Menu and returns to the main menu. Again, all user input values should be validated.



Graphical Menu: Coin Sorter will utilise the following two classes: CoinSorterGUI and a test class testCoinSorterGUI. The user should be presented with a graphical menu based on the structure of the textual menu. Java FX will be used top create the graphical menu. 
