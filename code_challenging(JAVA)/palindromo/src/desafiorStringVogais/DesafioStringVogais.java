package desafiorStringVogais;

import java.util.Scanner;

public class DesafioStringVogais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		
		
		//Contando quantas vogais a tem na frase
		int countVog = 0;
		for( char ltr : frase.replaceAll("\\s+", "").toLowerCase().toCharArray() ) {
			if( ltr == 'a' ) {
				countVog++;
			}
		}
		
		
		
		//invertendo a ordem da frase
		StringBuilder frsInvertida = new StringBuilder();
		String[] frs = frase.split("\\s+");
		for( int i = frs.length-1; i >= 0; i-- ) {
			frsInvertida.append(frs[i]).append(" ");
		}
		
		//mostrando os resultados
		System.out.println();
		System.out.println("Quantidade de vogais 'a' é: " + countVog);		
		System.out.println("Frase em maiúsculo : " + frase.toUpperCase().trim());
		System.out.println("Frase invertida: " + frsInvertida);
	}

}
