package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Reclamo;

public interface IReclamoDao {
	public void insertar(Reclamo reclamo);
	public List<Reclamo> listar();
	public void eliminar(int idReclamo);	
}

