package challenge301023;

public class ShoppingCart {

	public static void main(String[] args) {
	
		String custName;
		String itemDesc;
		String sentence = "Mary Smith wants to purchase a Shirt";
		
		int price = 7;
		double tax = 0.8;
		int quantity = 1;
		double total;
		
		System.out.println("Greetings!");
		
		System.out.println(sentence);
		
		System.out.println("Mary Smith wants to purchase " + quantity + " Shirt");

		int result = (int) (price * quantity * tax);
		System.out.println("Total cost with tax is: " + result);
	}

}
