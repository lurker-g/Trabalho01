package InstituicaoTi.geral.turma.Pessoa;

import InstituicaoTi.geral.BaseInstituicaoTi;

public class Pessoa {
	private String email;
	private String nome;
	private int codigo;
	private BaseInstituicaoTi curso;
	
	public BaseInstituicaoTi getCurso() {
		return curso;
	}
	public void setCurso(BaseInstituicaoTi curso) {
		this.curso = curso;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
