package com;
import java.util.ArrayList;
import java.util.Iterator;

public class Estudiante extends Persona{
	private ArrayList<Nota> notas = new ArrayList<>();
	//agregar metodo para buscar nota, nombre, etc
	private String catedra;
	private String carrera;
	private String universidad;

	//las coincidencias en busquedas deben devolver un indice
	public float buscarPuntuacion(float valor){
		float output = -1;
			// if(!notas.isEmpty()){
				Iterator<Nota> it = notas.iterator();
				while(it.hasNext()){
					Nota obj = it.next();
					if(obj.getPuntuacion() == valor)
						output = obj.getPuntuacion();
				}
				return output;
			// }else{
			// 	//cambiar por una Excepcion
			// }
	}

	public String buscarNombre(String valor){
		String output = "";
		// if(!notas.isEmpty()){
			Iterator<Nota> it = notas.iterator();
			while(it.hasNext()){
				Nota obj = it.next();
				if(obj.getNombre() == valor)
					output = obj.getNombre();
			}
			return output;
		// }else{
		// 	//cambiar por una Excepcion
		// }
	}

	public int buscarDocumento(int valor){
		int output = -1;
		// if(!notas.isEmpty()){
			Iterator<Nota> it = notas.iterator();
			while(it.hasNext()){
				Nota obj = it.next();
				if(obj.getDocumento() == valor)
					output = obj.getDocumento();
			}
			return output;
		// }else{
		// 	//cambiar por una Excepcion
		// }
	}

	public String getCatedra() {
		return catedra;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}

	public Nota getNotas(int index) {
		return this.notas.get(index);
	}

	public int getSizeNotas() {
		return this.notas.size();
	}

	public void setNotas(Nota n) {
		this.notas.add(n);
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getUniversidad() {
		return universidad;
	}

	
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	
	public Estudiante(){};

	public Estudiante(String nombre, String nacimiento, int documento, String catedra, String carrera, String universidad) {
		super(nombre, nacimiento, documento);
		this.catedra = catedra;
		this.carrera = carrera;
		this.universidad = universidad;
	}
}
