package testPackage;

public class Unit_4_reversingstring {
	public static void main(String args[])
	{
		System.out.println(printReverse("lol"));
	}
	public static String printReverse(String lol)
	{
	    String s = "";
	    for(int i = lol.length() - 1; i >= 0; i--)
	    {
	        s = s + lol.substring(i, i+1);
	    }
	    return s;
	}
}
