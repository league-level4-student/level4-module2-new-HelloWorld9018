package _06_Console_Store;

import java.awt.MenuContainer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_Generics_Vs_Object.GenericsList;

public class ConsoleStore {

	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */
	static Cart<StoreItem> generics;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input;
		double stipend = 25.00;
		double totalCost = 0;

		Chips chips = new Chips(1.99, "chips");
		SaladMix salad = new SaladMix(3.99, "salad");
		Blanket blanket = new Blanket(8.50, "blanket");
		PokemonCards pokemon = new PokemonCards(9.90, "pokemon");

		double chipPrice = chips.getPrice();
		double saladPrice = salad.getPrice();
		double blanketPrice = blanket.getPrice();
		double pokemonPrice = pokemon.getPrice();
		
		boolean found = false;

		generics = new Cart<StoreItem>();

		System.out.println("Directions: Type in the name of the item to add it to cart. \nType \"remove\" before "
				+ "the name of an item in your cart to \nremove an item in your cart."
				+ " Type \"view cart\" to view your \ncart. Type \"check out\" when you are "
				+ "ready to check out. \n\nChips - $1.99\nSalad Mix - $3.99\nBlanket - $8.50\nPokemon cards - $9.90\n");

		do {
			input = scanner.nextLine().toLowerCase();
			// make into object... and use getter
			switch (input.toLowerCase()) {
			// ___________________________________ADDING ITEMS TO CART_____________________
			case "chips":
				if (stipend >= chipPrice) {
					totalCost += chipPrice;
					stipend -= chipPrice;
					generics.add(chips);
					System.out.println("chips added to cart");
				} else {
					printWarning(stipend);
				}
				break;

			case "salad mix":
				if (stipend >= saladPrice) {
					totalCost += saladPrice;
					stipend -= saladPrice;
					generics.add(salad);
					System.out.println("salad mix added to cart");
				} else {
					printWarning(stipend);
				}
				break;

			case "blanket":
				if (stipend >= blanketPrice) {
					totalCost += blanketPrice;
					stipend -= blanketPrice;
					generics.add(blanket);
					System.out.println("blanket added to cart");
				} else {
					printWarning(stipend);
				}
				break;

			case "pokemon cards":
				if (stipend >= pokemonPrice) {
					totalCost += pokemonPrice;
					stipend -= pokemonPrice;
					generics.add(pokemon);
					System.out.println("pokemon cards added to cart");
				} else {
					printWarning(stipend);
				}
				break;
			// __________________________________________REMOVING ITEMS FROM CART_________
			case "remove chips":
				// check if item has already been added to generic array
				// reverse add/subtract
				for (int i = 0; i < 20; i++) {
					found  = false;
					if (generics.getItem(i) != null && generics.getItem(i).toString().equalsIgnoreCase("chips")) {
						generics.remove(i);
						found = true;
						totalCost -= chipPrice;
						stipend += chipPrice;
						System.out.println("1 bag of chips removed from cart");
						break;
					}
				}
				if(!found) {
					
						System.out.println("Bag of chips not found in cart");
					
				}

				break;

			case "remove salad mix":
				for(int i  = 0; i<20; i++) {
					found = false;
					if(generics.getItem(i) != null && generics.getItem(i).toString().equalsIgnoreCase("salad")) {
						generics.remove(i);
						found = true;
						totalCost -= saladPrice;
						stipend += saladPrice;
						System.out.println("1 bag of salad mix removed from cart");
						break;
					} 
				}
				if(!found) {
						System.out.println("Bag of salad mix not found in cart");
				}
				break;

			case "remove blanket":
				for(int i  = 0; i<20; i++) {
					found = false;
				if(generics.getItem(i) != null && generics.getItem(i).toString().equalsIgnoreCase("blanket")) {
						generics.remove(i);
						found = true;
						totalCost -= blanketPrice;
						stipend += blanketPrice;
						System.out.println("1 blanket removed from cart");
						break;
					} 
				}
				if(!found) {
						System.out.println("Blanket not found in cart");
				}
				break;
			case "remove pokemon cards":
				for(int i  = 0; i<20; i++) {
					found  = false;
					if(generics.getItem(i) != null && generics.getItem(i).toString().equalsIgnoreCase("pokemon")) {
						generics.remove(i);
						found = true;
						totalCost -= pokemonPrice;
						stipend += pokemonPrice;
						System.out.println("1 pack of Pokemon cards removed from cart");
						break;
					} 
				}
				if(!found) {
					System.out.println("Pack of Pokemon cards not found in cart");
				}
				break;
			// _______________________________________OTHER COMMANDS_______________________
			case "view cart":
				generics.viewCart();
				break;

			case "check out":
				System.out.println(
						"Your total cost is $" + totalCost + ". Thank you for shopping at Lily's Digital Market");
				scanner.close();
				//stipend = 0;
				//how to make do loop end so error doesn't show at end?
				break;
			default:
				System.out.println("Invalid input. Double check for typos");
			}

		} while (stipend >= 0);

		// if(input.equalsIgnoreCase("view cart")) {
		// System.out.println("Viewing cart");
		// }

	}

	private static void printWarning(double stipend) {
		// TODO Auto-generated method stub
		String money = String.format("%.2f", (stipend));
		System.out.println("You won't have enough money to purchase this. Your money remaining: $" + money);
	}

}
