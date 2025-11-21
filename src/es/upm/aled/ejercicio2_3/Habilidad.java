package es.upm.aled.ejercicio2_3;

import java.util.List;

public class Habilidad {
	private String id;
	private int costePuntos; // Coste para desbloquear esta habilidad
	private List<Habilidad> desbloqueables; // Habilidades que dependen de esta

	public int getCoste() {
		return this.costePuntos;
	}

	public List<Habilidad> getDesbloqueables() {
		return this.desbloqueables;
	}

	public static int costeRamaCompleta(Habilidad raiz) {
		if (raiz == null) {
			return 0;
		}
		int coste = 0;
		// Caso base
		coste = raiz.getCoste();
		// Recursividad
		if (raiz.getDesbloqueables() != null) {
			for (Habilidad hab : raiz.getDesbloqueables()) {
				coste = coste + costeRamaCompleta(hab);
			}
		}
		return coste;
	}
}
