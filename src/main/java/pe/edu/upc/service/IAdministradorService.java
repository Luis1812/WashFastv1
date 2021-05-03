package pe.edu.upc.service;

import java.util.List;
import pe.edu.upc.entity.Administrador;

public interface IAdministradorService {
	public void insertar(Administrador administrador);
	public List<Administrador> listar();
	public void eliminar(int idAdministrador);
}
