package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="reclamo")
public class Reclamo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idReclamo;
	
	@Column(name="detalleReclamo", nullable=false, length=200)
	private String detalleReclamo;
	
	private Date fechaReclamo;


	@ManyToOne
	@JoinColumn(name="idCliente", nullable=false)
	private Cliente cliente;

	@OneToOne
	@JoinColumn(name="idLocal", nullable=false)
	private Local local;

	public Reclamo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reclamo(int idReclamo, String detalleReclamo, Date fechaReclamo, Cliente cliente, Local local) {
		super();
		this.idReclamo = idReclamo;
		this.detalleReclamo = detalleReclamo;
		this.fechaReclamo = fechaReclamo;
		this.cliente = cliente;
		this.local = local;
	}

	public int getIdReclamo() {
		return idReclamo;
	}

	public void setIdReclamo(int idReclamo) {
		this.idReclamo = idReclamo;
	}

	public String getDetalleReclamo() {
		return detalleReclamo;
	}

	public void setDetalleReclamo(String detalleReclamo) {
		this.detalleReclamo = detalleReclamo;
	}

	public Date getFechaReclamo() {
		return fechaReclamo;
	}

	public void setFechaReclamo(Date fechaReclamo) {
		this.fechaReclamo = fechaReclamo;
	}

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


}
