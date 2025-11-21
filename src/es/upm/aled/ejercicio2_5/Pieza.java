package es.upm.aled.ejercicio2_5;

import java.util.List;

public class Pieza {
	private String nombre;
	private boolean esDefectuosa;
	private List<Pieza> componentes; // Piezas necesarias para montar esta

	public boolean isDefectuosa() {
		return this.esDefectuosa;
	}

	public List<Pieza> getComponentes() {
		return this.componentes;
	}

	public static boolean contieneDefectos(Pieza piezaPrincipal) {
		if (piezaPrincipal == null) {
			return true;
		}
		if (piezaPrincipal.isDefectuosa()) {
			return true;
		}
		if (piezaPrincipal.getComponentes() != null) {
			for (Pieza p : piezaPrincipal.getComponentes()) {
				if (contieneDefectos(p)) {
					return true;
				}
			}
		}
		return false;
	}

}
