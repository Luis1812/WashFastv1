package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.MetodoPago;

public interface IMetodoPagoDao {
	public void insertar(MetodoPago metodopago);
	public List<MetodoPago> listar();
	public void eliminar(int idMetodoPago);	
}

