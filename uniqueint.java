import java.util.*;
class uniqueint
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of elements in array");
int ar[]=new int[sc.nextInt()];
System.out.println("enter the elements");
for(int i=0;i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
System.out.println("unique numbers");
for(int i=0;i<ar.length;i++)
{int flag=0;
for(int j=0;j<ar.length;j++)
{
if(ar[i]==ar[j]){
flag=flag+1;}
}
if(flag==1)
System.out.println(ar[i]);
}
}
}
