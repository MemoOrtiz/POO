package u6.proyecto;

public class ProfesorTiempoCompleto extends Profesor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public ProfesorTiempoCompleto(String nombre, String telefono, Fecha fechaNacimiento, String clave) {
		super(nombre, telefono, fechaNacimiento, clave);
		calcularSalario();
	}

	public ProfesorTiempoCompleto(String curp, String nombre, String telefono, Fecha fechaNacimiento, String clave) {
		super(curp, nombre, telefono, fechaNacimiento, clave);
		calcularSalario();
	}
	
	public void calcularSalario(){
		setSalario(40*100);
	}


	@Override
	public String toString() {
		return super.toString()+ "\nProfesorTiempoCompleto \nTiene 40 horas: "  ;
	}

	
}
