package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.MetodoPago;
import pe.edu.upc.service.IMetodoPagoService;

@Named
@RequestScoped

public class MetodoPagoController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IMetodoPagoService mService;
	private MetodoPago metodopago;
	List<MetodoPago> listaMetodoPagos;
	
	@PostConstruct
	public void init() {
		this.listaMetodoPagos= new ArrayList<MetodoPago>();
		this.metodopago= new MetodoPago();
		this.listar();
	}
	
	public String nuevoMetodoPago() {
		this.setMetodopago(new MetodoPago());
		return "metodopago.xhtml";
	}
	
	public void insertar() {
		mService.insertar(metodopago);
		limpiarMetodoPago();
		this.listar();
	}

	public void listar() {
		listaMetodoPagos = mService.listar();
		
	}
	
	public void limpiarMetodoPago() {
		this.init();
	}
	
	public void eliminar(MetodoPago metodopago) {
		mService.eliminar(metodopago.getIdMetodoPago());
		this.listar();
	}
	
	

	public MetodoPago getMetodopago() {
		return metodopago;
	}

	public void setMetodopago(MetodoPago metodopago) {
		this.metodopago = metodopago;
	}

	public List<MetodoPago> getListaMetodoPagos() {
		return listaMetodoPagos;
	}

	public void setListaMetodoPagos(List<MetodoPago> listaMetodoPagos) {
		this.listaMetodoPagos = listaMetodoPagos;
	}


}
