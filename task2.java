import java.util.Scanner;
public class studentInfo
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter your name");
  String name=sc.next();
  System.out.println("enter the age");
  int age=sc.nextInt();
  System.out.println("enter marks");
  float marks=sc.nextFloat();
  public static void main(String args[])
    {
    System.out.println(name);
    System.out.println(age);
    System.out.println(marks);
  }

}
