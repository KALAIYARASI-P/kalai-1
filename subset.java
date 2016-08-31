import java.util.*;
class subset
{
public static void main(String[] args)
{
Scanner s=new Scanner(Sysatem.in);
int a1={1,2,3};
int a2={1,2,3,6,7};
int count=0;
for(int i=0;i<a1.length;i++)
{
for(int j=0;j<a2.length;j++)
{
if(a1[i]==a2[j])
{
count++;
break;
}
}
}
if(count==a1.length)
System.out.println("a1 is subset of a2");
}
}
