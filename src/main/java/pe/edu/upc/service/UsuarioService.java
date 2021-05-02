package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Usuario;

public interface UsuarioService {
	public void insertar(Usuario usuario);
	public List<Usuario> listar();
	public void eliminar(int idUsuario);
}
