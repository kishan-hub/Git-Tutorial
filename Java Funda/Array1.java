package com.kishan.app;
class Array1 
{
	public static void main(String[] args)throws NullPointerException
	{
	   Number[] number = new Number[10];
        
	   number[0]=new Integer(10);
	   number[1]=new Double(15.4);
	   number[2]=new Float(12.4f);
	   number[3]=new Long(453);
	

	    for(Number num:number)
		{  
			try
			{
			   System.out.println(num);	 
			
		    }
			catch(Throwable e)
			{
				throw e;
			}
		}
	}
}
