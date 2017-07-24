# bolt1
import java.io.*;
import java.util.*;
public class Reverse
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str;
    String reverse="";
    System.out.println("enter the string");                                                                      
    str=sc.nextLine();
    String s[]=str.split(" ");
    int len=str.length();
    for(String s1:s)
    {
       StringBuffer a=new StringBuffer(s1);
      System.out.print(a.reverse().toString()+" ");
      sc.close();
    }
  }
}
