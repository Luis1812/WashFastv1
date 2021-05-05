package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPrendaDao;
import pe.edu.upc.entity.Prenda;

public class PrendaDaoImpl implements IPrendaDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Prenda prenda) {
		em.persist(prenda);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Prenda> listar() {
		List<Prenda> lista = new ArrayList<Prenda>();
		Query q = em.createQuery("select p from Prenda p");
		lista = (List<Prenda>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idPrenda) {
		Prenda prenda = new Prenda();
		prenda= em.getReference(Prenda.class, idPrenda);
		em.remove(prenda);
	}
	
}
