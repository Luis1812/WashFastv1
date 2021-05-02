package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.UsuarioDao;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.UsuarioService;

@Named
@RequestScoped

public class UsuarioServiceImpl implements UsuarioService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UsuarioDao uD;
	
	@Override
	public void insertar(Usuario usuario) {
		uD.insertar(usuario);
	}

	@Override
	public List<Usuario> listar() {
		return uD.listar();
	}

	@Override
	public void eliminar(int idUsuario) {
		uD.eliminar(idUsuario);
	}

}
