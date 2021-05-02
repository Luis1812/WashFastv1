package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.MetodoPago;

public interface IMetodoPagoService {
	public void insertar(MetodoPago metodopago);
	public List<MetodoPago> listar();
	public void eliminar(int idMetodoPago);	
}
