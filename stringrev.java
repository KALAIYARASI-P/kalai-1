import java.util.*;
class stringrev
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String ss=s.nextLine();
String[] sr=ss.split(" ");
for(int i=sr.length-1;i>=0;i--)
{
System.out.println(sr[i]+" ");
}
}
}
