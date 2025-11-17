package bitCounting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BitCounting {

	public static void main(String[] args) {
		
		int numdig = 1234;
		
		//Comando para transformar inteiro em binario: Integer.toBinaryString(numdig)
		
		/*List<String> binario = Arrays.stream(Integer.toBinaryString(numdig).split("")).collect(Collectors.toList());
		
		System.out.println(binario.stream().filter(x -> x.equals("1")).collect(Collectors.toList()).size());*/
		
		System.out.println(Integer.bitCount(numdig)); //este conta apenas os bits ligados, ou seja, os números 1
		
		

	}

}
