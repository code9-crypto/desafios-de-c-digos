package sistemaNotas;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
	private String nome;
	private List<Integer> notas = new ArrayList<>();
	private List<String> disciplinas = new ArrayList<>();
	
	public Alunos() {}

	public Alunos(String nome, List<Integer> notas, List<String> disciplinas) {		
		this.nome = nome;
		this.notas = notas;
		this.disciplinas = disciplinas;
	}	

	public List<Integer> getNotas() {
		return notas;
	}

	public void setNotas(List<Integer> notas) {
		this.notas = notas;
	}

	public List<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<String> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
