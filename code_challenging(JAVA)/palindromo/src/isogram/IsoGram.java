package isogram;

import java.util.HashMap;
import java.util.Map;

public class IsoGram {

	public static void main(String[] args) {
		
		String palavra = "";
		
		boolean retorno = false;
		
		if( !palavra.isBlank() ) {		
			
			@SuppressWarnings("unchecked")
			String[] vectPlv = palavra.toLowerCase().split("");
			
			@SuppressWarnings("unchecked")
			Map<String, Integer> listaLe = new HashMap<String, Integer>();
			
			for( String v : vectPlv ) {
				//este comando faz com que se o valor não existe, então atribui o valor 0
				//mas se existir, atribui o valor +1
				listaLe.put(v, listaLe.getOrDefault(v, 0) + 1);
			}
			
			if( listaLe.containsValue(2) ) {
				retorno = false;
			}else if( listaLe.containsValue(1) ) {
				retorno = true;
			}
			
			System.out.println(retorno);
			
		} else {
			System.out.println(true);
		}

	}

}
