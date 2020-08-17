package Shopping;

public class Person {
	private String brand;
	private int quantity;
	private int cost;
	private int total;
	
	
	public Person(String brand, int cost,int quantity) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.quantity=quantity;
	}


	public String getBrand() {
		return brand;
	}
	
	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getCost() {
		return cost;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}	
}
