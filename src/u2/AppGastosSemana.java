package u2;

import javax.swing.JOptionPane;

public class AppGastosSemana {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Dime el numero de tickets a registrar"));
		Ticket[] arregloTickets = new Ticket[num];
		int seguir = 0;
		for (int i = 0; i < arregloTickets.length; i++) {
			String claveT = JOptionPane.showInputDialog("Dime la clave de la tienda ");
			String zona = JOptionPane.showInputDialog("Dime la zona de la tienda ");
			String ciudad = JOptionPane.showInputDialog("Dime la ciudad de la tienda ");
			String gerente = JOptionPane.showInputDialog("Dime el nombre del gerente de la tienda ");
			Tienda tienda = new Tienda(claveT, zona, ciudad, gerente);

			String nombre = JOptionPane.showInputDialog("Dime el nombre del emplead ");
			String direccion = JOptionPane.showInputDialog("Dime la direccion del empleado ");
			float sueldo = Float.parseFloat(JOptionPane.showInputDialog("Cual es el sueldo del empleado "));
			int diaN = Integer.parseInt(JOptionPane.showInputDialog("Dime el dia de nacimiento del empleado"));
			int mesN = Integer.parseInt(JOptionPane.showInputDialog("Dime el mes de nacimiento del empleado"));
			int añoN = Integer.parseInt(JOptionPane.showInputDialog("Dime el año de nacimiento del empleado"));
			int diaI = Integer.parseInt(JOptionPane.showInputDialog("Dime el dia de nacimiento del empleado"));
			int mesI = Integer.parseInt(JOptionPane.showInputDialog("Dime el mes de nacimiento del empleado"));
			int añoI = Integer.parseInt(JOptionPane.showInputDialog("Dime el año de nacimiento del empleado"));
			Fecha fechaNacimiento = new Fecha(diaN, mesN, añoN);
			Fecha fechaIngreso = new Fecha(diaI, mesI, añoI);
			Empleado empleado = new Empleado(nombre, direccion, fechaNacimiento, fechaIngreso, sueldo);

			Articulo[] arregloArticulos = new Articulo[50];
			while (seguir == 0) {
				String claveA = JOptionPane.showInputDialog("Dime la clave del articulo ");
				String descripcion = JOptionPane.showInputDialog("Dime la descripcion del articulo ");
				int existencia = Integer.parseInt(JOptionPane.showInputDialog("Dime la existencia del articulo "));
				double precio = Double.parseDouble(JOptionPane.showInputDialog("Dime el precio del articulo "));
				Articulo articulo = new Articulo(claveA, descripcion, existencia, precio);
				seguir = JOptionPane.showConfirmDialog(null, "Desea seguir capturando?");
				arregloArticulos[i] = articulo;
			}

			int diaT = Integer.parseInt(JOptionPane.showInputDialog("Dia de la compra "));
			int mesT = Integer.parseInt(JOptionPane.showInputDialog("Mes de la compra "));
			int añoT = Integer.parseInt(JOptionPane.showInputDialog("Año de la compra "));
			Fecha fechaTicket = new Fecha(diaT, mesT, añoT);
			Fpago fpago;

			fpago = (Fpago) JOptionPane.showInputDialog(null, "Selecciona", "Forma de pago", JOptionPane.PLAIN_MESSAGE,
					null, Fpago.values(), (Object) Fpago.EFECTIVO);
			double recibido = Double.parseDouble(JOptionPane.showInputDialog("Dime el monto recibido"));
			Ticket ticket = new Ticket(tienda,empleado,arregloArticulos,fechaTicket,fpago,recibido);
			

		}

	}

}
