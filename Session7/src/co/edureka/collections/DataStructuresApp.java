package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataStructuresApp {

	public static void main(String[] args) {
		
		HashMap<String, Integer> menu = new HashMap<String, Integer>();
		menu.put("Margherita", 215);
		menu.put("Extravegenza", 250);
		menu.put("Farmhouse", 300);
		menu.put("Peppy Paneer", 450);
		menu.put("Exotic Veg", 250);

		ArrayList<Integer> cart = new ArrayList<Integer>();
		System.out.println("CART SIZE ["+cart.size()+"]");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Food Item To Add in the Cart, clear to clear the cart and quit to exit: ");
			String choice = scanner.nextLine();
			
			if(choice.equals("quit")) {
				break;
			}else if(choice.equals("clear")){
				cart.clear();
				System.out.println("CART CLEARED");
				System.out.println("CART SIZE SET TO ["+cart.size()+"]");
			}else {
				if(menu.containsKey(choice)){
					Integer price = menu.get(choice);
					cart.add(price);
					System.out.println(choice+" added in Cart");
				}else {
					System.out.println(choice+" is not in the Menu");
				}
			}
		}
		
		System.out.println("CART SIZE NOW ["+cart.size()+"]");
		Integer total = 0;
		for(Integer element : cart) {
			total += element;
		}
		System.out.println("CART TOTAL ["+total+"]");
		
		scanner.close();
		
	}

}
