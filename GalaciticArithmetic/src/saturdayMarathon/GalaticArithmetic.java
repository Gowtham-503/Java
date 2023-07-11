package saturdayMarathon;

import java.util.Scanner;

public class GalaticArithmetic {
	public static long galacticAddition(long num, long num1)
	{
		return num+num1;
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		long a = read.nextLong();
		long b = read.nextLong();
		long res = galacticAddition(a,b);
		System.out.println(res);
		
		}
}
