package u2;

public class Pantalla {
	private int tamaño;
	private boolean tactil;
	
	public Pantalla(int tamaño, boolean tactil) {
		this.tamaño = tamaño;
		this.tactil = tactil;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public boolean isTactil() {
		return tactil;
	}

	public void setTactil(boolean tactil) {
		this.tactil = tactil;
	}

	public String toString() {
		return "Pantalla [tamaño=" + tamaño + ", tactil=" + tactil + "]";
	}
	
	
	
}
