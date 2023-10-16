package u3;

public class ConCaducidad extends Producto {
	private int diasACaducar;
	
	public ConCaducidad(String nombre){
		super(nombre);
		diasACaducar=0;
	}
	public ConCaducidad(String nombre, double precio) {
		super(nombre,precio);
		diasACaducar=0;
	}
	public ConCaducidad(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar=diasACaducar;
	}
	public double calcular(int cantidad) {
		if(diasACaducar==1) {
			return ((precio*cantidad)/4);
		}else if(diasACaducar==2){
			return ((precio*cantidad)/3);
		} else if(diasACaducar ==3) {
			return ((precio*cantidad)/2);
		}
		return super.calcular(cantidad); //o return precio*cantidad;
	}
	
	public int getDiasACaducar() {
		return diasACaducar;
	}
	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}
	@Override
	public String toString() {
		return "ConCaducidad\n" +super.toString()+
				"\nDias para Caducar " + diasACaducar ;
	}
	
}
