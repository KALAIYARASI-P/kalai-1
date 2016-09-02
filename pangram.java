import java.util.*;
class pangram
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Set<Character> set=new HashSet<Character>();
String ss=s.nextLine();
for(int i=0;i<ss.length()-1;i++)
 {
  if(Character.isLetter(ss.charAt(i))
  {
   set.add(ss.charAt(i));
  }
 }
 if(set.size()==26)
 System.out.println("String is pangram");
 else
 System.out.println("String is non pangram");
}
}
