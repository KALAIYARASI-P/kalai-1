import java.util.*;
class odd
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=1,sum=0;
while(i<=n)
{
 sum+=i;
i+2;
}
System.out.println(sum);
}
}
