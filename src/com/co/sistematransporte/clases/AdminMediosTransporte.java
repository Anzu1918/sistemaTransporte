package com.co.sistematransporte.clases;

import java.util.List;

public class AdminMediosTransporte {

	private List<MedioTransporte> listaMt;

	public List<MedioTransporte> getListaMt() {
		return listaMt;
	}

	public void setListaMt(List<MedioTransporte> listaMt) {
		this.listaMt = listaMt;
	}
	
	public boolean agregarMedioDeTransporte(String idMedioTransporte, String nombre, Integer capacidadVehiculos){
		
		return false;
		
	}
	
	public boolean modificarMedioDeTransporte(String nombre, Integer capacidadVehiculos){
		
		return false;
		
	}
	
	public boolean eliminarMedioDeTransporte(String idMedioTransporte){
		
		return false;
		
	}
	
	public List<MedioTransporte> consultarMediosDeTransporte(){
		
		return null;
		
	}
	
}
