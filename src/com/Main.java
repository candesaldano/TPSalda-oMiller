package com;

public class Main {
	public static void main(String[] args) {
			Profesor austry = new Profesor("Austry Castillo", "02/08/1996", 1232323, "Java", "Docente", "Programacion", "Digitalers");
			Nota parcial1 = new Nota(100, "Candela Saldanio", 38000123);
			Estudiante candela = new Estudiante("Candela Saldanio", "02/08/1995", 38000123, "POO", "Programacion", "UNLP");
			candela.setNotas(parcial1);
			System.out.println(candela.getCarrera());
			System.out.println(austry.getNombre());
	}
}