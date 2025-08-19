package inverteTexto;

import java.util.Scanner;

public class InverterTexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o texto: ");
		String texto = sc.nextLine();
		StringBuilder txtRev = new StringBuilder(texto).reverse(); //aqui está invertendo a string
		System.out.println(txtRev);
	}

}
