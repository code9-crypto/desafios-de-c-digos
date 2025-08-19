package maiorNumLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaiorLista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite os números separados por espaço: ");
		String nums = sc.nextLine();
		//aqui separamos os valores(com o separador de espaço) e armezanamos num vetor de Strings
		String[] vectInt = nums.split(" ");
		//Cria a lista e logo abaixo adiciona cada elemento do array à lista - fazendo o parse em cada item
		List<Integer> numeros = new ArrayList<>();
		for( String c : vectInt ) {
			numeros.add(Integer.parseInt(c));
		}
		
		//numeros.sort((a,b) -> -a.compareTo(b));	//fazendo a inversão da lista do maior para o maior
		int maior = Collections.max(numeros); // procura pelo maior valor e insere na variavel
		System.out.print(maior);
	}

}
