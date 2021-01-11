package br.com.universidade.aplicacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Curso;
import br.com.universidade.modelo.Professor;
import br.com.universidade.modelo.Turma;
import br.com.universidade.modelo.Unidade;
import br.com.universidade.modelo.util.Magica;

public class AplicacaoTurma {

	public static void main(String[] args) {

		Turma turma = new Turma(
				Magica.s("turma"),
				Magica.s("periodo"),
				Magica.s("sala"),
				new Aluno(
					Magica.i("RM"),
					Magica.s("fone"),
					Magica.s("Nome"),
					Magica.b("Está ativo?")
						),
				new Professor(
					Magica.s("Nome"),
					Magica.f("Valor hora"),
					Magica.s("Formacao"),
					Magica.s("Area"),
					Magica.s("E-mail")
						),
				new Curso(
						Magica.s("Descricao"),
						Magica.i("Carga horaria"),
						Magica.f("Valor curso"),
						new Unidade(
								Magica.s("Nome"),
								Magica.s("Bairro"),
								Magica.s("Telefone")
								)
						)
				);
				
			System.out.println(turma.getResumo());
			System.out.println(turma.getProfessor().getSaudacao());
			System.out.println(turma.getProfessor().calcularSalario(100));
			System.out.println(turma.getAluno().getSaudacao());	
			System.out.println(turma.getCurso().getMensalidade());
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
