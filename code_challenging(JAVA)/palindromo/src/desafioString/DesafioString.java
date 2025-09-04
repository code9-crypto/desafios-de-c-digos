package desafioString;

import java.util.Scanner;

public class DesafioString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        // 1 - Contar as vogais
        String vogais = "aeiouéóêô";
        int countVog = 0;
        for (char ltr : frase.toLowerCase().toCharArray()) {
            if (vogais.indexOf(ltr) != -1) {
                countVog++;
            }
        }
        

        // 2 - Encontrar a palavra mais longa
        String palavraLonga = "";
        int qtdLtr = 0;
        String[] frs = frase.trim().toLowerCase().split("\\s+"); 
        for( String f : frs ) {
        	if( f.length() > qtdLtr ) {
        		qtdLtr = f.length();
        		palavraLonga = f;
        	}
        }

        // 3 - Inverter a frase
        StringBuilder fraseInvertida = new StringBuilder();
        for( int i = frs.length-1; i >= 0; i-- ) {
        	fraseInvertida.append(frs[i]).append(" ");
        }
        
        // 4 - Mostrar os resultados
        System.out.println("======== RESULTADOS ========");
        System.out.printf("A quantidade de vogais nesta frase é: %s%n", countVog);
        System.out.printf("A palavra mais longa é: %s%n", palavraLonga);
        System.out.printf("Frase invertida: %s", fraseInvertida.toString().trim());

        sc.close();

	}

}
