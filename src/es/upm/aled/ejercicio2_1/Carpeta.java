package es.upm.aled.ejercicio2_1;

import java.util.ArrayList;
import java.util.List;

//Representa una carpeta que puede contener archivos y otras subcarpetas
public class Carpeta {
	private String nombre;
	private List<Archivo> archivos; // Archivos directos en esta carpeta
	private List<Carpeta> subcarpetas; // Carpetas dentro de esta carpeta

	public Carpeta(String nombre) {
	}

	public List<Archivo> getArchivos() {
		return this.archivos;
	}

	public List<Carpeta> getSubcarpetas() {
		return this.subcarpetas;
	}

	public static double calcularPesoTotal(Carpeta inicio) {
		double peso = 0;
		List<Archivo> archivos = new ArrayList<>();
		List<Carpeta> carpetas = new ArrayList<>();
		// Caso base
		// Seria que la carpeta no tuviera mas subcarpetas
		archivos = inicio.getArchivos();
		for (Archivo archivo : archivos) {
			peso = peso + archivo.getPesoMB();
		}

		// Recursividad: conseguir todas las subcarpetas dentro de otra
		carpetas = inicio.getSubcarpetas();
		for (Carpeta carpet : carpetas) {
			peso = peso + calcularPesoTotal(carpet);
		}
		return peso;
	}
}