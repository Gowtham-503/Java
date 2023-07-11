import java.util.Scanner;

public class SecretMessageApp {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	char a = read.next().charAt(0);
	
	MessageDecoder d = new MessageDecoder();
		System.out.println(d.decodeCharacter(a));
		read.close();
}
}
