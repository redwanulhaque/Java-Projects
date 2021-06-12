import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.BindException;
import java.util.List;
import java.util.StringTokenizer;

public class FileMenuHandler implements ActionListener {
	BulbGUI jframe; 
	
	public FileMenuHandler (BulbGUI jf) {
	jframe = jf;
	}
   
	public void actionPerformed(ActionEvent event) { 
		String menuName = event.getActionCommand();
		if (menuName.equals("Open")) 
			openFile();
      
		else if (menuName.equals("Quit"))  
			System.exit(0);
	}
   
	public void openFile() {
		  
		JFileChooser jfc = new JFileChooser("./");
		int open = jfc.showOpenDialog(null);
		  
		if (open == JFileChooser.APPROVE_OPTION) {  
		      
			String myFile = jfc.getSelectedFile().getName(); 
			TextFileInput in = new TextFileInput(myFile);
			String line = in.readLine();
			
			while (line != null) {
				StringTokenizer token = new StringTokenizer(line, ",");	
				StringTokenizer token1 = new StringTokenizer(line, ",");  
				
				Project4.unsortedList.add(new Bulb(token.nextToken(),token.nextToken(), Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken())));
				Project4.sortedList.put(line, new Bulb(token1.nextToken(),token1.nextToken(), Integer.parseInt(token1.nextToken()), Integer.parseInt(token1.nextToken()))); 
  
				line = in.readLine();
			}
			jframe.displayList(Project4.unsortedList, Project4.sortedList);  
		}
		
		else
			JOptionPane.showMessageDialog(null, "The request was canceled!");
		}      
}
  
