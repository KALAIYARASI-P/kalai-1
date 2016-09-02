import java.util.*;
class pro15
{
public static void main(String args[])
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{b[i]=0;
while(a[i]>0)
{
int c=a[i]%2;
b[i]+=c;
a[i]=a[i]/2;
}
}
int t=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
 if(b[i]<b[j])
 {
  t=b[i];
  b[i]=b[j];
  b[j]=t;
  t=a[i];
  a[i]=a[j];
  a[j]=t;
  }
  if(b[i]==b[j])
  {
   if(a[i]<a[j])
   {
    t=b[i];
  b[i]=b[j];
  b[j]=t;
  t=a[i];
  a[i]=a[j];
  a[j]=t;}
  }
  }
  }
  for(int p:a)
  System.out.println(p);
  }
  }
