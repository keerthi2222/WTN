package oopsinheritance;

public class Book 
{
	String name1;
	String author;
	double price;
	int qtyInstock;
	Book(String n1)
	{
		name1=n1;
	}
	void setqtyInstock()
	{
		qtyInstock=10;
	}
	void setprice()
	{
		price=150.0;
	}
	double getprice()
	{
		return price;
	}
	int getqtyInstock()
	{
		return qtyInstock;
	}
	String getname1()
	{
		return name1;
	}
	void getAuthor()
	{
		System.out.println("Author name is :+Author.name");
		System.out.println("Mail id is :+Author.email");
		System.out.println("Gender is :+Author.gender");
	}

}
