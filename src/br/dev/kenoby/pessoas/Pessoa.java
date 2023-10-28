package br.dev.kenoby.pessoas;

import java.util.Scanner;

public class Pessoa {
	private int matricula;
	private String nome;
	private String dataNascimento;
	private String endereco;
	private String telsContato;

	public void cadastrar (String nome, String dataNascimento, String endereco, String telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
	}
	
	public int obterIdade() {
		//Subtrair ano atual do ano de nascimento
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu ano de nascimento:");
        int idade = entrada.nextInt();
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelsContato() {
		return telsContato;
	}

	public void setTelsContato(String telsContato) {
		this.telsContato = telsContato;
	}
	
	
}

