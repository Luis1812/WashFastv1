package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Servicio;
import pe.edu.upc.service.IServicioService;

@Named
@RequestScoped

public class ServicioController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IServicioService sService;
	private Servicio servicio;
	List<Servicio> listaServicios;
	
	@PostConstruct
	public void init() {
		this.listaServicios = new ArrayList<Servicio>();
		this.servicio = new Servicio();
		this.listar();
	}
	
	public String nuevoServicio() {
		this.setServicio(new Servicio());
		return "servicio.xhtml";
	}
	
	public void insertar() {
		try {
			sService.insertar(servicio);
			limpiarServicio();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listar() {
		try {
			listaServicios = sService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarServicio() {
		this.init();
	}
	
	public void eliminar() {
		try {
			sService.eliminar(servicio.getIdServicio());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public List<Servicio> getListaServicios() {
		return listaServicios;
	}

	public void setListaUsuarios(List<Servicio> listaServicios) {
		this.listaServicios = listaServicios;
	}
	
	
}
