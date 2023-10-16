package u3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppListaDeComercios {

	public static void main(String[] args) {
		ArrayList<Comercio> lista = new ArrayList<>();
		int seguir = JOptionPane.showConfirmDialog(null, "Ingresar un comercio ?");
		while (seguir == 0) {
			String nombre = JOptionPane.showInputDialog("Nombre del comercio ");
			int esFarmacia = JOptionPane.showConfirmDialog(null, "Es una farmacia ? ");
			if (esFarmacia == 0) {
				double ventasM = Double
						.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas por medicamentos: "));
				double ventasP = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas de piso: "));
				lista.add(new Farmacia(nombre, ventasM, ventasP));
			} else {
				int esGasolinera = JOptionPane.showConfirmDialog(null, "Es una gasolinera ? ");
				if (esGasolinera == 0) {
					double litrosVend = Double
							.parseDouble(JOptionPane.showInputDialog("Ingrese los litros vendidos: "));
					double precioXlitro = Double
							.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por litro: "));
					lista.add(new Farmacia(nombre, litrosVend, precioXlitro));
				}
			}
			seguir = JOptionPane.showConfirmDialog(null, "Ingresar un comercio ?");
		}
		// Mostrar el contenido de la lista
		System.out.println(lista);

		// Mostrar el contenido con un jop
		String salida = "";
		for (Comercio elemento : lista) {
			salida += elemento.toString() + "\n-----------------\n";
		}
		JOptionPane.showMessageDialog(null, salida);
		
		//Mostrar los comercios con ganancias mayores a 2000
		String salida2 ="\nLos comercios que tienen ganancias mayores a 2000 son: \n";
		for(Comercio cadaComercio: lista){
			if(cadaComercio !=null && cadaComercio.getGanancias()>2000) {
				salida2 += cadaComercio;
			}
		}JOptionPane.showMessageDialog(null, salida2);
		
		//Mostrar los comercios con ganancias mayores a 2000 CON JOPTIONPANE BONITO
				String salida3 ="\nLos comercios que tienen ganancias mayores a 2000 son: \n";
				for(Comercio cadaComercio: lista){
					if(cadaComercio !=null && cadaComercio.getGanancias()>2000) {
						salida2 += cadaComercio;
					}
				}JOptionPane.showMessageDialog(null, salida3, "Comercios Seleccionados", JOptionPane.PLAIN_MESSAGE);
	}

}
