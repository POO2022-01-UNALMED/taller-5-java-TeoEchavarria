package gestion;

import java.util.ArrayList; 
import zooAnimales.Animal;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zona = new ArrayList<>();
	
	public Zoologico() {
		this(null, null);
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	//-----G E T T E R S   A N D   S E T T E R S-----
	public String getNombre() {
			return nombre;
	}

	public void setNombre(String nombre) {
			this.nombre = nombre;
	}

	public String getUbicacion() {
			return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
			return zona;
	}

	public void setZona(ArrayList<Zona> zonas) {
			this.zona = zonas;
	}

	public void agregarZonas(Zona nuevaZona) {
		this.zona.add(nuevaZona);
		
	}
	
	public int cantidadTotalAnimales () {
		int total = 0;
		
		for(Zona lista:zona) 
			total += lista.cantidadAnimales();
		
		return total;	
	}
}