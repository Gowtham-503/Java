import java.util.Scanner;

public class PlanetExplorerApp {
 public static void main(String[] args) {
	Scanner read  = new Scanner(System.in);
	double d = read.nextDouble();
	PlanetExplorer p = new PlanetExplorer();
	System.out.printf("%.2f",p.calculateSurfaceArea(d));
	read.close();
}
}