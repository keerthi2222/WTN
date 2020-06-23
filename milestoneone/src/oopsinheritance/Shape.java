package oopsinheritance;

public class Shape 
{
	void draw()
	{
		System.out.println("Drawing Shape");
	}
 void erase()
 {
	 System.out.println("Erasing Shape");
 }
}
class circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing circle");
	}
	void erase()
	{
		System.out.println("Erasing circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class square extends Shape
{
	void draw()
	{
		System.out.println("Drawing square");
	}
	void erase()
	{
		System.out.println("Erasing square");
	}
}
