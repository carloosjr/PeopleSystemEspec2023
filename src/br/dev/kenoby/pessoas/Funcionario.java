package br.dev.kenoby.pessoas;

import br.dev.kenoby.telefone.Telefone;
import br.dev.kenoby.endereco.Endereco;
import br.dev.kenoby.cargo.Cargo;

public class Funcionario extends Pessoa{
	private int matricula;
	private Cargo cargo;
	private double salario;
	private String dataAdmissao;
	
	public void reajustarSalario(double percentual) {
        this.salario = (salario * (percentual/100)) + salario;
	}
	
	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
	}

	public void cadastrar(int matricula, Cargo cargo, double salario, String dataAdmissao, String nome, String dataNascimento, Endereco endereco, Telefone telsContato) {
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		setNome(nome);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setTelsContato(telsContato);		
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

	public Cargo getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}
	
	
}
