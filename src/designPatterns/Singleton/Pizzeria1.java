package designPatterns.Singleton;

import java.util.Random;

public class Pizzeria1 {
	
	private int _id;
	
	public Pizzeria1() {
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

}
