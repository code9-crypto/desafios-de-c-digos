package sistemaProduto;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getCurrencyInstance();//este objeto será usado para formatar valores
		
		//Pedindo ao usuário a quantidade de produtos
		System.out.print("Digite a quantidade de produtos: ");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		
		//Inserido os produtos na lista
		Map<String, Double> produtos = new HashMap<>();
		for( int i = 1; i <= qtd; i++ ) {
			System.out.print("Nome do produto: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			sc.nextLine();
			produtos.put(nome, preco);
		}
		
		
		//Variáveis necessárias para continuar o sistema
		double maisCaro = 0.0;
		String nomeCaro = "";
		double maisBarato = Double.MAX_VALUE;
		String nomeBarato = "";
		double media = 0.0;
		double soma = 0.0;
		
		
		//Verificando o produto mais caro, o mais barato e a média dos produtos		
		for( Map.Entry<String, Double> dados : produtos.entrySet() ) {
			String prod = dados.getKey();
			double preProd = dados.getValue();
			
			//Produto mais caro
			if( preProd > maisCaro ) {
				maisCaro = preProd;
				nomeCaro = prod;
			}
			
			//Produto mais barato
			if( preProd < maisBarato ) {
				maisBarato = preProd;
				nomeBarato = prod;
			}
			
			
			//Somando todos os valores para depois fazer a média
			soma += preProd;
		}
		
		//Calculando a média
		media = soma / produtos.size();		
		System.out.println();
		
		//Exibindo lista de forma mais legível
		System.out.println("Produto mais caro: " + nomeCaro + " => " + nf.format(maisCaro));
		System.out.println("Produto mais barato: " + nomeBarato + " => " + nf.format(maisBarato));
		System.out.printf("Valor médio do produto: ", nf.format(media));
		System.out.println();
		
		System.out.println("LISTA DOS PRODUTOS");
		for( Map.Entry<String, Double> lista : produtos.entrySet() ) {
			System.out.println(lista.getKey() + " => R$" + nf.format(lista.getValue()));
		}
		
		sc.close();
	}
}
