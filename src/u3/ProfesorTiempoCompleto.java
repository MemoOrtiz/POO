package u3;

import u2.Fecha;

public class ProfesorTiempoCompleto extends Profesor {

	public ProfesorTiempoCompleto(String nombre, int telefono, Fecha fechaNacimiento, String clave) {
		super(nombre, telefono, fechaNacimiento, clave);
		calcularSalario();
	}

	public ProfesorTiempoCompleto(String curp, String nombre, int telefono, Fecha fechaNacimiento, String clave) {
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
