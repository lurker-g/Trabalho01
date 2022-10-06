package InstituicaoTi.geral.turma;

import InstituicaoTi.geral.turma.Pessoa.Aluno;
import InstituicaoTi.geral.turma.Pessoa.Professor;

public class Turma {
	private Professor professor;
	private Aluno aluno;
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
