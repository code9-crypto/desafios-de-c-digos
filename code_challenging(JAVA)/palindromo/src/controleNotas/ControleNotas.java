package controleNotas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControleNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de alunos: ");
		int qtdAlu = sc.nextInt();
		sc.nextLine();
		
		//Lista dos alunos
		Map<String, Double> alunos = new HashMap<>();
		
		String resp;
		do {		
			for( int i = 1; i <= qtdAlu; i++ ) {
				System.out.print("Digite o nome do aluno: ");
				String nome = sc.nextLine();
				System.out.print("Digite a nota do aluno: ");
				double nota = sc.nextDouble();
				sc.nextLine();
				alunos.put(nome, nota);
			}
			System.out.print("Quer adiciona mais alunos: ");
			resp = sc.nextLine();
			if( resp.equals("s") || resp.equals("S") ) {
				System.out.print("Quantos alunos mais? ");
				qtdAlu = sc.nextInt();
				sc.nextLine();
			}
		}while( resp.equals("s") || resp.equals("S") );
		
		//variáveis que serão usadas posteriormente
		double maiorNota = 0.0;
		String nomeMaior = "";
		double menorNota = Double.MAX_VALUE;
		String nomeMenor = "";
		double mediaTurma = 0.0;
		double soma = 0.0;
		
		//Percorrendo a lista dos alunos
		for( Map.Entry<String, Double> entry : alunos.entrySet() ) {
			String nome = entry.getKey();
			Double nota = entry.getValue();
			
			//Verificando maior nota
			if( nota > maiorNota ) {
				maiorNota = nota;
				nomeMaior = nome;
			}
			
			//Verificando menor nota			
			if( nota < menorNota ) {
				menorNota = nota;
				nomeMenor = nome;
			}
			
			//Fazendo o cálculo da média
			soma += nota;
			mediaTurma = soma / alunos.size();
		}
		
		System.out.println("\n======RESULTADOS======");
		System.out.printf("Aluno(a) %s teve maior nota: (%.2f)%n", nomeMaior, maiorNota);
		System.out.printf("Aluno(a) %s teve menor nota: (%.2f)%n", nomeMenor, menorNota);
		System.out.printf("A média da turma foi: (%.2f)%n", mediaTurma);
		
		sc.close();
	}

}
