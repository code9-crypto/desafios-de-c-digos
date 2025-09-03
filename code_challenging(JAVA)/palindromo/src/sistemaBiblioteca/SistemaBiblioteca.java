package sistemaBiblioteca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SistemaBiblioteca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> livros = new HashMap<>();
		
		//solicitando usuário a quantidade de livros
		System.out.print("quantos livros serão inseridos: ");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		//inserindo os dados na lista de livros
		for( int i = 1; i <= qtd; i++ ) {
			System.out.print("Título do livro: ");
			String titulo = sc.nextLine();
			System.out.print("Autor do livro: ");
			String autor = sc.nextLine();
			System.out.print("Ano de publicação do livro: ");
			int ano = sc.nextInt();
			sc.nextLine();
			livros.put(titulo, ano);
		}
		
		//Verificando o livro mais antigo, mais recente e a média dos anos
		int anoAntigo = Integer.MAX_VALUE;
		String ttAntigo = "";
		int anoRecente = 0;
		String ttRecente = "";
		int mediaAnos = 0;
		int soma = 0;
		 
		for( Map.Entry<String, Integer> lv : livros.entrySet() ) {
			String titulo = lv.getKey();
			int ano = lv.getValue();
			
			//Mais antigo
			if( ano < anoAntigo) {
				anoAntigo = ano;
				ttAntigo = titulo;
			}
			
			//Mais recente
			if( ano > anoRecente ) {
				anoRecente = ano;
				ttRecente = titulo;
			}
			
			//Somando os anos para depois tirar a média
			soma += ano;
		}
		
		//Tirando a média
		mediaAnos = soma / livros.size();
		
		//Lista do Resultado
		System.out.println("======RESULTADO======");
		System.out.printf("Livro mais antigo é %s do ano %s%n", ttAntigo, anoAntigo);
		System.out.printf("Livro mais recente é %s do ano %s%n", ttRecente, anoRecente);
		System.out.printf("A média é %s", mediaAnos);
	}

}
