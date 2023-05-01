package com.tsnif.daysecond;

public class NestedElseDemo {
	public static void main(String[] args) {
		
		int a =10;
		int b =35;
		int c = 34;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greate");
			}
			else
			{
				System.out.println("C is greater");
			}
		}else
		{
			if (c>b)
			{
				System.out.println("C is greater");
			}
			else
			{
				System.out.println("B is greater");
			}
		}
	}

}
