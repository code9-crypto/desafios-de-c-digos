package numberUtils;

public class NumberUtils {

	public static void main(String[] args) {
		
		String n = "153";		
		String[] numero = n.split("");		
		int result = 0;
		
		for( String num : numero ){
			result += (int) Math.pow(Integer.parseInt(num), n.length()); 
		}
		
		System.out.println(result == Integer.parseInt(n) ? n + " is narcissistic" : n + " is not narcissistic");
	}

}
