import java.util.Scanner;

public class CubeMystery {
public static int cubeNumber(int num)
{
	return num*num*num;
}
public static void main(String[] args) {
	{
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		System.out.println(cubeNumber(a));
	}
}
}