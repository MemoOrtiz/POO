package u2;

public class Boton {
	private float ancho;
	private float alto;
	private String texto;

	public Boton(float ancho, float alto, String texto) {
		this.ancho = ancho;
		this.alto = alto;
		this.texto = texto;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Boton:" + "\nancho=" + ancho + "\nalto=" + alto + "\n texto=" + texto;

	}

}
