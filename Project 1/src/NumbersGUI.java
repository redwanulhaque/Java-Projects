import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NumbersGUI { 
	
	public void NumberGrid() {
		
		JFrame frame = new JFrame("NumberGUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // If user click X, The GUI will close
		frame.setSize(600,600); // width, and height
		frame.setLocationRelativeTo(null); // Setting the location to the center
		frame.setLayout(new GridLayout(3,3,10,10)); // 3 Rows and 3 column. Plus space between the column
		
		// Grid Layouts #1
        JTextArea textArea2 = new JTextArea();
        textArea2.setEditable(false); // Not able to add text
        JScrollPane scrollPane2 = new JScrollPane(textArea2);
        frame.getContentPane().add(scrollPane2); // Scroll panel
        textArea2.setText("Number 2: "); 

        // Grid Layout #2
        JTextArea textArea3 = new JTextArea();
        textArea3.setEditable(false); 
        JScrollPane scrollPane3 = new JScrollPane(textArea3);
        frame.getContentPane().add(scrollPane3);
        textArea3.setText("Number 3: "); 

        // Grid Layout #3
        JTextArea textArea4 = new JTextArea();
        textArea4.setEditable(false);
        JScrollPane scrollPane4 = new JScrollPane(textArea4);
        frame.getContentPane().add(scrollPane4);
        textArea4.setText("Number 4: "); 

        // GridLayout #4
        JTextArea textArea5 = new JTextArea();
        textArea5.setEditable(false);
        JScrollPane scrollPane5 = new JScrollPane(textArea5);
        frame.getContentPane().add(scrollPane5);
        textArea5.setText("Number 5: "); 

        // GridLayout #5
        JTextArea textArea6 = new JTextArea();
        textArea6.setEditable(false);
        JScrollPane scrollPane6 = new JScrollPane(textArea6);
        frame.getContentPane().add(scrollPane6);
        textArea6.setText("Number 6: "); 

        // Grid Layout #6
        JTextArea textArea7 = new JTextArea();
        textArea7.setEditable(false);
        JScrollPane scrollPane7 = new JScrollPane(textArea7);
        frame.getContentPane().add(scrollPane7);
        textArea7.setText("Number 7: "); 

        // Grid Layout #7
        JTextArea textArea8 = new JTextArea();
        textArea8.setEditable(false);
        JScrollPane scrollPane8 = new JScrollPane(textArea8);
        frame.getContentPane().add(scrollPane8);
        textArea8.setText("Number 8: "); 

        // Grid Layout #8
        JTextArea textArea9 = new JTextArea();
        textArea9.setEditable(false);
        JScrollPane scrollPane9 = new JScrollPane(textArea9);
        frame.getContentPane().add(scrollPane9);
        textArea9.setText("Number 9: "); 

        // Grid Layout #9
        JTextArea textArea10 = new JTextArea();
        textArea10.setEditable(false);
        JScrollPane scrollPane10 = new JScrollPane(textArea10);
        frame.getContentPane().add(scrollPane10);
        textArea10.setText("Number 10: "); 

		frame.setVisible(true); // Make the GUI visible
		
		displayNumbers(frame, textArea2, textArea3, textArea4, textArea5, textArea6, 
		textArea7, textArea8, textArea9, textArea10); // Multiple of each numbers
	} // GridLayout
	
	private static void displayNumbers(JFrame frame, JTextArea textArea2, JTextArea textArea3, JTextArea textArea4, JTextArea textArea5,
			JTextArea textArea6, JTextArea textArea7, JTextArea textArea8, JTextArea textArea9, JTextArea textArea10) {
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				textArea2.append("\n"+i +" ");} // Multiples of Number 2
			
			if(i%3==0) {
				textArea3.append("\n"+i+" ");} // Multiples of Number 3
			
			if(i%4==0) {
				textArea4.append("\n"+i+" ");} // Multiples of Number 4
			
			if(i%5==0) {
				textArea5.append("\n"+i+" ");} // Multiples of Number 5
			
			if(i%6==0) {
				textArea6.append("\n"+i+" ");} // Multiples of Number 6
			
			if(i%7==0) {
				textArea7.append("\n"+i+" ");} // Multiples of Number 7
			
			if(i%8==0) {
				textArea8.append("\n"+i+" ");} // Multiples of Number 8
			
			if(i%9==0) {
				textArea9.append("\n"+i+" ");} // Multiples of Number 9
			
			if(i%10==0) {
				textArea10.append("\n"+i+" ");} // Multiples of Number 10
		} // For loop
	} // displayNumbers
} // Class

