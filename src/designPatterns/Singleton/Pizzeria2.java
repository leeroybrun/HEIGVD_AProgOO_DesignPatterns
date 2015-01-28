package designPatterns.Singleton;

import java.util.Random;

public class Pizzeria2 {
	
	private int _id;
	
	private Pizzeria2() {
		setId(new Random().nextInt(1000));
	}

	public int getId() {
		return _id;
	}

	private void setId(int _id) {
		this._id = _id;
	}
	
	@Override
	public String toString() {
		return "Pizzeria "+ getId();
	}
	
	private static class PizzeriaHolder {
		private final static Pizzeria2 instance = new Pizzeria2();
	}
		
	public static Pizzeria2 getInstance() {
		return PizzeriaHolder.instance;
	}

}
