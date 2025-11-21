package es.upm.aled.ejercicio2_8;

public class NodoLista {
	int dato;
	NodoLista siguiente;

	public static NodoLista invertirRecursivo(NodoLista actual) {
		// Caso base: lista vacía o único elemento
		if (actual == null || actual.siguiente == null) {
			return actual;
		}
		// Paso recursivo:
		// TODO: Complete este código
		NodoLista siguienteNodo=actual.siguiente;
		NodoLista nuevaCabeza=invertirRecursivo(siguienteNodo);
		siguienteNodo.siguiente=actual;
		actual.siguiente=null;
		return nuevaCabeza;
	}
}
