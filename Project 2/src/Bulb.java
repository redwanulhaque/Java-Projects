public class Bulb {  // Bulb.java
	
	String manufacturer; // Instance Variable  manufacturer
	String partNumber; // Instance Variable partNumber
	int wattage; // Instance Variable wattage
	int lumens; // Instance Variable for lumens
	
	public Bulb() { // Default constructor
		this.manufacturer = "";
		this.partNumber = "";
		this.wattage = 0;
		this.lumens = 0;
	}
	
	public Bulb (int wattages) {
		if(wattage < 100)
			throw new IllegalBulbException(" The wattage is not valid!");
			
		this.wattage = wattages;
	}

	public String getManufacturer() { // Get Manufacturer
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) { // Set manufacturer
		this.manufacturer = manufacturer;
	}
	
	public String getPartNumber() { // Get partNumber
		return partNumber;
	}
	
	public void setPartNumber(String partNumber) { // Set partNumber
		this.partNumber = partNumber;
	}
	
	public int getWattage() { // Get wattage
		return wattage;
	}
	
	public void setWattage(int wattage) { // Set wattage
		this.wattage = wattage;
	}
	
	public int getLumens() { // Get lumens
		return lumens;
	}
	
	public void setLumens(int lumens) { // Set lumens
		this.lumens = lumens;
	}
	
	public Bulb(String manufacturer, String partNumber, int wattage, int lumens) { // parameter constructor
		super();
		
	    this.manufacturer = manufacturer;
	    this.partNumber = partNumber;
	    this.wattage = wattage;
	    this.lumens = lumens;
	}
	
	@Override
	public boolean equals(Object other) {  // Override method to equals
		if(this == other) return true;
		
		if((other != null) && this.getClass() == other.getClass()){
			Bulb OtherB = (Bulb)other;
			
			if((manufacturer == OtherB.manufacturer) && (partNumber == OtherB.partNumber) && (wattage == OtherB.wattage) && (lumens == OtherB.lumens)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public String toString() { // Override method toString
		return "Manufacturer = " + manufacturer + ", PartNumber = " + partNumber + ", Wattage = " + wattage +", Lumens = " + lumens;
	}
}
