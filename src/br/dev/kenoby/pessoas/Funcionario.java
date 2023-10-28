package br.dev.kenoby.pessoas;

public class Funcionario {
	private int matricula;
	private String cargo;
	private double salario;
	private String dataAdmissao;
	
	public void reajustarSalario(double percentual) {
		this.salario = this.salario * percentual;
	}
	
	public void promover(String novoCargo) {
		this.cargo = novoCargo;
	}
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}
	
}
