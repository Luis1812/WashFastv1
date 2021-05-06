package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Administrador;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IAdministradorService;

@Named
@RequestScoped

public class AdministradorController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private IAdministradorService aService;	
	
	private Usuario usuario;
	private Administrador administrador;
	
	List<Usuario> listaUsuarios;
	List<Administrador> listaAdministradores;
	
	@PostConstruct
	public void init() {
		usuario = new Usuario();
		administrador = new Administrador();
		
		listaUsuarios = new ArrayList<Usuario>();
		listaAdministradores = new ArrayList<Administrador>();
		
		this.listAdministrador();
		this.listUsuario();
		
	}
	
	public String nuevoAdministrador() {
		this.setAdministrador(new Administrador());
		return "administrador.xhtml";
	}
	
	public void insertar() {
		aService.insertar(administrador);
		limpiarAdministrador();
		this.listAdministrador();
	}
	
	//------
	public void listAdministrador() {
		listaAdministradores = aService.listar();
	}
	
	public void listUsuario() {
		listaUsuarios = uService.listar();
	}
	
	
	//------
	
	public void limpiarAdministrador() {
		this.init();
	}
	
	public void eliminar(Administrador administrador) {
		aService.eliminar(administrador.getIdAdmin());
		this.listAdministrador();
	}
	//----

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Administrador> getListaAdministradores() {
		return listaAdministradores;
	}

	public void setListaAdministradores(List<Administrador> listaAdministradores) {
		this.listaAdministradores = listaAdministradores;
	}

	
}
