import java.util.*;

public class EuclideanGCD {
	
	

	public static void main(String[] args) {
		System.out.println(10%6);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value for a: ");
		double a = scanner.nextDouble();
		System.out.println("Enter a value for b: ");
		double b = scanner.nextDouble();
		scanner.close();
		gcd(a, b);
	}
	
	
	public static void gcd(double a, double b){
		if(b == 0)
			System.out.println(a);
		else
			gcd(b, a%b);
	}
	
	

}
