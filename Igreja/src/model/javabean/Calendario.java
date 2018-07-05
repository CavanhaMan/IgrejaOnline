package model.javabean;

//import java.text.SimpleDateFormat;

public class Calendario {
	String titulo,data,hora,endereco,bairro,cnpj;
	
	public Calendario(String titulo) {
		super();
		this.titulo = titulo;
	}
	
	public Calendario(String titulo, String data, String hora,String endereco,String bairro, String cnpj) {
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
	public String getdata() {return data; }
	public void setdata(String data){this.data = data;}
	public String gethora() {return hora;}
	public void sethora(String hora) {this.hora = hora;}
	public String getEndereco() {return endereco;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	public String getBairro() {	return bairro;}
	public void setBairro(String bairro) {	this.bairro = bairro;}
	public String getCnpj() {return cnpj;}
	public void setCnpj(String cnpj) {this.cnpj = cnpj;}
	
}
