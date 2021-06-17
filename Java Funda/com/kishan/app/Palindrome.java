package com.kishan.app;
class Palindrome 
{
	public static void main(String[] args) 
	{
		  String p=palindrome(122231);
 
	    	System.out.println(p);
	}

	public static String palindrome(int no)
	{
		 String str=null;
		    int rev=0,temp,d;
                 if(no>0)
		         {
				     temp = no;
					 while(temp !=0)
					{
						 d=temp%10;
						 rev=rev*10 +d;
						 temp=temp/10;
				   }
				
				  if(rev == no)
					{
					  str = no+" is palidrome no";
					}
					else
					{
						str= no+"  is not a palindrome no";
					}
				 }
					return str;
	}
	
}
