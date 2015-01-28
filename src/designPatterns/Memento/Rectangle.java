package designPatterns.Memento;

public class Rectangle {
	private int x;
	private int y;
	private int w;
	private int h;
	
	public Rectangle(int x, int y, int w, int h) {
		setX(x);
		setY(y);
		setW(w);
		setH(h);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
	public void move(int x, int y) {
		setX(x);
		setY(y);
		
		System.out.format("Nouvelles coordonnées : (%d;%d).%n", getX(), getY());
	}
	
	public void scale(double factor) {
		setW((int)(getW() * factor));
		setH((int)(getH() * factor));
		
		System.out.format("Nouvelles dimensions sont : %dx%d.%n", getW(), getH());
	}
	
	@Override
	public String toString() {
		return String.format("Rectangle - x: %d - y: %d - w: %d - h: %d%n", getX(), getY(), getW(), getH());
	}
	
	public Memento saveToMemento() {
		System.out.println("Création d'un nouveau mémento.");
		
		return new Memento(this);
	}
	
	public void restoreFromMemento(Memento m) {
		Rectangle r = m.getSavedState();
		
		setX(r.getX());
		setY(r.getY());
		setW(r.getW());
		setH(r.getH());
		
		System.out.println("Etat antérieur réaffecté");
	}
	
	public class Memento {
		private final Rectangle state;
		
		public Memento(Rectangle r) {
			state = new Rectangle(
						r.getX(),
						r.getY(),
						r.getW(),
						r.getH()
					);
			
			System.out.println("Nouvel état créé.");
		}
		
		public Rectangle getSavedState() {
			System.out.println("Retour d'un état antérieur.");
			
			return state;
		}
	}
}
