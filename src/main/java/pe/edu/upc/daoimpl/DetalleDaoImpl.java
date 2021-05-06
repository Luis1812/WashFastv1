package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDetalleDao;
import pe.edu.upc.entity.Detalle;

public class DetalleDaoImpl implements IDetalleDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Detalle detalle) {
		em.persist(detalle);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Detalle> listar() {
		List<Detalle>lista=new ArrayList<Detalle>();
		Query q = em.createQuery("select d from Motor d");
		lista=(List<Detalle>)q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idDetalle) {
		Detalle detalle=new Detalle();
		detalle=em.getReference(Detalle.class, idDetalle);
		em.remove(detalle);
	}

}
