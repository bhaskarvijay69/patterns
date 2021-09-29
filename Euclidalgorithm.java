public class Euclidalgorithm
{
int r;
private static int euclid(int m,int n)
	{
	 if(n==0)
	 return  m;
	else
	return euclid(n,m%n);
	}
public static void main(String args[])
	{
	 Euclidalgorithm e=new Euclidalgorithm();
	System.out.println("gcd of two nubers is:"+e.euclid(36,48));
	}

}
