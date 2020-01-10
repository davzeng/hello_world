package testPackage;

public class Unit_3_lab 
	{
	public static void main(String[] args)
	{
		rect(10, 10);
	}
	public static void rect(int width, int height)
	{
		for(int i = 1; i <= height; i++)
		{
			for(int j = 1; j <= width; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
