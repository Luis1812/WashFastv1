package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Local;

public interface ILocalDao {
	public void insertar(Local local);
	public List<Local> listar();
	public void eliminar(int idLocal);

}
