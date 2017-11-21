import java.util.*;
class camelcase
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the text");
String ss=sc.nextLine();
String s2="";
String[] s1=ss.split(" ");
for(int i=0;i<s1.length;i++)
{
String ch=s1[i].charAt(0)+"";
s2+=ch.toUpperCase()+s1[i].substring(1,s1[i].length()).toLowerCase();
}
System.out.println(s2);
}
}
