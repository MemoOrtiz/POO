package u5;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int indice1 = 0;
		int indice2 = 0;
		int numeroAleatorio;
		int[] arr = arr1;

		try {
			Random random = new Random();
			while (true) {
				numeroAleatorio = random.nextInt(100) + 1;

				try {
					if (numeroAleatorio % 10 == 4) {
						arr[indice1] = numeroAleatorio;
						indice1++;

							if (indice1 == 5) {
								throw new Exception("Arreglo de números terminados en 4 completado");
							}
					} else if (numeroAleatorio % 10 == 8) {
						if (indice2 == 5) {
							throw new Exception("Arreglo de números terminados en 8 completado");
						}
						arr2[indice2] = numeroAleatorio;
						indice2++;
					}
				} catch (Exception e) {
					if (e.getMessage().equals("Arreglo de números terminados en 4 completado")) {
						arr = arr2;
						throw new Exception("Arreglo de números terminados en 8 completado");
					}
				}
			}
		} catch (Exception e) {
			mostrarNumerosTerminadosEn4(arr1);
			mostrarNumerosTerminadosEn8(arr2);
		}
	}

	private static void mostrarNumerosTerminadosEn4(int[] numeros) {
		System.out.println("Números terminados en 4:");
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}

	private static void mostrarNumerosTerminadosEn8(int[] numeros) {
		System.out.println("Números terminados en 8:");
		for (int numero : numeros) {
			System.out.println(numero);
		}

	}

}
