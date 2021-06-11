import javax.swing.JOptionPane;
/**
 * 
 * @author Redwanul Haque
 *
 */
public class Project0 {
	
	public static void main(String[] args) {
		
		while(true) {// infinite loop
			
		String sentence; // user enters their sentence 
		sentence = JOptionPane.showInputDialog(null, "Please enter a sentence: ");
		
		int E_counter=0; // using a counter to count Upper case E's in the sentence 
		int e_counter=0; // using another counter to count Lower case e's in the sentence
		
		for(int i=0; i<sentence.length(); i++) { // using a for loop to loop through the sentence
			if (sentence.charAt(i) == 'E') E_counter ++; // Upper case E's
            if (sentence.charAt(i) == 'e') e_counter ++; // Lower case e's
		}
		
		if(sentence.equalsIgnoreCase("stop")) // if user enters "stop" the program will end. Cases are ignored
			System.exit(0);
		
		JOptionPane.showMessageDialog(null, "Number of upper case E's: " + E_counter + "\nNumber of lower case e's: " + e_counter); // Prints the out come of Upper and lower case e's in the sentence. 
		}
	}
}
