package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Prenda")
public class Prenda implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idPrenda;
	
	@Column(name="tipoPrenda", nullable=false, length=20)
	private String tipoPrenda;

	public Prenda() {
		super();
	}

	public Prenda(int idPrenda, String tipoPrenda) {
		super();
		this.idPrenda = idPrenda;
		this.tipoPrenda = tipoPrenda;
	}

	public int getIdPrenda() {
		return idPrenda;
	}

	public void setIdPrenda(int idPrenda) {
		this.idPrenda = idPrenda;
	}

	public String getTipoPrenda() {
		return tipoPrenda;
	}

	public void setTipoPrenda(String tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}

}