package variaveis;

public class TipoString {

	public static void main(String[] args) {

		// String => � um tipo de referencia
		// Date => � um tipo de referenia
		
		String email = "TestE123456@ServidoR.cOm.br";
		System.out.println("Original: " + email);
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Minusculo: " + email.toLowerCase());
		//lenght() => retorna qtde de caracteres da string
		System.out.println("Qtde caracteres: "+ email.length());
		//contais() => retorna true/false sobre existencia ou n�o do caracter
		System.out.println("Tem @? " + email.contains("@"));
		//indexOf() => retorna a POSI��O do caracter ou da substring
		//t e s t e
		//0 1 2 3 4
		//Obs.: Se caracter pesquisa n�o existir o resultado ser� "-1"
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		//substring() => retorna parte da string com base nas coordenadas: inicial e final
		System.out.println("Do 2� ao 5� caracter:" + email.substring(1,5));
		System.out.println("A partir do 3�" + email.substring(2,email.length()));
		//exibir somente usu�rio
		System.out.println("Somente usu�rio: " + email.substring(0,email.indexOf("@")));
		//exibir somente servidor
		System.out.println("Soment servidor: " + email.substring(email.indexOf("@")+1, email.indexOf(".")));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}