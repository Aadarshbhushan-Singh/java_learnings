package com.company;
class outerClass
{
	public void show()
	{
		System.out.println("This is outerClass.");
	}
}
public class class_93_anonymous_inner_class {
	public static void main(String[] args)
	{
		outerClass obj=new outerClass()
				{
					public void show()
					{
						System.out.println("This is anonymous class.");
					}
				};
		obj.show();
	}
}
