package testPackage;

import java.util.Scanner;

public class arraysYay {
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("how many lines");
		int lines = Integer.parseInt(console.nextLine());
		String[] inputs = new String[lines];
		
		for(int i = 0; i < lines; i ++)
		{
			System.out.println("enter something");
			inputs[i] = console.nextLine();
		}
		
		
		for(int i = 0; i < lines; i ++)
		{
			System.out.println(inputs[i]);
		}
		System.out.println();
		
		for(int i = lines-1; i >= 0; i--)
		{
			System.out.println(inputs[i]);
		}
		System.out.println();
		
		for(int i = lines-1; i >= 0; i-=2)
		{
			System.out.println(inputs[i]);
		}

	}
}
