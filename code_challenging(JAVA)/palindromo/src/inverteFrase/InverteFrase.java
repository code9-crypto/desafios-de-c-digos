package inverteFrase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InverteFrase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a frase: ");
		String[] frase = sc.nextLine().trim().replaceAll("\\s+", " ").split("\\s+");
		String fraseInvertido = "";
		for( int i = frase.length - 1; i >= 0;  i-- ) {
			fraseInvertido += frase[i] + " ";
		}
		
		System.out.println(fraseInvertido);
	}

}
