package pe.edu.upc.service;

import java.util.List;
import pe.edu.upc.entity.Prenda;

public interface IPrendaService {
	public void insertar(Prenda prenda);
	public List<Prenda> listar();
	public void eliminar(int idPrenda);	
}
