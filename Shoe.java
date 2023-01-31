
public class Shoe implements Comparable<Shoe>{
	
	private final int size;
	private final String brand;
	
	public Shoe(int s, String b) {
		this.size = s;
		this.brand = b;
	}
	
	public int compareTo(Shoe s) {
		return Integer.compare(this.size, s.getSize());
	}
	
	public boolean equals(Shoe s) {
		if(this.size == s.getSize()) {
			if(this.brand.equals(s.getBrand())) {
					return true;
			}
		}
		return false;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String toString() {
		return "" + brand + ", Size " + size;
	}


}


