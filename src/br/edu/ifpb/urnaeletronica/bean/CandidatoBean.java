package br.edu.ifpb.urnaeletronica.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifpb.urnaeletronica.dao.*;
import br.edu.ifpb.urnaeletronica.entidade.*;


@ManagedBean
@SessionScoped
public class CandidatoBean {

    private Candidato candidato;
	
	public CandidatoBean() {
		
		this.candidato = new Candidato();		
	}
	
	public void cadastrarCandidato(){
		
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		candidatoDAO.insert(candidato);
	}
	
	public void deletarCandidato(){
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		candidatoDAO.delete(candidato);
	}
	
	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	
	
}