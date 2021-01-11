package br.com.ecommerceabc.modelo;

public class ClientePF extends Pessoa{

	
	private String cpf;
	private String rg;
	
	
	public String getResumo() {
		return "NOME: " + super.getNome() + "\n" + "CPF: " + cpf;
	}
	

	public void getAll(int id, String nome, String email, Endereco endereco, String cpf, String rg) {
		super.getAll(id, nome, email, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	@Override
	public String toString() {
		return "ClientePF [cpf=" + cpf + ", rg=" + rg + ", pessoa = " + super.toString() +"]";
	}
	public ClientePF() {
		super();
	}
	public ClientePF(int id, String nome, String email, Endereco endereco, String cpf, String rg) {
		super(id, nome, email, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
}
