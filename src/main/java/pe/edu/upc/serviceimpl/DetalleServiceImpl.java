package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDetalleDao;
import pe.edu.upc.entity.Detalle;
import pe.edu.upc.service.IDetalleService;

@Named
@RequestScoped

public class DetalleServiceImpl implements IDetalleService, Serializable{
	private static final long serialVersionUID = 1L;

	@Inject
	private IDetalleDao dD;

	@Override
	public void insertar(Detalle detalle) {
		dD.insertar(detalle);
	}

	@Override
	public List<Detalle> listar() {
		return dD.listar();
	}

	@Override
	public void eliminar(int idDetalle) {
		dD.eliminar(idDetalle);
	}
	

	

}
