package es.upm.aled.ejercicio2_4;

import java.util.List;

public class ElementoHTML {
	private String tag; // Ejemplo: "div", "p", "img"
	private List<ElementoHTML> hijos;

	public String getTag() {
		return this.tag;
	}

	public List<ElementoHTML> getHijos() {
		return this.hijos;
	}
	
	public static int contarEtiquetas(ElementoHTML elemento, String tagBuscado) {
		int contador = 0;
		if (elemento == null || tagBuscado == null) {
			return 0;
		}
		// Caso base
		if (elemento.getTag().equals(tagBuscado)) {
			contador = 1;
		}

		// Recursividad
		if (elemento.getHijos() != null) {
			for (ElementoHTML elem : elemento.getHijos()) {
				contador = contador + contarEtiquetas(elem, tagBuscado);
			}
		}
		return contador;
	}
}
