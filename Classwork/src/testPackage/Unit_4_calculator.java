package testPackage;
import java.util.Scanner;
public class Unit_4_calculator {
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		System.out.println("whats your name");
		String s1 = console.nextLine();
		System.out.println("whats your age");
		String s2 = console.nextLine();
		System.out.println("Hello " + s1 + ". You are " + s2 + " years old.");
		
	}
}
