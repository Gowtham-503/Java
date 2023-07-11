import java.util.Scanner;

public class HeightConverterApp {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	double a = read.nextDouble();
	
	HeightConverter h = new HeightConverter();
	System.out.printf("%.2f",h.convertInchesToFeet(a));
	
	read.close();
	
}
}
