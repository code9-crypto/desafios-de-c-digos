package palavraLong;

import java.util.Scanner;

public class PalavraLonga {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		String[] palavras = frase.split("\\s+");
		int maior = palavras[0].length(); //assume que a primeira palavra é a maior
		String plv = palavras[0]; //o texto da plavra
		for( String palavra : palavras ) {
			if( palavra.length() > maior ) { //aqui verifica se o tamnho 
				maior = palavra.length();
				plv = palavra;
			}
		}
		System.out.println("A palavra mais longa é: " + plv);
		sc.close();
	}

}
