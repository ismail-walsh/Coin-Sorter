
	import java.io.IOException;//Import the IOException, used if there is an exception in the code
    import javafx.application.Application;//import Application class
    import javafx.geometry.Insets;//Imports JavaFX class used in the source code
	import javafx.scene.Scene;//Imports JavaFX class used in the source code
	import javafx.scene.control.Button;//Imports JavaFX class used in the source code
	import javafx.scene.control.CheckBox;//Imports JavaFX class used in the source code
	import javafx.scene.control.ChoiceBox;//Imports JavaFX class used in the source code
	import javafx.scene.control.Label;//Imports JavaFX class used in the source code
    import javafx.scene.layout.GridPane;//Imports JavaFX class used in the source code
    import javafx.scene.text.Text;//Imports JavaFX class used in the source code
    import javafx.stage.Stage;//Imports JavaFX class used in the source code
    import javafx.scene.control.TabPane;//Imports JavaFX class used in the source code
    import javafx.scene.control.Tab;//Imports JavaFX class used in the source code
	
	public class CoinSorterGUI extends Application
	{ 
		static boolean answer;
		Stage window;
		Scene scene;
		int coinIn;
    	int desired_coin;

		@Override    
		public void start(Stage window) throws IOException //Implements JavaFX Application Start
		{         
			window.setTitle("Coin Sorter");//Naming the window Coin Sorter
		   
			//Tabs for menu using Tab Pane
			TabPane tabPane = new TabPane();

	        Tab tab1 = new Tab("1. Coin Calculator", new Label("If you dont mind what change comes out"));//Creating Tab 1 and its contents
	        Tab tab2 = new Tab("2. Multi Coin Calculator" , new Label("If you want to select which coins to recieve"));//Creating Tab 2 and its contents
	        Tab tab3 = new Tab("3. Print Coin List" , new Label("The current coin denominations are in circulation: £2, £1, 50p, 25p, 10p"));//Creating Tab 3 and its contents
	        Tab tab4 = new Tab("4. Set Details", new Label("If you would like to change the parameters"));//Creating Tab 4 and its contents
	        Tab tab5 = new Tab("5. Program Configuration", new Label("The current currency and the current minimum and maximum values accepted as inputs.\n\n"//Creating Tab 5 and its contents
	        		+ "The accepted currencies and coin values are as follows:\n"
	        		+ "Accepted Currencies: £ Sterling\n"
	        		+ "Returned Currencies: £ Sterling\n"
	        		+ "Minimum GBP Coin value accepted: " + 100 + "p\n"
	        		+ "Maximum GBP Coin value accepted: " + 2000 + "p"));
	        Tab tab6 = new Tab("6. Quit");//Creating Tab 6 and its contents

	        tabPane.getTabs().add(tab1);//Adding tab 1 to the tab pane
	        tabPane.getTabs().add(tab2);//Adding tab 2 to the tab pane
	        tabPane.getTabs().add(tab3);//Adding tab 3 to the tab pane
	        tabPane.getTabs().add(tab4);//Adding tab 4 to the tab pane
	        tabPane.getTabs().add(tab5);//Adding tab 5 to the tab pane
	        tabPane.getTabs().add(tab6);//Adding tab 6 to the tab pane
	        
	        //Grid Pane 1
	        
	        GridPane grid1 = new GridPane();//Creating grid 1 of the grid pane
			grid1.setPadding(new Insets(10, 10, 10, 10));//This sets the padding around the 4 sides of the pane
			grid1.setVgap(8);
			grid1.setHgap(10);
			
			//Name Label
			Label numberLabel1 = new Label("Please Enter the amount to convert (in Pennies):");//Creating a label
			GridPane.setConstraints(numberLabel1, 0, 0);//assigns the labels location on the grid
			
			//Results Text
			Text results = new Text("Results: Click Calculate to see results!");//Creating Text to go on the grid
			GridPane.setConstraints(results, 0, 6);//assigns the texts location on the grid

			//Choice Box
			ChoiceBox<Integer>choiceBox = new ChoiceBox<>();//This creates a choice box, which is a drop down. This choice box is specified to be an integer
			
			//getITems returns the observable list object which can add items to
			choiceBox.getItems().addAll(2000, 1500, 1000, 500, 200);//declaring what will be the options inside the choice box
			GridPane.setConstraints(choiceBox, 1, 0);//assigns the choice box location on the grid
			
			//Number Label 2
			Label numberLabel2 = new Label("Select a coin denomination:\n"
					+ "Enter 200 for £2\n"
					+ "Enter 100 for £1\n"
					+ "Enter 50  for 50p\n"
					+ "Enter 25  for 25p\n"
					+ "Enter 10  for 10p\n"
					+ "Enter 5    for 5p");
			GridPane.setConstraints(numberLabel2, 0, 1);//assigns label location
			
			//Choice Box 2
			ChoiceBox<Integer>choiceBox2 = new ChoiceBox<>();//creates new integer choice box
			
			//getITems returns the observable list object which can add items to
			choiceBox2.getItems().addAll(200, 100, 50, 25, 10, 5);//specifies what will be the options in the above choice box
			GridPane.setConstraints(choiceBox2, 1, 1);//assigns the location of the choice box

		
			//Calculation button
			Button calcButton = new Button("Calculate");//Creates a new button
			GridPane.setConstraints(calcButton, 1, 2);//assigns button location on grid
			calcButton.setOnAction(e -> {
				int Division = choiceBox.getValue()/choiceBox2.getValue();
				int remainder = choiceBox.getValue()%choiceBox2.getValue();
				results.setText("Results: A total of " + Division + " x " + choiceBox2.getValue() + "p " + "coins can be exchanged, with a remainder of " + remainder + "p.");
				});//This specifies what the result of pressing the button is. A lambda is used for this
			
			grid1.getChildren().addAll(numberLabel1, choiceBox, numberLabel2, choiceBox2, calcButton, results);//spcifying what will be inside grid 1 as opposed to all the others
			
			//Grid Pane 2
	        
	        GridPane grid2 = new GridPane();//Creates grid 2 
			grid2.setPadding(new Insets(10, 10, 10, 10));//Specifies the padding 
			grid2.setVgap(8);
			grid2.setHgap(10);
			
			
			//Selection Label
			Label selectionLabel2 = new Label("Please select the amount to convert (in Pennies): ");//Create new label
			GridPane.setConstraints(selectionLabel2, 0, 0);//assigns location of label
			
			//Choice Box
			ChoiceBox<Integer>choiceBox3 = new ChoiceBox<>();//Creates a new integer choice Box
			
			//getItems returns the observable list object which can add items to
			choiceBox3.getItems().addAll(2000, 1500, 1000, 500, 200);
			GridPane.setConstraints(choiceBox3, 1, 0);
			
			//MultiResults Text
			Text multiresults = new Text("Results: Click Calculate to see results!");//Creates new text
			GridPane.setConstraints(multiresults, 0, 10);//Assigns location of text
			Text multiresults2 = new Text("0 x £2");//Creates new text
			GridPane.setConstraints(multiresults2, 0, 11);//Assigns location of text
			Text multiresults3 = new Text("0 x £1");//Creates new text
			GridPane.setConstraints(multiresults3, 0, 12);//Assigns location of text
			Text multiresults4 = new Text("0 x 50p");//Creates new text
			GridPane.setConstraints(multiresults4, 0, 13);//Assigns location of text
			Text multiresults5 = new Text("0 x 25p");//Creates new text
			GridPane.setConstraints(multiresults5, 0, 14);//Assigns location of text
			Text multiresults6 = new Text("0 x 10p");//Creates new text
			GridPane.setConstraints(multiresults6, 0, 15);//Assigns location of text
            
			//check box Label 2
			Label checkBoxLabel = new Label("Please select your desired coin denominations: ");
			GridPane.setConstraints(checkBoxLabel, 0, 3);
			
			//Check Boxes
			CheckBox box1 = new CheckBox("1. £2");//Creates a new Check box used to select denominations
			CheckBox box2 = new CheckBox("2. £1");//Creates a new Check box used to select denominations
			CheckBox box3 = new CheckBox("3. 50p");//Creates a new Check box used to select denominations
			CheckBox box4 = new CheckBox("4. 20p");//Creates a new Check box used to select denominations
			CheckBox box5 = new CheckBox("5. 10p");//Creates a new Check box used to select denominations
		
			
			//Check box Positions
			GridPane.setConstraints(box1, 1, 3);//Specifies Check box location on the grid
			GridPane.setConstraints(box2, 1, 4);//Specifies Check box location on the grid
			GridPane.setConstraints(box3, 1, 5);//Specifies Check box location on the grid
			GridPane.setConstraints(box4, 1, 6);//Specifies Check box location on the grid
			GridPane.setConstraints(box5, 1, 7);//Specifies Check box location on the grid
			
			//MultiCalculation button 2
			Button multiCalcButton = new Button("Calculate");
			GridPane.setConstraints(multiCalcButton, 1, 9);
			multiCalcButton.setOnAction(e ->{
				if(box1.isSelected() ) {
					int Division2 = choiceBox3.getValue()/200;
					int remainder2 = choiceBox3.getValue()%200;
					multiresults.setText("");
					multiresults2.setText("Results: \n" + Division2 + " x £2");}
					
				else if (box2.isSelected()) {
						int Division3 = choiceBox3.getValue()/100;
						int remainder3 = choiceBox3.getValue()%100;
						multiresults3.setText(Division3 + " x £1");}
						
						else if(box3.isSelected()) {
							int Division4 = choiceBox3.getValue()/50;
							int remainder4 = choiceBox3.getValue()%50;
							multiresults4.setText(Division4 + " x 50p");}
							
							else if(box4.isSelected()) {
								int Division5 = choiceBox3.getValue()/20;
								int remainder5 = choiceBox3.getValue()%20;
								multiresults5.setText(Division5 + " x 20p");}
								
							else if(box5.isSelected()) {
									int Division6 = choiceBox3.getValue()/10;
									int remainder6 = choiceBox3.getValue()%10;
									multiresults6.setText("Results: \n" + Division6 + " x 10p\n" + "with a remainder of " + remainder6 + "p.");}
				});//Multi coin calculation to be carried out when calculate button is pressed
			
			
			//resetButton
			Button resetButton = new Button("Reset");//creates reset button
			GridPane.setConstraints(resetButton, 1, 17);//assigns location of button
			multiCalcButton.setOnAction(e ->{
				multiresults.setText("Results: Click Calculate to see results!");
				multiresults2.setText("0 x £2");
				multiresults3.setText("0 x £1");
				multiresults4.setText("0 x 50p");
				multiresults5.setText("0 x 20p");
				multiresults6.setText("0 x 10p");
			});//Changes the text to a blank results display

			grid2.getChildren().addAll(selectionLabel2, choiceBox3, checkBoxLabel, box1, box2, box3, box4, box5, multiCalcButton, multiresults, multiresults2, multiresults3, multiresults4, multiresults5, multiresults6, resetButton);

            //Grid Pane 4
	        
	        GridPane grid4 = new GridPane();
			grid4.setPadding(new Insets(10, 10, 10, 10));
			grid4.setVgap(8);
			grid4.setHgap(10);
			
			
			//Currency Label
			Label currencyLabel = new Label("Set currency: ");
			GridPane.setConstraints(currencyLabel, 0, 0);
			
			//Choice Box
			ChoiceBox<String>choiceBox4 = new ChoiceBox<>();
			
			//getITems returns the observable list object which can add items to
			choiceBox4.getItems().addAll("-", "£");
			GridPane.setConstraints(choiceBox4, 1, 0);
			
			//Maximum Input Label 
			Label maxInputLabel = new Label("Set Maximum Input: ");
			GridPane.setConstraints(maxInputLabel, 0, 1);
			
			//Choice Box
			ChoiceBox<Integer>choiceBox5 = new ChoiceBox<>();
			
			//getITems returns the observable list object which can add items to
			choiceBox5.getItems().addAll(3000, 2000, 1500, 1000, 500, 200);
			GridPane.setConstraints(choiceBox5, 1, 1);
			
			//Minimum Input Label 
			Label minInputLabel = new Label("Set Maximum Input: ");
			GridPane.setConstraints(minInputLabel, 0, 3);
			
			//Choice Box
			ChoiceBox<Integer>choiceBox6 = new ChoiceBox<>();
			
			//getITems returns the observable list object which can add items to
			choiceBox6.getItems().addAll(3000, 2000, 1500, 1000, 500, 200);
			GridPane.setConstraints(choiceBox6, 1, 3);
			
			//Save button 
			Button saveButton = new Button("Save");//Creates save button
			GridPane.setConstraints(saveButton, 1, 5);//Assigns location
			saveButton.setOnAction(e -> System.out.println("Saved") );//prints "Saved" to the console 
			
			grid4.getChildren().addAll(currencyLabel, choiceBox4, maxInputLabel, choiceBox5, minInputLabel, choiceBox6, saveButton);//sets what is inside of gird 4
			
			
			
            //Grid Pane 6
	        
	        GridPane grid6 = new GridPane();
			grid6.setPadding(new Insets(10, 10, 10, 10));
			grid6.setVgap(8);
			grid6.setHgap(10);
		
			Label quitLabel = new Label("Are you sure you would like to Quit?");//Creates quit label
			GridPane.setConstraints(quitLabel, 0, 0);//Assigns location
			
			
			Button yesButton = new Button("Yes");//creates new button
			yesButton.setOnAction(e -> {
				answer = true;
				window.close();//window closes if the yes button is clicked
			});
			GridPane.setConstraints(yesButton, 0, 1);//button location
			
			Button noButton = new Button("No");//creates no button
			noButton.setOnAction(e -> {
				answer = false;
			});//no action is no button is pressed
			GridPane.setConstraints(noButton, 0, 2);//assigns location
			grid6.getChildren().addAll(quitLabel, yesButton, noButton);//Specifies whats inside grid 6
			
			
			//Merge
			tab1.setContent(grid1);//ensures the content of tab1 is grid 1
			tab2.setContent(grid2);//ensures the content of tab2 is grid 2
			tab4.setContent(grid4);//ensures the content of tab3 is grid 3
			tab6.setContent(grid6);//ensures the content of tab4 is grid 4
			
			//Scene
	        Scene scene = new Scene(tabPane, 750, 750);//Create new scene
	        window.setScene(scene);//Use "scene" as the scene
			window.show();//show the window named "window"
			
		}     
		
		public static void main(String[] args)     
		{  
			launch(args);//Launches program   
		}
		
	}


									


