import java.util.*;
class seed
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int m=a.nextInt();
int n=m;
while(n>0)
{
int c=n%10;
m*=c;
n=n%10;
}
System.out.println(m);
}
}
