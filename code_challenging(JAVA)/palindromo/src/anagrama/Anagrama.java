package anagrama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a 1ª palavra: ");
		String priPalavra = sc.nextLine();
		List<String> arrPriPlv = new ArrayList<>(Arrays.asList(priPalavra.split("")));
		Collections.sort(arrPriPlv);
		
		System.out.print("Digite a 2ª palavra: ");
		String segPalavra = sc.nextLine();
		List<String> arrSegPlv = new ArrayList<>(Arrays.asList(segPalavra.split("")));
		Collections.sort(arrSegPlv);
		
		String textOriginal = "";
		for( String pPlv : arrPriPlv ) {
			textOriginal += pPlv;
		}
		
		String textInvertido = "";
		for( String sPlv : arrSegPlv ) {
			textInvertido += sPlv;
		}
		
		
		System.out.println(textOriginal.toString().equals(textInvertido.toString()) ? "As "
				+ "palavras são anagramas" : "Não são anagramas");
		sc.close();
	}

}
