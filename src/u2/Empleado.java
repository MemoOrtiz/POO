package u2;

public class Empleado {
	private String nombre;
	private String direccion;
	private Fecha fechaNacimiento;
	private Fecha fechaIngreso;
	private float sueldo;
	
	public Empleado(String nombre, String direccion, Fecha fechaNacimiento, Fecha fechaIngreso, float sueldo) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngreso = fechaIngreso;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	
	public String toString() {
		return "Empleado [nombre=" + nombre + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento
				+ ", fechaIngreso=" + fechaIngreso + ", sueldo=" + sueldo + "]";
	}
	
	
	

}
