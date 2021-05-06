package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Detalle;
import pe.edu.upc.service.IDetalleService;

@Named
@RequestScoped

public class DetalleController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDetalleService dService;
	private Detalle detalle;
	List<Detalle>listaDetalles;
	
	@PostConstruct
	public void init() {
		this.listaDetalles = new ArrayList<Detalle>();
		this.detalle=new Detalle();
		this.listar();
	}
	
	public String nuevoDetalle() {
		this.setDetalle(new Detalle());
		return "detalle.xhtml";
	}
	
	public void insertar () {
		dService.insertar(detalle);
		limpiarDetalle();
		this.listar();
	}
	
	private void listar() {
		listaDetalles=dService.listar();
	}
	
	private void limpiarDetalle() {
		this.init();
	}
	
	public void eliminar (Detalle detalle) {
		dService.eliminar(detalle.getIdDetalle());
		this.listar();
	}
	
	public Detalle getDetalle() {
		return detalle;
	}
	
	private void setDetalle(Detalle detalle){
		this.detalle=detalle;
	}
	
	public List<Detalle>getListaDetalle(){
		return listaDetalles;
	}
	
	public void setListaDetalles(List<Detalle>listaDetalle){
		this.listaDetalles=listaDetalle;
	}

}
