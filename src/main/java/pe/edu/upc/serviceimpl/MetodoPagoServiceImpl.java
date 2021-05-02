package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMetodoPagoDao;
import pe.edu.upc.entity.MetodoPago;
import pe.edu.upc.service.IMetodoPagoService;

@Named
@RequestScoped

public class MetodoPagoServiceImpl implements IMetodoPagoService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IMetodoPagoDao mD;
	
	@Override
	public void insertar(MetodoPago metodopago) {
		mD.insertar(metodopago);
	}

	@Override
	public List<MetodoPago> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idMetodoPago) {
		mD.eliminar(idMetodoPago);		
	}

}
