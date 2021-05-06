package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prenda")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPrenda;
		result = prime * result + ((tipoPrenda == null) ? 0 : tipoPrenda.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prenda other = (Prenda) obj;
		if (idPrenda != other.idPrenda)
			return false;
		if (tipoPrenda == null) {
			if (other.tipoPrenda != null)
				return false;
		} else if (!tipoPrenda.equals(other.tipoPrenda))
			return false;
		return true;
	}

}