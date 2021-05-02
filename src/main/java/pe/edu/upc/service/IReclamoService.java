package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Reclamo;

public interface IReclamoService {
	public void insertar(Reclamo reclamo);
	public List<Reclamo> listar();
	public void eliminar(int idReclamo);	
}