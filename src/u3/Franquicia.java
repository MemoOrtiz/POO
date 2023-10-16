package u3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Franquicia {

	public static void main(String[] args) throws java.io.IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dime el nombre de la gasolinera: ");
		String nombre = (br.readLine());
		System.out.println("Dame los litros vendidos: ");
		double litrosVendidos = Double.parseDouble(br.readLine());
		System.out.println("Dame el precio por litro: ");
		double precioPorLitro = Double.parseDouble(br.readLine());
		Gasolinera unaGas = new Gasolinera(nombre, litrosVendidos, precioPorLitro);
		unaGas.calcularGanancias();

		System.out.println("Datos del comercio:\n " + unaGas.toString());
		System.out.printf("Datos del comercio:\n ", unaGas.toString());
	}

}
