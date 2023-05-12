package _06_Console_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_Generics_Vs_Object.GenericsList;

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
	static GenericsList<String> generics;
	
    public static void main(String[] args) {
    	
    	Boolean thing = false;
    	Scanner scanner = new Scanner(System.in);
    	String input;
    	double stipend = 25.00;
    	double totalCost = 0;

    	Chips chips = new Chips(1.99);
    	SaladMix salad = new SaladMix(3.99);
    	Blanket blanket = new Blanket(8.50);
    	PokemonCards pokemon = new PokemonCards(9.90);
    	
    	double chipPrice = chips.getPrice();
    	double saladPrice = salad.getPrice();
    	double blanketPrice = blanket.getPrice();
    	double pokemonPrice = pokemon.getPrice();
    	
        generics = new GenericsList<String>();
    	
		System.out.println("Directions: Type in the name of the item to add it to cart. \nType \"remove\" before "
				+ "the name of an item in your cart to \nremove an item in your cart."
				+ " Type \"view cart\" to view your \ncart. Type \"check out\" when you are "
				+ "ready to check out. \n\nChips - $1.99\nSalad Mix - $3.99\nBlanket - $8.50\nPokemon cards - $9.90\n");		
    	
    	do {
    		input  = scanner.nextLine().toLowerCase();
    		//make into object... and use getter
    		switch (input) {
    		case "chips":
    			if(stipend >= chipPrice) {
    			totalCost += chipPrice;
    			generics.add("chips");
    			}
    			break;
    		case "salad mix":
    			if(stipend >= saladPrice) {
    			totalCost += saladPrice;
    			generics.add("salad");
    			}
    			break;
    		case "blanket":
    			if(stipend >= blanketPrice) {
    			totalCost += blanketPrice;
    			generics.add("blaket");
    			}
    			break;
    		case "pokemon cards":
    			if(stipend >= pokemonPrice) {
    			totalCost += pokemonPrice;
    			generics.add("pokemon");
    			}
    			break;
    		case "view cart":
    			
    			viewCart();
    			break;
    		case "check out":
    			System.out.println("Your total cost is $" + totalCost + ". Thank you for shopping at Lily's Digital Market");
    			break;
    		}
    		
    	}while (stipend >= totalCost);
    	
    	String money = String.format("%.2f", stipend);
    	System.out.println("You do not have enough money left to purchase this. Your Money: " + money);
    	
    	if(input.equalsIgnoreCase("view cart")) {
    		System.out.println("Viewing cart");
    	}
    	

    	
    }

	private static void viewCart() {
		// TODO Auto-generated method stub
		System.out.println("viewing cart");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		for(int i = 0; i<generics.length(); i++) {
			JLabel label = new JLabel();
			if(generics.get(i).equals("")) {
				//label.add	image      I need to add images here, depending on what store item it is
			}
			
			panel.add(label); 
		}
		
		frame.setVisible(true);
		frame.add(panel);
		//JOptionPane.
	}

}
