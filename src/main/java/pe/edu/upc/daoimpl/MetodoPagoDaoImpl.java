package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMetodoPagoDao;
import pe.edu.upc.entity.MetodoPago;

public class MetodoPagoDaoImpl implements IMetodoPagoDao, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(MetodoPago metodopago) {
		em.persist(metodopago);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MetodoPago> listar() {
		List<MetodoPago> lista = new ArrayList<MetodoPago>();
		Query q = em.createQuery("select mp from MetodoPago mp");
		lista = (List<MetodoPago>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idMetodoPago) {
		MetodoPago metodopago = new MetodoPago();
		metodopago= em.getReference(MetodoPago.class, idMetodoPago);
		em.remove(metodopago);		
	}

}
