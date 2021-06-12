/**
 * 
 * @author Redwanul Haque
 * @version 3
 * @lab 11b
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Project2 { // Main Class

	public static void main(String[] args) {  // Main Method that brings everything together

		SortedBulbList sortedBulbList = new SortedBulbList();  // Defining sortedBulbList object
		UnsortedBulbList unsortedBulbList = new UnsortedBulbList();  // Defining unSortedBulbList object

		File fileReader = new File("BulbList.txt");  // Calling on BulbList.txt

		try {
			Scanner scanner = new Scanner(fileReader);  // Defining scanner object for fileReader
   
			while (scanner.hasNext()) {
				String line = scanner.nextLine();  // Reading the line
				String bulb[] = line.split(","); // Split on ","
				
			    String manufacturer = (bulb[0].trim());
			    String partNumber = (bulb[1].trim());
			    int wattage = Integer.parseInt(bulb[2].trim());
			    int lumens = Integer.parseInt(bulb[3].trim());

				Bulb BulbList = new Bulb(manufacturer, partNumber, wattage, lumens);  // Defining bulb object class
				
				unsortedBulbList.add(BulbList);  // Adding bulb list to class
				sortedBulbList.add(BulbList); // Adding bulb list to class
			}  // while loop
   
			new BulbGUI(unsortedBulbList, sortedBulbList);  // Calling on constructor
		}
		
		catch (IOException e) {
			System.out.println("File not found!");
		}
	}
}