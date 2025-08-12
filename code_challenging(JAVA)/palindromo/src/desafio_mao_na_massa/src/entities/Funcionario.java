package entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa{

	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private BigDecimal salario;
	private String funcao;
	
	public Funcionario(){
		super();
	}

	public Funcionario(BigDecimal salario, String funcao, String nome, LocalDate data_nascimento) {	
		super(nome, data_nascimento);
		this.salario = salario;
		this.funcao = funcao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String toString() {
		return "Nome do funcionário: " + super.getNome() + " Data de Nascimento: " + super.getData_nascimento().format(fmt) + " Salário: " + String.format("%2$,3.2f %1$s", "",salario) + 
				" Função: " + funcao;
	}
}
