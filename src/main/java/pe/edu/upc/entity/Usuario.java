package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    private int idUsuario;

	private String usuario;
	
	private String contrasena;
	
	private char sexo;
	
    private String direccion;

    private String telefono;

    private String nombre;

    private String apellido;

    private String correo;

	public Usuario(int idUsuario, String usuario, String contrasena, char sexo, String direccion, String telefono,
			String nombre, String apellido, String correo) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.sexo = sexo;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
