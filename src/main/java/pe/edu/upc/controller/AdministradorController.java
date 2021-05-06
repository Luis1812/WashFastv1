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
	private Administrador admin;
	
	List<Usuario> listaUsuarios;
	List<Administrador> listaAdmins;
	
	@PostConstruct
	public void init() {
		usuario = new Usuario();
		admin = new Administrador();
		
		listaUsuarios = new ArrayList<Usuario>();
		listaAdmins = new ArrayList<Administrador>();
		
		this.listCliente();
		this.listUsuario();
		
	}
	
	public String nuevoAdministrador() {
		this.setAdministrador(new Administrador());
		return "administrador.xhtml";
	}
	
	public void insertar() {
		aService.insertar(admin);
		limpiarCliente();
		this.listCliente();
	}
	
	//------
	public void listCliente() {
		listaAdmins = aService.listar();
	}
	
	public void listUsuario() {
		listaUsuarios = uService.listar();
	}
	
	public void limpiarCliente() {
		this.init();
	}
	
	public void eliminar(Administrador admin) {
		aService.eliminar(admin.getIdAdmin());
		this.listCliente();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Administrador getAdministrador() {
		return admin;
	}

	public void setAdministrador(Administrador administrador) {
		this.admin = administrador;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Administrador> getListaAdministrador() {
		return listaAdmins;
	}

	public void setListaAdministradores(List<Administrador> listaAdmins) {
		this.listaAdmins = listaAdmins;
	}

}
