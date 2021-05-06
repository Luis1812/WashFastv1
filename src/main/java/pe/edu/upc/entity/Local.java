package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Local")
public class Local implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idLocal;
	
	@Column(name="Nombre local", nullable=false, length=50)
	private String nombreLocal;
	
	@Column(name="Direcci�n local", nullable=false, length=100)
	private String direccionLocal;
	
	@Column(name="Tel�fono local", nullable=false, length=20)
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

	
}
