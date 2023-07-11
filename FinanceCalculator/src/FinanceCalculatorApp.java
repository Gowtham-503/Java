import java.util.Scanner;

public class FinanceCalculatorApp {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	double principal = read.nextDouble();
	
	double rate = read.nextDouble();
	
	double time = read.nextDouble();
	
	FinanceCalculator f = new FinanceCalculator();
	System.out.printf("%.2f",f.calculateSimpleInterest(principal,rate,time));
	read.close();
}
}
