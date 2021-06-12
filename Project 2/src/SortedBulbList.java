public class SortedBulbList extends BulbList{  // SortedBulbList extends BulbList
	
	public SortedBulbList() {
		super();  // Calling on Super
	}
	
	public void add(Bulb bulb) {

		BulbNode previous = first, current = first.next;
		
	    BulbNode node = new BulbNode(bulb);  // Node Defining
	       
	    while(current != null && bulb.getWattage() > current.data.getWattage()) {
	    	
	           previous = current;  // Previous node as current node
	           current = current.next;  // Current node to next node
	    }
	    
	    node.next = current; // Node to next current node
	    previous.next = node; // Previous to next is node

	    if(node.next == null) {  // Node next to value equals null
	    	last = node;  // set node as last
	        length++;  // Increment the node
	    }
	}
}


