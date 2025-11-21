package es.upm.aled.ejercicio2_7;

public class Nodo {
	int valor;
	Nodo izq, der;

	public static boolean esBST(Nodo nodo) {
		return esBSTAux(nodo, Integer.MIN_VALUE, Integer.MAX_VALUE);// Mantiene los valores dentro de un rango
	}

	private static boolean esBSTAux(Nodo nodo, int min, int max) {
		if (nodo == null) {
			return true;
		}
		if (nodo.valor <= min || nodo.valor >= max) {
			return false;
		}
		boolean izqValido = esBSTAux(nodo.izq, min, nodo.valor);
		boolean derValido = esBSTAux(nodo.der, nodo.valor, max);
		return izqValido && derValido;
	}
}