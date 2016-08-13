import java.util.*;
class small
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>0)
{
int[] a=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
Arrays.sort(a);
System.out.println(a[1]);
}
else
System.out.println(0);
}
}
