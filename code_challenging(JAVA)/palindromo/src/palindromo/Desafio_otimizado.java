package palindromo;

import java.util.Scanner;

public class Desafio_otimizado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto = sc.nextLine();
        boolean retorno = isPalindrome(texto);
        System.out.println(retorno);
        sc.close(); // boa prática
    }

    public static boolean isPalindrome(String texto) {
        // Remover espaços e converter para minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        // StringBuilder.reverse() é mais eficiente que concatenar com +=.
        StringBuilder invertido = new StringBuilder(texto).reverse();

        return texto.equals(invertido.toString());
    }
    
//    replaceAll("\\s+", "") remove todos os espaços.
//
//    toLowerCase() resolve o problema de letras maiúsculas.
}