package pe.edu.upc.service;

import java.util.List;
import pe.edu.upc.entity.Local;

public interface LocalService {
	public void insertar(Local local);
	public List<Local> listar();
	public void eliminar(int idLocal);
}
