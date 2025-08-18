package contaPalavras;

import java.util.Scanner;

public class ContaPalavras_Melhorado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        
        int total = contaPalavras(frase);
        System.out.println("A frase possui " + total + " palavras");
        
        sc.close();
    }
    
    public static int contaPalavras(String frase) {
        String[] texto = frase.trim().split("\\s+"); //A expressão regular para retirar os espaços entre as palavras
        return texto.length;
    }
}
