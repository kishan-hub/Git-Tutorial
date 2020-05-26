package com.kishan.app;
class PrimeNo 
{
	public static boolean primeNo(int no)
	{
		  boolean flag=true;

		if(no>0)
		{
			for(int i=2;i<no/2;i++)
			{
			    if(no % 2==0)
				{
				  flag=false;
				  break;
				}
			}
		}
		return flag;

	}
	public static void main(String[] args) 
	{
		boolean flag= primeNo(11);
		if(flag == true)
		{
			System.out.println("This is The prime No");
		}
		else
		{
          System.out.println("This is not prime no");
		}
	}
}
