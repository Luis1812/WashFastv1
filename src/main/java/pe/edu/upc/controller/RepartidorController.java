package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Local;
import pe.edu.upc.entity.Repartidor;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.ILocalService;
import pe.edu.upc.service.IRepartidorService;

@Named
@RequestScoped

public class RepartidorController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private ILocalService lService;
	
	@Inject
	private IRepartidorService rService;	
	
	private Usuario usuario;
	private Local local;
	private Repartidor repartidor;
	
	List<Usuario> listaUsuarios;
	List<Local> listaLocales;
	List<Repartidor> listaRepartidores;
	
	@PostConstruct
	public void init() {
		usuario = new Usuario();
		local = new Local();
		repartidor = new Repartidor();
		
		listaUsuarios = new ArrayList<Usuario>();
		listaLocales = new ArrayList<Local>();
		listaRepartidores = new ArrayList<Repartidor>();
		
		this.listRepartidor();
		this.listLocal();
		this.listUsuario();
		
	}
	
	public String nuevoRepartidor() {
		this.setRepartidor(new Repartidor());
		return "repartidor.xhtml";
	}
	
	public void insertar() {
		rService.insertar(repartidor);
		limpiarRepartidor();
		this.listRepartidor();
	}
	
	//------
	public void listRepartidor() {
		listaRepartidores = rService.listar();
	}
	
	public void listLocal() {
		listaLocales = lService.listar();
	}
	
	public void listUsuario() {
		listaUsuarios = uService.listar();
	}
	
	
	//------
	
	public void limpiarRepartidor() {
		this.init();
	}
	
	public void eliminar(Repartidor repartidor) {
		rService.eliminar(repartidor.getIdRepartidor());
		this.listRepartidor();
	}
	//----

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Repartidor getRepartidor() {
		return repartidor;
	}

	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Local> getListaLocales() {
		return listaLocales;
	}

	public void setListaLocal(List<Local> listaLocales) {
		this.listaLocales = listaLocales;
	}

	public List<Repartidor> getListaRepartidores() {
		return listaRepartidores;
	}

	public void setListaClientes(List<Repartidor> listaRepartidores) {
		this.listaRepartidores = listaRepartidores;
	}

}
