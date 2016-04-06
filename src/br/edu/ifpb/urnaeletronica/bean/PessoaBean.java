package br.edu.ifpb.urnaeletronica.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;
import javax.management.*;
import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.edu.ifpb.urnaeletronica.dao.PessoaDAO;
import br.edu.ifpb.urnaeletronica.entidade.*;
import br.edu.ifpb.urnaeletronica.hibernate.HibernateUtil;


@ManagedBean
@SessionScoped
public class PessoaBean {

    private Pessoa pessoa;
	
	public PessoaBean() {
		
		this.pessoa = new Eleitor();		
	}
	
	public void cadastrarPessoa(){
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.insert(pessoa);
	}
	
     public void contarPessoa(int id_pessoa){

 		Session session = HibernateUtil.getSessionFactory().openSession();
 		Pessoa argument = null;
 		Eleitor eleitor[];
 		try {

			String hql = "from Eleitor as a"
					+ " where a.eleitor.id = :id";

			Query query = (Query) session.createQuery(hql);
			((org.hibernate.Query) query).setParameter("id_pessoa", id_pessoa);

			eleitor = (Eleitor[])  query.eleitor();

		} catch (HibernateException hibernateException) {

			session.getTransaction().rollback();

		} finally {

			session.close();
		}
	}
	
	public void deletarPessoa(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.delete(pessoa);
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
