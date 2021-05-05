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
@Table(name="Tarifario")
public class Tarifario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idTarifario;
	
	@Column(name="cantidad", nullable=false, length=30)
	private String cantidad;
	
	@ManyToOne
	@JoinColumn(name="idPrenda", nullable=false)
	private Prenda prenda;
	
	/*@ManyToOne
	@JoinColumn(name="idSevicio", nullable=false)
	private Servicio sevicio;*/
	
	@ManyToOne
	@JoinColumn(name="idPedido", nullable=false)
	private Pedido pedido;
}
