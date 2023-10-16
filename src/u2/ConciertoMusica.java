 package u2;

public class ConciertoMusica {
	private Funcion[] funciones;
	private String nombreFuncion;
	
	public ConciertoMusica(Funcion[] funciones, String nombreFuncion) {
		this.funciones = funciones;
		this.nombreFuncion = nombreFuncion;
	}
	public Funcion[] getFunciones() {
		return funciones;
	}
	public void setFunciones(Funcion[] funciones) {
		this.funciones = funciones;
	}
	public String getNombre() {
		return nombreFuncion;
	}
	public void setNombre(String nombreFuncion) {
		this.nombreFuncion = nombreFuncion;
	}
	
	public String toString() {
		return "\nConciertoMusica \nFunciones=" + funciones + "\nNombre=" + nombreFuncion ;
	}
	
}
