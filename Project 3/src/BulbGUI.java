import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BulbGUI extends JFrame {
    
	static JTextArea unsorted;
    
    public BulbGUI() { 
    	createGUI();  // calling on the method
    }
	
	public void createGUI() {
		setTitle("BulbList");  // Title for GUI
	    setSize(600,600);  // Size for GUI
	    setLocationRelativeTo(null);  // Location for GUI
	    createFileMenu();  // FileMenu method
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
		unsorted = new JTextArea();
		getContentPane().add(unsorted);//add textArea to the JFrame
		unsorted.setEditable(false);  // Eddiable to false
	    setVisible(true); // Make the GUI visiable
   }
	
	public void displayList(ArrayList<Bulb> unsortedList) {  // Displaying the array list to GUI
		for (int i = 0; i < unsortedList.size(); i++) {
			unsorted.append(unsortedList.get(i) + "\n");
		}
	}

	private void createFileMenu( ) {  // Open and quit for menuhandler
		JMenuItem   item;
		JMenuBar    menuBar  = new JMenuBar();
		JMenu       fileMenu = new JMenu("File");
		FileMenuHandler fmh  = new FileMenuHandler(this);
		
		item = new JMenuItem("Open");    
		item.addActionListener( fmh );
		fileMenu.add( item );

		fileMenu.addSeparator();            
		
		item = new JMenuItem("Quit");       
		item.addActionListener( fmh );
		fileMenu.add( item );


		setJMenuBar(menuBar);
		menuBar.add(fileMenu);
   } 

}
