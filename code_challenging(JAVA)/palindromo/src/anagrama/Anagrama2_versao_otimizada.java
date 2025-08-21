package anagrama;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama2_versao_otimizada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1ª palavra: ");
        String priPalavra = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        System.out.print("Digite a 2ª palavra: ");
        String segPalavra = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        // Transforma em array de caracteres
        char[] arr1 = priPalavra.toCharArray();
        char[] arr2 = segPalavra.toCharArray();

        // Ordena os arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compara
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("As palavras são anagramas!");
        } else {
            System.out.println("Não são anagramas.");
        }

        sc.close();
    }
}
