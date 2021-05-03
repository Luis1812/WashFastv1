package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Repartidor;

public interface IRepartidorDao {
	public void insertar(Repartidor repartidor);
	public List<Repartidor> listar();
	public void eliminar(int idRepartidor);

}
