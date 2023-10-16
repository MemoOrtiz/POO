package u3;

public class Gasolinera extends Comercio {
	double litrosVendidos;
	double precioPorLitro;
	
	public Gasolinera(String nombre,double litrosVendidos,double precioPorLitro ) {
		super(nombre);
		this.litrosVendidos=litrosVendidos;
		this.precioPorLitro=precioPorLitro;
		calcularGanancias();
	}
	public void calcularGanancias(){
		ganancias= litrosVendidos*precioPorLitro;
	}
	
	public String toString() {
		return super.toString()+"\nLitros Vendidos: " + litrosVendidos + 
				"\nPrecio Por Litro:" + precioPorLitro;
	}
	
}
// la clase puede ser abstracta sin tener metodos abstractos
//pero si una clase tiene metodos abstractos forzozamente 
//tiene que ser una clase abstracta
