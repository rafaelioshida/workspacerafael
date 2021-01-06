package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Existem dois tipos de dados
		 *  - alfanumerico: � o dado que N�O VAI ser utilizado em uma express�o matem�ica e 
		 *  tamb�m n�p � um dado sensivel (muito utilizado para buscas) para o modelo de neg�cio;
		 * CEP (de um colaborador do itau)
		 * CPF (de um aluno deuma universidade)
		 * Em Java =>String
		 * 
		 * 
		 * 	- num�rico: dado que PODE ser utilizado em uma express�o matem�tica
		 * CEP (contexto do site dos correios)
		 * CPF (contexto do site da receita)
		 * Em Java => int(para numeros inteiros) e double(para n�meros reais)
		 * 
		 * */
		
		/*
		 * Nome da variavel = identificador
		 * Regras
		 * 	- 1� n�o come�ar� com numero (1berto - n�o pode, h1berto - pode)
		 * 	- 2� n�o  far� uso de palavra reservada (int - n�o pode, class - n�o pode)
		 * 	- 3� n�o usu�r� caracteres especiais (d@t@  - @, nome cliente - "espa�o")
		 * 
		 * Padr�es
		 * 	- nomes significativos, evitar: x, n1, xpto
		 * 	- come�a com letra minuscula
		 * 	- padr�o CamelCase
		 * dataNascimento(correto)
		 * datanascimento(errado)
		 * data_nascimento(correto)
		 * data_Nascimento(errado)
		 * 
		 * */
		
		
		String nome = JOptionPane.showInputDialog("Digite seu nome") ;
		/*
		 * Tipos numericos s�o primitivos, para apoia-los, usamos classes wrappers.
		 * int=>Integer
		 * double=>Double
		 * short=>Short
		 * boolean=>Boolean
		 * */
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")) ;
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double imc = peso / (altura * altura);


		System.out.println("Nome:" + nome);
		System.out.println("Idade:" + idade);
		System.out.println("Altura:" + altura);
		System.out.println("IMC:" + imc);
				
	}

}
