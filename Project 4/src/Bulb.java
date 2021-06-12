public class Bulb {

	String manufacturer; 
	String partNumber;
	int wattage;
	int lumens; 
	public Object Project4;

	public Bulb(String manufacturer, String partNumber, int wattage, int lumens) { 

		this.manufacturer = manufacturer;
		this.partNumber = partNumber;
		this.wattage = wattage;
		this.lumens = lumens;
	}

	public String getManufacturer() { 
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) { 
		this.manufacturer = manufacturer;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) { 
		this.partNumber = partNumber;
	}

	public int getWattage() {
		return wattage;
	}

	public void setWattage(int wattage) { 
		this.wattage = wattage;
	}

	public int getLumens() { 
		return lumens;
	}

	public void setLumens(int lumens) {
		this.lumens = lumens;
	}
	
	public int compareTo(Bulb o) {  
		return this.partNumber.compareTo(o.partNumber);
	}

	@Override
	public boolean equals(Object other) { 
		if (this == other)
			return true;

		if ((other != null) && this.getClass() == other.getClass()) {
			Bulb OtherB = (Bulb) other;

			if ((manufacturer == OtherB.manufacturer) && (partNumber == OtherB.partNumber)
					&& (wattage == OtherB.wattage) && (lumens == OtherB.lumens)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public String toString() { 
		return manufacturer + "," + partNumber + "," + wattage + "," + lumens;
	}
}
