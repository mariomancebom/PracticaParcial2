package es.upm.aled.ejercicio2_9;

public class Cambio {

	public static int contarFormasCambio(int objetivo, int[] monedas) {
		// Definimos los valores de las monedas según el índice del array
		// 0->1, 1->2, 2->5
		// Así podemos reutilizar este array con otros tipos de monedas
		int[] valores = { 1, 2, 5 };
		// Llamada al auxiliar empezando por la moneda más grande (índice 2)
		return contarAux(objetivo, monedas, valores, 2);
	}

	// Asi es mas facil hacerlo
	private static int contarAux(int objetivo, int[] cantidades, int[] valores, int indiceMoneda) {
		// Caso base
		if (objetivo == 0)
			return 1;
		if (objetivo < 0)
			return 0;
		if (indiceMoneda < 0)
			return 0;
		int valorActual = valores[indiceMoneda];
		int cantidadDisponible = cantidades[indiceMoneda];
		int formas = 0;

		for (int i = 0; i <= cantidadDisponible; i++) {
			int sumaActual = i * valorActual;
			if (sumaActual > objetivo)
				break;
			formas = formas + contarAux(objetivo - sumaActual, cantidades, valores, indiceMoneda - 1);
		}

		return formas;
	}

}

