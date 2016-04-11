package br.edu.ifpb.urnaeletronica.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.edu.ifpb.urnaeletronica.entidade.Candidato;
import br.edu.ifpb.urnaeletronica.entidade.Eleitor;
import br.edu.ifpb.urnaeletronica.hibernate.HibernateUtil;

public class EleitorDAO extends GenericDAO<Integer, Eleitor>{

	private static EleitorDAO instance;

	public static EleitorDAO getInstance() {	

		instance = new EleitorDAO();		
		return instance;
	}

	@Override
	public Eleitor find(Eleitor entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Eleitor> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Eleitor getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Eleitor argument = null;

		try {
			session.beginTransaction();
			argument = (Eleitor) session.get(Eleitor.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			
			session.close();
			
		}

		return argument;
	}
	
	
	@Override
	public int insert(Eleitor eleitor) throws HibernateException {

		Session session = HibernateUtil.getSessionFactory().openSession();

		Integer id;

		try {

			session.beginTransaction();
			id = (Integer) session.save(eleitor);
			session.getTransaction().commit();

		} catch (HibernateException hibernateException) {

			session.getTransaction().rollback();

			throw new HibernateException(hibernateException);

		} finally {

			session.close();
		}

		return id;
	}

	public Eleitor getByTitulo(String tituloVotacao) {
		// TODO Auto-generated method stub
		return null;
	}

}