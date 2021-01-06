package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {

		/*
		 * boolean => dado logico (true/false)
		 * char => 1 caracter
		 * -- para numeros inteiros --
		 * byte = > -127 +128 - Byte
		 * short => -32.????? +32.??? - Short
		 * int => -2bilhoes + 2 bilhoes - Integer
		 * long => ????lhoes - Long
		 * 
		 * --para numeros reais --
		 * float => menos exatidao
		 * double => dobro de precisao nas casas decimais quando comparado ao float
		 * 
		 */
		
		/*
		 * nota (semestral 1)
		 * nota (semestral 2)
		 * faltas (max 200)
		 * disciplina (nome da materia)
		 * media (calcular)
		 */
		
		float notaSem1 = Float.parseFloat(JOptionPane.showInputDialog("Digite suanota do primeiro semestre"));
		float notaSem2 = Float.parseFloat(JOptionPane.showInputDialog("Digite suanota do segundo semestre"));
		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas no ano"));
		String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
		float media = (notaSem1 + notaSem2) / 2;
		
		System.out.println(nomeDisciplina);
		//System.out.println(notaSem1);
		//System.out.println(notaSem2);
		System.out.println(faltas);
		System.out.println(media);
		//cast: conversao entre tipos compativeis
		float notaSem3= (float) 7.45;
		int teste = (int) notaSem3;
		
		
		
		
		
	}

}
