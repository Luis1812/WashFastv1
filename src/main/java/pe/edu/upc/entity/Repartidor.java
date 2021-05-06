package pe.edu.upc.entity;

import java.io.Serializable;

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
@Table(name="Repartidor")
public class Repartidor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idRepartidor;
	
	@Column(name="Codigo Licencia", nullable=false, length=9)
	private String codLicencia;
	
	@Column(name="Placa", nullable=false, length=6)
	private String placaMoto;
	
	@ManyToOne
	@JoinColumn(name="idLocal", nullable=false)
	private Local local;
	
	@OneToOne
	@JoinColumn(name="idUsuario", nullable=false)
	private Usuario usuario;

	public Repartidor() {
		super();
	}

	public Repartidor(int idRepartidor, String codLicencia, String placaMoto, pe.edu.upc.entity.Local local,
			Usuario usuario) {
		super();
		this.idRepartidor = idRepartidor;
		this.codLicencia = codLicencia;
		this.placaMoto = placaMoto;
		this.local = local;
		this.usuario = usuario;
	}

	public int getIdRepartidor() {
		return idRepartidor;
	}

	public void setIdRepartidor(int idRepartidor) {
		this.idRepartidor = idRepartidor;
	}

	public String getCodLicencia() {
		return codLicencia;
	}

	public void setCodLicencia(String codLicencia) {
		this.codLicencia = codLicencia;
	}

	public String getPlacaMoto() {
		return placaMoto;
	}

	public void setPlacaMoto(String placaMoto) {
		this.placaMoto = placaMoto;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
