package oopsinheritance;

public class Animal 
{
void eat()
{
	System.out.println("Eat");
}
void sleep()
{
	System.out.println("sleep");
}
}
class Bird extends Animal
{
	void fly()
	{
		System.out.println("Fly");
	}
}
