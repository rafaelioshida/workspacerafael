package br.com.elevadores.modelo;

public class Elevadores {

	private short capacidadeMaxima;
	private short andarMaximo;
	private short andarMinimo;
	private short qtdePessoas;
	private short andarAtual;
	

	//Sintaxe dos metodos
	//<Modificador><tidpo do retorno><nome do metodo>(<tipo do param><nome do param>)
	
	public void inicializar (short capacidade, short maior, short menor){
		capacidadeMaxima = capacidade;
		andarMaximo = maior;
		andarMinimo  = menor;
	}
	
	public String verificarStatus() {
		return "O elevador está com " + qtdePessoas +  " pessoas" + "\n" + 
			   "No andar " + andarAtual + "\n" + 
			   "Possui capacidade maxima de " + capacidadeMaxima + " de pessoas";
	}
	
	public void subir () {
		if (andarAtual < andarMaximo) {
			andarAtual+=1;
			}
	}
	
	public void descer () {
		if (andarAtual > andarMinimo) {
			andarAtual-=1;
			}
	}
	
	public void entrar (short pessoas) {
		if((qtdePessoas+pessoas)<=capacidadeMaxima) {
			qtdePessoas = (short) (qtdePessoas +pessoas);
			}
	}
	
	public void sair () {
		if(qtdePessoas>0) {
			qtdePessoas-=1;
			}
	}
	
	public void sair (short pessoas) {
		if((qtdePessoas-pessoas)>0) {
			qtdePessoas= (short)+(qtdePessoas - pessoas);
			}
	}
	
	
	
	
	
	
}
