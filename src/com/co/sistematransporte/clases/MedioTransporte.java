package com.co.sistematransporte.clases;

import java.util.Date;
import java.util.List;

public class MedioTransporte {

	private String idMedioTransporte;
	private String nombre;
	private Integer capacidadVehiculos;
	private List<Ruta> listaRu;
	private List<Vehiculo> listaVeh;
	private List<FranjaDeHorario> listaFj;
	
	public String getIdMedioTransporte() {
		return idMedioTransporte;
	}

	public void setIdMedioTransporte(String idMedioTransporte) {
		this.idMedioTransporte = idMedioTransporte;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCapacidadVehiculos() {
		return capacidadVehiculos;
	}

	public void setCapacidadVehiculos(Integer capacidadVehiculos) {
		this.capacidadVehiculos = capacidadVehiculos;
	}

	public List<Ruta> getListaRu() {
		return listaRu;
	}

	public void setListaRu(List<Ruta> listaRu) {
		this.listaRu = listaRu;
	}

	public List<Vehiculo> getListaVeh() {
		return listaVeh;
	}

	public void setListaVeh(List<Vehiculo> listaVeh) {
		this.listaVeh = listaVeh;
	}

	public List<FranjaDeHorario> getListaFj() {
		return listaFj;
	}

	public void setListaFj(List<FranjaDeHorario> listaFj) {
		this.listaFj = listaFj;
	}

	public boolean agregarVehiculo(String idVehiculo, String tipoVehiculo, String marca, Integer capacidadPasajeros, String placa, String modelo){
		
		return false;
		
	}
	
	public boolean modificarVehiculo(String tipoVehiculo, String marca, Integer capacidadPasajeros, String placa, String modelo){
		
		return false;
		
	}
	
	public boolean eliminarVehiculo(String idVehiculo){
		
		return false;
		
	}
	
	public List<Vehiculo> consultarVehiculos(){
		
		return null;
		
	}
	
	public void generarReporteDeVehiculos(){
		
		
	}

	public boolean asociarVehiculoAMedioDeTransporte(String idMedioTransporte, String idVehiculo){
		
		return false;
		
	}
	
	public boolean agregarFranjaDeHorario(String idFranjaDeHorario, Date horaInicial, Date horaFinal){
		
		return false;
		
	}
	
	public boolean modificarFranjaDeHorario(Date horaInicial, Date horaFinal){
		
		return false;
		
	}
	
	public boolean eliminarFranjaDeHorario(String idFranjaDeHorario){
		
		return false;
		
	}
	
	public List<FranjaDeHorario> consultarFranjasDeHorario(){
		
		return null;
		
	}
	
	public boolean asociarFranjaDeHorarioAMedioDeTransporte(String idFranjaDeHorario, String idMedioTransporte){
		
		return false;
		
	}
	
	public boolean agregarRuta(String idRuta, String nombre, Integer cantidadParadas){
		
		return false;
		
	}
	
	public boolean modificarRuta(String nombre, Integer cantidadParadas){
		
		return false;
		
	}
	
	public boolean eliminarRuta(String idRuta){
		
		return false;
		
	}
	
	public List<Ruta> consultarRutas(){
		
		return null;
		
	}
	
	public void generarReporteDeRutas(){
		
		
	}
	
}