package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Local;
import pe.edu.upc.service.ILocalService;

@Named
@RequestScoped

public class LocalController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ILocalService lService;
	private Local local;
	List<Local> listaLocales; 
	
	@PostConstruct
	public void init() {
		this.listaLocales = new ArrayList<Local>();
		this.local = new Local();
		this.listar();
	}
	
	public String nuevoLocal() {
		this.setLocal(new Local());
		return "local.xhtml";
	}
	
	public void insertar() {
		lService.insertar(local);
		limpiarLocal();
	}
	
	public void listar() {
		listaLocales = lService.listar();
	}
	
	public void limpiarLocal() {
		this.init();
	}
	
	public void eliminar(Local local) {
		lService.eliminar(local.getIdLocal());
		this.listar();
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public List<Local> getListaLocales() {
		return listaLocales;
	}

	public void setListaLocales(List<Local> listaLocales) {
		this.listaLocales = listaLocales;
	}

}
