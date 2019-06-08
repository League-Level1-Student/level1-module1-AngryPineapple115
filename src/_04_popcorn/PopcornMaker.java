package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {

		Popcorn popcorn = new Popcorn();

		popcorn.applyHeat();
		String flavor = JOptionPane.showInputDialog("What is the flavor of the popcorn?");
		
		String minutes = JOptionPane.showInputDialog("How many minutes should it be cooked?");
		
		int mins = Integer.parseInt(minutes);
		
		System.out.println("The flavor of the popcorn is " + flavor + " and it should be cooked for " + minutes + " minute(s).");

	}

}