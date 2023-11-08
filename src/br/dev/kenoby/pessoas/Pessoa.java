package br.dev.kenoby.pessoas;

import br.dev.kenoby.Telefone.Telefone;
import br.dev.kenoby.Endereco.Endereco;
import java.util.Scanner;

public class Pessoa {
	private int matricula;
	private String nome;
	private String dataNascimento;
	//Utilizando composição
	private Endereco endereco;
	private Telefone telsContato;

	public void cadastrar (String nome, String dataNascimento, Endereco endereco, Telefone telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
	}
	
	public int obterIdade() {
		//Subtrair ano atual do ano de nascimento

		//Instânciando o objeto entrada
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu ano de nascimento:");
		//Realizando conversão da entrada para um Int
        int idade = entrada.nextInt();
		//Finalizando o objeto entrada
        entrada.close();
		return idade;		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelsContato() {
		return telsContato;
	}

	public void setTelsContato(Telefone telsContato) {
		this.telsContato = telsContato;
	}
	
	
}

