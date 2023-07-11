import java.util.Scanner;

public class PowerOfSquares {
public static int squareNumber(int num)
{
	return num*num;
}
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int a = read.nextInt();
	System.out.println(squareNumber(a));
	read.close()
;	}
}
