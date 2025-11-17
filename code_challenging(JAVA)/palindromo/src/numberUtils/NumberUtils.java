package numberUtils;

public class NumberUtils {

	public static void main(String[] args) {
		
		String numero = "8";
		
		int digits = numero.split("\\s+").length;
		
		String[] nums = numero.split("\\s+");
		
		int total = 0;
		
		for( String n : nums ) {
			total += Math.pow(Integer.parseInt(n), digits);
		}
		
		System.out.println(total == Integer.parseInt(numero));

	}

}
