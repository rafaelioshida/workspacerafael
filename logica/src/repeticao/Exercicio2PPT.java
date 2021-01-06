package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2PPT {

	public static void main(String[] args) {

		String escolaridade = "a";
		int medio = 0;
		int superior = 0;
		int pos = 0;
		
		do {
			escolaridade = JOptionPane.showInputDialog("Qual seu nivel de escolaridade, escolha entre medio/superior/pos?");
			if (escolaridade.contains("medio")==true) {
				medio = medio + 1;
			} else if (escolaridade.contains("superior")==true) {
				superior = superior + 1;
			} else if (escolaridade.contains("pos")==true) {
				pos = pos + 1;
			}
			
		}while (escolaridade.contains("medio")!=false || escolaridade.contains("superior")!=false || escolaridade.contains("pos")!=false );
		
			
		/*JOptionPane.showMessageDialog(null, "Médio:  " + medio);
		JOptionPane.showMessageDialog(null, "Superior: " + superior);
		JOptionPane.showMessageDialog(null, "Pos: " + pos);*/
		
		if (medio>superior && medio>pos) {
			//System.out.println(medio);
			escolaridade = "Medio";
		} else if (superior>pos && superior>medio) {
			//System.out.println(superior);
			escolaridade = "Superior";
		} else if (pos>medio && pos>superior) {
			//System.out.println(pos);
			escolaridade = "Pos";
			}
		JOptionPane.showMessageDialog(null, "A maior quantidade de escolaridade é: " + escolaridade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
