package inverteFrase;

import java.util.Scanner;

public class InverteFrase_otimizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a frase: ");
        
        String[] frase = sc.nextLine().trim().replaceAll("\\s+", " ").split("\\s+");
        StringBuilder fraseInvertida = new StringBuilder();
        
        for (int i = frase.length - 1; i >= 0; i--) {
            fraseInvertida.append(frase[i]).append(" ");
        }

        System.out.println(fraseInvertida.toString().trim());
        sc.close();
    }
}
