package model.javabean;

public class Agenda {
	String titulo,data,hora,endereco,bairro,cnpj;
	
	public Agenda(String titulo) {
		super();
		this.titulo = titulo;
	}
	
	public Agenda(String titulo, String data, String hora,String endereco,String bairro, String cnpj) {
		super();
		this.titulo = titulo;
		this.data = data;
		this.hora = hora;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cnpj = cnpj;
	}
	
	public String getTitulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public String getData() {
		String[] s = data.split("/");
		String novaData = s[2]+"/"+s[1]+"/"+s[0];
		return novaData;
		//return data;
	}
	public void setData(String data) {
		//this.data = data;
		String[] r = data.split("/");
		String velhaData = r[2]+"/"+r[1]+"/"+r[0];
		this.data = velhaData;
	}
	public String getHora() {return hora;}
	public void setHora(String hora) {this.hora = hora;}
	public String getEndereco() {return endereco;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	public String getBairro() {return bairro;}
	public void setBairro(String bairro) {this.bairro = bairro;}
	public String getCnpj() {return cnpj;}
	public void setCnpj(String cnpj) {this.cnpj = cnpj;}
	
}
