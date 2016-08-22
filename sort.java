import java.util.*;
class sort
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int p=0;
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n-1;i++)
{
if(a[i]>a[i+1])
 p=1;
}
if(p=0)
System.out.println("true");
else
System.out.println("false");
}
}
