package br.edu.ifpb.urnaeletronica.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifpb.urnaeletronica.dao.EleitorDAO;
import br.edu.ifpb.urnaeletronica.dao.PessoaDAO;
import br.edu.ifpb.urnaeletronica.entidade.Eleitor;
import br.edu.ifpb.urnaeletronica.entidade.Pessoa;

@ManagedBean
@SessionScoped

public class EleitorBean {


    private Eleitor eleitor;
	
	public EleitorBean() {
		
		this.eleitor = new Eleitor();		
	}
	
	public void cadastrarEleitor(){
		
		EleitorDAO eleitorDAO = new EleitorDAO();
		eleitorDAO.insert(eleitor);
	}
	
	public void deletarEleitor(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.delete(eleitor);
	}
	
	public Pessoa getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor= eleitor;
	}
	
	
	
	
}
