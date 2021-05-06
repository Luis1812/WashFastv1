package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="local")
public class Local implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idLocal;
	
	@Column(name="nombreLocal", nullable=false, length=50)
	private String nombreLocal;
	
	@Column(name="direccionLocal", nullable=false, length=100)
	private String direccionLocal;
	
	@Column(name="telefonoLocal", nullable=false, length=20)
	private String telefonoLocal;

	public Local() {
		super();
	}

	public Local(int idLocal, String nombreLocal, String direccionLocal, String telefonoLocal) {
		super();
		this.idLocal = idLocal;
		this.nombreLocal = nombreLocal;
		this.direccionLocal = direccionLocal;
		this.telefonoLocal = telefonoLocal;
	}

	public int getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}

	public String getNombreLocal() {
		return nombreLocal;
	}

	public void setNombreLocal(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}

	public String getDireccionLocal() {
		return direccionLocal;
	}

	public void setDireccionLocal(String direccionLocal) {
		this.direccionLocal = direccionLocal;
	}

	public String getTelefonoLocal() {
		return telefonoLocal;
	}

	public void setTelefonoLocal(String telefonoLocal) {
		this.telefonoLocal = telefonoLocal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direccionLocal == null) ? 0 : direccionLocal.hashCode());
		result = prime * result + idLocal;
		result = prime * result + ((nombreLocal == null) ? 0 : nombreLocal.hashCode());
		result = prime * result + ((telefonoLocal == null) ? 0 : telefonoLocal.hashCode());
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
		Local other = (Local) obj;
		if (direccionLocal == null) {
			if (other.direccionLocal != null)
				return false;
		} else if (!direccionLocal.equals(other.direccionLocal))
			return false;
		if (idLocal != other.idLocal)
			return false;
		if (nombreLocal == null) {
			if (other.nombreLocal != null)
				return false;
		} else if (!nombreLocal.equals(other.nombreLocal))
			return false;
		if (telefonoLocal == null) {
			if (other.telefonoLocal != null)
				return false;
		} else if (!telefonoLocal.equals(other.telefonoLocal))
			return false;
		return true;
	}
	
}
