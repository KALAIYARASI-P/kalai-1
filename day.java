import java.util.*;
class day
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String st=s.next();
String[] d={"monday","tuesday","wednesday","thursday","friday","saturday"};
if(st.length>1)
{
for(int i=0;i<d.length;i++)
{
if(st.equalsIgnoreCase(d[i])
  System.out.println("true");
}
if(st.equalsIgnoreCase("sunday"))
  System.out.println("false");
else
System.out.println("0");
}
}
else
 System.out.println("0");
}
