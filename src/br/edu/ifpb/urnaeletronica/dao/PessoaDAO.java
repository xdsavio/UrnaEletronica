package br.edu.ifpb.urnaeletronica.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.edu.ifpb.urnaeletronica.entidade.Pessoa;
import br.edu.ifpb.urnaeletronica.hibernate.HibernateUtil;

public class PessoaDAO extends GenericDAO<Integer, Pessoa>{

	private static PessoaDAO instance;

	public static PessoaDAO getInstance() {	

		instance = new PessoaDAO();		
		return instance;
	}

	@Override
	public Pessoa find(Pessoa entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pessoa> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Pessoa getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Pessoa argument = null;

		try {
			session.beginTransaction();
			argument = (Pessoa) session.get(Pessoa.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			
			session.close();
			
		}

		return argument;
	}
}
