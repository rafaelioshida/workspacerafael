package br.com.ecommerceabc.modelo;

public class Produto {

	/*
	 * Design pattern (padrões para projetos)
	 * DTO ( UM PATTERN: DATA TRANSFER OBJECT), melhor forma para representar um diagrmaa de classe dentro da programacao
	 *  - TODOS atributos devem ser privados
	 * cada atributo deve possuir um metodo individual de unput e outro de output
	 * cada atributo deve possuir individualmente metodos getters e setters
	 * toda classe BEANS deve possuir no MINIMO 2 construtores. Um vazio e outro com todos os parametros para os atributos
	 */
	
	
	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorVenda=" + valorVenda + ", valorCompra="
				+ valorCompra + ", qtde=" + qtde + "]";
	}



	public Produto() {
		super();
	}



	public Produto(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}



	//Sintaxe dos metodos
		//<Modificador><tidpo do retorno><nome do metodo>(<tipo do param><nome do param>)
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public float getValorVenda() {
		return valorVenda;
	}



	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}



	public float getValorCompra() {
		return valorCompra;
	}



	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}



	public int getQtde() {
		return qtde;
	}



	public void setQtde(int qtde) {
		this.qtde = qtde;
	}



	public String getAll() {
		return "id " + id +  "\n" + 
			   "descrição " + descricao + "\n" + 
			   "valor de venda " + valorVenda + "\n" +
			   "valor de compra " + valorCompra +  "\n" +
			   "quantidade " + qtde;
	}
	
	
	
	public void setAll (int identificacao, String desc, float venda, float compra,int quantidade ){
		//se o nome do paramtro for igual ao do atributo deve ser usado o modelo:
		// this.xpto = xpto
		id = identificacao;
		descricao = desc;
		valorVenda  = venda;
		valorCompra = compra;
		qtde  = quantidade;
	}
	
	public float getPromocao () {
		return (float)(valorVenda * 0.9);
	}
	
	public float getTotalVendas () {
		return (valorVenda * qtde);
	}
	
	public float getTotalCompras () {
		return (valorCompra * qtde);
	}
	
	public void atualizarValores (float porcentagem) {
		valorVenda = (float)(valorVenda + valorVenda * (porcentagem/100));
		valorCompra = (float)(valorCompra + valorCompra * (porcentagem/100));
	}
		
	
	public String verificaEstoque () {
		if (qtde > 20) {
			return "Esqtoque alto";
		}else if (qtde < 5) {
			return "Esqtoque baixo";
		}else {
			return 	"Estoque normal";
		}
		
	}
	
	public void getPromocao (float porcentagem) {
		valorVenda = (float)(valorVenda - valorVenda * (porcentagem/100));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
