package gestion;

import java.util.ArrayList; 
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico Zoo;
	private ArrayList <Animal> animales = new ArrayList<>();
	
	public Zona() {
		this (null, null);
		
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		Zoo = zoo;
	}
	
	//-----G E T T E R S   A N D   S E T T E R S-----
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return Zoo;
	}

	public void setZoo(Zoologico zoo) {
		Zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}

	public void agregarAnimales(Animal nuevoAnimal) {
		animales.add(nuevoAnimal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}