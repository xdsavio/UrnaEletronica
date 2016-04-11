package br.edu.ifpb.urnaeletronica.bean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.*;

@ManagedBean
@SessionScoped

public class EncerraBean {

	private String outcome = "encerra";

	private String userInput = "";

	public String getOutcome() {

		return outcome;

	}
	
	public String toEncerrar (String senha){
	  if(senha=="irelia"){
		  return("sessao2.xhtml");
	  }
	return senha;
	}
	}