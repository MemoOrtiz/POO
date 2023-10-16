package u3;

public class Farmacia extends Comercio {
	private double ventasMedicamentos;
	private double ventasPiso;
	
	public Farmacia(String nombre, double ventasMedicamentos, double ventasPiso) {
		super(nombre);
		this.ventasMedicamentos=ventasMedicamentos;
		this.ventasPiso=ventasPiso;
		calcularGanancias();
	}

	@Override
	public void calcularGanancias() {
		ganancias = ventasMedicamentos+ventasPiso;

	}

	@Override
	public String toString() {
		return super.toString()+"\nVentas de Medicamentos: " + ventasMedicamentos +
				"\nVentas Piso: " + ventasPiso;
	}

}
