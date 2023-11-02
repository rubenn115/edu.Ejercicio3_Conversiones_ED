package edu.Ejercicio3_Conversiones_ED;

import java.util.Scanner;

/***
 * Clase principal de la aplicación
 * rbr - 021123
 */
public class principal {
/***
 * Método principal de la aplicación
 * rbr - 021123
 * @param args
 */
	public static void main(String[] args) {
		char caracter;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un carácter: ");
		caracter = sc.next().charAt(0);
		
		Character carac = Character.valueOf(caracter);
		System.out.println(carac.getClass());

	}

}
