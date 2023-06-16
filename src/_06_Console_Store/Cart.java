package _06_Console_Store;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Cart<T> {
	//different (mine)
	private T[] cart;
	
	@SuppressWarnings("unchecked")
	public Cart() {
		cart = (T[]) new Object[20];
	}
	public void add(T item) {
		for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                return;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Your cart is full!\nNo more than 20 items");
	}
	public void viewCart() {
		// TODO Auto-generated method stub
		System.out.println("viewing cart");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
			frame.setVisible(true);
		frame.add(panel);
		
		//= new JLabel(loadImage("salad_mix_resized.png"));
		//panel.add(label);
		
		
		for(int i = 0; i<20; i++) {
			//JLabel label = new JLabel();
			if(cart[i]!=null) {
			switch(cart[i].toString()) {
				//label.add	image      I need to add images here, depending on what store item it is
				case "blanket":
					panel.add(new JLabel(loadImage("blanketResized.png"))); 
					break;	
				case "salad":
					panel.add(new JLabel(loadImage("salad_mix_resized.png")));
					break;
				case "chips":
					panel.add(new JLabel(loadImage("transparentChips.png")));
					break;
				case "pokemon":
					panel.add(new JLabel(loadImage("transparentPokemon.png")));
					break;
			}
			frame.pack();
			}	
		}
		
	
		//JOptionPane.
	}
	
	public int findItem(String name) {
		for(int i=0; i<20; i++) {
			
			if(cart[i]!=null && cart[i].toString().equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public T getItem(int i) {
		return cart[i];
	}
	
	public void remove(int i) {
		cart[i] = null;
	}
	
	  @SuppressWarnings("rawtypes")
	    public static ImageIcon loadImage(String fileName) {
	        try {
	            return new ImageIcon(ImageIO
	                    .read(new ConsoleStore().getClass().getResourceAsStream(fileName)));
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	
}
