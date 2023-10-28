package br.dev.kenoby.pessoas;

public class Cliente extends Pessoa {
	private String codigo;
	private String Profissao;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProfissao() {
		return Profissao;
	}
	public void setProfissao(String profissao) {
		Profissao = profissao;
	}
	
	public void cadastrar(String codigo, String profissao, String nome, String dataNascimento, String endereco, String telsContato) {
		this.codigo = codigo;
		this.Profissao = profissao;
		setNome(nome);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setTelsContato(telsContato);
	}
}
