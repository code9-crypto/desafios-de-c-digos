package palindromo;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String texto = sc.nextLine();
		boolean retorno = isPalindrome(texto);
		System.out.println(retorno);
	}
	
	public static boolean isPalindrome(String texto) {		
		String resp = "";
		char[] letras = texto.toCharArray();
		for( int i=letras.length-1; i>=0; i-- ) {
			resp += letras[i];
		}
		if( texto.equals(resp) ) {
			return true;
		}else {
			return false;
		}
	}

}
