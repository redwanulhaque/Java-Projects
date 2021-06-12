import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class BulbGUI extends JFrame { // BulbGui.java

	public BulbGUI (UnsortedBulbList unsortedBulb, SortedBulbList sortedBulb) { // Creating the Gui for unsortedBulb and SortedBulb
	    GridLayout layout = new GridLayout(1, 2,10,10); // 2 Column GUI
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // If user click X, The GUI will close
		this.setSize(1000, 300); // Size of the GUI
	    this.setLocationRelativeTo(null); // Setting the to center
	    this.setTitle("Bulb List"); // Title
		Font font = new Font("Timesnew Roman", Font.BOLD, 13); // Font

	    JTextArea Unsorted = new JTextArea();
        Unsorted.setEditable(false); // Not able to add text
        String bulb = "\t\t  UnsortedBulbList\n\n";
        Unsorted.setFont(font);
        bulb += unsortedBulb.toString();  // Sending unsortedBulbList to toString
        Unsorted.setText(bulb);  // Setting text for UnsortedBulbList
	    add(Unsorted); // Adding to the column
        
	    JTextArea Sorted = new JTextArea();
        Sorted.setEditable(false); // Not able to add text
        Sorted.setFont(font);
        Sorted.setForeground(Color.blue); // Sorted Color to blue
        bulb = "\t\t  SortedBulbList\n\n";
        bulb +=sortedBulb.toString();  // Sending sortedBulb to toString
        Sorted.setText(bulb);  // Setting text for SortedList
	    add(Sorted); // Adding to the column

	    this.setLayout(layout); 
	    this.setVisible(true); // Setting visible
	}
}

