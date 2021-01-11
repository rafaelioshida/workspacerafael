package br.com.banco.modelo;

public class Cliente {

	/*
	 * Design pattern (padrões para projetos)
	 * DTO ( UM PATTERN: DATA TRANSFER OBJECT), melhor forma para representar um diagrmaa de classe dentro da programacao
	 *  - TODOS atributos devem ser privados
	 * cada atributo deve possuir um metodo individual de unput e outro de output
	 * cada atributo deve possuir individualmente metodos getters e setters
	 * toda classe BEANS deve possuir no MINIMO 2 construtores. Um vazio e outro com todos os parametros para os atributos
	 */
	
	
	private int id;
	private String nome;
	private String email;
	private Endereco endereco;
	
		
	public void getAll (int id, String nome, String email, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + "]";
	}

	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, String email, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getServidor() {
		if(email.contains("@")) {
		return email.substring(email.indexOf("@")+1);
		}
		return  email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
