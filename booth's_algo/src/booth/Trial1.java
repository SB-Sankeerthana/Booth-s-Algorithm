package booth;

import java.util.Scanner;

public class Trial1 
{
	  int Qimg=0;
	  static int size=20;
	  
	  void input()
	  {
		  System.out.println("Enter two numbers for multiplication");
		  x=s.nextInt();
		  y=s.nextInt();
	  }
	  
	  
	 int count(int integer)
	  {
		int c=1;
		integer=Math.abs(integer);
		while(integer != 1)
		{
			c++;
			integer=integer/2;
		}
		return c+1;
	  }
	  
	  void check()
	  {
		  if(Math.abs(x)>=Math.abs(y))
		  size=count(x);
		  else
		  size=count(y);
	  }
	 
	  
	  
	  
	  int acc[]=new int[size];
	  int multiplier[]=new int[size];
	  int multiplicant[]=new int[size];
	  int mbar[]=new int[size];
	  int qbar[]=new int[size];
	  int x;
	  int y;
	  int i,j=0;
	  int r=0;
	  int no=-1;
	  int carrya[]=new int[size];
	  int carryb[]=new int[size];
	  Scanner s=new Scanner(System.in);
	 int bin[]=new int[size];
	 
	
	  void convert(int a)
	  {
		int rem, i=0;
		
		for(i=0;i<size;i++)
			bin[i]=0;
		i=0;
		while(a!=0)
		 {
			rem=a%2;
			bin[i]=rem;
			i++;
			a=a/2;
		 }
		
	  }
	  
	  void storex()
	  {
		  if(x<0)
		  {
			x=Math.abs(x);
			convert(x);
			for(i=size-1;i>=0;i--)
			{
				multiplicant[j]=bin[i];
			    j=j+1;
			}
			compx();
			for(i=0;i<size;i++)
				multiplicant[i]=mbar[i];
		  }
		  else
		  {
	      convert(x);
		  for(i=size-1;i>=0;i--)
			{
				multiplicant[j]=bin[i];
			    j=j+1;
			}
		  }
	  }
	 
	  
	  void storey()
	  {
		  if(y<0)
		  {
			y=Math.abs(y);
			convert(y);
			j=0;
			for(i=size-1;i>=0;i--)
			{
				multiplier[j]=bin[i];
			    j=j+1;
			}
			compy();
			for(i=0;i<size;i++)
				multiplier[i]=qbar[i];
		  }
		  else
		  {	  
		convert(y); 
		int j=0;
		for(i=size-1;i>=0;i--)
		{
			multiplier[j]=bin[i];
		    j=j+1;
		}
		  }
		
	  }
	 
	  void outAcc()
	  {
		for(i=0;i<size;i++)
			acc[i]=0;
	  }
	  
	 void compx()
	 {
	  for(i=0;i<size;i++)
	  {
		  if(multiplicant[i]==0)
			  mbar[i]=1;
		  else
			  mbar[i]=0;
		  carrya[i]=0;
	  }
	 
	  if(mbar[size-1]==0)
		  mbar[size-1]=1;
	  else
	  {
		  mbar[size-1]=0;
		  carrya[size-1]=1;
		  for(i=size-2;i>=0;i--)
		  {
			  if(mbar[i]==1 && carrya[i+1]==1)
			  {
				  mbar[i]=0;
				  carrya[i]=1;
			  }
			  else
				  mbar[i]=mbar[i]+carrya[i+1];
		  }
	  }
	  
	 }
	 
	 void compy()
	 {	 
	  for(i=0;i<size;i++)
	  {
		  if(multiplier[i]!=1)
			  qbar[i]=1;
		  else
			  qbar[i]=0;
		  carryb[i]=0;
	  }
	  
	  if(qbar[size-1]==0)
		  qbar[size-1]=1;
	  else
	  {
		  qbar[size-1]=0;
		  carryb[size-1]=1;
		  for(i=size-2;i>=0;i--)
		  {
			  if(qbar[i]==1 && carryb[i+1]==1)
			  {
				  qbar[i]=0;
				  carryb[i]=1;
			  }
			  else
				  qbar[i]=qbar[i]+carryb[i+1];
		  }
	  }
	 }
}	  
