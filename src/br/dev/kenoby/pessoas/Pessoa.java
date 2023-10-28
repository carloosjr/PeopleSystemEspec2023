package br.dev.kenoby.pessoas;

import java.util.Scanner;

public class Pessoa {
	private int matricula;
	private String nome;
	private String dataNascimento;
	private String endereco;
	private String telsContato;
	private String cargo;
	
	public void cadastrar () {
		
	}
	
	public int obterIdade() {
		//Subtrair ano atual do ano de nascimento
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu ano de nascimento:");
        int idade = entrada.nextInt();
        entrada.close();
		return idade;
		
	}
	
}

