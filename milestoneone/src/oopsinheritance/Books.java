package oopsinheritance;

public class Books 
{
	public static void main(String args[])
	{
		Book b=new Book("Digital System Design");
		Author a=new Author("maya","maya14@rnd.ac.in",'f');
		b.setprice();
		b.setqtyInstock();
		System.out.println("Name of the book is :"+b.getname1());
		System.out.println("price of the book is :"+b.getprice());
		System.out.println("stock is:"+b.getqtyInstock());
	
	}

}
