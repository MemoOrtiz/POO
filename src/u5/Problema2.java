package u5;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Problema2 {
	public static void main (String[]Args) {
		int tam =Integer.parseInt(JOptionPane.showInputDialog("Tamaño del primer arreglo \"arr1\""));
		char[]arr1=new char[tam];
		tam=Integer.parseInt(JOptionPane.showInputDialog("Tamaño del segundo arreglo \"arr1\""));
		char[]arr2=new char[tam];
		char[]arr=arr1;
		
		char caracter='A';
		for(int i=0;i<arr.length;i++) {
			arr[i]=caracter++;
		}
		arr=arr2;
		caracter='a';
		for(int i=0;i<arr.length;i++) {
			arr[i]=caracter++;
		}
		System.out.println("Contenido arr1"+Arrays.toString(arr1));
		System.out.println("Contenido arr2"+Arrays.toString(arr2));
	}

}
