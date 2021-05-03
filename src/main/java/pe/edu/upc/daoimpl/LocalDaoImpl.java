package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ILocalDao;
import pe.edu.upc.entity.Local;

public class LocalDaoImpl implements ILocalDao, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Local local) {
		em.persist(local);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Local> listar() {
		List<Local> lista = new ArrayList<Local>();
		Query q = em.createQuery("select l from Local l");
		lista = (List<Local>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idLocal) {
		Local local = new Local();
		local = em.getReference(Local.class, idLocal);
		em.remove(local);		
	}

}
