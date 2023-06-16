package _06_Console_Store;

public class StoreItem {

	String name;

	double price = 0;

	StoreItem(double price, String name) {
		this.price = price;
		this.name = name;
	}

	double getPrice() {
		return price;

	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
