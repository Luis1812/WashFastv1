package pe.edu.upc.service;

import java.util.List;
import pe.edu.upc.entity.Repartidor;

public interface IRepartidorService {
	public void insertar(Repartidor repartidor);
	public List<Repartidor> listar();
	public void eliminar(int idRepartidor);
}
