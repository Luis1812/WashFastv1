package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Prenda;
import pe.edu.upc.service.IPrendaService;

@Named
@RequestScoped

public class PrendaController implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private IPrendaService pService;
	private Prenda prenda;
	List<Prenda> listaPrendas;

	@PostConstruct
	public void init() {
		this.listaPrendas = new ArrayList<Prenda>();
		this.prenda = new Prenda();
		this.listar();
	}

	public String nuevoPrenda() {
		this.setPrenda(new Prenda());
		return "prenda.xhtml";
	}
	
	public void insertar () {
		pService.insertar(prenda);
		limpiarPrenda();
		this.listar();
	}
	
	private void listar() {
		listaPrendas = pService.listar();
	}
	
	private void limpiarPrenda() {
		this.init();
	}
	
	public void eliminar (Prenda prenda) {
		pService.eliminar(prenda.getIdPrenda());
		this.listar();
	}

	
	
	
	public Prenda getPrenda() {
		return prenda;
	}
	
	private void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	
	public List<Prenda> getListaPrendas() {
		return listaPrendas;
	}
	
	public void setListaPrendas(List<Prenda> listaPrendas) {
		this.listaPrendas = listaPrendas;
	}
	
}
