package u2;

import javax.swing.JOptionPane;

public class AppListaInmueble {

	public static void main(String[] args) {
		
		int numInmuebles;
		numInmuebles = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero de Inmuebles: "));
		Inmueble[] arregloInmuebles = new Inmueble[numInmuebles];

		
		
		for(int i=0;i<arregloInmuebles.length;i++) {
			String nombre = JOptionPane.showInputDialog("Nombre del propietario "+(i+1)+":");
			int telefono = Integer.parseInt(JOptionPane.showInputDialog("Telefono del propietario "+(i+1)+":"));
			int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia del Nacimiento del propietario "+(i+1)+":"));
			int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes del Nacimiento del propietario "+(i+1)+":"));
			int año = Integer.parseInt(JOptionPane.showInputDialog("Año del Nacimiento del propietario "+(i+1)+":"));
			float volumen = Float.parseFloat(JOptionPane.showInputDialog("Volumen de la piscina del propietario "+(i+1)+":"));
			boolean cubierta = (0 == JOptionPane.showConfirmDialog(null, "¿Está cubierta la piscina?", "Selección", JOptionPane.YES_NO_OPTION));
			float superficieCochera = Float.parseFloat(JOptionPane.showInputDialog("Superficie de la cochera "+(i+1)+"?:"));
			int plazas =Integer.parseInt(JOptionPane.showInputDialog("Cuantos carros caben en la Cochera "+(i+1)+"?:"));
			boolean automatica =(0 == JOptionPane.showConfirmDialog(null, "¿Es automática la Cochera?", "Selección", JOptionPane.YES_NO_OPTION));
			float superficie= Float.parseFloat(JOptionPane.showInputDialog("Superficie del Inmueble del propietario "+(i+1)+":"));
			int habitaciones= Integer.parseInt(JOptionPane.showInputDialog("Habitaciones del Inmueble del propietario "+(i+1)+":"));
			double precio= Float.parseFloat(JOptionPane.showInputDialog("Precio del Inmueble del propietario "+(i+1)+":"));
			int diaC = Integer.parseInt(JOptionPane.showInputDialog("Dia de Construcción del Inmueble "+(i+1)+":"));
			int mesC = Integer.parseInt(JOptionPane.showInputDialog("Mes de Construccion del Inmueble "+(i+1)+":"));
			int añoC = Integer.parseInt(JOptionPane.showInputDialog("Año de construccion del Inmueble "+(i+1)+":"));
			Fecha fechaNacimiento = new Fecha(dia,mes,año);
			Persona propietario = new Persona(nombre, telefono,fechaNacimiento);
			Piscina piscina = new Piscina(volumen, cubierta);
			Cochera cochera= new Cochera(superficieCochera,plazas,automatica);
			Fecha fechaConstruccion = new Fecha(diaC,mesC,añoC);
			arregloInmuebles[i] = new Inmueble(superficie, habitaciones, precio,fechaConstruccion, propietario, piscina, cochera);
		}
		String salida = "Los propietarios con Inmuebles construidos después del año 2000 son: ";
		for(Inmueble cadaInmueble: arregloInmuebles) {
			if(cadaInmueble !=null) {
				if(cadaInmueble.getFecha().getAño()>2000);
				salida=salida+cadaInmueble.getPropietario().getNombre();
			}
		}JOptionPane.showMessageDialog(null, salida);
	}
}
