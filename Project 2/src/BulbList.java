public abstract class BulbList { // Abstract class BulbList

	protected BulbNode first; // Instance variable first
	protected BulbNode last; // Instance Variable last
	protected int length; // Instance variable length

	public BulbList() { // Default constructor
		first = last = new BulbNode(null);
	    length = 0; 
	}
	
	public void append(Bulb bulb) {  // Append method
		last.next = new BulbNode(bulb);  // Data to last node
		last = last.next;  // Last node set to last.next
		length++;  // Increment the length
	}
	
	public String toString() {  // Implementing toString
		
		BulbNode current = first.next; //define current node
		String string = "";
		
		while(current != null) {  // Current node is null or not
		  
			string += current.data.toString() + "\n";  // Calling toString
			current = current.next;  // Current to next
		}
		
	return string;  // Return String
	}
}
