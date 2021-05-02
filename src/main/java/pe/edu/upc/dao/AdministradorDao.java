package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Administrador;

public interface AdministradorDao {
	public void insertar(Administrador admin);
	public List<Administrador> listar();
	public void eliminar(int idAdmin);

}
