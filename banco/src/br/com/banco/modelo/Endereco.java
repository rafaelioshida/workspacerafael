package br.com.banco.modelo;

public class Endereco {

	
	/*
	 * Design pattern (padrões para projetos)
	 * DTO ( UM PATTERN: DATA TRANSFER OBJECT), melhor forma para representar um diagrmaa de classe dentro da programacao
	 *  - TODOS atributos devem ser privados
	 * cada atributo deve possuir um metodo individual de unput e outro de output
	 * cada atributo deve possuir individualmente metodos getters e setters
	 * toda classe BEANS deve possuir no MINIMO 2 construtores. Um vazio e outro com todos os parametros para os atributos
	 */
	
	
	private String logradouro;
	private String bairo;
	private String cidade;
	private String uf;
	private String cep;
	private String numero;
	private String complemento;
	
	
		
	public void setAll(String logradouro, String bairo, String cidade, String uf, String cep, String numero,String complemento) {
		this.logradouro = logradouro;
		this.bairo = bairo;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", bairo=" + bairo + ", cidade=" + cidade + ", uf=" + uf
				+ ", cep=" + cep + ", numero=" + numero + ", complemento=" + complemento + "]";
	}

	public Endereco() {
		super();
	}

	public Endereco(String logradouro, String bairo, String cidade, String uf, String cep, String numero,String complemento) {
		super();
		this.logradouro = logradouro;
		this.bairo = bairo;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairo() {
		return bairo;
	}
	public void setBairo(String bairo) {
		this.bairo = bairo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
