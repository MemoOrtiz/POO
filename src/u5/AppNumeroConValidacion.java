package u5;

import java.util.InputMismatchException;
import java.util.Scanner;

//en esta clase se leeran 2 valores enteros hasta que sean validos
// se manejan excepciones para cuando se ingresen caracteres alfanumericos especiales 
// o punto decimal

import javax.swing.JOptionPane;

public class AppNumeroConValidacion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		do {
			try {
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1? "));
				break;
			} catch (NumberFormatException e) {
				System.out.println("Primer numero incorrecto corregir "); // Al trabajar con Integer.parse int
			}
		} while (true);

		do {
			try {
				System.out.println("Numero 2?");
				num2 = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Segundo numero incorrecto corregir ");// al trabajar con Scanner
			}
		} while (true);
		System.out.println("Numero 1: " + num1 + "\nNumero 2: " + num2);
		sc.close();
	}

}
