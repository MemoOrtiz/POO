package u5;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AppNumerosConValidacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		do {
			try {
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1? "));
				break;
			} catch (NumberFormatException e) {
				System.out.println("Primer número incorrecto, corregir ");
			}
		} while (true);
		do {
			try {
				System.out.println("Numero 2? ");
				num2 = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("segundo numero incorrecto, corregir ");
				sc.nextLine();
			}
		} while (true);
		System.out.println("\nNumero1 " + num1 + "\nNumero2 " + num2);
		sc.close();
	}

}
