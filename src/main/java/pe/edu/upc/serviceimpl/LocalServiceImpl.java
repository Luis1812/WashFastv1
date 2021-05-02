package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.LocalDao;
import pe.edu.upc.entity.Local;
import pe.edu.upc.service.LocalService;

@Named
@RequestScoped

public class LocalServiceImpl implements LocalService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private LocalDao lD;
	
	@Override
	public void insertar(Local local) {
		lD.insertar(local);
	}

	@Override
	public List<Local> listar() {
		return lD.listar();
	}

	@Override
	public void eliminar(int idLocal) {
		lD.eliminar(idLocal);		
	}

}
