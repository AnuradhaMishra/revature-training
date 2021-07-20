package material;

public class Lapi extends Inventor {
	int quantity = 1000;
	int lowOrderLevelQuantity = 3;
	String processor;
	String name;

	public Lapi() {
		super();
		this.quantity = quantity;
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
		this.processor = processor;
		this.name = name;
	}

	public Lapi(String string, String string2) {

	}

	@Override
	public String toString() {
		return "Lapi [quantity=" + quantity + ", lowOrderLevelQuantity=" + lowOrderLevelQuantity + ", processor=" + processor + ", name=" + name + "]";
	}

	public void out(int q) {
		if (q < quantity && q > lowOrderLevelQuantity)
			System.out.println("Order Placed");
		else if (q < lowOrderLevelQuantity)
			System.out.println("Requesting Material");
		else {
			System.out.println("Item not found");
		}
	}
}
