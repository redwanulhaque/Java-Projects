import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BulbGUI extends JFrame {
    
	static JTextArea unsorted;
	static JTextArea sorted;
    
    public BulbGUI() { 
    	createGUI();  
    }
	
	public void createGUI() {
		setTitle("BulbList");  
	    setSize(600,600);  
	    setLocationRelativeTo(null);  
		setLayout(new GridLayout(1, 2,5,5));
	    createFileMenu();  
		Font font = new Font("Timesnew Roman", Font.BOLD, 13); 
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
		unsorted = new JTextArea();
		getContentPane().add(unsorted);  
        String text1 = "\t  UnsortedList \n\n";
        unsorted.setText(text1.toUpperCase());  
		unsorted.setFont(font);
		unsorted.setEditable(false); 
		
		sorted = new JTextArea();
		getContentPane().add(sorted);  
		String text2 = "\t   SortedList \n\n";
	    sorted.setText(text2.toUpperCase());  
	    sorted.setFont(font);
		sorted.setEditable(false);  

	    setVisible(true); 
   }
	
	public void displayList(ArrayList<Bulb> unsortedList, TreeMap<String, Bulb> sortedList) { 
		for (int i = 0; i < unsortedList.size(); i++) {  
			unsorted.append("  " + unsortedList.get(i) + "\n");
		}
		
		for (Entry<String, Bulb> map : sortedList.entrySet()) {  
			sorted.append(map.getKey().toString() + "\n");
		}
	}

	private void createFileMenu( ) { 
		JMenuItem   item;
	      JMenuBar    menuBar  = new JMenuBar();
	      JMenu       fileMenu = new JMenu("File");
	      JMenu       editMenu = new JMenu("Edit");
	      FileMenuHandler fmh  = new FileMenuHandler(this);
	      EditMenuHandler emh  = new EditMenuHandler(this);
	      
	      item = new JMenuItem("Open");    
	      item.addActionListener( fmh );
	      fileMenu.add( item );

	      fileMenu.addSeparator();          
	    
	      item = new JMenuItem("Quit");       
	      item.addActionListener( fmh );
	      fileMenu.add( item );
	      
	      item = new JMenuItem("Search");    
	      item.addActionListener( emh );
	      editMenu.add( item );
	      
	      setJMenuBar(menuBar);
	      menuBar.add(fileMenu);
	      menuBar.add(editMenu);
	} 
}
