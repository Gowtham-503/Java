package journeyCalculator;

import java.util.Scanner;

public class JourneyApp {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double a = read.nextDouble();
		double b  = read.nextDouble();
		
		
		JournyCalculator1 jc = new JournyCalculator1();
		
		double res = jc.calculateDistance(a,b);
		System.out.printf("%.3f",res);
		}

}
