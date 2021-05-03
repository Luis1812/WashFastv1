package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAdministradorDao;
import pe.edu.upc.entity.Administrador;
import pe.edu.upc.service.IAdministradorService;

@Named
@RequestScoped

public class AdministradorServiceImpl implements IAdministradorService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IAdministradorDao aD;
	
	@Override
	public void insertar(Administrador admin) {
		aD.insertar(admin);
	}

	@Override
	public List<Administrador> listar() {
		return aD.listar();
	}

	@Override
	public void eliminar(int idAdmin) {
		aD.eliminar(idAdmin);		
	}

}
