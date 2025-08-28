package contaPalavrasFrase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContaPalavrasFrase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        // Normalizando a frase: tudo minúsculo e retirando pontuações simples
        frase = frase.toLowerCase().replaceAll("[^a-zà-ú0-9 ]", "");
        String[] palavras = frase.split("\\s+");

        // Criando o mapa para contar as ocorrências
        Map<String, Integer> contador = new HashMap<>();

        for (String palavra : palavras) {
            contador.put(palavra, contador.getOrDefault(palavra, 0) + 1);
        }

        // Encontrar a palavra mais repetida
        String maisRepetida = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            if (entry.getValue() > max) {
                maisRepetida = entry.getKey();
                max = entry.getValue();
            }
        }

        // Exibindo resultados
        System.out.println("\nContagem de palavras:");
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nA palavra mais repetida foi \"" + maisRepetida + "\" com " + max + " ocorrência(s).");

        sc.close();
    }
}
