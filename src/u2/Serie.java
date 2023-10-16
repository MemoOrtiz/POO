package u2;

public class Serie {
	private String nombreSerie;
	private int temporadas;
	private Productor productor;
	
	public Serie(String nombreSerie, int temporadas, Productor productor) {
		this.nombreSerie = nombreSerie;
		this.temporadas = temporadas;
		this.productor = productor;
	}

	public String getNombre() {
		return nombreSerie;
	}

	public void setNombre(String nombreSerie) {
		this.nombreSerie = nombreSerie;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public Productor getProductor() {
		return productor;
	}

	public void setProductor(Productor productor) {
		this.productor = productor;
	}

	
	public String toString() {
		String f="";
		f += "";
		f +="\nNombre de la serie: "+nombreSerie;
		f +="\nTemporadas: "+temporadas;
		f +="\nProductor: "+productor;
		
		return f;
	}
	
}
