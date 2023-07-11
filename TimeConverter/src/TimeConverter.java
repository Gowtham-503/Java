import java.util.Scanner;

public class TimeConverter {
	public static double convertToHours(int minutes)
	{
		return minutes/60.0;
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int minutes = read.nextInt();
		System.out.println(convertToHours(minutes));
		
		read.close();
	}
}
