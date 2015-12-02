package com.co.sistematransporte.clases;

import java.util.List;

public class Ruta {

	private String idRuta;
	private String nombre;
	private Integer cantidadParadas;
	
	public String getIdRuta() {
		return idRuta;
	}
	
	public void setIdRuta(String idRuta) {
		this.idRuta = idRuta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getCantidadParadas() {
		return cantidadParadas;
	}
	
	public void setCantidadParadas(Integer cantidadParadas) {
		this.cantidadParadas = cantidadParadas;
	}
	
	public List<Ruta> consultarRutasQueParanEnUnaEstacion(String idEstacion){
		
		return null;
		
	}
	
}
