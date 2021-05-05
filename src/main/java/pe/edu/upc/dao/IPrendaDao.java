package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Prenda;

public interface IPrendaDao {
	public void insertar(Prenda prenda);
	public List<Prenda> listar();
	public void eliminar(int idPrenda);	
}
