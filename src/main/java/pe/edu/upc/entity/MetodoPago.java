package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="metodopago")
public class MetodoPago implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idMetodoPago;
	
	@Column(name="nombreMetodoPago", nullable=false, length=50)
	private String nombreMetodoPago;

	public MetodoPago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MetodoPago(int idMetodoPago, String nombreMetodoPago) {
		super();
		this.idMetodoPago = idMetodoPago;
		this.nombreMetodoPago = nombreMetodoPago;
	}

	public int getIdMetodoPago() {
		return idMetodoPago;
	}

	public void setIdMetodoPago(int idMetodoPago) {
		this.idMetodoPago = idMetodoPago;
	}

	public String getNombreMetodoPago() {
		return nombreMetodoPago;
	}

	public void setNombreMetodoPago(String nombreMetodoPago) {
		this.nombreMetodoPago = nombreMetodoPago;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMetodoPago;
		result = prime * result + ((nombreMetodoPago == null) ? 0 : nombreMetodoPago.hashCode());
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
		MetodoPago other = (MetodoPago) obj;
		if (idMetodoPago != other.idMetodoPago)
			return false;
		if (nombreMetodoPago == null) {
			if (other.nombreMetodoPago != null)
				return false;
		} else if (!nombreMetodoPago.equals(other.nombreMetodoPago))
			return false;
		return true;
	}

	
	
}
