package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IReclamoDao;
import pe.edu.upc.entity.Reclamo;
import pe.edu.upc.service.IReclamoService;

@Named
@RequestScoped

public class ReclamoServiceImpl implements IReclamoService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IReclamoDao mD;
	
	@Override
	public void insertar(Reclamo reclamo) {
		mD.insertar(reclamo);
	}

	@Override
	public List<Reclamo> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idReclamo) {
		mD.eliminar(idReclamo);		
	}

}
