package u2;

public class Tienda {
	private String clave;
	private String zona;
	private String ciudad;
	private String gerente;
	
	public Tienda(String clave, String zona, String ciudad, String gerente) {
		this.clave = clave;
		this.zona = zona;
		this.ciudad = ciudad;
		this.gerente = gerente;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	
	public String toString() {
		return "Tienda [clave=" + clave + ", zona=" + zona + ", ciudad=" + ciudad + ", gerente=" + gerente + "]";
	}
	
	
}
