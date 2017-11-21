import java.util.*;
class reversenum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
String ss=new StringBuffer(n+"").reverse().toString();
System.out.println(ss);
}
}
