package maiorNumero;

public class Exec {

	public static void main(String[] args) {
        int[] numeros = {-5, -2, -10};
        int maior = encontrarMaiorNumero(numeros);
        System.out.println("Maior número: " + maior);
    }
	
	public static int encontrarMaiorNumero(int[] array) {
	    // Verifica se o array está vazio (boa prática)
	    if (array.length == 0) {
	        throw new IllegalArgumentException("O array está vazio.");
	    }

	    // Assume que o primeiro número é o maior inicialmente
	    int maior = array[0];

	    // Começa a partir do segundo elemento
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] > maior) {
	            maior = array[i];
	        }
	    }

	    return maior;
	}

}
