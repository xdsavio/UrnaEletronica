package br.edu.ifpb.urnaeletronica.entidade;


public class Apuracao {
	
	
	private int id;
	
	private int NumVotos;

	private int NumBrancos;
	
	private int NumNulos;
		
	private Candidato prefeitoMaisVotado;
	
	private Candidato governadorMaisVotado;
	
	private Candidato presidenteMaisVotado;
	
	private Candidato prefeitoMenosVotado;
	
	private Candidato governadorMenosVotado;
	
	private Candidato presidenteMenosVotado;
	
	private Candidato prefeitoVencedor;
	
	private Candidato governadorVencedor;
	
	private Candidato presidenteVencedor;	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumVotos() {
		return NumVotos;
	}

	public void setNumVotos(int NumVotos) {
		this.NumVotos = NumVotos;
	}

	public int getNumBrancos() {
		return NumBrancos;
	}

	public void setNumBrancos(int NumBrancos) {
		this.NumBrancos = NumBrancos;
	}

	public int getNumNulos() {
		return NumNulos;
	}

	public void setNumNulos(int NumNulos) {
		this.NumNulos = NumNulos;
	}

	public Candidato getPrefeitoMaisVotado() {
		return prefeitoMaisVotado;
	}

	public void setPrefeitoMaisVotado(Candidato prefeitoMaisVotado) {
		this.prefeitoMaisVotado = prefeitoMaisVotado;
	}

	public Candidato getGovernadorMaisVotado() {
		return governadorMaisVotado;
	}

	public void setGovernadorMaisVotado(Candidato governadorMaisVotado) {
		this.governadorMaisVotado = governadorMaisVotado;
	}

	public Candidato getPresidenteMaisVotado() {
		return presidenteMaisVotado;
	}

	public void setPresidenteMaisVotado(Candidato presidenteMaisVotado) {
		this.presidenteMaisVotado = presidenteMaisVotado;
	}

	public Candidato getPrefeitoMenosVotado() {
		return prefeitoMenosVotado;
	}

	public void setPrefeitoMenosVotado(Candidato prefeitoMenosVotado) {
		this.prefeitoMenosVotado = prefeitoMenosVotado;
	}

	public Candidato getGovernadorMenosVotado() {
		return governadorMenosVotado;
	}

	public void setGovernadorMenosVotado(Candidato governadorMenosVotado) {
		this.governadorMenosVotado = governadorMenosVotado;
	}

	public Candidato getPresidenteMenosVotado() {
		return presidenteMenosVotado;
	}

	public void setPresidenteMenosVotado(Candidato presidenteMenosVotado) {
		this.presidenteMenosVotado = presidenteMenosVotado;
	}

	public Candidato getPrefeitoVencedor() {
		return prefeitoVencedor;
	}

	public void setPrefeitoVencedor(Candidato prefeitoVencedor) {
		this.prefeitoVencedor = prefeitoVencedor;
	}

	public Candidato getGovernadorVencedor() {
		return governadorVencedor;
	}

	public void setGovernadorVencedor(Candidato governadorVencedor) {
		this.governadorVencedor = governadorVencedor;
	}

	public Candidato getPresidenteVencedor() {
		return presidenteVencedor;
	}

	public void setPresidenteVencedor(Candidato presidenteVencedor) {
		this.presidenteVencedor = presidenteVencedor;
	}
}

	
