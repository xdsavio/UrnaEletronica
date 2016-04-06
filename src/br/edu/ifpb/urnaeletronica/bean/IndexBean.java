package br.edu.ifpb.urnaeletronica.bean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.*;

@ManagedBean
@SessionScoped

public class IndexBean {

	private String outcome = "index";

	private String userInput = "";

	public String getOutcome() {

		return outcome;

	}
	
	public void toCadastrarCandidato (){
		response.sendRedirect("cadastrocandidato.xhtml");
	}
	
	public void toCadastrarEleitor (){
		response.sendRedirect("cadastroeleitor.xhtml");
	}	
	
	public void toDeletar (){
		response.sendRedirect("delete.xhtml");
	}
	
	public void toEntrarVotacao (){
		response.sendRedirect("entrarvotacao.xhtml");
	}
	
	public void toVotacao (){
		response.sendRedirect("votacao.xhtml");
	}
	
	public void setOutcome(String outcome) {

		this.outcome = outcome;

	}
	public String getUserInput() {

		return userInput;

	}
	public void setUserInput(String userInput) {

		this.userInput = userInput;

	}
	public String submit(){

		this.userInput = "The user has entered \""+this.userInput+" \"";

		return "";

	}
}
