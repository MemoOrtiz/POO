package u3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppFiguras {

	public static void main(String[] args) {
		ArrayList<FiguraGeometrica> lista = new ArrayList<>();

		String menu = "VOLUMEN DE FIGURAS GEOMÉTRICAS " + "\n1. Cubo: " + "\n2. Paralelepípedo: " + "\n3. Cilindro: "
				+ "\n4. Esfera: " + "\n5. Observar el arreglo de figuras" +"\n6. Terminar";

		int opcion = 0;
		while (opcion != 6) {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
			switch (opcion) {
			case 1:
				double arista = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide el lado del cubo? "));
				Cubo cubo = new Cubo(arista);
				lista.add(cubo);
				JOptionPane.showMessageDialog(null, cubo.toString());
				break;
			case 2:
				double lado1 = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide el lado 1 del paralelepípedo? "));
				double lado2 = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide el lado 2 del paralelepípedo? "));
				double lado3 = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide el lado 3 del paralelepípedo? "));
				Paralelepipedo paralelepipedo = new Paralelepipedo(lado1,lado2,lado3);
				lista.add(paralelepipedo);
				JOptionPane.showMessageDialog(null, paralelepipedo.toString());
				break;
			case 3:
				double r = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide el radio del cilindro? "));
				double h = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide la altura del cilindro? "));
				Cilindro cilindro = new Cilindro(r,h);
				lista.add(cilindro);
				JOptionPane.showMessageDialog(null, cilindro.toString());
				break;
			case 4:
				double radio = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide el radio de la esfera? "));
				Esfera esfera = new Esfera(radio);
				lista.add(esfera);
				JOptionPane.showMessageDialog(null, esfera.toString());
				break;
			case 5:
				JOptionPane.showMessageDialog(null, lista.toString());
				break;
				//podria mejorarse añadiendo excepciones para que no se puedan ingresar ninguna letra y
				//asi no interrumpir el flujo del programa. pendiente a checar en tiempo libre
				
			}
		}

	}

}
