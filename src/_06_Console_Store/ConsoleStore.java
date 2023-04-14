package _06_Console_Store;

import java.util.Scanner;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
    	Boolean thing = false;
    	Scanner scanner = new Scanner(System.in);
    	String input;
    	double stipend = 25.00;
    	double totalCost = 0;
    	/*double chipsCost = 1.99;
    	double saladCost = 3.99;
    	double blanketCost = 8.50;
    	double pokemonCost = 9.90;*/
    	Chips chips = new Chips(1.99);
    	//do all things this way!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    	System.out.println(chips.getPrice());
    			
    	/*do {
    		System.out.println("Directions: Type in the name of the item to add it to cart. \nType \"remove\" before "
    				+ "the name of an item in your cart to \nremove an item in your cart."
    				+ " Type \"view cart\" to view your \ncart. Type \"check out\" when you are "
    				+ "ready to check out. \n\nChips - $1.99\nSalad Mix - $3.99\nBlanket - $8.50\nPokemon cards - $9.90\n");
    		
    		input  = scanner.nextLine().toLowerCase();
    		//make into object... and use getter
    		switch (input) {
    		case "chips":
    			if(stipend >= chipsCost) {
    			totalCost += chipsCost;
    			}
    			break;
    		case "salad mix":
    			if(stipend >= saladCost) {
    			totalCost += saladCost;
    			}
    			break;
    		case "blanket":
    			if(stipend >= blanketCost) {
    			totalCost += blanketCost;
    			}
    			break;
    		case "pokemon cards":
    			if(stipend >= pokemonCost) {
    			totalCost += pokemonCost;
    			}
    			break;
    		}
    		
    		stipend -= totalCost;
    		
    	}while (stipend >= totalCost);
    	 */

    	String money = String.format("%.2f", stipend);
    	System.out.println("You do not have enough money left to purchase this. Your Money: " + money);
    }

}
