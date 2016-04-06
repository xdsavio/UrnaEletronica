package br.edu.ifpb.urnaeletronica.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.edu.ifpb.urnaeletronica.entidade.Candidato;
import br.edu.ifpb.urnaeletronica.entidade.Voto;
import br.edu.ifpb.urnaeletronica.hibernate.HibernateUtil;

public class CandidatoDAO extends GenericDAO{

	Candidato candidato = new Candidato();
	
	private Session sessao;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Candidato> getAll() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Candidato> candidatos = null;

		try {
			session.beginTransaction();
			Query query = (Query) session.getNamedQuery("Candidato.getAll");
			candidatos = (List<Candidato>) ((org.hibernate.Query) query).list();
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			session.clear();
			session.close();
		}

		return candidatos;
	}
	
	public Candidato getByNumero(int numero) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Candidato candidato = null;
		
		try {
			
			String hql = "from Candidato as a"
					+ " where a.numero = :numero";
			
			Query query = (Query) session.createQuery(hql);
			((org.hibernate.Query) query).setParameter("numero", numero);
			
			candidato = (Candidato) ((org.hibernate.Query) query).uniqueResult();
	        
		} catch (HibernateException hibernateException) {
			
			session.getTransaction().rollback();
			
		} finally {
		
			session.close();
		}
		
		return candidato;
	}
	
	@SuppressWarnings("unchecked")
	public List <Candidato> getAllCandidatos() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		List <Candidato> candidatos = null;
		
		try {
			
			String hql = "from Pessoa as a"
					+ " where a.DTYPE = :candidato";
			
			Query query = (Query) session.createQuery(hql);
			((org.hibernate.Query) query).setParameter("candidato", "candidato");
			
			candidatos = (List<Candidato>) ((org.hibernate.Query) query).list();
	        
		} catch (HibernateException hibernateException) {
			
			session.getTransaction().rollback();
			
		} finally {
		
			session.close();
		}
		
		return candidatos;
	}


	@Override
	public Candidato getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Candidato candidato = null;

		try {
			session.beginTransaction();
			candidato = (Candidato) session.get(Candidato.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			session.close();
		}

		return candidato;
	}

	
	@Override
	public Object find(Object entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAll1() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
