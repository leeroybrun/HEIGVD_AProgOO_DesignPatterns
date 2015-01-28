package designPatterns.Memento;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) throws IOException {
		TravaillerSansMemento();
		
		System.out.println("");
		
		TravaillerAvecMemento();
		
		System.in.read();
	}
	
	public static void TravaillerSansMemento() {
		System.out.println("----------------------------------------");
		System.out.println(" Exemple sans memento");
		System.out.println("----------------------------------------");
		
		Rectangle r = new Rectangle(0, 0, 20, 10);
		
		System.out.println(r.toString());
		
		r.move(5, 5);
		
		r.scale(0.5);
		
		System.out.println(r.toString());
	}
	
	public static void TravaillerAvecMemento() {
		System.out.println("----------------------------------------");
		System.out.println(" Exemple avec memento");
		System.out.println("----------------------------------------");
		
		List<Rectangle.Memento> states = new ArrayList<Rectangle.Memento>();
		
		System.out.println("Création nouveau rectangle");
		
		Rectangle r = new Rectangle(0, 0, 20, 10);
		
		System.out.println(r.toString());

		
		System.out.println("------------------");
		System.out.println("Création point restauration");
		
		states.add(r.saveToMemento());
		
		r.move(5, 5);
		
		r.scale(0.5);
		
		System.out.println(r.toString());
		
		System.out.println("------------------");
		System.out.println("Restauration etat antérieur");
		
		r.restoreFromMemento(states.get(0));
		
		System.out.println(r.toString());
	}

}
