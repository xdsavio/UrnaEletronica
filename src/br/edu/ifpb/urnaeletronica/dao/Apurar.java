package br.edu.ifpb.urnaeletronica.dao;

import java.util.List;
import org.hibernate.*;

import br.edu.ifpb.urnaeletronica.entidade.Voto;
import br.edu.ifpb.urnaeletronica.hibernate.*;

public class Apurar extends GenericDAO {

	@SuppressWarnings("unchecked")
	public List<Voto> getByVoto(int id) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		List <Voto> votos = null;

		try {

			String hql = "from Voto as a"
					+ " where a.eleitor.id = :id";

			Query query = session.createQuery(hql);
			query.setParameter("id", id);

			votos = (List<Voto>) query.list();

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

			Query query = session.createQuery(hql);
			query.setParameter("numero", numero);

			votos = (List<Voto>) query.list();

		} catch (HibernateException hibernateException) {

			session.getTransaction().rollback();

		} finally {

			session.close();
		}

		return votos.size();
	}

	@Override
	public Object find(Object entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
