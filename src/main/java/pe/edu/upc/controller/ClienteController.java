package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.MetodoPago;
import pe.edu.upc.entity.Cliente;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IMetodoPagoService;
import pe.edu.upc.service.IClienteService;

@Named
@RequestScoped

public class ClienteController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private IMetodoPagoService mpService;
	
	@Inject
	private IClienteService cService;	
	
	private Usuario usuario;
	private MetodoPago metodopago;
	private Cliente cliente;
	
	List<Usuario> listaUsuarios;
	List<MetodoPago> listaMetodoPagos;
	List<Cliente> listaClientes;
	
	@PostConstruct
	public void init() {
		usuario = new Usuario();
		metodopago= new MetodoPago();
		cliente = new Cliente();
		
		listaUsuarios = new ArrayList<Usuario>();
		listaMetodoPagos = new ArrayList<MetodoPago>();
		listaClientes = new ArrayList<Cliente>();
		
		this.listCliente();
		this.listMetodoPago();
		this.listUsuario();
		
	}
	
	public String nuevoCliente() {
		this.setCliente(new Cliente());
		return "cliente.xhtml";
	}
	
	public void insertar() {
		cService.insertar(cliente);
		limpiarCliente();
		this.listCliente();
	}
	
	//------
	public void listCliente() {
		listaClientes = cService.listar();
	}
	
	public void listMetodoPago() {
		listaMetodoPagos = mpService.listar();
	}
	
	public void listUsuario() {
		listaUsuarios = uService.listar();
	}
	
	
	//------
	
	public void limpiarCliente() {
		this.init();
	}
	
	public void eliminar(Cliente cliente) {
		cService.eliminar(cliente.getIdCliente());
		this.listCliente();
	}
	//----

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public MetodoPago getMetodopago() {
		return metodopago;
	}

	public void setMetodopago(MetodoPago metodopago) {
		this.metodopago = metodopago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<MetodoPago> getListaMetodoPagos() {
		return listaMetodoPagos;
	}

	public void setListaMetodoPagos(List<MetodoPago> listaMetodoPagos) {
		this.listaMetodoPagos = listaMetodoPagos;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

}
