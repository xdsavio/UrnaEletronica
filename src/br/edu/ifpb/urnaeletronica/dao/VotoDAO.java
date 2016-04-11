package br.edu.ifpb.urnaeletronica.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.edu.ifpb.urnaeletronica.entidade.Voto;
import br.edu.ifpb.urnaeletronica.hibernate.HibernateUtil;

public class VotoDAO extends GenericDAO<Integer, Voto>{

	private static VotoDAO instance;

	public static VotoDAO getInstance() {	

		instance = new VotoDAO();		
		return instance;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Voto> getAll() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Voto> votos = null;

		try {
			session.beginTransaction();
			Query query = (Query) session.getNamedQuery("Voto.getAll");
			votos = (List<Voto>) ((org.hibernate.Query) query).list();
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			session.clear();
			session.close();
		}

		return votos;
	}

	@Override
	public Voto getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Voto voto = null;

		try {
			session.beginTransaction();
			voto = (Voto) session.get(Voto.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			session.close();
		}

		return voto;
	}
	
	@SuppressWarnings("unchecked")
	public List<Voto> getByVoto(int id) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		List <Voto> votos = null;

		try {

			String hql = "from Voto as a"
					+ " where a.eleitor.id = :id";

			Query query = (Query) session.createQuery(hql);
			((org.hibernate.Query) query).setParameter("id", id);

			votos = (List<Voto>) ((org.hibernate.Query) query).list();

		} catch (HibernateException hibernateException) {

			session.getTransaction().rollback();

		} finally {

			session.close();
		}

		return votos;
	}

	@SuppressWarnings("unchecked")
	public int getVotosCandidato(int numero) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		List <Voto> votos = null;

		try {

			String hql = "from Voto as a"
					+ " where a.voto = :numero";

			Query query = (Query) session.createQuery(hql);
			((org.hibernate.Query) query).setParameter("numero", numero);

			votos = (List<Voto>) ((org.hibernate.Query) query).list();

		} catch (HibernateException hibernateException) {

			session.getTransaction().rollback();

		} finally {

			session.close();
		}

		return votos.size();
	}
	
	@SuppressWarnings("unchecked")
	public int getVotosBrancos(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		List <Voto> votos = null;

		try {

			String hql = "from Voto as a"
					+ " where a.votoCandidato = :numero";

			Query query = (Query) session.createQuery(hql);
			((org.hibernate.Query) query).setParameter("numero", 0);

			votos = (List<Voto>) ((org.hibernate.Query) query).list();

		} catch (HibernateException hibernateException) {

			session.getTransaction().rollback();

		} finally {

			session.close();
		}
		if (votos ==  null)
			return 0;
		
		return votos.size();
	}
	
	
	
	
	@Override
	public Voto find(Voto entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
