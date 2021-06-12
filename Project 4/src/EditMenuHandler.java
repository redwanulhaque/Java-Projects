import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EditMenuHandler implements ActionListener {
   BulbGUI jframe;  
   
   public EditMenuHandler (BulbGUI jf) {
      jframe = jf;
   	}
   
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      
      if (menuName.equals("Search"))  
    	  doSearch();
      
      else
			System.exit(0);
   }
   
   private void doSearch() {
	   
		String input = JOptionPane.showInputDialog("Enter a Bulb’s Part Number: ");  
			
		for ( Bulb value:Project4.sortedList.values()) {

			if (value.getPartNumber().equals(input)) {  
				JOptionPane.showMessageDialog(null, "The partNumber '" + input + "' does exist!");
				return;
			}	
		}
		
		for ( Bulb value:Project4.sortedList.values()) {

			if (!value.getPartNumber().equals(input)) {  
				JOptionPane.showMessageDialog(null, "The partNumber '" + input + "' does NOT exist!");
				return;
			}	
		}
	}
}