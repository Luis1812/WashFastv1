package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Detalle;
import pe.edu.upc.entity.Servicio;
import pe.edu.upc.entity.Prenda;
//import pe.edu.upc.entity.Pedido;
import pe.edu.upc.service.IDetalleService;
import pe.edu.upc.service.IServicioService;
import pe.edu.upc.service.IPrendaService;
//import pe.edu.upc.service.IPedidoService;

@Named
@RequestScoped

public class DetalleController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDetalleService dService;
	private Detalle detalle;
	List<Detalle>listaDetalles;
	
	@Inject
	private IServicioService sService;
	private Servicio servicio;
	List<Servicio> listaServicios;
	
	@Inject
	private IPrendaService pService;	
	private Prenda prenda;
	List<Prenda> listaPrendas;
	
	//@Inject
	//private IPedidoService peService;
	//private Pedido pedido;
	//List<Pedido> listaPedidos;
	
	
	
	@PostConstruct
	public void init() {
		
		detalle = new Detalle();
		servicio = new Servicio();
		prenda= new Prenda();
		//pedido = new Pedido();
		
		listaDetalles = new ArrayList<Detalle>();
		listaServicios= new ArrayList<Servicio>();
		listaPrendas = new ArrayList<Prenda>();
		//listaPedidos = new ArrayList<Pedido>();
		
		this.listDetalle();
		this.listServicio();
		this.listPrenda();
		//this.listLocal();
		
	}
	
	public String nuevoDetalle() {
		this.setDetalle(new Detalle());
		return "detalle.xhtml";
	}
	
	public void insertar () {
		dService.insertar(detalle);
		limpiarDetalle();
		this.listDetalle();
	}
	
	private void listDetalle() {
		listaDetalles = dService.listar();
	}
	
//	private void listPedido() {
//		listaPedidos = peService.listar();
//	}
//	
	private void limpiarDetalle() {
		this.init();
	}
	
	public void eliminar (Detalle detalle) {
		dService.eliminar(detalle.getIdDetalle());
		this.listDetalle();
	}
	
	
	public Detalle getDetalle() {
		return detalle;
	}

	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}

	public List<Detalle> getListaDetalles() {
		return listaDetalles;
	}

	public void setListaDetalles(List<Detalle> listaDetalles) {
		this.listaDetalles = listaDetalles;
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

	public void setListaServicios(List<Servicio> listaServicios) {
		this.listaServicios = listaServicios;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public List<Prenda> getListaPrendas() {
		return listaPrendas;
	}

	public void setListaPrendas(List<Prenda> listaPrendas) {
		this.listaPrendas = listaPrendas;
	}

	private void listServicio() {
		listaServicios= sService.listar();
	}
	
	private void listPrenda() {
		listaPrendas= pService.listar();
	}
	

}
