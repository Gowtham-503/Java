import java.util.Scanner;

public class SemeterMarksApp {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
			int a = read.nextInt();
			int b = read.nextInt();
			int c = read.nextInt();
			int d = read.nextInt();
			int e = read.nextInt();
			int f = read.nextInt();
			int g = read.nextInt();
			int h = read.nextInt();
			SemesterMarks s = new SemesterMarks();
			System.out.printf("%.2f",s.calculateAverage(a,b,c,d,e,f,g,h));
			
			
}
}
