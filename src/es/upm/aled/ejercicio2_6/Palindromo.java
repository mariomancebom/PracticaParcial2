package es.upm.aled.ejercicio2_6;

public class Palindromo {

	// Suponemos que no hay espacios en blanco y todos los caracteres en minusculas
	public static boolean esPalindromo(String texto) {
		if (texto == null || texto.length() <= 1) {
			return true;
		}
		char primero = texto.charAt(0);
		char ultimo = texto.charAt(texto.length() - 1);
		// Si coinciden el primer y el ultimo caracter
		if (primero == ultimo) {
			String subcadena = texto.substring(1, texto.length() - 1);// Sentencia que coge el texto entre esos dos
																		// indices
			return esPalindromo(subcadena);
		}
		return false;
	}
}
