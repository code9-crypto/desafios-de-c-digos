package serpro;

import java.util.ArrayList;
import java.util.List;

public class java {

	public static void main(String args[]) { 
		 ArrayList<String> lista = new ArrayList<>(); 
		 lista.add("VERDE"); 
		 lista.add("AZUL"); 
		 lista.add("VERMELHO"); 
		 lista.add("AMARELO"); 
		 lista.add("CINZA"); 
		 
		 lista.remove(2);
		 System.out.println("Lista após exclusão: " + lista); 
		 // Insira na linha imediatamente a seguir a linha de código que atenda ao requisito 
		 
		 lista.sort((a, b) -> a.compareTo(b));
		 
		 System.out.println("Lista após da ordenação: " + lista); 
		 alterar(lista,2,"BRANCO"); 
	}
		
	public static void alterar(List<String> lista, int num, String cor) {
		lista.remove(num);
		lista.add(num, cor); //adicionando um elemento naquele posição específica
		System.out.println("Lista após a atualização: " + lista);
	}
	

}
