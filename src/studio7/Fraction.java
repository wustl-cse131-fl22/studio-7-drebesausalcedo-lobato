package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int initnum, int initden) {
		numerator= initnum;
		denominator= initden;
	
	}
	public String add(int newnum,int newden)
	{
		int crossnum=(numerator* newden)+ (newnum*denominator);
		int crossden= denominator*newden;
		String sum= crossnum+"/" + crossden;
		return sum;
	}
	public String times(int newnum,int newden)
	{
		int crossnum=(numerator*newnum);
		int crossden= denominator*newden;
		String product= crossnum+"/" + crossden;
		return product;
	}
	public String recip()
	{
		int one= numerator;
		int two= denominator;
		String flip= two+"/"+ one;
		return flip;
	}
	public String simp()
	{
		int p=numerator;
		int q= denominator;
		while (p!=0)
		{
			int temp= q;
			q= p% q;
			p= temp;
		}
		int rednum= numerator/p;
		int redden= denominator/p;
		String simplify= rednum+"/"+ redden;
		return simplify;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
