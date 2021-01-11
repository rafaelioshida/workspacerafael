package br.com.ecommerceabc.modelo;

public class ClientePJ extends Pessoa{

	
	private String cnpj;
	private String contato;
	private String dtAbertura;
	
	
	
	
	
	
	
	
	
	
	
	

	public void getAll(int id, String nome, String email, Endereco endereco, String cnpj, String contato,
			String dtAbertura) {
		super.getAll(id, nome, email, endereco);
		this.cnpj = cnpj;
		this.contato = contato;
		this.dtAbertura = dtAbertura;
	}
	@Override
	public String toString() {
		return "ClientePJ [cnpj=" + cnpj + ", contato=" + contato + ", dtAbertura=" + dtAbertura + ", pessoa = " + super.toString() + "]";
	}
	public ClientePJ() {
		super();
	}
	public ClientePJ(int id, String nome, String email, Endereco endereco, String cnpj, String contato,
			String dtAbertura) {
		super(id, nome, email, endereco);
		this.cnpj = cnpj;
		this.contato = contato;
		this.dtAbertura = dtAbertura;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	
		
	
	
	
}
