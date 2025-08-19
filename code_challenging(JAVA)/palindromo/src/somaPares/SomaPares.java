package somaPares;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite números separados por espaço: ");
		String numeros = sc.nextLine(); //recebendo o valor do usuário
		
		//recortando a string por espaço e colocando num array/vetor
		String[] vectInt = numeros.split(" ");
		
		//criando a lista de Inteiros
		List<Integer> valores = new ArrayList<>();
		
		//adicionando cada valor do array na lista de inteiros - junto com o parseInt
		for( String i : vectInt ) {
			valores.add(Integer.parseInt(i));
		}
		
		//Filtrando os números pares, já fazendo o calcúlo desses números e atrelando o resultado a variável
		int sum = valores.stream().filter(y -> y % 2 == 0).reduce(0, (a,b) -> a + b);
		
		System.out.println("A soma dos números pares é: " + sum);
	}

}
