import java.io.*;
import java.util.*;

public class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();	
String s=new String();
boolean flag=false;		
int noofiter=0;	
boolean val=true;
	s=n+"";	
	char b[]=s.toCharArray();	
	Arrays.sort(b);
	s=new String(b);
	while(s.length()<4)
	s="0"+s;
	while(val)
	{
	s=n+"";
		while(s.length()<4)
		s="0"+s;
	char a[]=s.toCharArray();	
	Arrays.sort(a);
	String s1=new String();
		for(int i=3;i>=0;i--)
		s1+=a[i]+"";
	s=String.copyValueOf(a);

	n=Integer.parseInt(s1)-Integer.parseInt(s);
	System.out.println(s1+"-"+s+"="+n);
	noofiter++;
		if(n==0)
		break;
		else
		if(n==6174)
		{
		flag=true;
		break;
		}
	}
if(flag==true)
System.out.println(noofiter);
else
System.out.println("Cannot reach");

}
}