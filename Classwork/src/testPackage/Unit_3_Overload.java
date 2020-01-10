package testPackage;

public class Unit_3_Overload {
	public static void main(String args[])
	{
		System.out.println(addNum(1));
		System.out.println(addNum(1.1));
		System.out.println(addNum("1"));
	}
	
	public static int addNum(int x)
	{
		return x + 4;
	}
	
	public static double addNum(double x)
	{
		return x + 5;
	}
	
	public static String addNum(String x)
	{
		return x + 6;
	}
	
}
