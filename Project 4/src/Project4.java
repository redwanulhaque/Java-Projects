/**
 * 
 * @author Redwanul Haque
 * @version 4
 * @lab 11b
 * 
 */

import java.util.ArrayList;
import java.util.TreeMap;

public class Project4 {
	
	static BulbGUI myGUI;
	static ArrayList<Bulb> unsortedList = new ArrayList<Bulb>();  
	static TreeMap<String, Bulb> sortedList = new TreeMap<String, Bulb>();  
	
	public static void main(String[] args) { 
		myGUI = new BulbGUI();
	}
}