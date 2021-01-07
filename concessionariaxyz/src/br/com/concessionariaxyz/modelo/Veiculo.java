package br.com.concessionariaxyz.modelo;

public class Veiculo {
	
	private String montadora;
	private String modelo;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	private boolean status;
	private  float valor;
	
	//Sintaxe dos metodos
	//<Modificador><tidpo do retorno><nome do metodo>(<tipo do param><nome do param>)
	
	
	public void preencherMontadora (String param){
		montadora = param.toUpperCase();
	}
	
	public String retornarMontadora() {
		return montadora;
	}
	
		
	public void preencherModelo (String param){
		modelo = param.toUpperCase();
	}
	
	public String retornarModelo() {
		return modelo;
	}
	
	public void preencherVelocidadeMaxima (float param){
		if(param>0) {
		velocidadeMaxima = param;
		}
	}
	
	public float retornarVelocidadeMaxima() {
		return velocidadeMaxima;
	}
		
	public void preencherValor (float param){
		if(param>0) {
		valor = param;
		}
	}
	
	public float retornarValor() {
		return valor;
	}

	public String ligar() {
		if(status == false) {
			status = true;
		}
		return "Veiculo ligado";
	}
	
	public String desligar() {
		if (status ==true) {
			status = false;
			velocidadeAtual=0;
		}
		return "Veiculo desligado";
	}
	
	public void acelerar () {
		if (status == true && (velocidadeAtual+10)<velocidadeMaxima) {
			velocidadeAtual+=10;
			}
	}
	
	public void desacelerar () {
		if (status == true && velocidadeAtual>0) {
			velocidadeAtual-=10;
			}
	}
	
	public String verificarStatus() {
		return "Está ligado?" + status + "\n" + "Velocidade atual: " +  velocidadeAtual + " km/h";
	
	}
	
	public void acelerar (float param) {
		if((velocidadeAtual+param)<velocidadeMaxima && status == true) {
			velocidadeAtual=+param;
			}
	}
	
	
	
	
	
	
	
	
	
	
	

}
