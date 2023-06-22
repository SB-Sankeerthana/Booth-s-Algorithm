package booth;

public class Out extends Working
{
	public static void main(String a[])
	{
		int k,l;
		 Working w=new Working();
		 w.input();
		 w.check();
		 w.convert(w.x);
		 w.convert(w.y);
		 w.storex();
		 w.storey();
		 w.compx();
		 w.compy();
		 w.outAcc();
		 System.out.println("Step no.     Accumulator(A)     Multiplier(Q)     Qimg     Multiplicant(M)");
		 w.output();
		 for(k=0;k<size;k++)
		 {
			 if(w.Qimg==0 && w.multiplier[size-1]==0)
			 {
				 w.ars();
				 w.output();
			 }
			 
			 else if(w.Qimg==1 && w.multiplier[size-1]==1)
			 {
				 w.ars();
				 w.output();
			 }
			 
			 else if(w.Qimg==0 && w.multiplier[size-1]==1)
			 {
				 w.changeFrom_0to1();
				 w.ars();
				 w.output();
			 }
			 else
			 {
				 w.changeFrom_1to0();
				 w.ars();
				 w.output();
			 }
		 }
		 System.out.println();
		 System.out.print("        Result = ");
		 for(l=0;l<size;l++)
			 System.out.print(w.acc[l]+" ");
		 for(l=0;l<size;l++)
			 System.out.print(w.multiplier[l]+" ");
		 int res[]=new int[2*size];
		 for(l=0;l<size;l++)
			 res[l]=w.acc[l];
		 int i=size;
		 for(l=0;l<size;l++)
		 {
			 res[i++]=w.multiplier[l];
		 }
		 int temp=0;
		 for (i=0;i<2*size;i++)
		 {
			if(res[i]==1)
			{
				temp=temp+(int)Math.pow(2,2*size-i-1);
			}
			 
		 }
		 System.out.print(" = "+temp);
		 /* m=w.result(res);
		 System.out.print(" = "+m);*/
		 
	}
}