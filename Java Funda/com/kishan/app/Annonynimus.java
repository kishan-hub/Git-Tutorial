package com.kishan.app;
class Annonynimus
{
	public static void main(String[]args)
	{
      int total=sum(new int []{10,20,30,40,50,60,70});
	  System.out.println(total);
	}

	public static int sum(int []array);
    {
	   int total=0;
	for(int i=0;i<array.length;i++)
	{
       total=total+array[i];
	}
	  return total;
   }

}


