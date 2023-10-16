package u3;

public class Futbolista extends SeleccionFutbol {
	private int dorsal;
	private String demarcacion;

	public Futbolista(int id, int dorsal) {
		super(id);
		this.dorsal =dorsal;
	}
	
	public Futbolista(int id, String nombre, String apellidos, int dorsal, String demarcacion) {
		super(id, nombre,apellidos);
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;

	}

	public Futbolista() {
		super();
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public void jugarPartido() {
		System.out.println("Jugador juega partido ");
	}

	public void entrenar() {
		System.out.println("Jugador entrena");
	}

	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
	}
//public String toString(){
//return super.toString();        AQUI SE REFIERE AL OBJETO DE LA SUPERCLASE
//}

//public Futbolista(int dorsal){
//super();
//this.dorsal = dorsal;            	AQUI SE REFIERE AL OBJETO ACTUAL 
//;

// public String toString(){
//return super.toString() + "\nDorsal: " +dorsal ;    AQUI SE REFIERE  A QUE SE MUESTRA PRIMERO TODO 
//}														LO DE LA SUPERCLASE Y LUEGO LO DE LA CLASE ACTUAL
}
