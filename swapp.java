import java.util.*;
class swapp
{
public static void main(String[] srgs)
{
 String s="kalai";
 String h="";
 int j=0;
 char a[]=s.toCharArray();
 char b[]=new char[(s.length()/2)+1];
 char c[]=new char[(s.length()/2];
 for(int i=0;i<s.length;i++)
 {
 b[i]=a[i];
 c[i]=a[i+1];
 j++;
 i++;
}
for(int i=0;i<s.length;i++)
{if(c[i]!=0){
h+=c[i];}
if(b[i]!=0){
h+=b[i];}
}
}
}
