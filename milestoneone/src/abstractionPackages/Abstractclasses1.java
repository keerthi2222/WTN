package abstractionPackages;
abstract class Compartment
{
    abstract void notice();
}
class Firstclass extends Compartment
{
	void notice()
	{
		System.out.println("Its FirstClass");
	}
}

class Ladies extends Compartment
{
	void notice()
	{
		System.out.println("Its Ladies Compartment");
		
	}
}
class general extends Compartment
{
	void notice()
	{
		System.out.println("Its General Compartment");
	}
}
class Luggage extends Compartment
{
	void notice()
	{
		System.out.println("Its Luggage");
	}
}


