import java.util.Scanner;

public class StringJoiner {

	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String a = read.next();
		String b = read.next();
		String res = joinStrings(a,b);
		System.out.println(res);
	}
}
