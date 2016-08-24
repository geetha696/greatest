import java.util.*;
import java.io.*;
class Greatest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
char ch[]=str.toCharArray();
int digit=sc.nextInt();int len=ch.length-digit;
Arrays.sort(ch);int re[]=new int[len];
for(int i=0;i<len;i++)
{
re[i]=Character.getNumericValue(ch[i]);
}
System.out.println(Arrays.toString(re));
}
}
