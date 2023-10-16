package u3;

import javax.swing.JOptionPane;

public class FranquiciaJOPane {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Nombre del negocio");
		double litros = Double.parseDouble(JOptionPane.showInputDialog("Litros vendidos "));
		double precioLitro = Double.parseDouble(JOptionPane.showInputDialog("Precio vendido "));
		Gasolinera unaGas = new Gasolinera(nombre, litros, precioLitro);
		unaGas.calcularGanancias();
		//es necesario llamar el metodo calcular ganancias si no las ganancias no seran calculadas
		JOptionPane.showMessageDialog(null, "Datos del comercio "+ unaGas.toString() );
		//es lo mismo se llama implicitamente si no lo ponemos
		JOptionPane.showMessageDialog(null,"Datos del comercio\n"+ unaGas);
	}

}
