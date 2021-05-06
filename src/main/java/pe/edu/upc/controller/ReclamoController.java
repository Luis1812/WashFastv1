package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cliente;
import pe.edu.upc.entity.Local;
import pe.edu.upc.entity.Reclamo;

import pe.edu.upc.service.IClienteService;
import pe.edu.upc.service.ILocalService;
import pe.edu.upc.service.IReclamoService;

@Named
@RequestScoped

public class ReclamoController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IClienteService cService;
	private Cliente cliente;
	List<Cliente> listaClientes;
	
	@Inject
	private ILocalService lService;
	private Local local;
	List<Local> listaLocales;
	
	@Inject
	private IReclamoService rService;	
	private Reclamo reclamo;
	List<Reclamo> listaReclamos;
	
	@PostConstruct
	public void init() {
		cliente = new Cliente();
		local= new Local();
		reclamo = new Reclamo();
		
		listaClientes = new ArrayList<Cliente>();
		listaLocales = new ArrayList<Local>();
		listaReclamos = new ArrayList<Reclamo>();
		
		this.listReclamo();
		this.listCliente();
		this.listLocal();
		
	}
	
	public String nuevoReclamo() {
		this.setReclamo(new Reclamo());
		return "reclamo.xhtml";
	}
	
	public void insertar() {
		rService.insertar(reclamo);
		limpiarReclamo();
		this.listReclamo();
	}
	
	//------
	public void listReclamo() {
		listaReclamos = rService.listar();
	}
	
	public void listCliente() {
		listaClientes = cService.listar();
	}
	
	public void listLocal() {
		listaLocales = lService.listar();
	}
	
	
	//------
	
	public void limpiarReclamo() {
		this.init();
	}
	
	public void eliminar(Reclamo reclamo) {
		rService.eliminar(reclamo.getIdReclamo());
		this.listReclamo();
	}
	//----

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Reclamo getReclamo() {
		return reclamo;
	}

	public void setReclamo(Reclamo reclamo) {
		this.reclamo = reclamo;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Local> getListaLocales() {
		return listaLocales;
	}

	public void setListaLocales(List<Local> listaLocales) {
		this.listaLocales = listaLocales;
	}

	public List<Reclamo> getListaReclamos() {
		return listaReclamos;
	}

	public void setListaReclamos(List<Reclamo> listaReclamos) {
		this.listaReclamos = listaReclamos;
	}

	
}
