package _02_Generics_Store;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	
	public static void main(String[] args) {
		// 2. Create a Cart object of type Candy
		Cart<Candy> candyCart = new Cart<Candy>();
		// 3. Create another Cart object of type Cereal
		Cart <Cereal> cerealCart = new Cart<Cereal>();
		// 4. Add a few items to EACH cart
		int candyItems = 3;
		int cerealItems = 2;
		for(int i = 0; i<=candyItems-1; i++) {
			candyCart.add(new Candy());
			
		}
		for(int i  = 0; i<=cerealItems-1;i++) {
			cerealCart.add(new Cereal());
			
		}
		candyCart.showCart();
		cerealCart.showCart();
		
		
		
		// 5. Call the showCart() method on EACH cart
		
		
		// 6. Run the code
		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		
		Cart <Clothing> clothingCart = new Cart <Clothing>();
		Cart <Toy> toyCart = new Cart <Toy>();
		
		int clothingItems = 5;
		int toyItems = 1;
		
		for(int i = 0; i<=clothingItems-1; i++) {
			clothingCart.add(new Clothing());
		}
		for(int i = 0; i<=toyItems-1; i++) {
			toyCart.add(new Toy());
		}
		clothingCart.showCart();
		toyCart.showCart();
		// Why are there errors?
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 10. Run the code. Does it work?
		
	}
}
