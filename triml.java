import java.util.*;
class triml
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String ss=s.nextLine();
String st[]=ss.split(" ");
String h="";
int count=0,i=0,p=0;
int l=s.nextInt();
System.out.print("['");
while(i<st.length)
{
count+=st[i].length();
while(count<=l)
{
 
 if(st[i].charAt(st[i].length()-1)!='.'){
 h+=st[i]+" ";
 count+=st[i+1].length()+1;
 i++;}
 else{
  h+=st[i]+" ";
  i++;
  break;}
}
System.out.println(h+",");
count=0;h="";
}
System.out.println("']");
}
}
