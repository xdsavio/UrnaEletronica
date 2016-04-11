package br.edu.ifpb.urnaeletronica.bean;
import java.io.IOException;
import java.sql.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.*;

import br.edu.ifpb.urnaeletronica.dao.CandidatoDAO;
import br.edu.ifpb.urnaeletronica.dao.EleitorDAO;
import br.edu.ifpb.urnaeletronica.entidade.Candidato;
import br.edu.ifpb.urnaeletronica.entidade.Eleitor;
import br.edu.ifpb.urnaeletronica.entidade.Voto;


@ManagedBean
@SessionScoped

public class SessaoBean {

	Eleitor eleitor;
	Candidato candidato;
	Voto voto;  
	
	public SessaoBean() {
		
		this.eleitor = new Eleitor();
		this.candidato = new Candidato();
		this.voto = new Voto();
	}

	public void verificarTitulo() throws IOException{
		EleitorDAO eleitorDAO = new EleitorDAO();
		Eleitor eleitor_aux = eleitorDAO.getByTitulo(eleitor.getTituloVotacao());
		
		if(eleitor_aux!=null){
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("eleitor", eleitor_aux);
			FacesContext.getCurrentInstance().getExternalContext().redirect("sessao1.xhtml");
		}else{
			System.out.println("É nulo");
		}
	}
	
	public void votar(){
		Date data = new Date();
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		
		eleitor = (Eleitor)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("eleitor");

		Candidato candidato = candidatoDAO.getByNumero(voto.getVoto_candidato());
		
		voto.setData(data);
		voto.setEleitor(eleitor);
		voto.setCandidato(candidato);
		
		System.out.println(eleitor.getId());
		System.out.println(candidato.getId());
		
		VotoDAO votoDAO = new VotoDAO();
		votoDAO.insert(voto);	
		
	}
	
	public void votar_branco(){
		Date data = new Date();
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		
		eleitor = (Eleitor)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("eleitor");

		Candidato candidato = null;
		
		voto.setData(data);
		voto.setEleitor(eleitor);
		voto.setCandidato(candidato);
		
		System.out.println(eleitor.getId());
		System.out.println(candidato.getId());
		
		VotoDAO votoDAO = new VotoDAO();
		votoDAO.insert(voto);
	}
	
	public String encerrar_eleicao(){
		return ("encerrar.xhtml");
	}

	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public Voto getVoto() {
		return voto;
	}

	public void setVoto(Voto voto) {
		this.voto = voto;
	}
}
