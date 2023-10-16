package u2;

public class Productor {
	private String nombre;
	private String correo;
	private int edad;
	
	public Productor(String nombre, String correo, int edad) {
		this.nombre = nombre;
		this.correo = correo;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public String toString() {
		String f="";
		f += "";
		f +="\nNombre Productor: "+nombre;
		f +="\nCorreo Productor: "+correo;
		f +="\nEdad del Productor: "+edad;
		return f;
	}
	
	

}
