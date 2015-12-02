package com.co.sistematransporte.clases;

import java.util.List;

public class Estacion {

	private String idEstacion;
	private String nombreEstacion;
	private String direccion;
	private List<Paradero> listaP;
	
	public String getIdEstacion() {
		return idEstacion;
	}
	public void setIdEstacion(String idEstacion) {
		this.idEstacion = idEstacion;
	}
	
	public String getNombreEstacion() {
		return nombreEstacion;
	}
	
	public void setNombreEstacion(String nombreEstacion) {
		this.nombreEstacion = nombreEstacion;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public List<Paradero> getListaP() {
		return listaP;
	}
	
	public void setListaP(List<Paradero> listaP) {
		this.listaP = listaP;
	}
	
	public boolean agregarParadero(String idParadero, String nombreParadero, String tipo){
		
		return false;
		
	}
	
	public boolean modificarParadero(String nombreParadero, String tipo){
		
		return false;
		
	}
	
	public boolean eliminarParadero(String idParadero){
		
		return false;
	}
	
	public List<Paradero> consultarParaderos(){
		
		return null;
		
	}
	
	public boolean asociarParaderoAEstacion(String idEstacion, String idParadero){
		
		return false;
		
	}
	
	public List<Paradero> consultarParadasDeUnaRuta(String idRuta){
		
		return null;
		
	}
}
