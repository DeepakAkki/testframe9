package ExceptionTopic;

public class Sample
{
	public static void main(String[] args) 
	{
		System.out.println("starts");
		try
		{
			int a=98/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println("handeled");
		}
		System.out.println("ends");
	}
}
