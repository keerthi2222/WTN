package oopsinheritance;

public class Fruit 
{
	String Name;
	String taste;
	String size;
	Fruit(String n,String t,String s)
	{
		Name=n;
		taste=t;
		size=s;
	}
	void eat()
	{
		System.out.println(Name+" "+taste);
	}

}
class Apple extends Fruit
{
	Apple(String n,String t,String s)
	{
		super(n,t,s);
	}
	void eat()
	{
		System.out.println(Name+" "+taste);
	}
}
class orange extends Fruit
{
	orange(String n,String t,String s)
	{
		super(n,t,s);
	}
	void eat()
	{
		System.out.println(Name+" "+taste);
	}
}

