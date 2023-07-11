package saturdayMarathon;

public class ArithmeticOperations {
	public static int subtract(int num1,int num2)
	{
		return num1-num2;
	}
	public static int multiplication(int num1,int num2)
	{
		return num2*num1;
	}
	public static double division(int num1,int num2)
	{
		return num1/num2;
	}
	public static int remainder(int num1,int num2)
	{
		return num1%num2;
	}
	public static void main(String[] args)
	{
		int res = subtract(20,5);
		System.out.println(res);
		int res1 = multiplication(4,5);
		System.out.println(res1);
		double res2= division(20,4);
		System.out.printf("%.2f\n",res2);
		int res3 = remainder(10,3);
		System.out.println(res3);
		
		
	}

}
