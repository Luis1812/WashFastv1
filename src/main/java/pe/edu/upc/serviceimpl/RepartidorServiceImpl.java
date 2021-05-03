package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRepartidorDao;
import pe.edu.upc.entity.Repartidor;
import pe.edu.upc.service.IRepartidorService;

@Named
@RequestScoped

public class RepartidorServiceImpl implements IRepartidorService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IRepartidorDao rD;
	
	@Override
	public void insertar(Repartidor repartidor) {
		rD.insertar(repartidor);
	}

	@Override
	public List<Repartidor> listar() {
		return rD.listar();
	}

	@Override
	public void eliminar(int idRepartidor) {
		rD.eliminar(idRepartidor);		
	}

}
