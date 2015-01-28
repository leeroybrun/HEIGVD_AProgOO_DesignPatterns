package designPatterns.Singleton;

import java.io.IOException;

public class Start {

	public static void main(String[] args) throws IOException {
		ExempleSansSingleton();
		
		System.out.println("");
		
		ExempleAvecSingleton();
		
		System.in.read();
	}
	
	public static void ExempleSansSingleton() {
		System.out.println("----------------------------------------");
		System.out.println(" Exemple sans singleton");
		System.out.println("----------------------------------------");
		
		Pizzeria1 p1 = new Pizzeria1();
		Pizzeria1 p2 = new Pizzeria1();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		if(p1 == p2) {
			System.out.println("Deux objets les mêmes");
		} else {
			System.out.println("Deux objets PAS les mêmes");
		}
	}
	
	public static void ExempleAvecSingleton() {
		System.out.println("----------------------------------------");
		System.out.println(" Exemple avec singleton");
		System.out.println("----------------------------------------");
		
		Pizzeria2 p1 = Pizzeria2.getInstance();
		Pizzeria2 p2 = Pizzeria2.getInstance();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		if(p1 == p2) {
			System.out.println("Deux objets les mêmes");
		} else {
			System.out.println("Deux objets PAS les mêmes");
		}
	}

}
