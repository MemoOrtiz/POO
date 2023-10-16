package u2;

public class Piscina {
	private float volumen;
	private boolean cubierta;
	
	public Piscina(float volumen, boolean cubierta) {
		this.volumen = volumen;
		this.cubierta = cubierta;
	}

	public float getVolumen() {
		return volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}

	public boolean isCubierta() {
		return cubierta;
	}

	public void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}

	
	public String toString() {
		return "Piscina [volumen=" + volumen + ", cubierta=" + cubierta + "]";
	}
	
	
}
