package br.edu.ifpb.urnaeletronica.dao;

import java.util.List;

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

	@Override
	public Voto find(Voto entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voto> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Voto getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Voto argument = null;

		try {
			session.beginTransaction();
			argument = (Voto) session.get(Voto.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			
			session.close();
			
		}

		return argument;
	}
}