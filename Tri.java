import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * HOMEWORK 1
 * @author Donald Ulfig
 */
public class Tri {
    
    int s1=0;
    int s2=0;
    int s3=0;
	int line=0;
	int line2=0;
	int line3=0;
    static String result="";

/**
 *Changes the side values
 */
public void Scan()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("What are the 3 sides: \n");
  if(sc.next()=="exit")
	  result=sc.next();
      System.out.print(result);
  else {
      try{
        s1= sc.nextInt();
        s2= sc.nextInt();
        s3= sc.nextInt();
		line=s1+s2;
		line2=s2+s3
		line3=s1+s3;
      }
     
      catch(Exception e)
      {
    	  sc.close();
          throw new IllegalArgumentException("Must be a valid integer");
  }
      if(s1<=0||s2<=0||s3<=0)
  {
	  sc.close();
	  throw new IllegalArgumentException("Sides cannot be less than or equal to 0");
      }
	  if(line==s3||line2==s1||line3==s2)
	  {
		  throw new IllegalArgumentException("Is a line");
	  }
      else sc.close();
   	
  }	
}
public void isEquil()
{
    if (s1==s2&&s1==s3)
        result="equilateral";
}
  public void isIso()
{
    if (s1==s2&&s1!=s3)
        result="isoceles";
else if(s2==s3&&s2!=s1)
    result="isoceles";
else if(s1==s3&&s2!=s3)
    result="isoceles";
}
    public void isScal()
{
    if (s1!=s2&&s1!=s3&&s2!=s3)
        result="scalene";
}
    public void response()
    {
        System.out.println(result + "\n");
    }
    
public static void main(String[] ags)
{
    Tri test = new Tri();
    test.Scan();
    if(result=="exit")
        	System.exit(0);
        test.isEquil();
        test.isIso();
        test.isScal();
        test.response();
        
    }
    
}