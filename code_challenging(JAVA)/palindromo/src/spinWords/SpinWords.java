package spinWords;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpinWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma frase: ");		
		
		System.out.println(Arrays.stream(sc.nextLine().split(" ")).map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i).collect(Collectors.joining(" ")));

	}

}
