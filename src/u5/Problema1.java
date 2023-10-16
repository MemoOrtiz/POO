package u5;

import java.util.Random;

import javax.swing.JOptionPane;

public class Problema1 {

	public static void main(String[] args) {
		Random ran = new Random();
		int rand = ran.nextInt(100) + 1;
		int cont = 0;
		do {
			try {
				cont++;	
				int ingresado1 = Integer.parseInt(JOptionPane.showInputDialog("Dime el numero que creas que es"));
				
				if (ingresado1 < 0 || ingresado1 > 100) {
					throw new RangoException("Fuera de rango ");
				}
				if (ingresado1 > rand) {
					JOptionPane.showMessageDialog(null, "Número menor");
				}
				if (ingresado1 < rand) {
					JOptionPane.showMessageDialog(null, "Número mayor ");
				}
				if (ingresado1 == rand) {
					JOptionPane.showMessageDialog(null, "Numero encontrado"+"\nNumero de intentos "+cont);
					break;
				}
				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Ingrese un número, no letras ");
			} catch(RangoException e) {
				JOptionPane.showMessageDialog(null, "Rango de numero superado");
			}

		} while (true);

	}

}
