import java.util.Scanner;

public class MenorNumero {

	public static void main(String[] args) {
		int[] vect = {10, 5, 22, 1, 9};
		int menor = vect[0];
		for( int n : vect ) {
			menor = n < menor ? n : menor;
		}
		System.out.println(menor);
	}

}
