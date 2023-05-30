package Encapsulation;
class Demo
{
private int a=17;
public int getA()
{
	return a;
}
public void setA(int a)
{
	this.a=a;
}}
public class Sample 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		int x=d.getA();
System.out.println(x);
d.setA(48);
System.out.println(d.getA());
	}
}
