import java.util.*;
class tallest
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the array size");
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.prinln("4th tallest"+a[n-4]);
System.out.println("enter k value:");
int k=s.nextInt();
System.out.println("height:"+a[n-k]);
}
}
