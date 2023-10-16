package u2;

public class Teclado {
	private int ancho;
	private int largo;
	private int profundidad;
	private String idioma;
	private boolean extendido;
	
	public Teclado(int ancho, int largo, int profundidad, String idioma, boolean extendido) {
		this.ancho = ancho;
		this.largo = largo;
		this.profundidad = profundidad;
		this.idioma = idioma;
		this.extendido = extendido;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean isExtendido() {
		return extendido;
	}

	public void setExtendido(boolean extendido) {
		this.extendido = extendido;
	}


	public String toString() {
		return "Teclado [ancho=" + ancho + ", largo=" + largo + ", profundidad=" + profundidad + ", idioma=" + idioma
				+ ", extendido=" + extendido + "]";
	}
	
	

}
