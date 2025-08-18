package contaPalavras;

import java.util.Scanner;

public class ContaPalavras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		contaPalavras(frase);
	}
	
	public static void contaPalavras(String frase) {
		String[] texto = frase.trim().split(" ");
		System.out.println("A frase possui " + texto.length + " palavras");
	}

}
