import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
   int n=s.nextInt();
    int m=s.nextInt();
  int  k=n*m;
int sqrt=(int) Math.sqrt(k);
if(sqrt*sqrt==k)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
	}
}
