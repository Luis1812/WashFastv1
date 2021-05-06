package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle")
public class Detalle implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idDetalle;
	
	@Column(name="cantidad", nullable=false, length=30)
	private String cantidad;
	
	@ManyToOne
	@JoinColumn(name="idPrenda", nullable=false)
	private Prenda prenda;
	
	@ManyToOne
	@JoinColumn(name="idServicio", nullable=false)
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name="idPedido", nullable=false)
	private Pedido pedido;

	public Detalle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Detalle(int idDetalle, String cantidad, Prenda prenda, Servicio servicio, Pedido pedido) {
		super();
		this.idDetalle = idDetalle;
		this.cantidad = cantidad;
		this.prenda = prenda;
		this.servicio = servicio;
		this.pedido = pedido;
	}

	public int getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
