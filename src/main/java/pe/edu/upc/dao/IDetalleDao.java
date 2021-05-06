package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Detalle;

public interface IDetalleDao {
public void insertar(Detalle detalle);
public List<Detalle> listar();
public void eliminar(int idDetalle);
}
