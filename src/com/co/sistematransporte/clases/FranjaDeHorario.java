package com.co.sistematransporte.clases;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class FranjaDeHorario {

	private String idFranjaDeHorario;
	private Date horaInicial;
	private Date horaFinal;
	private List<Tarifa> listaTF;
	
	public String getIdFranjaDeHorario() {
		return idFranjaDeHorario;
	}
	
	public void setIdFranjaDeHorario(String idFranjaDeHorario) {
		this.idFranjaDeHorario = idFranjaDeHorario;
	}
	
	public Date getHoraInicial() {
		return horaInicial;
	}
	
	public void setHoraInicial(Date horaInicial) {
		this.horaInicial = horaInicial;
	}
	
	public Date getHoraFinal() {
		return horaFinal;
	}
	
	public void setHoraFinal(Date horaFinal) {
		this.horaFinal = horaFinal;
	}
	
	public List<Tarifa> getListaTF() {
		return listaTF;
	}
	
	public void setListaTF(List<Tarifa> listaTF) {
		this.listaTF = listaTF;
	}
	
	public boolean agregarTarifa(String idTarifa, Integer valorTarifa, String tipoTarifa){
            
            try {
                List<Tarifa> listTarifasTemp = new ArrayList<>();
                Tarifa tar= new Tarifa();
                tar.setIdTarifa(idTarifa);
                tar.setValorTarifa(valorTarifa);
                tar.setTipoTarifa(tipoTarifa);
                listTarifasTemp.add(tar);
                if(this.getListaTF()!=null){
                    listTarifasTemp=this.getListaTF();
                } 
                System.out.println(tar.getIdTarifa());
                this.setListaTF(listTarifasTemp);
                return true;
            } catch (Exception e) {
                throw e;
            }
	}
	
	public boolean modificarTarifa(Integer valorTarifa, String tipoTarifa){
		
		return false;
		
	}
	
	public boolean eliminarTarifa(String idTarifa){
		
		return false;
		
	}
	
	public List<Tarifa> consultarTarifas(){
		List<Tarifa> a= new ArrayList<>();
                a=this.getListaTF();
                
		return a;
		
	}
	
	public Integer obtenerTarifaEconomicaDeUnTransporteSegunFranjaHoraria(Date horaInicial, Date horaFinal){
		
		return 0;
		
	}
	
	public void generarReporteDeTarifas(){
		
		
	}
	
	public boolean asociarTarifaAFranjaDeHorario(String idTarifa, String idFranjaDeHorario){
		
		return false;
		
	}
	
}
