package ordenarLista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exec {

	public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(10,25,3,99,47));
        List<Integer> ordenada = ordenarLista(lista);

        System.out.println("Lista ordenada: " + ordenada);
    }
	
	public static List<Integer> ordenarLista(List<Integer> lista) {
        // Convertendo para array
        Integer[] array = lista.toArray(new Integer[0]);
        

        // Bubble sort
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Trocar
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        

        // Converter de volta para lista
        return new ArrayList<>(Arrays.asList(array));
    }

}
