package es.upm.aled.ejercicio2_2;

import java.util.List;

public class Empleado {
	private String nombre;
	private double salario;
	private List<Empleado> subordinados; // Lista de empleados a su cargo

	public Empleado (String nombre, double salario) { 
	}

	public double getSalario() {
		return this.salario;
	}

	public List<Empleado> getSubordinados() {
		return this.subordinados;
	}
	
	public static double presupuestoEquipo(Empleado jefe) {
		if (jefe == null) {
			return 0;
		}
		double salario = 0;
		// Caso base, solo se calcula el del jefe
		salario = salario + jefe.getSalario();
		//Recursividad
		if (jefe.getSubordinados() != null)
			for (Empleado subempleado : jefe.getSubordinados()) {
				salario = salario + presupuestoEquipo(subempleado);
			}
		return salario;
	}
}

