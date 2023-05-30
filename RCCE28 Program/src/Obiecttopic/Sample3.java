package Obiecttopic;

public class Sample3
{
public int hashCode()
{
	return 123;
}
	public static void main(String[] args) 
	{
		Sample3 s=new Sample3();
		System.out.println(s.hashCode());
		Sample3 s1=new Sample3();
		System.out.println(s1.hashCode());
	}
}