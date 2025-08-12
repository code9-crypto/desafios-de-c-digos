package contaVogais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class contaVogais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String texto = sc.nextLine();
		contaVogais(texto);
	}

	public static void contaVogais(String txt) {
		int counter = 0;
		char[] vogais = { 'a', 'e', 'i', 'o', 'u', 'ã', 'õ' };
		//String[] arrLetras = txt.split("");
		//Arrays.sort(arrLetras);
		//System.out.println(arrLetras);
		char[] arrLetras = txt.toCharArray();
		for(char ltr : arrLetras) {
			for( char v : vogais ) {
				if( ltr == v ) {
					counter++;					
				}
			}
		}
		System.out.println("O total de vogais na palavra " + txt +" é de: " + counter);
	}

}
