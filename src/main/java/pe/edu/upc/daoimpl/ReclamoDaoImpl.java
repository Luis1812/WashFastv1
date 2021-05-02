package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IReclamoDao;
import pe.edu.upc.entity.Reclamo;

public class ReclamoDaoImpl implements IReclamoDao, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Reclamo reclamo) {
		em.persist(reclamo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reclamo> listar() {
		List<Reclamo> lista = new ArrayList<Reclamo>();
		Query q = em.createQuery("select r from Reclamo r");
		lista = (List<Reclamo>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idReclamo) {
		Reclamo reclamo= new Reclamo();
		reclamo	= em.getReference(Reclamo.class, idReclamo);
		em.remove(reclamo);		
	}

}
