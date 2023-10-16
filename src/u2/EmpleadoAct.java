package u2;

public class EmpleadoAct {
	private String nombre;
	private int departamento;
	private int horasTrabajadas;
	private double pagoPorHora;
	
	public EmpleadoAct(String nombre, int departamento, int horasTrabajadas, double pagoPorHora) {
		this.nombre = nombre;
		this.departamento = departamento;
		this.horasTrabajadas = horasTrabajadas;
		this.pagoPorHora = pagoPorHora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getPagoPorHora() {
		return pagoPorHora;
	}

	public void setPagoPorHora(double pagoPorHora) {
		this.pagoPorHora = pagoPorHora;
	}
	
	public double getSalario(){
		double salario;
		salario = (getPagoPorHora() * getHorasTrabajadas());
		return salario;
	}
	
	public String toString() {
		String s = "";
		s+= (nombre==null?"":"Nombre del empleado: "+nombre);
		s+= "Número de Departamento: "+departamento;
		s+= "Horas Trabajadas: "+horasTrabajadas;
		s+= "Pago por Hora: "+pagoPorHora;
		s+= "Salario del empleado: "+getSalario();
		return s;
	}
	

}
