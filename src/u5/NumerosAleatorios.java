package u5;

import java.util.Random;

public class NumerosAleatorios {
	public static void main(String[] args) {
		int[] numerosTerminadosEn4 = new int[5];
        int[] numerosTerminadosEn8 = new int[5];
        int[] arr = numerosTerminadosEn4;
        int index = 0;

        try {
            while (true) {
                Random random = new Random();
                int numeroAleatorio = random.nextInt(100) + 1;

                if (numeroAleatorio % 10 == 4) {
                    arr[index] = numeroAleatorio;
                    index++;
                    if (index == 5 && arr == numerosTerminadosEn4) {
                        arr = numerosTerminadosEn8;
                        index = 0;
                    } else if (index == 5 && arr == numerosTerminadosEn8) {
                        throw new Exception();
                    }
                } else if (numeroAleatorio % 10 == 8 && arr == numerosTerminadosEn8) {
                    arr[index] = numeroAleatorio;
                    index++;
                    if (index == 5) {
                        throw new Exception();
                    }
                }
            }
        } catch (Exception e) {
            mostrarArreglo(numerosTerminadosEn4);
            mostrarArreglo(numerosTerminadosEn8);
        }
    }

    public static void mostrarArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

