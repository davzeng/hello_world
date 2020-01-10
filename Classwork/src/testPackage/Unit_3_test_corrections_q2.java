package testPackage;

public class Unit_3_test_corrections_q2 {
	public static void main(String args[])
	{
		number_Triangle(5);
	}
	public static void number_Triangle(int height)
	{
		for(int i = height; i >= 1; i--)//loop 5 times; and decreases i each time
		{
			for(int h = 1; h <= i; h++)//loops i amount of times
			{
				System.out.print(h*i + " ");//writes on character and a space
			}
			System.out.println();//new line
		}
	}
}
