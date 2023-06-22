package booth;


public class Working extends Trial1
{
	int last;
	int carry[]=new int[size];
	
	void ars()
	{
		last=acc[size-1];
		for(i=size-1;i>0;i--)
			acc[i]=acc[i-1];
		Qimg=multiplier[size-1];
		for(i=size-1;i>0;i--)
			multiplier[i]=multiplier[i-1];
			multiplier[0]=last;	
	}
	void changeFrom_0to1()
	{
		sumof_AandMbar();
		
	}
	
	void changeFrom_1to0()
	{
		sumof_AandM();
	}
	
	void sumof_AandM()
	{
		for(i=0;i<size;i++)
			carry[i]=0;
		if(acc[size-1]==1 && multiplicant[size-1]==1)
		{
			acc[size-1]=0;
			carry[size-1]=1;
		}
		else
		{
			acc[size-1]=acc[size-1]+multiplicant[size-1];
		}
		for(i=size-2;i>=0;i--)
		{
			if(acc[i]==1 && multiplicant[i]==1 && carry[i+1]==0)
			{
				acc[i]=0;
				carry[i]=1;
			}
			else if(acc[i]==1 && multiplicant[i]==1 && carry[i+1]==1)
			{
				acc[i]=1;
				carry[i]=1;
			}
			else if(acc[i]==0 && multiplicant[i]==1 && carry[i+1]==1)
			{
				acc[i]=0;
				carry[i]=1;
			}
			else if(acc[i]==1 && multiplicant[i]==0 && carry[i+1]==1)
			{
				acc[i]=0;
				carry[i]=1;
			}
			else
			{
				acc[i]=multiplicant[i]+acc[i]+carry[i+1];
			}
		}
	}
	
	void sumof_AandMbar()
	{
		for(i=0;i<size;i++)
			carry[i]=0;
		if(acc[size-1]==1 && mbar[size-1]==1)
		{
			acc[size-1]=0;
			carry[size-1]=1;
		}
		else
		{
			acc[size-1]=acc[size-1]+mbar[size-1];
		}
		
		for(i=size-2;i>=0;i--)
		{
			if(acc[i]==1 && mbar[i]==1 && carry[i+1]==0)
			{
				acc[i]=0;
				carry[i]=1;
			}
			else if(acc[i]==1 && mbar[i]==1 && carry[i+1]==1)
			{
				acc[i]=1;
				carry[i]=1;
			}
			else if(acc[i]==0 && mbar[i]==1 && carry[i+1]==1)
			{
				acc[i]=0;
				carry[i]=1;
			}
			else if(acc[i]==1 && mbar[i]==0 && carry[i+1]==1)
			{
				acc[i]=0;
				carry[i]=1;
			}
			else
			{
				acc[i]=mbar[i]+acc[i]+carry[i+1];
			}
		}
	}
	
	/*int result(int a[])
	{
	    String s= Arrays.toString(a);
		String s1=new String(s);
		System.out.println(s1);
		int decimal=Integer.parseInt(s1,2);
		return decimal;
		
	}*/
	
	void output()
	  {
		  no++;
		  System.out.print("  "+no+"\t      ");
		  for(i=0;i<size;i++)
			  System.out.print(acc[i]+" ");
		  System.out.print("\t ");
		  for(i=0;i<size;i++)
			  System.out.print(multiplier[i]+" ");
		  System.out.print("\t   ");
		  System.out.print(Qimg+"\t    ");
		  for(i=0;i<size;i++)
			  System.out.print(multiplicant[i]+" ");
		  System.out.println();
	  }
}
