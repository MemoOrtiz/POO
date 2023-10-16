package u2;


public class Ticket {
	private Tienda tienda;
	private Empleado empleado;
	private Articulo [] arregloArticulos;
	private Fecha fecha;
	private Fpago fpago;
	private double cambio;

	
	
	public Ticket(Tienda tienda, Empleado empleado, Articulo[] arregloArticulos, Fecha fecha, Fpago fpago,double recibido) {
		this.tienda = tienda;
		this.empleado = empleado;
		this.arregloArticulos = arregloArticulos;
		this.fecha = fecha;
		this.fpago = fpago;
		if(fpago==Fpago.EFECTIVO) {
			calcularCambio(recibido);
		}
	}
	public Ticket(Tienda tienda, Empleado empleado, Articulo[] arregloArticulos, Fecha fecha, Fpago fpago) {
		this.tienda = tienda;
		this.empleado = empleado;
		this.arregloArticulos = arregloArticulos;
		this.fecha = fecha;
		this.fpago = fpago;
		if(fpago==Fpago.EFECTIVO) {
			throw new IllegalArgumentException();
		}
	}
	


	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Articulo[] getArregloArticulos() {
		return arregloArticulos;
	}

	public void setArregloArticulos(Articulo[] arregloArticulos) {
		this.arregloArticulos = arregloArticulos;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	//aqui tengo que sacar el total con el Foreach
	public double calcularTotal() {
		double total=0;
		for(Articulo elemento:arregloArticulos) {
			if(elemento!=null) {
				total=total+elemento.getPrecio()*elemento.getExistencia();
			}
		}
		return total;
	}
	//forma de sacar el total con for
	public double calcularTotaldos() {
		double total=0;
		for(int i=0;i<arregloArticulos.length;i++) {
			if(arregloArticulos[i]!=null) {
				total=total+arregloArticulos[i].getPrecio();
			}
		} return total;
	}

	public Fpago getFpago() {
		
		return fpago;
	}

	public void setFpago(Fpago fpago) {
		this.fpago = fpago;
	}

	//aqui tengo que sacar el cambio
	public void calcularCambio(double recibido) {
			cambio=recibido-calcularTotal();	
	}




	
	public String toString() {
		return "Ticket [tienda=" + tienda + ", empleado=" + empleado + ", arregloArticulos=" + arregloArticulos
				+ ", fecha=" + fecha + ", fpago=" + fpago + (fpago==Fpago.EFECTIVO?"\nCambio=" + cambio:"") + "]";
	}
	
	
	

}
