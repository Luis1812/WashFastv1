package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPrendaDao;
import pe.edu.upc.entity.Prenda;
import pe.edu.upc.service.IPrendaService;

@Named
@RequestScoped
public class PrendaServiceImpl implements IPrendaService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IPrendaDao mD;
	
	@Override
	public void insertar(Prenda prenda) {
		mD.insertar(prenda);
	}

	@Override
	public List<Prenda> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idPrenda) {
		mD.eliminar(idPrenda);	
	}

	
}
