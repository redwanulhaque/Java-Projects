import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.BindException;
import java.util.StringTokenizer;

public class FileMenuHandler implements ActionListener {
	BulbGUI jframe; // Bulb GUI to fileMenuHandler
	
	public FileMenuHandler (BulbGUI jf) {
	jframe = jf;
	}
   
	public void actionPerformed(ActionEvent event) { // Open and quit
		String menuName = event.getActionCommand();
		if (menuName.equals("Open")) 
			openFile();
      
		else if (menuName.equals("Quit"))  // GUI closes if selected quit
			System.exit(0);
	}
   
	public void openFile() {
		  
		JFileChooser jfc = new JFileChooser();
		int open = jfc.showOpenDialog(null);
		  
		if (open == JFileChooser.APPROVE_OPTION) {  // Geting the file to open and displaying it to the GUI
		      
			String myFile = jfc.getSelectedFile().getName();
			String line;
			TextFileInput in = new TextFileInput(myFile);
			line = in.readLine();
			
			StringTokenizer token ; 
			while (line != null) {
				token = new StringTokenizer(line, ",");				
				try {  // manufacturer to token, partNumber to token, wattage to token, lumenst to token
				Project3.unsortedList.add(new Bulb(token.nextToken(),token.nextToken(), Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken())));		
				}

				 catch (IllegalBulbException e) {  // Catch statement
		               System.out.println(e.getMessage()); // Display the error bulb objects when the wattage less than 5
				 }

				line = in.readLine();
			}
			
			jframe.displayList(Project3.unsortedList);  // Display the unsoorted to the GUI
		}
		
		else
			JOptionPane.showMessageDialog(null, "The request was canceled!"); // If no file was selected then the program displays this message
		}      
}
  
