package u3;

public class SinCaducidad extends Producto {
	private String tipo;

	public SinCaducidad(String nombre) {
		super(nombre);	
		this.tipo= "Generico ";
	}
	public SinCaducidad(String nombre, String tipo) {
		super(nombre);		
		this.tipo=tipo;
	}

	public SinCaducidad(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo=tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "SinCaducidad " + super.toString() + 
				"Tipo " + tipo;
	}
	
	
	
}
