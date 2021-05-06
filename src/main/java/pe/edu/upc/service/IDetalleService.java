package pe.edu.upc.service;

import java.util.List;
import pe.edu.upc.entity.Detalle;

public interface IDetalleService {
	public void insertar(Detalle detalle);
	public List<Detalle> listar();
	public void eliminar(int idDetalle);
}
