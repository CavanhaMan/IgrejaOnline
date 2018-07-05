package model.javabean;

public class Igreja {
	String cnpj,nome,endereco,bairro,telefone;

	public Igreja(String nome) {
		super();
		this.nome = nome;
	}
	
	public Igreja(String cnpj, String nome, String endereco, String bairro, String telefone) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.telefone = telefone;
	}

	public String getCnpj() {return cnpj;}
	public void setCnpj(String cnpj) {this.cnpj = cnpj;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getEndereco() {return endereco;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	public String getBairro() {return bairro;}
	public void setBairro(String bairro) {this.bairro = bairro;}
	public String getTelefone() {return telefone;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
	
	
}
