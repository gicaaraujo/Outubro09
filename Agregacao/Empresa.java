package Agregacao;

public class Empresa {
	
	private String nome;
	private Departamento departamneto;

	
	public Empresa(String nome,Departamento departamento) {
		this.nome=nome;
		this.departamneto = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return getDepartamento();
	}

	public void setDepartamento(Departamento departamento) {
		this.departamneto = departamento;
	}
}
