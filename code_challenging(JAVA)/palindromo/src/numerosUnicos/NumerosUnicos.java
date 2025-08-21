package numerosUnicos;

import java.util.*;

public class NumerosUnicos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a lista de números: ");
        String nums = sc.nextLine();

        // Transforma a string em lista de números
        String[] arr = nums.split("\\s+");

        // Usando um Map para contar as ocorrências
        Map<String, Integer> contador = new LinkedHashMap<>();
        for (String n : arr) {
            contador.put(n, contador.getOrDefault(n, 0) + 1);
        }

        // Pegando apenas os números que aparecem uma vez
        List<String> unicos = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            if (entry.getValue() == 1) {
                unicos.add(entry.getKey());
            }
        }

        System.out.println("Números únicos: " + unicos);
        sc.close();
    }
}
