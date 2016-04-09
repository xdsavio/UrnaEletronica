package br.edu.ifpb.urnaeletronica.entidade;


@Entity
@Table(name = "tb_eleitor")
@NamedQuery(name = "Eleitor.getAll", query = "from Eleitor")
public class Eleitor extends Pessoa {
	private int secao;

	public int getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}



}
