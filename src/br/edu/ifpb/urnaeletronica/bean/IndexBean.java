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
	
	public String toCadastrarCandidato (){
		return("cadastrocandidato.xhtml");
	}
	
	public String toCadastrarEleitor (){
		return ("cadastroeleitor.xhtml");
	}	
	
	public String toDeletar (){
		return("delete.xhtml");
	}
	
	public String toEntrarVotacao (){
		return ("entrarvotacao.xhtml");
	}
	
	public String toVotacao (){
		return("votacao.xhtml");
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
