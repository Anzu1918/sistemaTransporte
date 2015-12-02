package com.co.sistematransporte.clases;

import java.util.List;

public class AdminEstacion {

	private List<Estacion> listaE;

	public List<Estacion> getListaE() {
		return listaE;
	}

	public void setListaE(List<Estacion> listaE) {
		this.listaE = listaE;
	}
	
	public boolean agregarEstacion(String idEstacion, String nombreEstacion, String direccion){
		
		return false;
				
	}
	
	public boolean modificarEstacion(String nombre, String direccion){
		
		return false;
		
	}
	
	public boolean eliminarEstacion(String idEstacion){
		
		return false;
		
	}
	
	public List<Estacion> consultarEstaciones(){
		
		return null;
		
	}
	
	public void generarReporteDeEstaciones(){
		
		
	}
	
}
