package br.edu.ifpb.urnaeletronica.bean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class Sessao1Bean {

	private String outcome = "sessao1";

	private String userInput = "";

	public String getOutcome() {

		return outcome;

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