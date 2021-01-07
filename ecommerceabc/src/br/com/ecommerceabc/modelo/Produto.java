package br.com.ecommerceabc.modelo;

public class Produto {

	/*
	 * Design pattern (padrões para projetos)
	 * DTO ( UM PATTERN: DATA TRANSFER OBJECT), melhor forma para representar um diagrmaa de classe dentro da programacao
	 *  - TODOS atributos devem ser privados
	 * cada atributo deve possuir um metodo individual de unput e outro de output
	 * cada atributo deve possuir individualmente metodos getters e setters
	 */
	
	
	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;

	
	//Sintaxe dos metodos
		//<Modificador><tidpo do retorno><nome do metodo>(<tipo do param><nome do param>)
	
	public String getAll() {
		return "id " + id +  "\n" + 
			   "descrição " + descricao + "\n" + 
			   "valor de venda " + valorVenda + "\n" +
			   "valor de compra " + valorCompra +  "\n" +
			   "quantidade " + qtde;
	}
	
	
	
	public void setAll (int identificacao, String desc, float venda, float compra,int quantidade ){
		id = identificacao;
		descricao = desc;
		valorVenda  = venda;
		valorCompra = compra;
		qtde  = quantidade;
	}
	
	public void getPromocao () {
		valorVenda = (float)(valorVenda * 0.9);
	}
	
	public void getTotalVendas () {
		valorVenda = (float)(valorVenda * qtde);
	}
	
	public void getTotalCompras () {
		valorCompra = (float)(valorCompra * qtde);
	}
	
	public void atualizaValores (float porcentagem) {
		valorVenda = (float)(valorVenda * (porcentagem/100));
		valorCompra = (float)(valorCompra * (porcentagem/100));
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
		valorVenda = (float)(valorVenda * porcentagem);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
