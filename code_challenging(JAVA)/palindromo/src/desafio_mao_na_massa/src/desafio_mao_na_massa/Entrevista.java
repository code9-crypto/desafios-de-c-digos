package desafio_mao_na_massa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Entrevista {

	public static void main(String[] args) {
		//CONFIGURAÇÃO INICIAL
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Funcionario> func = new ArrayList<>();
		String resp = "";
		int n = 10;
		
		//INSERÇÃO DOS DADOS
		do {
			for (int i = 0; i < n; i++) {
				try {
					System.out.print("Digite o nome do funcionario: ");
					String nome = sc.nextLine();
					System.out.print("Digite a data de nascimento: ");
					LocalDate dataNascimento = LocalDate.parse(sc.nextLine(), fmt);
					System.out.print("Digite o salario: ");
					BigDecimal salario = sc.nextBigDecimal();
					sc.nextLine();
					System.out.print("Digite a função do funcionário: ");
					String funcao = sc.nextLine();					
					func.add(new Funcionario(salario, funcao, nome, dataNascimento));
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			//PERGUNTANDO SE DESEJA INSERIR MAIS FUNCIONÁRIOS
			System.out.println();
			System.out.print("Deseja incluir outro funcionário?(s(sim) ou n(não)): ");
			resp = sc.nextLine().toLowerCase();			
			if( !resp.equals("s") && !resp.equals("n") ) {
				do{
					System.out.print("Resposta inválida, por favor digite s para sim ou n para não: ");
					resp = sc.nextLine();
				}while( !resp.equals("s") && !resp.equals("n") );
			}
			n = 1;	
		} while (resp.equals("s") || resp.equals("S"));
		
		//REMOVENDO O FUNCIONÁRIO JOÃO DA LISTA
		func.removeIf(f -> f.getNome().equals("João"));
		System.out.println();
		
		//EXIBINDO A LISTA DOS FUNCIONÁRIOS COM TODAS INFORMAÇÕES
		System.out.println("EXIBINDO INFORMAÇÕES DOS FUNCIONÁRIOS");
		func.forEach(System.out::println);
		
		//AUMENTO DE 10% NO SALÁRIO
		for( Funcionario f : func ) {
			BigDecimal valor = f.getSalario();
			BigDecimal mult = valor.multiply(new BigDecimal(0.1));
			BigDecimal total = mult.add(valor);
			f.setSalario(total);
		}
		
		System.out.println();		
		//AGRUPANDO OS FUNCIONÁRIO PELA FUNÇÃO MAP COM A CHAVE FUNÇÃO		
		Map<String, String> grupoFunc = new HashMap<>();
		for( Funcionario f : func ) {			
			grupoFunc.put(f.getFuncao(), f.toString());
		}
		
		//EXIBINDO OS FUNCIONÁRIOS AGRUPADOS PELA FUNÇÃO MAP E COM O VALOR DE 10% ADICIONADO AO SALÁRIO
		System.out.println("INFORMAÇÕES AGRUPADAS PELA FUNÇÃO MAP E JÁ COM OS 10% APLICADOS AO SALARIO");
		for( String s : grupoFunc.values() ) {
			System.out.println(s);
		}		
		System.out.println();
		
		//EXIBINDO LISTA DE FUNCIONARIOS QUE FAZEM ANIVERSARIO NO MÊS 10 E 12
		System.out.println("ANIVERSARIANTES NO MÊS 10 E 12");
		List<Funcionario> anivers = func.stream().filter(f -> f.getData_nascimento().getMonth().getValue() == 10 || f.getData_nascimento().getMonth().getValue() == 12).collect(Collectors.toList());
		anivers.forEach(System.out::println);
		System.out.println();
		
		//EXIBINDO O FUNCIONARIO MAIS VELHO E SEUS ATRIBUTOS
		System.out.println("FUNCIONARIO MAIS VELHO");
		func.sort((a, b) -> a.getData_nascimento().compareTo(b.getData_nascimento()));
		int mesFunc = func.get(0).getData_nascimento().getMonthValue();
		int mesAtual = LocalDate.now().getMonthValue();
		int maisUmAno = 0;
		if( mesFunc > mesAtual ) {
			maisUmAno = 1;
		}
		System.out.println("Nome: " + func.get(0).getNome() + " - Idade: " + ((LocalDate.now().getYear() - func.get(0).getData_nascimento().getYear() + maisUmAno)) + " anos");		
		System.out.println();
		
		//EXIBINDO A LISTA DE FUNCIONÁRIOS POR ORDEM ALFABÉTICA
		System.out.println("LISTA DE FUNCIONÁRIOS POR ORDEM ALFABÉTICA");
		func.sort((a, b) -> a.getNome().compareTo(b.getNome()));
		func.forEach(System.out::println);		
		System.out.println("");
		
		//EXIBINDO O TOTAL DOS SALARIOS DOS FUNCIONÁRIOS
		System.out.println("EXIBINDO O TOTAL DOS SALARIOS DOS FUNCIONÁRIOS");
		BigDecimal val = new BigDecimal(0);
		for( Funcionario f : func ) {
			val = val.add(f.getSalario());
		}
		System.out.println("Total dos salários dos funcionários: " + String.format("%2$,3.2f %1$s", "",val));
		System.out.println();
		
		//EXIBINDO QUANTOS SALÁRIOS MÍNIMOS GANHA CADA FUNCIONÁRIO
		System.out.println("EXIBINDO QUANTOS SALÁRIOS MÍNIMOS GANHA CADA FUNCIONÁRIO");
		int salMinimo = new BigDecimal(1212.00).intValue();
		for( Funcionario f : func ) {
			double salario =  f.getSalario().doubleValue();
			int qtdSalMin = (int) (salario / salMinimo);
			System.out.println("Funcionário(a): " + f.getNome() + " - Recebe: " + qtdSalMin + (qtdSalMin > 1 ?  " salários mínimos" : " salário mínimo"));
		}
		sc.close();
	}

}
