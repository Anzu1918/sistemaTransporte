package com.co.sistematransporte.controladores;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import com.co.sistematransporte.clases.AdminEstacion;
import com.co.sistematransporte.clases.AdminMediosTransporte;
import com.co.sistematransporte.clases.FranjaDeHorario;
import com.co.sistematransporte.clases.Ruta;
import com.co.sistematransporte.clases.Tarifa;
import java.util.ArrayList;

public class STControl {

	private List<AdminMediosTransporte> listaMediosDeTransporte;
	private List<Ruta> listaRutas;
	private boolean bl;
	private List<AdminEstacion> listAdm;
	
	public List<AdminMediosTransporte> getListaMediosDeTransporte() {
		return listaMediosDeTransporte;
	}

	public void setListaMediosDeTransporte(
			List<AdminMediosTransporte> listaMediosDeTransporte) {
		this.listaMediosDeTransporte = listaMediosDeTransporte;
	}

	public List<Ruta> getListaRutas() {
		return listaRutas;
	}

	public void setListaRutas(List<Ruta> listaRutas) {
		this.listaRutas = listaRutas;
	}

	public boolean isBl() {
		return bl;
	}

	public void setBl(boolean bl) {
		this.bl = bl;
	}

	public List<AdminEstacion> getListAdm() {
		return listAdm;
	}

	public void setListAdm(List<AdminEstacion> listAdm) {
		this.listAdm = listAdm;
	}

	public static void main(String[] args){
		
		try{
		
			Properties properties = new Properties();
			properties.load(new FileInputStream("AppConfig" + File.separator + "inicio.properties"));
		
		} catch (Exception e){
			
			System.out.println(e.getMessage());
			
		}
		
	}
        
        
        /*-------------------------------------------------------------
        --------------------NO SE SI ESTE BN REVISAR----------------------------------------
        --------------------------TARIFAS---------------------------------*/
        public boolean agregarTarifa(String idTarifa,String nombre,Integer cantidad){
            try {
                FranjaDeHorario franja= new FranjaDeHorario();
                boolean agregarTarifa = franja.agregarTarifa(idTarifa, cantidad, nombre);
                return agregarTarifa;
            } catch (Exception e) {
                throw e;
            }   
        }
        public List<Tarifa> consultarTarifas(){
            try {
                
                FranjaDeHorario franja= new FranjaDeHorario();
                
                List<Tarifa> lst= new ArrayList<>();
                
                        lst=franja.consultarTarifas();
                return lst;
            } catch (Exception e) {
                throw e;
            } 
        }
	
}