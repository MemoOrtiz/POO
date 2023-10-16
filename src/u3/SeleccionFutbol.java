package u3;

import java.util.Objects;

public class SeleccionFutbol {
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;

	
	public SeleccionFutbol(int id) {
		this.id = id;
	}
	
	public SeleccionFutbol(int id, String nombre, String apellidos) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public SeleccionFutbol() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeleccionFutbol other = (SeleccionFutbol) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && id == other.id
				&& Objects.equals(nombre, other.nombre);
	}

	public void Concentrarse() {
		System.out.println("Se concentra Seleccion ");
	}

	public void Viajar() {
		System.out.println("Viaja Seleccion ");
	}

	@Override
	public String toString() {
		String f = "";
		f += "";
		f += "\nId: " + id;
		f += "\nNombre: " + nombre;
		f += "\nApellidos: " + apellidos;
		f += "\nEdad: " + edad;
		return f;
	}

}
