package model.javabean;

public class Usuario {
	private String nome,nomeUsuario,senha,cpf,email,endereco,bairro,telefone,cargo;

	public Usuario(String nome) {
		super();
		this.nome = nome;
	}
	
	public Usuario(String nome, String nomeUsuario, String senha,String cpf,String email,String endereco,String bairro,String telefone, String cargo) {
		super();
		this.nome = nome;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
		this.bairro = bairro;
		this.telefone = telefone;
		this.cargo = cargo;
	}

	public String getNomeUsuario() {return nomeUsuario;}
	public void setNomeUsuario(String nomeUsuario) {this.nomeUsuario = nomeUsuario;}
	public String getSenha() {return senha;}
	public void setSenha(String senha) {this.senha = senha;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getCpf() {return cpf;}
	public void setCpf(String cpf) {this.cpf = cpf;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public String getEndereco() {return endereco;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	public String getBairro() {return bairro;}
	public void setBairro(String bairro) {this.bairro = bairro;}
	public String getTelefone() {return telefone;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
	public String getCargo() {return cargo;}
	public void setCargo(String cargo) {this.cargo = cargo;}
	
}
