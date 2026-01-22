import java.util.*;
class MyException extends Exception
{
     public String toString(){
        return "divide by zero ERROR!";
    }
}
class DivideByZero
{
      static void divide(int a,int b)throws MyException
      {
           if(b==0) 
		throw new MyException();
            else
               System.out.println("Division : "+a/b);
      }
      public static void main(String args[])
      {
            try
            {
                 Scanner sc = new Scanner(System.in);
                System.out.println("Enter the diviend:");
                 int de = sc.nextInt();
                 System.out.println("Enter the divisor:");
                int ds = sc.nextInt();
                divide(de,ds);
            }
            catch(MyException e1)
            {
                  System.out.println(e1);
             }
       }
}