package testPackage;

public class unit3_physicsprob {
	public static void main(String args[])
	{
		System.out.print("you've travelled " + calc(1.0, 1.0 ,1.0 ,1.0 ) + " miles");
	}
	public static double calc(double s0, double v0, double t, double a)
	{
		return s0 + (v0*t) + (a*t*t/2);
	}
}
